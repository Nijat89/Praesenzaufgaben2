package p3;

public class P3_main {
	public static void main(String[] args) {

		int a = 7;

		System.out.println("Betrag von " + a + " ist " + Math.abs(a));

		System.out.println("Quadrat von " + a + " ist " + Math.pow(a, 2));

		if (a % 2 == 0) {
			System.out.println("Die Zahl " + a + " ist gerade");
		} else {
			System.out.println("Die Zahl " + a + " ist ungerade");
		}

	}
}
