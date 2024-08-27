public class Printer{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount <= 0 || tonerAmount > 100 || this.tonerLevel + tonerAmount > 100){
            return -1;
        }
        this.tonerLevel += tonerAmount;

        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = (duplex)? ((pages/2)+(pages%2)): pages;
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
