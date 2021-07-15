package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String [] args) {
		hello("world");
		hello("user");
		hello("Alexander");

		Square s = new Square(5);
		System.out.println("Площадь квадрата с длиной стороны " + s.l + " равна " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площать прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
}