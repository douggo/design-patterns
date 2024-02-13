package br.com.douggo.strategy.calc.strategy;

public class DivisionOperation implements OperationStrategy {

    @Override
    public int calculate(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }
}
