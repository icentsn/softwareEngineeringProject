/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.domain;
import java.util.*;

/**
 *
 * @author icentsn
 */
public class Account {
    private List<Book> books = new LinkedList<Book>();
    private String firstName = "";
    private String lastName = "";
    private int id;
    private int nextId = 0;

    public List<Book> getBooks() {
        return books;
    }
    
    
    public Book add(Book book){
        book.setId(++nextId);
        books.add(book);
        return book;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private Login login = null;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    public boolean validate(){
        if(firstName == null || (firstName.equals(""))) return false;
        if(lastName == null || (lastName.equals(""))) return false;
        if(login == null) return false;
        return true;
    }
}
