package functions;

public class Reverse {
	Integer esq;
	Integer dir;
	
	public Reverse(Integer esq, Integer dir) {
		super();
		this.esq = esq;
		this.dir = dir;
	}

	public String reverseString(char[] charArray) {
		while(esq < dir) {
			char temporario = charArray[esq];
			charArray[esq] = charArray[dir];
			charArray[dir] = temporario;
			dir--;
			esq++;
		}
		return new String(charArray);
	}
}
