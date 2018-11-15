package Assignment_9;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for CTC");
		int CTC=scanner.nextInt();
		if(CTC>0 && CTC<=180000){
		
			System.out.println(" Tax Amount is Nil");
		}
		else if(CTC>181001 && CTC<=300000)
		
		{
			int Taxamount1=CTC/10;
			System.out.println(" Tax Amount is "+Taxamount1);
		
		}
		else if(CTC>300001 && CTC<=500000){
		
		
			int Taxamount3=CTC/5;
			System.out.println(" Tax Amount is "+Taxamount3);
		
		}
		else if(CTC>500001 && CTC<=1000000)
	
		{
			int Taxamount4=CTC*3/10;
			System.out.println(" Tax Amount is "+Taxamount4);
		}
	

	}

}
