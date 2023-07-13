
public class Tarefa_4 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        
		int A, B, C, D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();
	    
	    dif = A * B - C * D;
	    
	    System.out.println("Diferença = " + dif);
	    
	    sc.close();
	}
}
