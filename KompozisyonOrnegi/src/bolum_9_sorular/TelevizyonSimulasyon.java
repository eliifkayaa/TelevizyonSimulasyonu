package bolum_9_sorular;

import java.util.Scanner;

public class TelevizyonSimulasyon {
    static Scanner tara = new Scanner(System.in);
    static Televizyon tv; //her seferin de yeni bir televizyon olusturmaması için static nesne tanımladık

    public static void main(String[] args) {

        menuGoster();
        boolean cikis=false;

        while (cikis==false) {
            System.out.println("Seçiminiz: (Menüyü görmek için 8'i tuşlayın)");
            int secim= tara.nextInt();

            switch (secim) {

                case 1:
                    tvKurveKanallariOlustur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 6:
                    kanalBilgisiGoster();
                    break;
                case 7:
                    tvKapat();
                    break;

                case 8:
                    menuGoster();
                    break;
                case 0:
                        System.out.println("Sistemden çıkılıyor");
                        cikis=true;
                        break;
                default:
                    System.out.println("0 ile 8 arasında bir değer giriniz");
                    break;
            }
        }
    }

    private static void kanalBilgisiGoster() {
        if(tv != null) {
            tv.aktifKanaliGoster();
        }
        else {
            System.out.println("Önce TV'yi kurun ve kanalları oluşturun.");
        }
    }

    private static void kanalDegistir() {
        if(tv != null) {
            System.out.println("Hangi kanalı açmak istersiniz\n");
            int acilmasiİstenenKanal= tara.nextInt();
            tv.kanalDegistir(acilmasiİstenenKanal);
        }
        else {
            System.out.println("Önce TV'yi kurun ve kanalları oluşturun.");
        }
    }

    private static void sesArttir() {
        if (tv != null) { //tv oluştu mu
            tv.sesArttir();
        } else {
            System.out.println("Önce TV'yi kurun ve kanalları oluşturun.");
        }
    }
        private static void sesAzalt() {
        if (tv != null) { //tv oluştu mu
            tv.sesAzalt();
        } else {
            System.out.println("Önce TV'yi kurun ve kanalları oluşturun.");
        }
    }
    private static void tvKapat() {
        if (tv!=null) { //tv oluştu mu
            tv.tvKapat();
        }
        else {
            System.out.println("Önce TV'yi kurun ve kanalları oluşturun.");
        }
    }

    private static void tvAc() {
        if (tv!=null) { //tv oluştu mu
            tv.tvAc();
        }
        else {
            System.out.println("Önce TV'yi kurun ve kanalları oluşturun.");
        }
    }

    private static void tvKurveKanallariOlustur() {
        if(tv==null) {
            tara.nextLine();
            System.out.println("Televizyonun markasını giriniz");
            String marka = tara.nextLine();
            System.out.println("Televizyonun boyutunu giriniz");
            String boyut = tara.nextLine();
            tv=new Televizyon(marka,boyut);
            System.out.println(tv);
        }
        else {
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        System.out.println("**************MENU*****************");
        System.out.println(" 0 -- Çıkış\n" +
                "1 -- Televizyonu Kur\n" +
                "2 -- Televizyonu Aç\n" +
                "3 -- Sesini Arttır\n" +
                "4 -- Sesi Azalt\n" +
                "5 -- Kanal Değiştirin\n" +
                "6 -- Kanal Bilgisini Goster\n" +
                "7 -- Televizyonu Kapat\n" +
                "8 -- Menüyü Göster\n"
                );
    }
}
