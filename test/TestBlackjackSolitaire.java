package Luxoft_project1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestBlackjackSolitaire {
    @Test
    public void test1()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("JS", 10);
        gameBoard1[1] = new Card("9H", 9);
        gameBoard1[2] = new Card("3C", 3);
        gameBoard1[3] = new Card("5D", 5);
        gameBoard1[4] = new Card("JC", 10);
        gameBoard1[5] = new Card("AH", 1);
        gameBoard1[6] = new Card("9C", 9);
        gameBoard1[7] = new Card("4C", 4);
        gameBoard1[8] = new Card("6H", 6);
        gameBoard1[9] = new Card("6C", 6);
        gameBoard1[10]= new Card("3D", 3);
        gameBoard1[11] = new Card("8S", 8);
        gameBoard1[12] = new Card("8C", 8);
        gameBoard1[13] = new Card("2D", 2);
        gameBoard1[14] = new Card("3H", 3);
        gameBoard1[15] = new Card("AS", 1);
        gameBoard1[16] = new Card("9S", 9);
        gameBoard1[17] = new Card("7H", 7);
        gameBoard1[18] = new Card("5C", 5);
        gameBoard1[19] = new Card("JD", 10);
        assertEquals(24, BlackjackSolitaire.calculateScore(gameBoard1));
    }

    @Test
    public void test2()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("10C", 10);
        gameBoard1[1] = new Card("7S", 7);
        gameBoard1[2] = new Card("7C", 7);
        gameBoard1[3] = new Card("6S", 6);
        gameBoard1[4] = new Card("QS", 10);
        gameBoard1[5] = new Card("AS", 1);
        gameBoard1[6] = new Card("9S", 9);
        gameBoard1[7] = new Card("4C", 4);
        gameBoard1[8] = new Card("2C", 2);
        gameBoard1[9] = new Card("QC", 10);
        gameBoard1[10]= new Card("KH", 10);
        gameBoard1[11] = new Card("KC", 10);
        gameBoard1[12] = new Card("4S", 4);
        gameBoard1[13] = new Card("5C", 5);
        gameBoard1[14] = new Card("5D", 5);
        gameBoard1[15] = new Card("9H", 9);
        gameBoard1[16] = new Card("4H", 4);
        gameBoard1[17] = new Card("5S", 5);
        gameBoard1[18] = new Card("3D", 3);
        gameBoard1[19] = new Card("6C", 6);
        assertEquals(26, BlackjackSolitaire.calculateScore(gameBoard1));
    }


    @Test
    public void test3()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("KS", 10);
        gameBoard1[1] = new Card("9C", 9);
        gameBoard1[2] = new Card("8S", 8);
        gameBoard1[3] = new Card("6D", 6);
        gameBoard1[4] = new Card("AC", 1);
        gameBoard1[5] = new Card("AS", 1);
        gameBoard1[6] = new Card("4C", 4);
        gameBoard1[7] = new Card("9S", 9);
        gameBoard1[8] = new Card("6S", 6);
        gameBoard1[9] = new Card("JS", 10);
        gameBoard1[10]= new Card("6C", 6);
        gameBoard1[11] = new Card("4S", 4);
        gameBoard1[12] = new Card("QD", 10);
        gameBoard1[13] = new Card("8D", 8);
        gameBoard1[14] = new Card("9H", 9);
        gameBoard1[15] = new Card("3D", 3);

        assertEquals(30, BlackjackSolitaire.calculateScore(gameBoard1));
    }

    @Test
    public void test4()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("QH", 10);
        gameBoard1[1] = new Card("2C", 2);
        gameBoard1[2] = new Card("3H", 3);
        gameBoard1[3] = new Card("QS", 10);
        gameBoard1[4] = new Card("AC", 1);
        gameBoard1[5] = new Card("AD", 1);
        gameBoard1[6] = new Card("4H", 4);
        gameBoard1[7] = new Card("KH", 10);
        gameBoard1[8] = new Card("7C", 7);
        gameBoard1[9] = new Card("JH", 10);
        gameBoard1[10]= new Card("6D", 6);
        gameBoard1[11] = new Card("7H", 7);
        gameBoard1[12] = new Card("8S", 8);
        gameBoard1[13] = new Card("9D", 9);
        gameBoard1[14] = new Card("9S", 9);
        gameBoard1[15] = new Card("3D", 3);
        gameBoard1[16] = new Card("4C", 4);
        gameBoard1[17] = new Card("7D", 7);
        gameBoard1[18] = new Card("8H", 8);
        gameBoard1[19] = new Card("6H", 6);
        assertEquals(41, BlackjackSolitaire.calculateScore(gameBoard1));
    }


    @Test
    public void test5()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("AS", 1);
        gameBoard1[1] = new Card("9H", 9);
        gameBoard1[2] = new Card("4D", 4);
        gameBoard1[3] = new Card("3S", 3);
        gameBoard1[4] = new Card("10D", 10);
        gameBoard1[5] = new Card("JD", 10);
        gameBoard1[6] = new Card("6S", 6);
        gameBoard1[7] = new Card("5H", 5);
        gameBoard1[8] = new Card("4H", 4);
        gameBoard1[9] = new Card("AC", 1);
        gameBoard1[10]= new Card("JH", 10);
        gameBoard1[11] = new Card("2D", 2);
        gameBoard1[12] = new Card("6D", 6);
        gameBoard1[13] = new Card("4C", 4);
        gameBoard1[14] = new Card("QH", 10);
        gameBoard1[15] = new Card("7D", 7);
        gameBoard1[16] = new Card("3D", 3);
        gameBoard1[17] = new Card("10S", 10);
        gameBoard1[18] = new Card("10C", 10);
        gameBoard1[19] = new Card("7C", 7);
        assertEquals(42, BlackjackSolitaire.calculateScore(gameBoard1));
    }

    @Test
    public void test6()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("10S", 10);
        gameBoard1[1] = new Card("2D", 2);
        gameBoard1[2] = new Card("5S", 5);
        gameBoard1[3] = new Card("3S", 3);
        gameBoard1[4] = new Card("AC", 1);
        gameBoard1[5] = new Card("AD", 1);
        gameBoard1[6] = new Card("4D", 4);
        gameBoard1[7] = new Card("4C", 4);
        gameBoard1[8] = new Card("2H", 2);
        gameBoard1[9] = new Card("10C", 10);
        gameBoard1[10]= new Card("5C", 5);
        gameBoard1[11] = new Card("9C", 9);
        gameBoard1[12] = new Card("7C", 7);
        gameBoard1[13] = new Card("JD", 10);
        gameBoard1[14] = new Card("3H", 3);
        gameBoard1[15] = new Card("8D", 8);
        gameBoard1[16] = new Card("8C", 8);
        gameBoard1[17] = new Card("6C", 6);
        gameBoard1[18] = new Card("9S", 9);

        assertEquals(67, BlackjackSolitaire.calculateScore(gameBoard1));
    }

    @Test
    public void test7()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("JD", 10);
        gameBoard1[1] = new Card("5H", 5);
        gameBoard1[2] = new Card("KC", 10);
        gameBoard1[3] = new Card("QD", 10);
        gameBoard1[4] = new Card("9C", 9);
        gameBoard1[5] = new Card("JH", 10);
        gameBoard1[6] = new Card("2C", 2);
        gameBoard1[7] = new Card("4S", 4);
        gameBoard1[8] = new Card("2D", 2);
        gameBoard1[9] = new Card("QH", 10);
        gameBoard1[10]= new Card("4H", 4);
        gameBoard1[11] = new Card("KH", 10);
        gameBoard1[12] = new Card("10C", 10);
        gameBoard1[13] = new Card("AD", 1);
        gameBoard1[14] = new Card("8S", 8);
        gameBoard1[15] = new Card("8C", 8);
        gameBoard1[16] = new Card("KS", 10);
        gameBoard1[17] = new Card("QS", 10);
        gameBoard1[18] = new Card("4C", 4);
        gameBoard1[19] = new Card("3C", 3);
        assertEquals(12, BlackjackSolitaire.calculateScore(gameBoard1));
    }

    @Test
    public void test8()  {

        Card[] gameBoard1 = new Card[20];
        gameBoard1[0] = new Card("QH", 10);
        gameBoard1[1] = new Card("5H", 5);
        gameBoard1[2] = new Card("3H", 3);
        gameBoard1[3] = new Card("2H", 2);
        gameBoard1[4] = new Card("10S", 10);
        gameBoard1[5] = new Card("8S", 8);
        gameBoard1[6] = new Card("8C", 8);
        gameBoard1[7] = new Card("6S", 6);
        gameBoard1[8] = new Card("10H", 10);
        gameBoard1[9] = new Card("KH", 10);
        gameBoard1[10]= new Card("4C", 4);
        gameBoard1[11] = new Card("5C", 5);
        gameBoard1[12] = new Card("8H", 8);
        gameBoard1[13] = new Card("QS", 10);
        gameBoard1[14] = new Card("JS", 10);
        gameBoard1[15] = new Card("AC", 1);

        assertEquals(24, BlackjackSolitaire.calculateScore(gameBoard1));
    }
}


