import java.time.LocalDate;

public class ProdejceInfo {

    private String name;
    private LocalDate birthDate;
    private int totalContracts;
    private double carrotsSold;
    private boolean isSenior;

    public ProdejceInfo(String name, LocalDate birthDate, int totalContracts, double carrotsSold, boolean isSenior) {
        this.name = name;
        this.birthDate = birthDate;
        this.totalContracts = totalContracts;
        this.carrotsSold = carrotsSold;
        this.isSenior = isSenior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getTotalContracts() {
        return totalContracts;
    }

    public void setTotalContracts(int totalContracts) {
        this.totalContracts = totalContracts;
    }

    public double getCarrotsSold() {
        return carrotsSold;
    }

    public void setCarrotsSold(double carrotsSold) {
        this.carrotsSold = carrotsSold;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public void setSenior(boolean senior) {
        isSenior = senior;
    }

}
