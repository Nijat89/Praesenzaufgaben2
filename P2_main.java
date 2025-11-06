package p2;

public class P2_main {

	public static void main(String[] args) {

		int a = 50;
		int b = 50;
		int c = 100;
		int d = 0;

		if (a == b) {
			d += 1;
		}
		if (a == c || a == b) {
			d += 1;
		}
		if (a + b >= c) {
			d += 1;
		}
		if (a + b + c >= 100) {
			d += 1;
		}
		System.out.println(d + " Eigenschaften sind erfüllt!");
	}

}
