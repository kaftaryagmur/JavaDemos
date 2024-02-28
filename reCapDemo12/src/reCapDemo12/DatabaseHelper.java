<<<<<<< HEAD
package reCapDemo12;
//inner class yapisi SOLID prensibi cercevesine single resp. ilkesine aykiridir

public class DatabaseHelper {
	public static class Crud{ //create, read update and delete
		public static void Delete() {
			System.out.println("silindi");
		}
		public static void Update() {
			System.out.println("Güncellendi");
		}
	}
	public static class Connection{
		public static void createConnection() {
			System.out.println("Baglanti olusturuldu");
		}
	}
}
=======
package reCapDemo12;
//inner class yapisi SOLID prensibi cercevesine single resp. ilkesine aykiridir

public class DatabaseHelper {
	public static class Crud{ //create, read update and delete
		public static void Delete() {
			System.out.println("silindi");
		}
		public static void Update() {
			System.out.println("Güncellendi");
		}
	}
	public static class Connection{
		public static void createConnection() {
			System.out.println("Baglanti olusturuldu");
		}
	}
}
>>>>>>> 6a6f35683c30af64c6c69cbae018cdcd82d307c2
