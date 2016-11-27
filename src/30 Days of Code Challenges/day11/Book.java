package librarycatalogue;

public class Book {


    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int dayCheckedOut) {
        isCheckedOut = checkedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    public void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }

    // Constructor
    public Book(int pageCount, int ISBN, String title) {
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.title = title;
        isCheckedOut = false;
    }
}
