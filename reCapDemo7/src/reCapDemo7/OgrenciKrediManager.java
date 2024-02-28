
package reCapDemo7;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) { //overriding
		return tutar * 1.10;
	}
}
// final keyword'ü ile override engellenir. ör: public final double hesapla();