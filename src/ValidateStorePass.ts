export class ValidateStorePass {
    private store_pass: string[];
    private scanner: any;
    private is_exit: boolean = true;
    private static readonly MESSAJE: string[] = [
        "Correcta!!", 
        "Incorrecta!!", 
        "Ingrese la clave: ", 
        "Intente nuevamente"
    ];
       
    constructor(...arr_pass: string[]) {
        this.scanner = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        });
        this.store_pass = [...arr_pass];
    }
    
    private validatePass(pass: string): boolean {
        for (const value_pass of this.store_pass) {
            if (value_pass.toLowerCase() === pass.toLowerCase()) {
                return true;
            }
        }
        return false;
    }
    
    public isValidate(): void {
        const askPassword = () => {
            if (!this.is_exit) {
                this.scanner.close();
                return;
            }
            
            console.log(ValidateStorePass.MESSAJE[2]);
            
            this.scanner.question('', (pass: string) => {
                if (this.validatePass(pass)) {
                    console.log(ValidateStorePass.MESSAJE[0]);
                    this.is_exit = false;
                } else {
                    console.log(ValidateStorePass.MESSAJE[1]);
                    console.log(ValidateStorePass.MESSAJE[3]);
                }
                
                askPassword();
            });
        };
        
        askPassword();
    }
}
