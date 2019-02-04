package nested_loops;

public class ForaGauntletboi {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int j = 100; j < 0; j++) {
			System.out.println(j);
		}
		for (int a = 2; a < 100; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
		for (int b = 0; b < 99; b++) {
			if (b % 2 == 1) {
				System.out.println(b);
			}
		}
		for (int c = 0; c < 500; c++) {
			if (c % 2 == 1) {
				System.out.println(c + " is odd");
			}
			if (c % 2 == 0) {
				System.out.println(c + " is even");
			}
		}
		for (int d = 7; d < 777; d++) {
			if (d % 7 == 0) {
				System.out.println(d);
			}
		}
		int age = 0;
		for (int year = 2007; year < 2019; year++) {

			System.out.println("In " + year + ", I was " + age + " years old.");
			age++;
		}

		for (int e = 0; e < 3; e++) {
			for (int f = 0; f < 3; f++) {
				System.out.println(e + " " + f);
			}
		}
		
		for (int g = 0; g < 9; g+=3) {
			for (int h = 1; h < 4; h++) {
				System.out.print(h + g );
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
