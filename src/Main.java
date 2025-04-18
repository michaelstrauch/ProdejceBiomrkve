import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ProdejceInfo prodejce1 = new ProdejceInfo("John",LocalDate.of(1950, 12, 13) , 140, 10.2, true);
        ProdejceInfo prodejce2 = new ProdejceInfo("Henry",LocalDate.of(1990,01, 11), 40, 2.9, false);

        System.out.println("Prodejce 1:");
        System.out.println("Jmeno: " + prodejce1.getName());
        System.out.println("Datum narozeni: " +prodejce1.getBirthDate());
        System.out.println("Pocet smluv: " + prodejce1.getTotalContracts());
        System.out.println("Prodanych mrvki v tunach: " + prodejce1.getCarrotsSold());
        System.out.println("Seniorni prodejce ? " + prodejce1.isSenior());
        System.out.println();
        System.out.println("Prodejce 2:");
        System.out.println("Jmeno: " + prodejce2.getName());
        System.out.println("Datum narozeni: " + prodejce2.getBirthDate());
        System.out.println("Pocet smluv: " + prodejce2.getTotalContracts());
        System.out.println("Prodanych mrkvi v tunach: " + prodejce2.getCarrotsSold());
        System.out.println("Seniorni prodejce ? " + prodejce2.isSenior());
    }
}