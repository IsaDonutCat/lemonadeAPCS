import java.util.Random;
import java.util.Scanner;

public class Ingredients
{
    int quantity;
    double price, spoilage;
    String name; 
    public Ingredients (double priceGiven, double spoilageGiven, String itemName)
    {
        price = priceGiven;
        spoilage = spoilageGiven; //spoilage should be between 0 and 100
        quantity = 0;
        name = itemName;
    }

    public double purchase(double bank)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("You have " + quantity + " " + name + ". Buy more " + name + "? (Y/N)");
        String ans = input.nextLine();

        if (!(ans.equals("N")))
        {
            System.out.println("Quantity to Purchase: ");
            int count = input.nextInt();

            double cost = count * price;

            if (bank > cost)
            {
                quantity += count;
                System.out.println("Purchase was successful! You now have " + quantity + " " + name + ".ss");
                input.close();
                return bank - cost; // purchase was successful, subtract money
            }
            else
            {
                System.out.println("Not enough money!");
                input.close();
                return bank; //lol no broke
            }
        }
        input.close();
        return -1;
    }

    public boolean spoiled()
    {
        Random rand = new Random();
        int random = rand.nextInt(100);

        if (random <= spoilage)
        {
            return true; //spoiled
        }
        else
        {
            return false; //not spoiled
        }
    }

    
}