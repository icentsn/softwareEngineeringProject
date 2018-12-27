/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444project.domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author icentsn
 */
public class ShippingTest {
    
    public ShippingTest() {
    }

    @Test
    public void testValidate() {
        Shipping shipping = new Shipping();
        boolean result = shipping.validate();
        assertFalse(result);
        shipping.setAddress("3333 Regis Blvd");
        result = shipping.validate();
        assertFalse(result);
        shipping.setCity("Denver");
        result = shipping.validate();
        assertFalse(result);
        shipping.setState("Colorado");
        result = shipping.validate();
        assertFalse(result);
        shipping.setZipCode("80221");
        result = shipping.validate();
        assertFalse(result);
        Login login = new Login();
        login.setUsername("jdoe");
        login.setPassword("123456");
        shipping.setLogin(login);
        result = shipping.validate();
        assertTrue(result);
    }
    
}
