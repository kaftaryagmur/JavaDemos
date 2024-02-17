package reCapDemo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // harf al
		System.out.print("Sesli harf giriniz: ");
		char harf = in.next().charAt(0);

		switch (harf) {
		case 'a':
		case 'A':
		case 'ı':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(harf + " kalın ünlüdür.");
			break;
		case 'e':
		case 'E':
		case 'i':
		case 'İ':
		case 'ö':
		case 'Ö':
		case 'ü':
		case 'Ü':
			System.out.println(harf + " ince ünlüdür.");
			break;
		default:
			System.out.println("Sesli harf girin.");
		}

	}

}
