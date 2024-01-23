import Classes.Logger;
import Classes.ComplexCalculator;
import Classes.ComplexNumber;
import Classes.Decorator;
import Classes.ViewCalculator;
import Interfaces.iCalculableComplex;

public class App {
    public static void main(String[] args) throws Exception {
        ComplexNumber complexNumber = new ComplexNumber(0, 0);

        iCalculableComplex  decorator = new Decorator(new ComplexCalculator(complexNumber), new Logger());
        
        ViewCalculator view = new ViewCalculator(decorator);
        view.run();
    }
}
