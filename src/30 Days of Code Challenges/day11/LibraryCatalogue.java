package librarycatalogue;

import librarycatalogue.Book;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public LibraryCatalogue(Map<String, Book> bookCollection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }


    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }
    public Book getBook (String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public void setLengthOfCheckoutPeriod(int lengthOfCheckoutPeriod) {
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public void setInitialLateFee(double initialLateFee) {
        this.initialLateFee = initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }

    //Setters
    public void nextDay(){
        currentDay++;
    }

    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.isCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
            return;
        }else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " + (getCurrentDay() + getLengthOfCheckoutPeriod()) +".");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0){
            System.out.println("You own the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + "because your books is " + daysLate + "days overdue.");
        } else {
            System.out.println("Book Returned. Thank you");
        }
        book.setCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry " +book.getTitle() + " is already checked out. " + "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod() + "."));
    }
    public static void main(String[] args) {
        Map <String,Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book (827132, 9999999 , "Harry Potter");
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setCurrentDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
}
