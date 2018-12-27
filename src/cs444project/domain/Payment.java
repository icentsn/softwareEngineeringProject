/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.domain;

/**
 *
 * @author icentsn
 */
public class Payment {
    private String cardNum = "";
    private String month = "";
    private String year = "";
    private String securityCode = "";
    private String firstName = "";
    private String lastName = "";
    private Login login = null;

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

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
        if(cardNum == null || (cardNum.equals(""))) return false;
        if(month == null || (month.equals(""))) return false;
        if(year == null || (year.equals(""))) return false;
        if(securityCode == null || (securityCode.equals(""))) return false;
        if(firstName == null || (firstName.equals(""))) return false;
        if(lastName == null || (lastName.equals(""))) return false;
        if(login == null) return false;
        return true;
    }
    
}
