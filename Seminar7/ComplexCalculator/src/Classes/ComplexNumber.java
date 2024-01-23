package Classes;

public class ComplexNumber {
    
    private double realPart;
    private double complexPart;
    
    public ComplexNumber(double realPart, double complexPart) {
        this.realPart = realPart;
        this.complexPart = complexPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getComplexPart() {
        return complexPart;
    }

    public void setComplexPart(double complexPart) {
        this.complexPart = complexPart;
    }

    @Override
    public String toString() {
        if (this.complexPart >= 0) {
            return this.realPart + " + " + this.complexPart + "i";
        }else{
            return this.realPart + " + " + Math.abs(this.complexPart) + "i";
        }
        
    }
}
