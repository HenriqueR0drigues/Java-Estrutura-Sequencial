
public class Tarefa_3 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double R, A, pi = 3.14159;

		R = sc.nextDouble();

		A = pi * R * R;

		System.out.printf("A=%.4f%n", A);
		
		sc.close();
	}
}
