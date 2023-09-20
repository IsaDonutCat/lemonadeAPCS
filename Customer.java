public class Customer
{
    double priceLimit;
    int bandWagon;
    int ice, lemon, sugar, lemDiff, sugarDiff, iceDiff;
    int judgyness = 7;

    public void Customer(int iceice, int sour, int sweetie, double priceLim, int wagoner)
    {
        priceLimit = priceLim;
        bandWagon = wagoner;
        ice = iceice;
        lemon = sour;
        sugar = sweetie;
        return;
    }

    public boolean similar(int lemCt, int sugCt, int iceCt)
    {
        lemDiff = lemCt - lemon;
        sugarDiff = sugCt - sugar;
        iceDiff = iceCt - ice;

        if (Math.abs(lemDiff) + Math.abs(sugarDiff) + Math.abs(iceDiff) < judgyness)
        {
            return true; // yummy
        }
        else
        {
            return false;
        }
    }

    public String critic(int temp) // comment on what needs to be changed. 
    {
        if (temp > 80 && iceDiff < -2)
        {
            return "More ice!";
        }
        else if (iceDiff > 2)
        {
            return "That's cold!";
        }
        else
        {
            return "Ick!";
        }
    }
}