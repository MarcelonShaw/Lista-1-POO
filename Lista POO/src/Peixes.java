import java.util.Scanner;

public class Peixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double P, M, E;
		final int MQ = 4; //Multa por quilo
		
		Scanner leitor = new Scanner(System.in); //Scanner
		
		System.out.println("Indique o peso dos peixes: ");
		P = leitor.nextDouble();
			
		if (P > 50)
			E = P - 50;
		else
			E = 0;
		
		M = E * MQ;
		
		System.out.println("Seu Excesso é de: " + E);
		System.out.println("Sua multa é de : " + M);
		
				
			
			
		   		
	 
		
		

	}

}
