package com.tek.interview.question;

import java.util.HashMap;
import java.util.Map;

public class Foo {

	public static void main(String[] args) throws Exception {

		Map<String, Order> orderMap = new HashMap<String, Order>();

		Order c = new Order();
		c.add(new OrderLine(new Item("book", (float) 12.49), 1));
		c.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		c.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));
		orderMap.put("Order 1", c);

		// Reuse cart for an other order
		c = new Order();
		c.add(new OrderLine(new Item("imported box of chocolate", 10), 1));
		c.add(new OrderLine(new Item("imported bottle of perfume",
				(float) 47.50), 1));
		orderMap.put("Order 2", c);

		// Reuse cart for an other order
		c = new Order();
		c.add(new OrderLine(new Item("Imported bottle of perfume",
				(float) 27.99), 1));
		c.add(new OrderLine(new Item("bottle of perfume", (float) 18.99), 1));
		c.add(new OrderLine(new Item("packet of headache pills", (float) 9.75),
				1));
		c.add(new OrderLine(new Item("box of imported chocolates",
				(float) 11.25), 1));
		orderMap.put("Order 3", c);

		new Calculator().calculate(orderMap);

	}

}
