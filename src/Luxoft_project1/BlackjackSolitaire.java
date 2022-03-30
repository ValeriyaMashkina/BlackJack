package Luxoft_project1;
import java.util.*;

public class BlackjackSolitaire
{
    public static Deck deck; // колода карт, участвующая в игре
    public static Card[] gameBoard; // игровое поле со всеми ячейками от 1 до 20 (с учетом "мусорных")
    public static String[] screenBoard; // игровое поле, отображаемое на экране, с ячейками от 1 до 16 (без учета "мусорных")
    public static int cardsPlayed; // количество карт, лежащих на отображамом на экране поле (в ячейках от 1 до 16)

    public static void play()
    {
        gameBoard = new Card[20];
        screenBoard = new String[16];
        deck = new Deck();
        cardsPlayed = 0;
        System.out.println("The game is on! Enter numbers from 1 to 16 to place the card " +
                "or numbers from 17 to 20 to throw it");
        printBoard();

        while (cardsPlayed < 16)
        {
            Card currentCard = deck.getNextCard();
            System.out.println("Current card: " + currentCard.getName());
            Integer input = null;
            Scanner sc = new Scanner(System.in);
            while(true)
            {

                try { input = Integer.parseInt(sc.nextLine()); }
                catch (Exception e)
                {
                    System.out.println("Wrong number! Enter numbers from 1 to 20");
                    continue;
                }

                if (input != null && isWrongNumber(input))
                {
                    System.out.println("Wrong number! Enter numbers from 1 to 20");
                    continue;
                }

                else if (input != null && isOccupiedNumber(input))
                {
                    System.out.println("This number is already occupied. Choose another");
                    continue;
                }

                else if (input != null) {break;}
            }

            gameBoard[input-1] = currentCard;
            if (input >= 1 && input <=16) {cardsPlayed++;}
            printBoard();
        }
        int result = calculateScore(gameBoard);
        System.out.println("The game is over. Your score is: " + result +". Bye!");
    }

    // проверка на корреткность введенного игроком числа
    public static Boolean isWrongNumber (int i)
    {
        return ((i < 1) || (i > 20));
    }

    // проверка на занятость выбранной игроком ячейки
    public static Boolean isOccupiedNumber (int i)
    {
        return (gameBoard[i-1] != null);
    }

    public static int calculateScore(Card[] board) // подсчет итогов игры
    {
        int result = 0;
        // на основе игрового поля создаем 9 массивов карт (колонок и строк):
        Card[] hand1 = new Card[] {board[0], board[5]};
        Card[] hand2 = new Card[] {board[1], board[6], board[10], board[13]};
        Card[] hand3 = new Card[] {board[2], board[7], board[11], board[14]};
        Card[] hand4 = new Card[] {board[3], board[8], board[12], board[15]};
        Card[] hand5 = new Card[] {board[4], board[9]};
        Card[] hand6 = new Card[] {board[0], board[1], board[2], board[3], board[4]};
        Card[] hand7 = new Card[] {board[5], board[6], board[7], board[8], board[9]};
        Card[] hand8 = new Card[] {board[10], board[11], board[12]};
        Card[] hand9 = new Card[] {board[13], board[14], board[15]};

        // по каждому массиву посчитаем баллы и добавим в общий результат игры
        result +=calculateHandScore (hand1, true);
        result +=calculateHandScore (hand2, false);
        result +=calculateHandScore (hand3, false);
        result +=calculateHandScore (hand4, false);
        result +=calculateHandScore (hand5, true);
        result +=calculateHandScore (hand6, false);
        result +=calculateHandScore (hand7, false);
        result +=calculateHandScore (hand8, false);
        result +=calculateHandScore (hand9, false);

        return result;
    }



    // подсчет баллов по каждому массиву
    // аргумент hand - массив, по которому производится расчет
    // аргумент isBlackJackColumn - отметка о том, может ли в указанном массиве (колонке) быть блэкджек

    public static int calculateHandScore (Card[] hand, Boolean isBlackJackColumn)
    {
        int res = 0;
       Boolean hasAce = false;

        for (int i = 0; i < hand.length; i++)
        {
            res += hand[i].getPoints();
            if (hand[i].getName().equals("AH") ||
                hand[i].getName().equals("AS") ||
                hand[i].getName().equals("AD") ||
                hand[i].getName().equals("AC"))
            {hasAce = true;}
        }

        if (hasAce && convertPointsToScore(res,isBlackJackColumn) < convertPointsToScore(res+10, isBlackJackColumn))
        { res += 10;}

        return convertPointsToScore(res, isBlackJackColumn);
    }

    // перевод очков в баллы по каждому массиву
    // аргумент input - количество очков в массиве
    // аргумент isBlackJackColumn - отметка о том, может ли в указанном массиве (колонке) быть блэкджек
    public static int convertPointsToScore(int input, Boolean isBlackJackColumn)
    {
        if (input == 21 && !isBlackJackColumn) {return 7;}
        if (input == 21 && isBlackJackColumn) {return 10;}
        else if (input == 20) {return 5;}
        else if (input == 19) {return 4;}
        else if (input == 18) {return 3;}
        else if (input == 17) {return 2;}
        else if (input <= 16) {return 1;}
        else  {return 0;}
    }


    // отображение поля для игрока
    public static void printBoard()
    {
        for (int i = 0; i < 16; i++)
        {
            if (gameBoard[i] != null) { screenBoard[i] = gameBoard[i].getName(); }
            else { screenBoard[i] = Integer.toString(i+1); }
        }

        System.out.printf("%s   %s   %s   %s   %s\n", screenBoard[0], screenBoard[1], screenBoard[2],
                screenBoard[3], screenBoard[4]);
        System.out.printf("%s   %s   %s   %s   %s\n", screenBoard[5], screenBoard[6], screenBoard[7],
                screenBoard[8], screenBoard[9]);
        System.out.printf("  %s   %s   %s     \n", screenBoard[10], screenBoard[11], screenBoard[12]);
        System.out.printf("  %s   %s   %s     \n", screenBoard[13], screenBoard[14], screenBoard[15]);

    }
}



