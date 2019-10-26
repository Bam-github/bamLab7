package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RPSLSpock_Test {

    @Test
    public void isValidPick() {

        RPSLSpock Bam = new RPSLSpock();

        assertTrue(Bam.isValidPick("rock") == true);
        assertTrue(Bam.isValidPick("paper") == true);
        assertTrue(Bam.isValidPick("scissors") == true);
        assertTrue(Bam.isValidPick("lizard") == true);
        assertTrue(Bam.isValidPick("spock") == true);
        assertTrue(Bam.isValidPick("book") == false);

        assertTrue(Bam.isValidPick(Bam.generatePick()) == true);
    }

    @Test
    public void generatePick() {
        RPSLSpock Bam = new RPSLSpock();
        for (int counter = 0; counter < 1000000; counter++) {
            assertTrue(Bam.isValidPick(Bam.generatePick()) == true);

        }
    }

    @Test
    public void isComputerWin() {
        RPSLSpock Bam = new RPSLSpock();
        
        Assert.assertTrue(Bam.isComputerWin("rock", "scissors"));
       Assert.assertTrue(Bam.isComputerWin("rock", "lizard"));
       Assert.assertTrue(Bam.isComputerWin("paper", "rock"));
        Assert.assertTrue(Bam.isComputerWin("paper", "spock"));
        Assert.assertTrue(Bam.isComputerWin("scissors", "paper"));
        Assert.assertTrue(Bam.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(Bam.isComputerWin("lizard", "paper"));
        Assert.assertTrue(Bam.isComputerWin("lizard", "spock"));
        Assert.assertTrue(Bam.isComputerWin("spock", "scissors"));
        Assert.assertTrue(Bam.isComputerWin("spock", "rock"));
        Assert.assertFalse(Bam.isComputerWin("rock", "paper"));

    }
}


