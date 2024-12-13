import java.util.Scanner;

public class AtmProje {

    public static void main(String[] args) {
        int bakiye = 1000, input, miktar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Merhabalar Mert Banka'ya Hoşgeldiniz!");
        System.out.println("Güncel Bakiyeniz : " + bakiye + " TL");

        while (bakiye > 0) {
            System.out.println();
            System.out.println("1-) Para Yatır");
            System.out.println("2-) Para Çek");
            System.out.println("3-) Bakiye Sorgula");
            System.out.println("4-) Çıkış Yap");
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: ");
            
            try {
                input = scan.nextInt();

                if (input == 1) {
                    System.out.print("Yatırmak istediğiniz miktar: ");
                    miktar = scan.nextInt();
                    if (miktar < 0) {
                        System.out.println("Negatif bir miktar yatıramazsınız!");
                    } else {
                        bakiye += miktar;
                    }
                } else if (input == 2) {
                    System.out.print("Çekmek istediğiniz miktar: ");
                    miktar = scan.nextInt();
                    if (miktar < 0) {
                        System.out.println("Negatif bir miktar çekemezsiniz!");
                    } else if (miktar > bakiye) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        bakiye -= miktar;
                    }
                } else if (input == 3) {
                    System.out.println("Güncel Bakiyeniz : " + bakiye + " TL");
                } else if (input == 4) {
                    System.out.println("Çıkış Yapılıyor! Tekrar Bekleriz.");
                    break;
                } else {
                    System.out.println("Geçersiz bir işlem girdiniz!");
                }
            } catch (Exception e) {
                System.out.println("Geçerli bir sayı giriniz!");
                scan.nextLine(); // Hatalı girdiyi temizler
                continue; // Döngüyü yeniden başlatır
            }
        }

        System.out.println("Program sonlandı. Tekrar Bekleriz!");
    }
}
