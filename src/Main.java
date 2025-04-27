import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz!");

        int rastgeleSayi = (int)(Math.random()*100+1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Tahmin Ettiginiz Sayiyi Yazin:");
            int tahminEdilenSayi = scanner.nextInt();

            if (tahminEdilenSayi == rastgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin.");
                break;
            } else if (tahminEdilenSayi > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Daha büyük bir sayı girin.");
            }
        }

        System.out.println("Oyun bitti!");

    }
}