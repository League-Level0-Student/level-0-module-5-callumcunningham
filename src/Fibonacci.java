

public class Fibonacci {
  public static void main(String[] args) {
	
	  int a = 0;
	  
	  int b = 1;
	  
	  int sum;
	  
	  for (int i = 0; i < 11; i++) {
		  
		  sum = a + b;
		  
		  a = b;
		  
		  b = sum;
		  
		System.out.println(sum);  
		  
		  
	  }
}
}
