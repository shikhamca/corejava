package com.shikha.learning.oops.basic.abstractclass;

public abstract class Animal {
	public abstract void move();

	public abstract void eat();

	// concrete method
	public void label() {
		System.out.println("Animal's data:");
	}
}
