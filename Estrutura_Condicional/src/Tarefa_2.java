
public class Tarefa_2 {
  public static void main(String[] main){
	  java.util.Scanner sc = new java.util.Scanner(System.in);
	  
	  int N =  sc.nextInt();
	  
	  if (N % 2 == 0) {
		  System.out.println("PAR");
	  }
	  else {
		  System.out.println("IMPAR");
	  }
	  sc.close();
  }
}
