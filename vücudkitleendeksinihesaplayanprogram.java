package myjavaprograms;
import java.util.Scanner ;

public class vücudkitleendeksinihesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, weight, index1;
	
		Scanner input= new Scanner(System.in);
		
		//boy ölçüsünü al
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz ");
		height= input.nextDouble();
		//kilo ölçüsünü al
		System.out.print("Lütfen kilonuzu (kilogram cinsinde) giriniz ");
		weight= input.nextDouble();
		
		//vücud kitle endeksini hesapla
		index1= weight/(height*height);
		
		System.out.println("Vücut Kitle Ýndeksiniz : " + index1 );
		
		System.out.print("ProgramEND") ;
		

		
		
		
		
		
		
		

	}

}
