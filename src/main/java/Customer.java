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

//
//    public ArrayList<Artwork> getArtCollection() {
//        return this.artCollection;
//    }
//
//    public void addToArtCollection(ArrayList<Artwork> painting) {
//        this.artCollection = painting;
//    }

}