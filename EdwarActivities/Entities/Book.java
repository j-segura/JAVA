package EdwarActivities.Entities;

public class Book {

    private int isbm;
    private String title;
    private String author;
    private int pagesNumber;

    public Book(int isbm, String title, String author, int pagesNumber){
        this.isbm = isbm;
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    public Book(){};

    // Setters
    public void setIsbm(int isbm) {
        this.isbm = isbm;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
    
    //Getters
    public int getIsbm() {
        return isbm;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPagesNumber(){
        return pagesNumber;
    }

}
