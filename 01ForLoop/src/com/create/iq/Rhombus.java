package com.create.iq;

public class Rhombus {
	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 9; i++) {
				if ((j == 1 && i == 1) || (j == 1 && i == 2) || (j == 1 && i == 3) || (j == 1 && i == 4)
						|| (j == 2 && i == 1) || (j == 2 && i == 2) || (j == 2 && i == 3) || (j == 3 && i == 1)
						|| (j == 3 && i == 2) || (j == 4 && i == 1) || (j == 2 && i == 9) || (j == 3 && i == 8)
						|| (j == 3 && i == 9) || (j == 4 && i == 7) || (j == 4 && i == 8) || (j == 4 && i == 9)
						|| (j == 5 && i == 6) || (j == 5 && i == 7) || (j == 5 && i == 8) || (j == 5 && i == 9)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}
}
