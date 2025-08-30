export class Divide {
    private scanner: any;
    private is_exit: boolean = true;
    private static readonly ZERO: number = 0;
    private static readonly MESSAJE: string[] = [
        "El resultado de la divicion entre ", 
        "a: ", 
        "b: ", 
        " y ", 
        " es: ", 
        "Valor no valido!!", 
        "Ingrese la un valor para ", 
        "Intente nuevamente!!", 
        "Desa continuar Si ~ No: ", 
        "Adios!!"
    ];
    private static readonly VALUE_EXIT: string = 's';

    constructor() {
        this.scanner = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    private isValidValue(value: number): boolean {
        if (value === Divide.ZERO || isNaN(value)) {
            return false;
        }
        return true;
    }

    private onExit(): void {
        console.log(Divide.MESSAJE[8]);
        
        this.scanner.question('', (value: string) => {
            if (value.toLowerCase() !== Divide.VALUE_EXIT.toLowerCase()) {
                console.log(Divide.MESSAJE[9]);
                this.is_exit = false;
            }
            
            if (this.is_exit) {
                this.divideAtoB();
            } else {
                this.scanner.close();
            }
        });
    }

    public divideAtoB(): void {
        if (!this.is_exit) {
            this.scanner.close();
            return;
        }
        
        console.log((Divide.MESSAJE[6] || '') + (Divide.MESSAJE[1] || ''));
        
        this.scanner.question('', (inputA: string) => {
            const a: number = parseFloat(inputA);
            
            console.log((Divide.MESSAJE[6] || '') + (Divide.MESSAJE[2] || ''));
            
            this.scanner.question('', (inputB: string) => {
                const b: number = parseFloat(inputB);

                if (this.isValidValue(b)) {
                    const resul: number = a / b;
                    console.log((Divide.MESSAJE[0] || '') + (Divide.MESSAJE[1] || '') + a + (Divide.MESSAJE[3] || '') + (Divide.MESSAJE[2] || '') + b + (Divide.MESSAJE[4] || '') + resul);
                    this.onExit();
                } else {
                    console.log(Divide.MESSAJE[5]);
                    console.log(Divide.MESSAJE[7]);
                    this.divideAtoB();
                }
            });
        });
    }
}
