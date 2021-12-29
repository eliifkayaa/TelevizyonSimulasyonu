package bolum_9_sorular;

public class Kanal {
    private String adı;
    private int kanalNo;

    public Kanal(String adı, int kanalNo) {
        this.adı = adı;
        this.kanalNo = kanalNo;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }

    public String kanalBilgisiniGoster() {
        return "Adı: " + adı + " Kanal No: " + kanalNo;
    }
}
