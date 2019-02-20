import java.util.Date;

public class Thesis extends Item{
    private String abstractOfThesis;
    public Thesis(int itemID, String title, String author, Date date, String publisher, String abstractOfThesis) {
        super(itemID, title, author, date, publisher);
        this.abstractOfThesis = abstractOfThesis;
    }
}
