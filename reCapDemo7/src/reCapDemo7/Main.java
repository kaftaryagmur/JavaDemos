<<<<<<< HEAD
package reCapDemo7;

public class Main {
	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new TarimKrediManager(),
				new OgretmenKrediManager() ,new OgrenciKrediManager()};
		for (BaseKrediManager baseKrediManager : krediManagers) {
			System.out.println(baseKrediManager.hesapla(1000));
		}
	}
}
=======
package reCapDemo7;

public class Main {
	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new TarimKrediManager(),
				new OgretmenKrediManager() ,new OgrenciKrediManager()};
		for (BaseKrediManager baseKrediManager : krediManagers) {
			System.out.println(baseKrediManager.hesapla(1000));
		}
	}
}
>>>>>>> 6a6f35683c30af64c6c69cbae018cdcd82d307c2
