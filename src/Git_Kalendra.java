import java.util.Random;
import java.util.Scanner;

public class Git_Kalendra {

	public static void main(String[] args) {
	int skaitlis, reizes;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	do{
	System.out.println("Cik reizes mest kauli�u?");
	reizes = scan.nextInt();
	}while(reizes<1);
	for(int i=1; i<=reizes; i++){
	skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita sakitlis "+skaitlis);
		}
		scan.close();
	
	
	}
	}
