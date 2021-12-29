package bolum_9_sorular;

public class MuzikKanali extends Kanal{

    private String muzikTuru;


    public MuzikKanali(String adı, int kanalNo, String muzikTuru) {
        super(adı, kanalNo);
        this.muzikTuru=muzikTuru;
    }
}
