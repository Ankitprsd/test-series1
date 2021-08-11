package com.Techment.day8.collections;


class Animal2
{
	void shout()
	{
		System.out.println("Animals are shouting");
		
	}
}
class Dog2 extends Animal2
{
	void shout()
	{
		System.out.println("dog shout :barking");
	}
}
class Horse extends Animal2
{
	void shout()
	{
		System.out.println("horse doesw shout as: neigh");
	}
}
class Cat extends Animal2
{
	void shout()
	{
		System.out.println("it shout: meow");
	}
}

public class TestQuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Dog2 dog = new Dog2();
		Horse horse=new Horse();
		Cat cat = new Cat();
		horse.shout();
		cat.shout();
		dog.shout();

	}

}
