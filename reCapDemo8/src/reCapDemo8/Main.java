package reCapDemo8;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator calculator= new WomanGameCalculator();
		calculator.hesapla();
		calculator.gameOver();
		
		GameCalculator calculator2= new ManGameCalculator(); //GameCalculator calculator2= new GameCalculator(); tanımında override gerekir.
		calculator2.hesapla();
		calculator2.gameOver();
	}

}
