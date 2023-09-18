import java.lang.Math;

public class Recipe
{
    int lemons;
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
        int lemDiff = Math.abs(lemCt - lemons);
        int sugarDiff = Math.abs(sugCt - sugar);
        int iceDiff = Math.abs(iceCt - ice);

        if (lemDiff + sugarDiff + iceDiff > 5)
        {
            return true; // yummy
        }
        else
        {
            return false;
        }
    }

    public String critic{} // comment on what needs to be changed. 
}