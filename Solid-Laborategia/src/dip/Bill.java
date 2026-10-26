package dip;

import java.util.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    private IDeductions deductionCalc;
    private IVAT vatCalc;

    public Bill(IDeductions deductionCalc, IVAT vatCalc) {
        this.deductionCalc = deductionCalc;
        this.vatCalc = vatCalc;
    }

    public void totalCalc() {
        billDeduction = deductionCalc.calcDeduction(billAmount, deductionPercentage);
        VAT = vatCalc.calcVAT(billAmount);
        billTotal = (billAmount - billDeduction)+ VAT;
    }
}

