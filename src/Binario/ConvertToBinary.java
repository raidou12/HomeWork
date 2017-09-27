package Binario;
import java.util.Scanner;

public class ConvertToBinary
{
	
		Scanner in = new Scanner(System.in);
		boolean repeat;
		int decimal = 0;
		int resto;
		String answer="";
		String	reverseanswer="";
		
		public void TransformInBinary(){
		decimal = in.nextInt();
		
		
		if(decimal == 0)
		{
			reverseanswer = ""+decimal;
		}else
		{
			do{
				if(decimal != 2)
				{
					if(decimal != 3)
					{
						resto = (decimal % 2);
						answer = (answer+(resto+""));
						decimal = (decimal / 2);
						repeat = true;
					}else
					{
						repeat = false;
					}
				}else
				{
					repeat = false;
				}
			}while(repeat == true);
			
			if(decimal == 2)
			{
				answer = answer + "01";
			}else if(decimal == 3)
			{
				answer = answer + "11";
			}
				for (int i = answer.length()-1; i >= 0; i--)
				{
					reverseanswer += answer.charAt(i);
				}
		}
		System.out.println("resposta: "+reverseanswer);
		}
}
