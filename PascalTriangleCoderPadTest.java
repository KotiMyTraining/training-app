package com.coderpadtest;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleCoderPadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> triangle = generate(10);

		printTriangle(triangle);

	}

	private static void printTriangle(List<List<Integer>> triangle) {

		int numRows = triangle.size();

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numRows - i - 1; j++) {
				System.out.print("  "); // Adjust this for more or fewer spaces
			}
			// Print the row values
			for (int value : triangle.get(i)) {
				System.out.printf("%-4d", value); // Extra spaces between numbers for better separation
			}
			System.out.println();
		}

	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> triangle = new ArrayList();

		if (numRows == 0) {
			return triangle;
		}

		for (int i = 0; i < numRows; i++) {

			List<Integer> row = new ArrayList();

			row.add(1);

			for (int j = 1; j < i; j++) {

				int prev = triangle.get(i - 1).get(j - 1);
				int current = triangle.get(i - 1).get(j);

				row.add(prev + current);

			}

			if (i > 0) {
				row.add(1);
			}
			triangle.add(row);
		}

		return triangle;

	}

}
