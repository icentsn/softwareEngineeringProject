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
public class Shipping {
    private String address = "";
    private String city = "";
    private String state = "";
    private String zipCode = "";
    private Login login = null;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    public boolean validate(){
        if(address == null || (address.equals(""))) return false;
        if(city == null || (city.equals(""))) return false;
        if(state == null || (state.equals(""))) return false;
        if(zipCode == null || (zipCode.equals(""))) return false;
        if(login == null) return false;
        return true;
    }
}
