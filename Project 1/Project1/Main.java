
public class Main {
	public static void main(String args[]) {
		int num1 = 234, num2 = 235;
		one: {
			two: {
				three: {
					if (num1 == num2 >> 1)
						break one;
				}
				System.out.println(num1);
			}
			System.out.println(num2);
		}
	}
}