package reCapDemo8;

public abstract class GameCalculator { //abstract siniflar new'lenemez
	
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
