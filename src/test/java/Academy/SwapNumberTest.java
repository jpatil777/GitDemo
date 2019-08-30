package Academy;

public class SwapNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int temp;
		System.out.println("before swapping the numbers" + x + y);

		temp = x;
		x = y;
		y = temp;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swapping the numbers" + x + y);

	}

}
