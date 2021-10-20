import static java.lang.Math.abs;

public class Squibbery {

	public static int getWoodcock(int wrappage, int adhere) {
		if (wrappage < adhere) {
			return wrappage + adhere;
		} else {
			return abs(wrappage - adhere) * abs(wrappage - adhere);
		}
	}

	public static int getRegulate(int benzazine, int melipona, int writee) {
		int asta = melipona - 17 * benzazine;
		if (asta * asta == writee) {
			return asta;
		} else {
			return asta * (-1);
		}
	}

}
