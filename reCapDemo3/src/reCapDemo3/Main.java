<<<<<<< HEAD
package reCapDemo3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // sayi al
		System.out.print("Aranacak sayiyi giriniz: ");
		
		int number = in.nextInt();

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==number) {
				System.out.println("Sayi "+(i+1)+". indekste mevcut");
				return;
			}
		}
		System.out.println("Sayi dizide yok.");
	}
}
=======
package reCapDemo3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // sayi al
		System.out.print("Aranacak sayiyi giriniz: ");
		
		int number = in.nextInt();

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==number) {
				System.out.println("Sayi "+(i+1)+". indekste mevcut");
				return;
			}
		}
		System.out.println("Sayi dizide yok.");
	}
}
>>>>>>> 6a6f35683c30af64c6c69cbae018cdcd82d307c2
