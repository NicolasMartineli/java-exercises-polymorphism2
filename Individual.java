package poo_tax_exercise;

public class Individual extends  TaxPayer{
    private Double healthExpenditures;
    public Individual(){}
    public Individual(Double annualIncome, String name, Double healthExpendiatures) {
        super(annualIncome, name);
        this.healthExpenditures = healthExpendiatures;
    }
    public Double getHealthExpendiatures() {
        return healthExpenditures;
    }
    public void setHealthExpendiatures(Double healthExpendiatures) {
        this.healthExpenditures = healthExpendiatures;
    }
    @Override
    public double tax() {
        double basicTax;
        if (getAnnualIncome() < 20000.00) {
            basicTax = getAnnualIncome() * 0.15;
        }
        else {
            basicTax = getAnnualIncome() * 0.25;
        }
        double healthDiscount = healthExpenditures * 0.50;
        double totalTax = basicTax - healthDiscount;
        if (totalTax < 0.0) {
            return 0.0;
        }
        return totalTax;
    }
    }

