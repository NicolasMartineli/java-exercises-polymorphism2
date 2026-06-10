package poo_tax_exercise;

public abstract class TaxPayer {
    private String name;
    private Double annualIncome;
    public TaxPayer(){}
    public TaxPayer(Double anuallIncome, String name) {
        this.annualIncome = anuallIncome;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnnualIncome() {
        return annualIncome;
    }
    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
    public abstract double tax();
}
