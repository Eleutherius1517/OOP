package Interfaces;

import Classes.ComplexNumber;

public interface iCalculableComplex  {
    iCalculableComplex sum(ComplexNumber arg);
    iCalculableComplex multi(ComplexNumber arg);
    iCalculableComplex div(ComplexNumber arg);
    String getResult();
}
