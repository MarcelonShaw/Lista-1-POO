import java.util.Scanner;

public class Triângulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lado1, lado2, lado3;
		
		Scanner leitor = new Scanner(System.in); //Scanner
		
		System.out.println("Indique o primeiro lado do triângulo: ");
		lado1 = leitor.nextDouble();
		System.out.println("Indique o segundo lado do triângulo: ");
		lado2 = leitor.nextDouble();
		System.out.println("Indique o terceiro lado do triângulo");
		lado3 = leitor.nextDouble();
		
		if((lado1 + lado2) <= lado3 || (lado2 + lado3) <= lado1 || (lado1 + lado3) <= lado2)
			System.out.println("Não é triângulo");
		else
			if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado1 + lado3) > lado2){
				
				if((lado1 == lado2) && (lado2 ==lado3))
					System.out.println("Triângulo equilátero");{
						
						if ((lado1 == lado2) && (lado2 != lado3) || (lado1 == lado3) && (lado1 != lado2) ||(lado2 == lado3) && (lado2 != lado1))
							System.out.println("Triângulo Isósceles");{
								
								if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3))
									System.out.println("Triângulo escaleno ");}
							}
								
							}
					}
}
				
			
		
				
				
						
						
									
		
		
		
		
				
						
							
					
			
			
				
			
		
				
			
			
				
		

			
		
					
		
		
		
			
		
		
				

	


