import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String inputName, int inputWallet) {
        this.name = inputName;
        this.wallet = inputWallet;
        this.artCollection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int amount) {
        this.wallet = amount;
    }


    public void buyArtwork(Gallery gallery, Artwork artwork) {
        if(wallet >= artwork.getPrice()) {
            wallet -= artwork.getPrice();
        }
    }


        // ATTEMPTED ADD TO ART COLLECTION
//    public void addToArtCollection(Artwork artwork) {
//        this.artCollection.add(artwork);
//    }
//
//    public void artCollectionCount() ){
//        this.artCollection.size();
//    }
    }
