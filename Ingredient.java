import java.util.Scanner;

public class Ingredient
{
    String name; // name of ingredient
    float price, spoilage; // spoilage: if random float is < spoilage, spoils
    int quantity = 0; //number purchased

    public Ingredient (String called, float cost, float corrode) //constructor class
    {
        name = called;
        cost = price%.2f; 
        if (corrode > 1) //1 is needed for ice cubes
            spoilage -= (int) corrode; //goes for only the beginning before decimal part
        else
            spoilage = corrode;
    }

    public boolean purchase (int savings)
    {
        int ctBought;
        Scanner purchaseInput = new Scanner(System.in);
        String clearBuff;

        do
        {
            System.out.print("Enter the quantity of " + name + " you want to purchase.");
            int ctBought = purchaseInput.nextInt();    
            String clearBuff = purchaseInput.nextLine();

        }
        while (price * ctBought > )

    }
}