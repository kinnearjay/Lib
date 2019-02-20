import java.util.Date;

public class Map extends Item{
    private String nameOfCartographer;
    public Map(int itemID, String title, String author, Date date, String publisher, String nameOfCartographer) {
        super(itemID, title, author, date, publisher);

        this.nameOfCartographer = nameOfCartographer;
    }

}
