package functions;

public class Fibonacci {
	Integer x;
	Integer y;
	
	
	public Fibonacci(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}


	public boolean isFibonacci(int n) {
		while(y < n) {
			int temporario = y;
			y += x;
			x = temporario;
		}
		return y == n;
	}
}
