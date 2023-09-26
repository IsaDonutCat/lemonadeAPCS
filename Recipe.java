import java.util.Scanner;

public class Recipe
{
    int lemons, sugar, ice, lemDiff, sugarDiff,iceDiff;
    int judgyness = 7; // at some point create a person value for this to pass on

    public Recipe ()
    {
        lemons = 3;
        sugar  = 2;
        ice = 5;
    }

    public void updateRecipe()
    {
        Scanner input = new Scanner(System.in);
        int ans;

        System.out.print("New # of lemons per pitcher:");
        ans = input.nextInt();
        lemons = ans;

        System.out.print("New # of sugar cubes per pitcher:");
        ans = input.nextInt();
        sugar = ans;

        System.out.print("New # of ice cubes per cup:");
        ans = input.nextInt();
        ice = ans;

        input.close();
        return;
    }

    public void printRec()
    {
        System.out.println("Lemons: " + lemons);
        System.out.println("Sugar: " + sugar);
        System.out.println("Ice cubes per cup:" + ice);
        return;
    }

    public int getLem()
    {
        return lemons;
    }

    public int getSug()
    {
        return sugar;
    }

    public int getIce()
    {
        return ice;
    }
    //create a ratio value to calculate the number of pitchers made 
}