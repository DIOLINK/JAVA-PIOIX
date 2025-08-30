import { ProgramUtil } from './ProgramUtil';

export class SumNumber extends ProgramUtil {
    private static readonly ZERO: number = 0;

    constructor() {
        super();
        const message: string[] = [
            "Ingrese un numero entero positivo, cero para salir: ", 
            "No es un valor valido", 
            "El resultado de sumar 1 hasta ", 
            " es: ", 
            "Adios!!"
        ];
        this.init(...message);
    }

    private onError(): void {
        console.log(this.MESSAGES[1]);
    }

    public cal(): void {
        const askNumber = () => {
            if (!this.EXIT) {
                console.log(this.MESSAGES[4]);
                this.scanner.close();
                return;
            }
            
            console.log(this.MESSAGES[0]);
            
            this.scanner.question('', (input: string) => {
                const value: number = parseInt(input);
                
                if (value < SumNumber.ZERO) {
                    this.onError();
                    askNumber();
                } else if (value === SumNumber.ZERO) {
                    this.EXIT = false;
                    askNumber();
                } else {
                    let aux: number = 0;
                    for (let i = 1; i <= value; i++) {
                        aux += i;
                    }
                    console.log((this.MESSAGES[2] || '') + value + (this.MESSAGES[3] || '') + aux);
                    askNumber();
                }
            });
        };
        
        askNumber();
    }
}
