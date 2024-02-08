import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork ohana;
    Artwork nani;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("HawaiiPics");
        ohana = new Artwork("Ohana", "Lilo", 40);
        nani = new Artwork("Nani", "Jumba", 20);
    }

    @Test
    public void canGetName() {
        assertThat(gallery.getName()).isEqualTo("HawaiiPics");
    }

    @Test
    public void canGetTill() {
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill() {
        gallery.setTill(40);
        assertThat(gallery.getTill()).isEqualTo(40);
    }

    @Test
    public void canRemoveArtworkFromGallery() {
        gallery.addArtwork(ohana);
        gallery.addArtwork(nani);
        gallery.removeArtwork(ohana);
        assertThat(gallery.artworkCount()).isEqualTo(1);
    }

    @Test
    public void canUpdateTill() {
        ohana.setPrice(0);
        assertThat(ohana.getPrice()).isEqualTo(gallery.getTill());
    }
}
