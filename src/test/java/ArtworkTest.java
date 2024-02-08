import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp() {
        artwork = new Artwork("Ohana", "Lilo", 30);
    }

    @Test
    public void canGetTitle() {
        assertThat(artwork.getTitle()).isEqualTo("Ohana");
    }

    @Test
    public void canGetArtist() {
        assertThat(artwork.getArtist()).isEqualTo("Lilo");
    }

    @Test
    public void canGetPrice() {
        assertThat(artwork.getPrice()).isEqualTo(30);
    }

    @Test
    public void canSetPrice() {
        artwork.setPrice(40);
        assertThat(artwork.getPrice()).isEqualTo(40);
    }


}
