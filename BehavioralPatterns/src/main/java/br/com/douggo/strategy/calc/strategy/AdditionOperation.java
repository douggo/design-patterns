package br.com.douggo.strategy.calc.strategy;

public class AdditionOperation implements OperationStrategy {

    @Override
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}
