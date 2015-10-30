import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OPT_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		int range = in.nextInt(); //range�N�� 0 ~ range-1  ���d��
		int ans = in.nextInt();  // �]�w����
		int count = 0;  //�q������
		int guess = (int) ( (-1 + Math.sqrt(1 + 8*range))/2 );  //�Q�Τ����D�o OPT_H(n)
		guess = range - guess;

		guesser(ans, guess, count);
	
	}
	
	public static int guesser(int answer, int guess, int count){
		
		count = count + 1;
		System.out.println("Guess " + guess);
		
		if(answer == guess){
			System.out.println("Bingo!" + " You guess " + count +" times.");
		}
		else if(answer>guess){
			guesser(answer, guess+1, count);
		}
		else if(answer<guess){
			int range = guess - 1;
			guess = (int) ( (-1 + Math.sqrt(1 + 8*range))/2);
			guess = range - guess;
			guesser(answer, guess, count);
		}

		return 0;
	}

}
