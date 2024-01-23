package Classes;

import Interfaces.iCalculableComplex;

public class ComplexCalculator implements iCalculableComplex {
    private ComplexNumber primaryComp;

    public ComplexCalculator(ComplexNumber primaryComp){
        this.primaryComp = primaryComp;
    }

    @Override
    public iCalculableComplex sum(ComplexNumber arg) {
        double realPart = primaryComp.getRealPart() + arg.getRealPart();
        double complexPartPart = primaryComp.getComplexPart() + arg.getComplexPart();
        this.primaryComp.setComplexPart(complexPartPart);
        this.primaryComp.setRealPart(realPart);
        return this;
    }

    @Override
    public iCalculableComplex multi(ComplexNumber arg) {
        double realPart = primaryComp.getRealPart() * arg.getRealPart() - primaryComp.getComplexPart() * arg.getComplexPart();
        double complexPartPart = primaryComp.getRealPart() * arg.getComplexPart() + primaryComp.getComplexPart() * arg.getRealPart();
        this.primaryComp.setComplexPart(complexPartPart);
        this.primaryComp.setRealPart(realPart);
        return this;
    }

    @Override
    public iCalculableComplex div(ComplexNumber arg) {
        double denominator = arg.getRealPart() * arg.getRealPart() + arg.getComplexPart() * arg.getComplexPart();
        double realPart = (primaryComp.getRealPart() * arg.getRealPart() + primaryComp.getComplexPart() * arg.getComplexPart()) / denominator;
        double complexPartPart = (primaryComp.getComplexPart() * arg.getRealPart() - primaryComp.getRealPart() * arg.getComplexPart()) / denominator;
        this.primaryComp.setComplexPart(complexPartPart);
        this.primaryComp.setRealPart(realPart);
        return this;
    }

    @Override
    public String getResult() {
        return primaryComp.toString();
    }
    
}
