package com.shikha.learning.oops.abstractclass.main;

import com.shikha.learning.oops.basic.abstractclass.Animal;
import com.shikha.learning.oops.basic.abstractclass.Bird;

public class TestBird {
	public static void main(String[] args) {
		Animal myBird = new Bird();

		myBird.label();
		myBird.move();
		myBird.eat();
	}
}
