
public class ex_condicional_ternaria {
  static public void main(String[] args) {
	  java.util.Scanner sc = new java.util.Scanner(System.in); 
	  
	  double preco = 34.5;
	  double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	  
	  if (preco < 20) {
		  desconto = preco * 0.1;
	  }
	  else {
		  desconto = preco * 0.05;
	  }
	  
	  System.out.println(desconto);
	  
	  sc.close();
  }
}