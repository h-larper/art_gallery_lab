import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;


    public Gallery(String inputName) {
        this.name = inputName;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int tillAmount) {
        this.till = tillAmount;
    }

    public int artworkCount() {
        return this.stock.size();
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    public void removeArtwork(Artwork artwork) {
        this.stock.remove(artwork);
    }

    public void updateTill(Artwork artwork) {
        till += artwork.getPrice();
    }

}


