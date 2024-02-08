public class Customer {

    private String name;
    private int wallet;

    public Customer(String inputName, int inputWallet) {
        this.name = inputName;
        this.wallet = inputWallet;
    }

    public String getName() {
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }

}