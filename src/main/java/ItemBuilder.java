import java.util.Date;

public class ItemBuilder {
    private static ItemBuilder builder;
    private int itemID;
    private String title;
    private String author;
    private Date date;
    private String cartographer;
    private String blurb;
    private String abstractOfThesis;
    private String publisher;

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Item buildItem(){
        String typeOfItem = "";
       switch(typeOfItem){
           case "book":
               this.blurb = blurb;
               Book book1 = new Book(12,title,author,date,publisher,blurb);
               return  (Item)book1;
           case "thesis":
               Book book2 = new Book(12,title,author,date,publisher,blurb);
               return  (Item)book2;

       }
        return new Item(12,title,author,date,publisher);
    }
    public static ItemBuilder getInstance(){
        if(builder==null){
            builder = new ItemBuilder();
        }
        return builder;
    }

    private ItemBuilder(){

    }


}
