package myjavaprograms;
import java.util.Scanner ;

public class v�cudkitleendeksinihesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, weight, index1;
	
		Scanner input= new Scanner(System.in);
		
		//boy �l��s�n� al
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz ");
		height= input.nextDouble();
		//kilo �l��s�n� al
		System.out.print("L�tfen kilonuzu (kilogram cinsinde) giriniz ");
		weight= input.nextDouble();
		
		//v�cud kitle endeksini hesapla
		index1= weight/(height*height);
		
		System.out.println("V�cut Kitle �ndeksiniz : " + index1 );
		
		System.out.print("ProgramEND") ;
		

		
		
		
		
		
		
		

	}

}
