package com.crust87.pizza.builder;

import com.crust87.pizza.NullHam;
import com.crust87.pizza.Pizza;
import com.crust87.pizza.PlainCheeze;
import com.crust87.pizza.PlainDough;
import com.crust87.pizza.PlainHam;

public class CheezePizzaBuilder extends PizzaBuilder {

	@Override
	public PizzaBuilder buildPizza() {
		mPizza = new Pizza();
		
		return this;
	}

	@Override
	public PizzaBuilder buildDough() {
		mPizza.setDough(new PlainDough());
		
		return this;
	}

	@Override
	public PizzaBuilder buildHam() {
		mPizza.setHam(new NullHam());
		
		return this;
	}

	@Override
	public PizzaBuilder buildCheeze() {
		mPizza.addCheeze(new PlainCheeze());
		
		return this;
	}

}
