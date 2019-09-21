
import java.util.Random;

class Coin
{
    Random num = new Random();
    int attempt;
    String side;

    int flip()
    {
        attempt = Math.abs(num.nextInt()) % 2;
        return attempt;
    }
}


class Result extends Coin
{
    String Side()
    {
        if (flip() == 0)
        {
            side = "Heads!";
            //System.out.println("Heads!");
        } else {
            side = "Tails!";
            //System.out.println("Tails!");
        }
        return side;
    }

}

class Game extends Result
{
    void play()
    {
        for (int i = 1; i <= 3; i++)
        {
            if (i == 1)
            {
                System.out.println("First Attempt:\t" + Side());
            } else if ( i == 2) {
                System.out.println("Second Attempt:\t" + Side());
            } else {
                System.out.println("Third Attempt:\t" + Side());
            }
        }
    }
}

class Toss
{
    public static void main(String[] args)
    {
        Game dollar = new Game();
        dollar.play();
    }
}