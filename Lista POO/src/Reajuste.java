import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int VMM;// Venda m�dia mensal
		double PA, reajuste = 0, taxa = 0; //Pre�o atual
		
		Scanner leitor = new Scanner(System.in); //Scanner
		
		System.out.println("Venda m�dia mensal do produto: ");
		VMM = leitor.nextInt();
		System.out.println("Pre�o atual do produto: ");
		PA = leitor.nextDouble();
		
		if (VMM < 500 && PA >= 30 || VMM >=500 && VMM < 1200 && PA < 30 && PA >= 60 || VMM >= 1200 && PA <80|| PA > 60 && PA< 80){
			System.out.println("N�o a reajuste");}
		else
			if (PA < 30){
				taxa = (PA * 10) / 100;
				reajuste = PA + taxa;
				System.out.println("Reajustado: " + reajuste);}
				else
					if ((PA >= 30) && (PA < 60)){
						taxa = (PA * 15) / 100;
					    reajuste = PA + taxa;
					    System.out.println("Reajustado: " + reajuste);}
					else
					    if (PA >= 80){
							taxa = (PA * 20) / 100;
							reajuste = PA - taxa;
							System.out.println("Reajustado: " + reajuste);}
					    }

				}
			
	


					
							
					    	
						
			
	
				
					
			
		
		
 
						
					
					
					
				


