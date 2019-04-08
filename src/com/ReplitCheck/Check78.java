package com.ReplitCheck;

public class Check78 {
	static class Main {

		String breed, name, color;

		void bark() {
			System.out.println(breed + " can bark");
		}

		void run() {
			System.out.println(breed + " can run");

		}

		void play() {
			System.out.println(breed + " can play");
		}

		public static void main(String[] args) {
			Main d1 = new Main();
			d1.breed = "Husky";
			d1.name = "Roscoe";
			d1.color = "black";
			d1.bark();
			d1.run();
			d1.play();

			Main d2 = new Main();
			d2.breed = "Bulldog";
			d2.name = "Bull";
			d2.color = "black";
			d2.bark();
			d2.run();
			d2.play();

			Main d3 = new Main();
			d3.breed = "Labrador";
			d3.name = "Lab";
			d3.color = "black";
			d3.bark();
			d3.run();
			d3.play();
		}
	}
}
