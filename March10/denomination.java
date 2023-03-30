public class denomination {

	public static void main(String args[]) {
		int amount, count2000 = 0, count500 = 0, count200 = 0, count100 = 0, count50 = 0, count20 = 0, count10 = 0, count5 = 0, count2 = 0, count1 = 0, count = 0;
		amount = Integer.parseInt(args[0]);

		if (amount >= 2000) {
			count2000 = amount / 2000;
			amount = amount % 2000;
			System.out.print("\nTotal Number Of 2000 Rupees Notes :" + count2000);
		}

		if (amount >= 500) {
			count500 = amount / 500;
			amount = amount % 500;
			System.out.print("\nTotal Number Of 500 Rupees Notes : " + count500);
		}
		if (amount >= 200) {
			count200 = amount / 200;
			amount = amount % 200;
			System.out.print("\nTotal Number Of 200 Rupees Notes : " + count200);
		}
		if (amount >= 100) {
			count100 = amount / 100;
			amount = amount % 100;
			System.out.print("\nTotal Number Of 100 Rupees Notes : " + count100);
		}

		if (amount >= 50) {
			count50 = amount / 50;
			amount = amount % 50;
			System.out.print("\nTotal Number Of 50 Rupees Notes : " + count50);
		}

		if (amount >= 20) {
			count20 = amount / 20;
			amount = amount % 20;
			System.out.print("\nTotal Number Of 20 Rupees Notes : " + count20);
		}

		if (amount >= 10) {
			count10 = amount / 10;
			amount = amount % 10;
			System.out.print("\nTotal Number Of 10 Rupees Notes Or Coin : " + count10);
		}

		if (amount >= 5) {
			count5 = amount / 5;
			amount = amount % 5;
			System.out.print("\nTotal Number Of 5 Rupees Notes Or Coin : " + count5);
		}

		if (amount >= 2) {
			count2 = amount / 2;
			amount = amount % 2;
			System.out.print("\nTotal Number Of 2 Rupees Notes Or Coin : " + count2);
		}

		if (amount >= 1) {
			count1 = amount / 1;
			amount = amount % 1;
			System.out.print("\nTotal Number Of 1 Rupees Note Or Coin : " + count1);
		}

		count = count2000 + count500 + count100 + count50 + count20 + count10 + count5 + count2 + count1;
		System.out.print("\n\nTotal Number Of Notes Require : " + count);
	}
}