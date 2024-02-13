package br.com.douggo.strategy.calc;

import br.com.douggo.strategy.calc.strategy.AdditionOperation;
import br.com.douggo.strategy.calc.strategy.DivisionOperation;
import br.com.douggo.strategy.calc.strategy.MultiplicationOperation;
import br.com.douggo.strategy.calc.strategy.SubtractOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
