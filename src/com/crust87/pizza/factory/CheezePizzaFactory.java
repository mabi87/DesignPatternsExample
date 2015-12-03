package com.crust87.pizza.factory;

import com.crust87.pizza.Cheeze;
import com.crust87.pizza.Dough;
import com.crust87.pizza.Ham;
import com.crust87.pizza.NullHam;
import com.crust87.pizza.Pizza;
import com.crust87.pizza.PlainCheeze;
import com.crust87.pizza.PlainDough;

public class CheezePizzaFactory extends PizzaFactory {

	@Override
	public Pizza makePizza() {
		return new Pizza();
	}

	@Override
	public Dough makeDough() {
		return new PlainDough();
	}

	@Override
	public Cheeze makeCheeze() {
		return new PlainCheeze();
	}

	@Override
	public Ham makeHam() {
		return new NullHam();
	}
}
