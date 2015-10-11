import java.util.Scanner;

public class Handson2 {
	public static void main(String[]args){
		int Michael,Bruce;
		
		Scanner in = new Scanner(System.in);  
		   System.out.println("This is Michael's Number");
		   Michael = in.nextInt();
		   System.out.println("This is Bruce's Number");
		   Bruce = in.nextInt();
		
		if (Michael > Bruce){
			
			System.out.println("The winner is Michael");
		}
			else if  (Michael < Bruce){
				System.out.println("The Winner is Bruce");
			}
			else if (Michael == Bruce){
			System.out.println("Michael and Bruce have same number please start again");
			
			
		}
	}

}
