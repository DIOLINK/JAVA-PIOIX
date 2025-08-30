export class UnivenOrPair {
    private static readonly MESSAJE: string[] = [
        "Es ", 
        "Par!!", 
        "Inpar!!", 
        "Ingrese un nuemero entero: ", 
        "Intente nuevamente", 
        "Desa continuar Si ~ No: ", 
        "Adios!!"
    ];
    private scanner: any;
    private static readonly ZERO: number = 0;
    private is_exit: boolean = true;
    private static readonly VALUE_EXIT: string = 's';
    private static readonly CRITERION: number = 2;

    constructor() {
        this.scanner = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    private onExit(): void {
        console.log(UnivenOrPair.MESSAJE[5]);
        
        this.scanner.question('', (value: string) => {
            if (value.toLowerCase() !== UnivenOrPair.VALUE_EXIT.toLowerCase()) {
                console.log(UnivenOrPair.MESSAJE[6]);
                this.is_exit = false;
            }
            
            if (this.is_exit) {
                this.isPair();
            } else {
                this.scanner.close();
            }
        });
    }

    public isPair(): void {
        if (!this.is_exit) {
            this.scanner.close();
            return;
        }
        
        console.log(UnivenOrPair.MESSAJE[3]);
        
        this.scanner.question('', (input: string) => {
            const value: number = parseInt(input);
            let res: string = UnivenOrPair.MESSAJE[2] || '';
            
            if (value % UnivenOrPair.CRITERION === UnivenOrPair.ZERO) {
                res = UnivenOrPair.MESSAJE[1] || '';
            }
            
            console.log(UnivenOrPair.MESSAJE[0] + res);
            this.onExit();
        });
    }
}
