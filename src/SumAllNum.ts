import { ProgramUtil } from './ProgramUtil';

export class SumAllNum extends ProgramUtil {
    private static readonly ZERO: number = 0;

    constructor() {
        super();
        const message: string[] = [
            "Ingrese numeros enteros positivo, ó ingesar un numero negativo para salir: ", 
            "El resultado de la suma es: ", 
            "Adios!!"
        ];
        this.init(...message);
    }

    public cal(): void {
        let aux: number = 0;
        
        const askNumber = () => {
            if (!this.EXIT) {
                console.log((this.MESSAGES[1] || '') + aux);
                console.log(this.MESSAGES[2]);
                this.scanner.close();
                return;
            }
            
            console.log(this.MESSAGES[0]);
            
            this.scanner.question('', (input: string) => {
                const value: number = parseInt(input);
                
                if (value < SumAllNum.ZERO) {
                    this.EXIT = false;
                } else {
                    aux += value;
                }
                
                askNumber();
            });
        };
        
        askNumber();
    }
}
