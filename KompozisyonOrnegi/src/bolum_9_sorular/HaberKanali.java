package bolum_9_sorular;

public class HaberKanali extends Kanal {

    private String haberTuru;


    public HaberKanali(String adı, int kanalNo, String tur) {
        super(adı, kanalNo);
        this.haberTuru=tur;
    }
}
