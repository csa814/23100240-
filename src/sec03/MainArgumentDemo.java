package sec03;

public class MainArgumentDemo {
	public static void main(String[] args) {
		if (args.length == 2) {
			int i = Integer.parseInt(args[1]);
			Println(args[0], i);
		} else

			System.out.println("어이쿠!");
	}

	public static void Println(String s, int n) {
		for (int i = 0; i < n; i++)
			System.out.println(s);
	}
}