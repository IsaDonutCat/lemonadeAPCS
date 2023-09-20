import java.lang.Math;

public class Recipe
{
    int lemons, sugar, ice, lemDiff, sugarDiff,iceDiff;
    int sugar;
    int ice;

    public void Recipe(int lemCount, int sugCount, int iceCount)
    {
        lemons = lemCount;
        sugar = sugCount;
        ice = iceCount;
        return;
    }

    public boolean similar(int lemCt, int sugCt, int iceCt)
    {
        lemDiff = lemCt - lemons;
        sugarDiff = sugCt - sugar;
        iceDiff = iceCt - ice;

        if (Math.abs(lemDif)f + Math.abs(sugarDiff) + Math.abs(iceDiff) > 5)
        {
            return true; // yummy
        }
        else
        {
            return false;
        }
    }

    public String critic(int temp, ) // comment on what needs to be changed. 
    {
        if (temp > 80 && iceDiff > 2)
        {
            return "More ice!"
        }
        else if ()
    }
}