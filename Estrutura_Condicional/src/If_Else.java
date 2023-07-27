
public class If_Else {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} 
		else if (hora < 18) {
			System.out.println("Boa tarde");
		} 
		else {
			System.out.println("Boa noite");
		}

		sc.close();
	}
}
