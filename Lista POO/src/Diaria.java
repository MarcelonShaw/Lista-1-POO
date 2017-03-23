import java.util.Scanner;

public class Diaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int QD, T = 0, total;// QD = Quantidade de diárias
		final int DIARIA = 300;
		
		Scanner leitor = new Scanner(System.in); //Scanner
		
		System.out.println("Indique a quantidade de diarias: ");
		QD = leitor.nextInt();
		
		if (QD > 15)
			T = 12;{
				if (QD == 15)
					T = 14;{
						if (QD < 15)
							T = 20;
						
						total = (QD * DIARIA) + T;
						System.out.println("O valor a pagar é de: R$ " + total);
					}
		
		}

}
}
