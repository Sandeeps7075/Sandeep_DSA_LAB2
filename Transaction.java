package Main;

import java.util.Scanner;

public class Transaction {
	public static void main(String args[]) {
		int size, targetNo;
		int temp = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of transaction array : ");
		size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the values of array: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved: ");
		targetNo = sc.nextInt();
		while (targetNo-- != 0) {

			int flag = 0;

			System.out.println("enter the value of target");
			long target = sc.nextInt();

			long sum = 0;

			for (int i = 0; i < size; i++) { // linear iteration , linear searching

				sum += array[i];

				if (sum >= target) {

					System.out.println("Target achieved after " + (i + 1) + " transactions ");

					flag = 1;

					break;

				}

			}

			if (flag == 0) {

				System.out.println(" Given target is not achieved ");

			}

		}

	}

}
