import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ProdejceInfo prodejce1 = new ProdejceInfo("John",LocalDate.of(1950, 12, 13) , 140, 10.2, true);
        ProdejceInfo prodejce2 = new ProdejceInfo("Henry", LocalDate.of(1990,01, 11), 40, 2.9, false);

        System.out.println("Prodejce 1:");
        System.out.println(prodejce1.getName());
        System.out.println(prodejce1.getBirthDate());
        System.out.println(prodejce1.getTotalContracts());
        System.out.println(prodejce1.getCarrotsSold());
        System.out.println(prodejce1.isSenior());
        System.out.println();
        System.out.println("Prodejce 2:");
        System.out.println(prodejce2.getName());
        System.out.println(prodejce2.getBirthDate());
        System.out.println(prodejce2.getTotalContracts());
        System.out.println(prodejce2.getCarrotsSold());
        System.out.println(prodejce2.isSenior());
    }
}