import java.util.Date;

public class Book extends Item{
    private String blurb;

    public Book(int itemID, String title, String author, Date date, String publisher, String blurb) {
        super(itemID, title, author, date, publisher);

        this.blurb = blurb;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }
}
