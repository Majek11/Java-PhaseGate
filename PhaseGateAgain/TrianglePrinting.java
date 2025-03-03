public class TrianglePrinting {
	public static void main(String[] args) {
		TrianglePrintingProgram();
	}

	public static void TrianglePrintingProgram() {
		for (int count = 1; count <= 10; count++) {
			for (int firstTriangle = 1; firstTriangle <= count; firstTriangle++) {
				System.out.print("*");
			}
			System.out.print("         ");

			for (int secondTriangle = 10; secondTriangle >= count; secondTriangle--) {
				System.out.print("*");
			}
			System.out.print("         ");


			for (int thirdTriangle = 10; thirdTriangle >= count; thirdTriangle--) {
				System.out.print("*");
				}
			System.out.print("         ");


			for (int fourthTriangle = 1; fourthTriangle <= count; fourthTriangle++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}



