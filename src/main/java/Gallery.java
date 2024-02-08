import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;


    public Gallery(String inputName, int inputTill) {
        this.name = inputName;
        this.till = inputTill;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getTill() {

    }


}
