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
public class PaymentTest {
    
    public PaymentTest() {
    }

    @Test
    public void testValidate() {
        Payment payment = new Payment();
        boolean result = payment.validate();
        assertFalse(result);
        payment.setCardNum("123456789123456");
        result = payment.validate();
        assertFalse(result);
        payment.setMonth("03");
        result = payment.validate();
        assertFalse(result);
        payment.setYear("03");
        result = payment.validate();
        assertFalse(result);
        payment.setSecurityCode("789");
        result = payment.validate();
        assertFalse(result);
        payment.setFirstName("John");
        result = payment.validate();
        assertFalse(result);
        payment.setLastName("Doe");
        result = payment.validate();
        assertFalse(result);
        Login login = new Login();
        login.setUsername("jdoe");
        login.setPassword("123456");
        payment.setLogin(login);
        result = payment.validate();
        assertTrue(result);
    }
    
}
