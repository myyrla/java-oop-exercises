package entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(){

    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double income = getAnualIncome();
        double rate = (numberOfEmployees >= 10) ? 0.14 : 0.16;
        return income * rate;
    }
}
