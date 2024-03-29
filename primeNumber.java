package number;

public class primeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Prime Number");
		int n = 200, num;
		for (int i = 3; i <= n; i++) {
			num = 0;
			for (int k = 2; k <= i / 2; k++) {
				if (i % k == 0) {
					num++;
					break;
				}

			}
			if (num == 0) {
				System.out.println(i);
			}
		}
	}
}
