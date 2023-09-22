import java.lang.Math;

public class Recipe
{
    int lemons, sugar, ice, lemDiff, sugarDiff,iceDiff;
    int judgyness = 7; // at some point create a person value for this to pass on

    public Recipe(int lemCount, int sugCount, int iceCount)
    {
        lemons = lemCount;
        sugar = sugCount;
        ice = iceCount;
    }

    public void updateRecipe(int lemCount, int sugCount, int iceCount)
    {
        lemons = lemCount;
        sugar = sugCount;
        ice = iceCount;
        return;
    }
}