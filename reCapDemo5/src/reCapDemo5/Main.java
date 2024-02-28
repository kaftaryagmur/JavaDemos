package reCapDemo5;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new OgrenciKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());

	}

}
