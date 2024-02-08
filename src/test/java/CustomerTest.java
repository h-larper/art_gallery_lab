import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork ohana;
    Artwork nani;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Stitch", 100);
        ohana = new Artwork("Ohana", "Lilo", 40);
        nani = new Artwork("Nani", "Jumba", 20);
    }

    @Test
    public void customerHasName() {
        assertThat(customer.getName()).isEqualTo("Stitch");
    }

    @Test
    public void customerHasWallet() {
        assertThat(customer.getWallet()).isEqualTo(100);
    }

    @Test
    public void updateCustomerWallet() {
        customer.setWallet(30);
        assertThat(customer.getWallet()).isEqualTo(30);
    }

//
//    @Test
//    public void canAddToArtCollection() {
//        customer.addToArtCollection();
//        assertThat()
//    }

//    @Test
//    public void canBuyArtwork() {
//        // check wallet balance
//        // check artwork price
//        // set wallet
//        // update till ?????
//    }

}
