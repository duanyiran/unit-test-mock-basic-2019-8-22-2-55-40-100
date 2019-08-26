package cashregister;

public class MockPrinter extends Printer {
    private String printerText;

    public String getPrinterText(){
        return printerText;
    }
    @Override
    public void print(String printThis) {
        super.print(printThis);
        this.printerText = printThis;
    }
}