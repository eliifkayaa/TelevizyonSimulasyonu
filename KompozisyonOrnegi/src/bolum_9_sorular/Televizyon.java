package bolum_9_sorular;

import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public  Televizyon(String marka, String boyut) {
        this.marka=marka;
        this.boyut=boyut;
        kanallar = new ArrayList<>();
        ses=10;
        aktifKanal=1;
        kanallariOlustur();
        this.acik=false;
    }
        public void sesArttir() {
        if(ses < 20 && acik==true) {
            ses++;
            System.out.println("Ses seviyesi: " + ses);
        }
        else
            System.out.println("Ses maksimumda daha fazla arttıramazsın veya TV Kapalı");
        }

        public void sesAzalt() {
        if(ses > 0 && acik) {
            ses--;
            System.out.println("Ses seviyesi: " + ses);
        }
        else
            System.out.println("Ses minimumda daha fazla azaltamazsın veya TV Kapalı");
        }

    public void tvAc() {
        if(acik==false) {
            acik=true;
            System.out.println("TV açıldı");
        }
        else {
            System.out.println("TV zaten açık");
        }
    }
public void tvKapat() {
        if(acik==true) {
            acik=false;
            System.out.println("TV kapandı");
        }
        else {
            System.out.println("TV zaten kapandı");
        }
    }

    private void kanallariOlustur() {
        HaberKanali cnn=new HaberKanali("CNN",1,"Güncel Haber");
        kanallar.add(cnn);
        HaberKanali beinSport=new HaberKanali("Bein Sport",2,"Spor Haber");
        kanallar.add(beinSport);
        MuzikKanali dreamturk = new MuzikKanali("Dream Türk", 3, "Yerli");
        kanallar.add(dreamturk);
        MuzikKanali numberOne = new MuzikKanali("Number One", 4, "Yabancı");
        kanallar.add(numberOne);
    }
    public void kanalDegistir(int acilmasiİstenenKanal) {
        if(acik) {
                if(acilmasiİstenenKanal != aktifKanal) {
                    if(acilmasiİstenenKanal <= kanallar.size() && acilmasiİstenenKanal >=0 ) {
                         aktifKanal=acilmasiİstenenKanal;
                        System.out.println("Kanal: " + acilmasiİstenenKanal + " Bilgi: " + kanallar.get(aktifKanal -1 ).kanalBilgisiniGoster());
                    }
                    else {
                        System.out.println("Geçerli bir kanal numarası giriniz");
                    }
                }
                else {
                    System.out.println("Zaten " + aktifKanal + " . kanaldasınız. Değiştirme yapılamadı");
                }
        }
        else{
            System.out.println("Önce televizyonu açınız ");
        }

    }

    public void aktifKanaliGoster() {
        if (acik) {
            System.out.println("Aktif Kanal: " + kanallar.get(aktifKanal - 1).kanalBilgisiniGoster());
        }
        else  {
            System.out.println("Önce televizyonu açınız ");
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka : " + marka + "  Boyut : " + boyut + " olan tv oluşturuldu.";
    }
}
