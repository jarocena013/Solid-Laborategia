package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

// Fakturaren totala kalkulatzen duen metodoa.  
	public void totalCalc() {
		DeductionKalkuloa k= new DeductionKalkuloa();
		VatKalkulua v= new VatKalkulua();
// Dedukzioa kalkulatu 
		billDeduction = k.kalkulatu(billAmount, deductionPercentage);
// VAT kalkulatzen dugu 
		float vatPortzentai= (float) 0.18;
		VAT = v.vatKalkulatu(billAmount, vatPortzentai,code);
// Totala kalkulatzen dugu 
		billTotal = (billAmount - billDeduction) + VAT;
	}
}
