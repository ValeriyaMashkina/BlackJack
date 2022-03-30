package Luxoft_project1;

import java.util.*;

public class Deck // реализация колоды карт, участвующей в игре
{
    private Queue<Card> cards; // очередь из карт, которые выдаются игроку
    private static char[] suits = {'H', 'S', 'D', 'C'}; // масти
    private static int[] numericGrades =  {10, 9, 8, 7, 6, 5, 4, 3, 2}; // ранги карт от 2 до 10
    private static char[] courtGrades =  {'K', 'Q', 'J'}; // ранги карт - король, дама, валет

    public Deck () //  создание новой колоды карт
    {
        LinkedList<Card> rawDeck = constructDeck();
        Collections.shuffle(rawDeck);
        this.cards = rawDeck;
    }

    private LinkedList<Card> constructDeck () // собираем колоду из 52 карт всех рангов и мастей
    {

        LinkedList<Card> result = new LinkedList<Card>();

        for (char suit : suits) // наполняем колоду картами кадой масти
        {
            for (int number : numericGrades) // наполняем колоду картами с номерами от 2 до 10
            {
                String cardName = new StringBuilder()
                        .append(Integer.toString(number)).append(suit).toString();
                Card newCard = new Card(cardName, number);
                result.add(newCard);
            }

            for (char grade : courtGrades) // добавляем короля, даму, валета
            {
                String cardName = new StringBuilder()
                        .append(grade).append(suit).toString();
                Card newCard = new Card(cardName, 10);
                result.add(newCard);
            }

            String cardName = new StringBuilder() // добавляем туз
                    .append("A").append(suit).toString();
            Card newCard = new Card(cardName, 1);
            result.add(newCard);
        }
        return result;
    }

    public Card getNextCard() { return this.cards.poll(); } // выдача игроку новой карты

}
