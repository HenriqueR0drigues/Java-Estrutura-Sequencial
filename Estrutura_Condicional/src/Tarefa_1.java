
public class Tarefa_1 {
  public static void main(String[] args) {
	  
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if ( x > 0 ) {
			System.out.println("Número positivo");
		}
		else {
			System.out.println("Número negativo!");
		}
		
		sc.close();
  }
}
