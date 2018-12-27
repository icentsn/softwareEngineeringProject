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
public class AccountTest {
    
    public AccountTest() {
    }

    @Test
    public void testValidate() {
        Account account = new Account();
        boolean result = account.validate();
        assertFalse(result);
        account.setFirstName("John");
        result = account.validate();
        assertFalse(result);
        account.setLastName("Doe");
        result = account.validate();
        assertFalse(result);
        Login login = new Login();
        login.setUsername("jdoe");
        login.setPassword("123456");
        account.setLogin(login);
        result = account.validate();
        assertTrue(result);
    }
    
}
