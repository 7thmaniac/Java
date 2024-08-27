public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public Printer(){
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.duplex = false;
    }

    public int addToner(int tonerAmount){
        this.tonerLevel += tonerAmount;
        if(this.tonerLevel > 100 || this.tonerLevel < 0){
            return -1;
        }
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? ((pages/2) + (pages%2)):pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
