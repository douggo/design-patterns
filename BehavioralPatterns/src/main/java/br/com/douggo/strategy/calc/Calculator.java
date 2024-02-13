package br.com.douggo.strategy.calc;

import br.com.douggo.strategy.calc.strategy.OperationStrategy;

public class Calculator {
	private final int num1;
	private final int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getResult(OperationStrategy operation) {
		return operation.calculate(this.num1, this.num2);
	}
}
