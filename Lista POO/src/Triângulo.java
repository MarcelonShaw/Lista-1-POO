import java.util.Scanner;

public class Tri�ngulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lado1, lado2, lado3;
		
		Scanner leitor = new Scanner(System.in); //Scanner
		
		System.out.println("Indique o primeiro lado do tri�ngulo: ");
		lado1 = leitor.nextDouble();
		System.out.println("Indique o segundo lado do tri�ngulo: ");
		lado2 = leitor.nextDouble();
		System.out.println("Indique o terceiro lado do tri�ngulo");
		lado3 = leitor.nextDouble();
		
		if((lado1 + lado2) <= lado3 || (lado2 + lado3) <= lado1 || (lado1 + lado3) <= lado2)
			System.out.println("N�o � tri�ngulo");
		else
			if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado1 + lado3) > lado2){
				
				if((lado1 == lado2) && (lado2 ==lado3))
					System.out.println("Tri�ngulo equil�tero");{
						
						if ((lado1 == lado2) && (lado2 != lado3) || (lado1 == lado3) && (lado1 != lado2) ||(lado2 == lado3) && (lado2 != lado1))
							System.out.println("Tri�ngulo Is�sceles");{
								
								if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3))
									System.out.println("Tri�ngulo escaleno ");}
							}
								
							}
					}
}
				
			
		
				
				
						
						
									
		
		
		
		
				
						
							
					
			
			
				
			
		
				
			
			
				
		

			
		
					
		
		
		
			
		
		
				

	


