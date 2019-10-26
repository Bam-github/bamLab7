package edu.cscc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//import org.junit.java.lang.String;
public class RPSLSpock_Test {
    private RPSLSpock BSpock;
    @Before
    public void pretest(){
        BSpock = new RPSLSpock();
    }

    @Test
    public void isValidPick() {
        assertTrue(BSpock.isValidPick("rock") == true);
        assertTrue(BSpock.isValidPick("paper") == true);
        assertTrue(BSpock.isValidPick("scissors") == true);
        assertTrue(BSpock.isValidPick("lizard") == true);
        assertTrue(BSpock.isValidPick("spock") == true);
        assertTrue(BSpock.isValidPick("book") == false);

       // assertFalse(BSpock.equals(BSpock.generatePick(), null) && BSpock.isEmpty(BSpock.generatePick()));
        assertTrue(BSpock.isValidPick(BSpock.generatePick()) == true);
    }

    @Test
    public static void generatePick() {
        String pick = "";
        for(int counter=0 ; counter < 1000000 ; counter++) {
            String pickTest = BSpock.generatePick();
           
        }
    }

    @Test
    public void isComputerWin() {
    }
}