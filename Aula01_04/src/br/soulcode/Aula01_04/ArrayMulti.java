package br.soulcode.Aula01_04;


public class ArrayMulti {

	public static void main(String[] args) {
		
		System.out.println("Hello");

		int[][] arrayMulti = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 4, 5 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arrayMulti[i][j] + " ");
			}
			System.out.println();
		}

	}

}
