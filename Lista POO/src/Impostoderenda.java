import java.util.Scanner;

public class Impostoderenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double RH, RM, RC , IR, RL, ali = 0;
	
	
	Scanner leitor = new Scanner(System.in); //Scanner
	
	System.out.println("Indique a renda do homem: ");
	RH = leitor.nextDouble();
	System.out.println("Indique a renda da mulher: ");
	RM =leitor.nextDouble();
	
	RC = RH + RM;
	System.out.println("A renda conjunta � de: " + RC);
	
	if (RC <= 900)
		ali = 0;{
			if (RC <= 1500)
				ali = 10;{
				if (RC <= 2500)
					ali = 15;{
						if (RC > 2500)
							ali = 25;}
				}
		}
		System.out.println("A aliquota ultizada � de: " + ali);
		IR = (RC * ali) / 100;
		RL = RC - IR;
		
		System.out.println("O imposto de renda � de: " + IR);
		System.out.println("A renda l�quida � de: " + RL);
		
	}	
}

    
	
				
		
					
		
	
				
				
		
					
		
					
				
			
		
			
	
					
		
				 
						
				 
	
	
				
	
	
		
				
	
	
	
		
		
	
	
			


