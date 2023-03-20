import java.util.Random;
import java.util.Scanner;

public class Git_Kalendra {

	public static void main(String[] args) {
	int skaitlis, reizes,lielakais =0;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	do{
	System.out.println("Cik reizes mest kauliòu?");
	reizes = scan.nextInt();
	}while(reizes<1);
	for(int i=1; i<=reizes; i++){
	skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita sakitlis "+skaitlis);
	if(lielakais<skaitlis)
		lielakais = skaitlis;
		}
	System.out.println("Lielakais metienos ir "+lielakais);
		scan.close();
	
	
	}
	}
