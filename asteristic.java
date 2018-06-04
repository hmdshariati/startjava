package startjava;

public class asteristic {
	public static void main (String[] args){
		char a = '*';//your character-ask user
		int r = 3; //user input greater than 2
		int x = -1;//for step 1 - steps are with 2 diffrences
		for (int i = 0 ; i< r ; i++) {//count x every 2 step
			if(i<=r/2)// check recursive shape
				x += 2;
			else
				x -= 2;
			int c =0;//initialize for next loop
			do {//shape print loop in every step
				System.out.print(a);
				c++;
			}while(x > c);
			System.out.println(' ');//next line print
		}
			
	}
}
