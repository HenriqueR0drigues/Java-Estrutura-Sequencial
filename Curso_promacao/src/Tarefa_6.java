
public class Tarefa_6 {
  public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int cod1, cod2, qte1, qte2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qte1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qte2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = preco1 * qte1 + preco2 * qte2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();
  }
}
