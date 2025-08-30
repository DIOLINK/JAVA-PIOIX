import { ProgramUtil } from './ProgramUtil';

export class AgeTaxAction extends ProgramUtil {
    private dateCurrent: Date;
    private objects: Map<string, string>;
    private static readonly OLD_AGE: number = 18;
    private static readonly MAX_AGE: number = 150;
    private CONT: number = 1;
    private static readonly LIMIT_TRX: number = 1000000;
    private monthCurrent: number;

    constructor() {
        super();
        const message: string[] = [
            "Ingrese su fecha de nacimiento (dd/mm/yyyy): ", 
            "Igrese el ingreso para el mes ", 
            "Fecha de naciomiento no valida", 
            "Si, ", 
            "No, ", 
            "debe tributar",
            "Adios!!"
        ];
        this.init(...message);
        this.objects = new Map<string, string>();
        this.dateCurrent = new Date();
        this.monthCurrent = this.dateCurrent.getMonth() + 1; // getMonth() devuelve 0-11
    }

    private onErrorDate(): void {
        console.log(this.MESSAGES[2]);
        this.EXIT = false;
    }

    private getNameMoths(numMohth: number): string | null {
        switch (numMohth) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                this.EXIT = false;
                return null;
        }
    }

    private cal(): void {
        let aux: number = 0;
        let res: string = this.MESSAGES[4] || '';
        
        for (const value of this.objects.values()) {
            aux += parseFloat(value);
        }
        
        if (aux >= AgeTaxAction.LIMIT_TRX) {
            res = this.MESSAGES[3] || '';
        } 
        
        console.log(res + (this.MESSAGES[5] || ''));
    }

    public calTaxAction(): void {
        console.log(this.MESSAGES[0]);
        
        this.scanner.question('', (birthDateStr: string) => {
            // Parsear fecha en formato dd/mm/yyyy
            const parts = birthDateStr.split('/');
            if (parts.length === 3) {
                const birthDate = new Date(parseInt(parts[2] || '0'), parseInt(parts[1] || '1') - 1, parseInt(parts[0] || '1'));
            
            const today = new Date();
            const diffTime = Math.abs(today.getTime() - birthDate.getTime());
            const diffYears = Math.ceil(diffTime / (1000 * 60 * 60 * 24 * 365.25));
            
            if (diffYears < AgeTaxAction.OLD_AGE || diffYears >= AgeTaxAction.MAX_AGE) {
                this.onErrorDate();
            }
            
            if (this.EXIT) {
                this.askForIncome();
            }
            } else {
                console.log("Formato de fecha inválido. Use dd/mm/yyyy");
                this.onErrorDate();
            }
        });
    }

    private askForIncome(): void {
        if (!this.EXIT) {
            this.scanner.close();
            return;
        }
        
        const monthName = this.getNameMoths(this.CONT);
        if (!monthName) {
            this.scanner.close();
            return;
        }
        
        console.log(this.MESSAGES[1] + monthName + ":");
        
        this.scanner.question('', (value: string) => {
            this.objects.set(monthName, value);
            
            if (this.CONT === this.monthCurrent) {
                this.cal();
                this.scanner.close();
                console.log(Object.fromEntries(this.objects));
                console.log(this.MESSAGES[6]);
                this.EXIT = false;
            } else {
                this.CONT += 1;
                this.askForIncome();
            }
        });
    }
}
