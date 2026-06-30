package week1.FactoryMethodPatternExample;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
