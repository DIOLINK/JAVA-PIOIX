export class ProgramUtil {
    public EXIT: boolean = true;
    public scanner: any;
    public MESSAGES: string[] = [];

    public init(...messajes: string[]): void {
        this.scanner = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        });
        this.MESSAGES = [...messajes];
    }
}
