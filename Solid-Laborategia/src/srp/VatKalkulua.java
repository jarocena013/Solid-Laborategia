package srp;

public class VatKalkulua {

	public float vatKalkulatu(float billAmount, float percentage, String kode) {
		if (kode.equals("0"))
			return 0;
		else
			return (float) (billAmount * percentage);
	}
}
