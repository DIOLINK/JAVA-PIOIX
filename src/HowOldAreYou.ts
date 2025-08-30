export class HowOldAreYou {
    private static readonly OLD_AGE: number = 18;
    private static readonly ZERO: number = 0;
    private static readonly MAX_AGE: number = 150;
    private static readonly MESSAGES: string[] = [
        "Cuantos años tienes?: ",
        "Mayor",
        "Menor", 
        "Ingresar solo el numeros que correspondan a tu edad",
        "No es un valor valido!!.",
        "Error: MENSAJES no puede estar vacío", 
        "Adios!!"
    ];
    private scanner: any;
    private EXIT: boolean = true;
      
    constructor() {
        this.scanner = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }
    
    public validateAge(age: number): number {
        if (age <= HowOldAreYou.ZERO || age >= HowOldAreYou.MAX_AGE) {
            console.log(HowOldAreYou.MESSAGES[4]);
            this.EXIT = false;
            this.scanner.close();
            console.log(HowOldAreYou.MESSAGES[6]);
        }
        return age;
    }
   
    private isOld(age: number): void {
        if (HowOldAreYou.OLD_AGE <= age) {
            console.log("Eres " + HowOldAreYou.MESSAGES[1] + " de edad!");
        } else {
            console.log("Eres " + HowOldAreYou.MESSAGES[2] + " de edad!");
        }
    }
    
    public ask(): void {
        const askQuestion = () => {
            if (!this.EXIT) return;
            
            console.log(HowOldAreYou.MESSAGES[3]);
            console.log(HowOldAreYou.MESSAGES[0]);
            
            this.scanner.question('', (input: string) => {
                const age: number = this.validateAge(parseInt(input));
                
                if (this.EXIT) {
                    this.isOld(age);
                }
                
                if (this.EXIT) {
                    askQuestion();
                }
            });
        };
        
        askQuestion();
    }
}
