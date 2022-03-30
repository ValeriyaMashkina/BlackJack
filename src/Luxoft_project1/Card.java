package Luxoft_project1;

public class Card
{
   private int points; // очки, начисляемые за карту
   private String name; // имя карты, состоит из ранга и масти


    public Card(String name, int points) // создание новой карты
    {
        setName(name);
        setPoints(points);
    }


    public String getName() { return name; }
    private void setName(String name) { this.name = name; }

    public int getPoints() { return points; }
    private void setPoints(int points) { this.points = points; }

}
