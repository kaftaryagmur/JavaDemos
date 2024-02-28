
package reCapDemo1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //sayi al
		System.out.print("Sayi giriniz: ");
		int number = in.nextInt(); 
		boolean isPrime = true; //asal kabul et
		
		for(int i =2;i<number;i++){ // 2'den baslayarak kendisinden bir kucuk sayıya kadar bol.
			if(number%i == 0){
				isPrime = false;
			}
		}
		if(isPrime){
			System.out.println(number+ " asaldır.");
		}
		else {
			System.out.println(number+ " asal değildir.");
		}
	}

}
