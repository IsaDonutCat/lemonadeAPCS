import java.util.Scanner;

public class stand {
    public static void main(String[] args)
    {
        Scanner dayNumInput = new Scanner(System.in);
        System.out.print("Duration (Days):");
        int daysNum;
        double cash = 20.00;
        daysNum = dayNumInput.nextInt(); // duration is done
        if (daysNum > 30 || daysNum < 1)
        {
            System.out.println("Invalid Number of Days");
            return;
        }   
        dayNumInput.close();

        Ingredients lemons = new Ingredients(0.45, 80, "lemons");
        Ingredients iceCubes = new Ingredients(0.07, 0, "ice cubes");
        Ingredients cups = new Ingredients(0.17, 100, "paper cups");


        Scanner ingredShop = new Scanner(System.in);
        System.out.println("                  Shop                  ");
        System.out.println("You have " + cash + " dollars");
        System.out.println();

        double test;

        test = lemons.purchase(cash);
        
        if (test >= 0)
        {
            cash = test;
            System.out.println("You have " + cash + " dollars remaining.");
        }

        test = iceCubes.purchase(cash);

        
    }
}
