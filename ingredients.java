import java.util.Random;

public class ingredients
{
    int quantity;
    double price, spoilage;

    new ingredients (double priceGiven, double spoilageGiven)
    {
        price = priceGiven;
        spoilage = spoilageGiven; //spoilage should be between 0 and 100
        quantity = 0;
    }

    boolean spoiled ()
    {
        int inverse = 100 - spoilage; // if inverse is less than the random number generated
        Random rand = new Random();
        int random = rand.nextInt(100);
        random++;

        if (random)
    }
}