package startjava;

import java.io.IOException;

public class factoriel {
	public static void main(String[] args) throws IOException {
		int f = 1;
		int x = 0;
		//read the value from user
		/*System.out.println(x);
		x = ( char )System.in.read;
		System.out.println(x);*/
		do {
			f= f * x;
			x--;
		}while(x>1);
		System.out.println(f);
	}
}
