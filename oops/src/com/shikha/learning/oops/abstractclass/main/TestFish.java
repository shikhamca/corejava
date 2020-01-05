package com.shikha.learning.oops.abstractclass.main;

import com.shikha.learning.oops.basic.abstractclass.Animal;
import com.shikha.learning.oops.basic.abstractclass.Fish;

public class TestFish {
	public static void main(String[] args) {
		Animal myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}
}
