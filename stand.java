import java.util.Scanner;

public class stand {
    public static void main(String[] args)
    {
        Scanner dayNumInput = new Scanner(System.in);
        System.out.print("Duration (Days):");
        int daysNum;
        double cash = 20.00;
        double price = 0.50;
        daysNum = dayNumInput.nextInt(); // duration is done
        if (daysNum > 30 || daysNum < 1)
        {
            System.out.println("Invalid Number of Days");
            dayNumInput.close();
            return;
        }   
        dayNumInput.close();

        Ingredients lemons = new Ingredients(0.45, 80, "lemons");
        Ingredients sugar = new Ingredients(0.35, 80, "lemons");
        Ingredients iceCubes = new Ingredients(0.07, 0, "ice cubes");
        Ingredients cups = new Ingredients(0.17, 100, "paper cups");
        Recipe userRecipe = new Recipe();
        Customer oneGuy = new Customer();
        int temp;
        double test;
        bool opinion;
        for (int i = 0; i < daysNum; i++)
        {   
            temp = (int) (Math.random() * 40) + 60;
            System.out.println("Good morning!");
            System.out.println("Today it is " + temp+ " degrees Farenheit!");


            Scanner ingredShop = new Scanner(System.in);
            System.out.println("                  Shop                  ");
            System.out.println("You have " + cash + " dollars");
            System.out.println();

            test = lemons.purchase(cash);
            
            if (test >= 0)
            {
                cash = test;
                System.out.println("You have " + cash + " dollars remaining.");
            }

            test = iceCubes.purchase(cash);

            if (test >= 0)
            {
                cash = test;
                System.out.println("You have " + cash + " dollars remaining.");
            }

            test = sugar.purchase(cash);

            if (test >= 0)
            {
                cash = test;
                System.out.println("You have " + cash + " dollars remaining.");
            }

            test = sugar.purchase(cash);

            if (test >= 0)
            {
                cash = test;
                System.out.println("You have " + cash + " dollars remaining.");
            }

            test = cups.purchase(cash);

            if (test >= 0)
            {
                cash = test;
                System.out.println("You have " + cash + " dollars remaining.");
            }

            ingredShop.close();


            System.out.println();
            System.out.println("                  Recipe                  ");
            System.out.println("Current Recipe:");
            userRecipe.printRec();

            Scanner recInput = new Scanner(System.in);

            System.out.print("Change Recipe? (Y/N)");
            String ans = recInput.nextLine();
            
            if (!(ans.equals("N")))
            {
                userRecipe.updateRecipe();
            }

            System.out.print("Set a price:");
            price = recInput.nextDouble();
            recInput.close();

            for (int j = 0; j < temp; j++)
            {
                if (soldOut())
                    break;
                
                opinion = oneGuy.similar(price, userRecipe.getLem(), userRecipe.getSug(), userRecipe.getIce());

                if (!opinion)
                {
                    System.out.println(oneGuy.critic(temp, price));
                }
            }
            
        } // days loop
    } // end of main method
} // end of class
