import { HowOldAreYou } from './HowOldAreYou';
import { ValidateStorePass } from './ValidateStorePass';
import { Divide } from './Divide';
import { UnivenOrPair } from './UnivenOrPair';
import { AgeTaxAction } from './AgeTaxAction';
import { SumNumber } from './SumNumber';
import { SumAllNum } from './SumAllNum';

class Ejers {
    private static readonly MESSAGES: string[] = [
        "=== MENÚ PRINCIPAL ===",
        "1. HowOldAreYou - Verificar edad",
        "2. ValidateStorePass - Validar contraseña",
        "3. Divide - División de números",
        "4. UnivenOrPair - Verificar par/impar",
        "5. AgeTaxAction - Cálculo de impuestos por edad",
        "6. SumNumber - Suma de números consecutivos",
        "7. SumAllNum - Suma de todos los números",
        "0. Salir",
        "Seleccione una opción: "
    ];

    public static main(): void {
        const readline = require('readline');
        
        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        const showMenu = () => {
            console.clear();
            Ejers.MESSAGES.forEach(message => console.log(message));
            
            rl.question('', (input: string) => {
                const option = parseInt(input);
                
                switch (option) {
                    case 1:
                        console.clear();
                        console.log("=== HowOldAreYou ===");
                        const howOld = new HowOldAreYou();
                        howOld.ask();
                        break;
                    case 2:
                        console.clear();
                        console.log("=== ValidateStorePass ===");
                        const passwords = ["VVIRKvysEZj5S4", "VpP1Y9JXQ5psrl", "casI13245"];
                        const validatePass = new ValidateStorePass(...passwords);
                        validatePass.isValidate();
                        break;
                    case 3:
                        console.clear();
                        console.log("=== Divide ===");
                        const divide = new Divide();
                        divide.divideAtoB();
                        break;
                    case 4:
                        console.clear();
                        console.log("=== UnivenOrPair ===");
                        const univenOrPair = new UnivenOrPair();
                        univenOrPair.isPair();
                        break;
                    case 5:
                        console.clear();
                        console.log("=== AgeTaxAction ===");
                        const ageTax = new AgeTaxAction();
                        ageTax.calTaxAction();
                        break;
                    case 6:
                        console.clear();
                        console.log("=== SumNumber ===");
                        const sumNumber = new SumNumber();
                        sumNumber.cal();
                        break;
                    case 7:
                        console.clear();
                        console.log("=== SumAllNum ===");
                        const sumAllNum = new SumAllNum();
                        sumAllNum.cal();
                        break;
                    case 0:
                        console.log("¡Adiós!");
                        rl.close();
                        process.exit(0);
                        break;
                    default:
                        console.log("Opción no válida. Presione Enter para continuar...");
                        rl.question('', () => {
                            showMenu();
                        });
                        break;
                }
            });
        };

        showMenu();
    }
}

// Ejecutar el programa principal
Ejers.main();
