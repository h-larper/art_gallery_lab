import java.util.ArrayList;

public class Artwork {

    private String title;
    private String artist;
    private int price;

    public Artwork(String inputTitle, String inputArtist, int inputPrice) {
        this.title = inputTitle;
        this.artist = inputArtist;
        this.price = inputPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int amount) {
        this.price = amount;
    }

}
