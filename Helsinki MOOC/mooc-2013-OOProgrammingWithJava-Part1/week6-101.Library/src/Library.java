/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cam
 */
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList = new ArrayList<Book>();
    
    public Library() {
    }

    public void addBook(Book newBook) {
        bookList.add(newBook);
    }
    
    public void printBooks() {
        for (Book a : this.bookList) {
            System.out.println(a.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        /*ArrayList<Book> found = new ArrayList<Book>();
        for (int a = 0; a < bookList.size(); a++) {
            if (bookList.get(a).title().contains(title)) {
                found.add(bookList.get(a));
            } else{
                
            }
        }
        
        
        return found*/
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and all the matching books found in the list.
        // use method contains instead of equals for String objects

        for (Book findTitle : this.bookList) {
            if (StringUtils.included(findTitle.title(), title)) {   // new if
                found.add(findTitle);
            }
        }

        //new if statement: if (StringUtils.included(findTitle.title(), title)) {
        //old if statement: if (findTitle.title().contains(title)) {

        return found;
    }
    
    
    public ArrayList<Book> searchByPublisher(String publisher){
         ArrayList<Book> found = new ArrayList<Book>();
         for (int a = 0; a < bookList.size(); a++) {
            if (bookList.get(a).publisher().contains(publisher)) {
                found.add(bookList.get(a));
            } else{
                
            }
        }
         
         return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
         ArrayList<Book> found = new ArrayList<Book>();
         for (int a = 0; a < bookList.size(); a++) {
            if (bookList.get(a).year() == year) {
                found.add(bookList.get(a));
            } else{
                
            }
        }
         
         return found;
    }
}
