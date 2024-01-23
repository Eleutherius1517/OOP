package Classes;

import Interfaces.iCalculableComplex;

public class Decorator implements iCalculableComplex {

    private ComplexCalculator oldCalculator;
    private Logger logger;

    public Decorator(ComplexCalculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public iCalculableComplex sum(ComplexNumber arg) {
        String firstArg = oldCalculator.getResult();

        logger.log(String.format("Первое значение калькулятора " + firstArg + ". Начало вызова метода sum с параметром " +
                arg));
        iCalculableComplex result = oldCalculator.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));

        return result;
    }

    @Override
    public iCalculableComplex multi(ComplexNumber arg) {
        String firstArg = oldCalculator.getResult();
        logger.log(String.format("Первое значение калькулятора " + firstArg + ". Начало вызова метода multi с параметром " +
        arg));
        iCalculableComplex result = oldCalculator.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public String getResult() {
        String result = oldCalculator.getResult();
        logger.log(String.format("Получение результата " + result));
        return result;
    }

    @Override
    public iCalculableComplex div(ComplexNumber arg) {
        String firstArg = oldCalculator.getResult();
        logger.log(String.format("Первое значение калькулятора " + firstArg + ". Начало вызова метода div с параметром " +
        arg));
        iCalculableComplex result = oldCalculator.div(arg);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }

}