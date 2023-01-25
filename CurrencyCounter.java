package Services;

public class CurrencyCounter {
	public void currencyCounteimplemantation(int currency[], int amount) {
		int notesCounter[] = new int[currency.length];

		try {
			for (int i = 0; i < currency.length; i++) {
				if (amount >= currency[i]) {
					notesCounter[i] = amount / currency[i];
					amount = amount - notesCounter[i] * currency[i];
				}
			}
			if (amount > 0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < currency.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(currency[i] + ":" + notesCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}
}
