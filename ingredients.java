import java.util.Random;

public class Ingredients
{
    public int quantity;
    public double price, spoilage;

    public Ingredients (double priceGiven, double spoilageGiven)
    {
        price = priceGiven;
        spoilage = spoilageGiven; //spoilage should be between 0 and 100
        quantity = 0;
    }

    public boolean spoiled()
    {
        Random rand = new Random();
        int random = rand.nextInt(100);

        if (random < spoilage)
        {
            return true; //spoiled
        }
        else
        {
            return false; //not spoiled
        }
    }
}