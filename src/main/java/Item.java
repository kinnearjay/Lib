import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Item {
    private int itemID;
    private String title;
    private String author;
    private Date date;
    private String publisher;
    private List<Item> itemList = new ArrayList();

    public Item(int itemID, String title, String author, Date date, String publisher) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.date = date;
        this.publisher = publisher;
    }

    public int getItemID() {
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getPublisher() {
        return publisher;
    }


}
