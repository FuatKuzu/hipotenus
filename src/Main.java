import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kenar1, kenar2, kenar3;
        double u,alan;
       // hipotenus= (genislik*genislik) + (yukseklik*yukseklik);
        Scanner girdi = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz: ");
        kenar1 = girdi.nextInt();
        System.out.println("İkinci kenerı giriniz: ");
        kenar2 = girdi.nextInt();
        System.out.println("Üçüncü kenerı giriniz: ");
        kenar3 = girdi.nextInt();

        u = (kenar1+kenar2+kenar3)/2;
        alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin alanı= " +alan);
    }
}