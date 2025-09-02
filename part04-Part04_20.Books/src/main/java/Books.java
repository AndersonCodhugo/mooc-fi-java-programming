public class Books {
    
    private String title;
    private int pages;
    private int year;
    
    public Books(String bookTitle, int bookPages, int bookYear ) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = bookYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getYear() {
        return year;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages" + ", " + this.year;
    }
}

