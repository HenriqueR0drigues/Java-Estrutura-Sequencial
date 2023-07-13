
public class Tarefa_5 {
  public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
								
		int numero, horas;
		double valorHora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = $ %.2f%n", salario );
		
		sc.close();
  }
}
