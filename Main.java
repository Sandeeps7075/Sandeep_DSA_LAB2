package Driver;

import java.util.Scanner;
import Services.CurrencyCounter;
import Services.MergeSort;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MergeSort mergeSort = new MergeSort();
		CurrencyCounter currencyCounter = new CurrencyCounter();

		System.out.println("Enter the Size of currency denominations:");
		int size = sc.nextInt();
		int[] currency = new int[size];

		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			currency[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay ::");
		int amount = sc.nextInt();

		mergeSort.sort(currency, 0, currency.length - 1);
		currencyCounter.currencyCounteimplemantation(currency, amount);
	}
}
