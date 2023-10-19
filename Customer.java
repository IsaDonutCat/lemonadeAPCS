public class Customer
{
    double priceLimit;
    int ice, lemon, sugar, lemDiff, sugarDiff, iceDiff;
    int tolerance = 7;

    public Customer()
    {
        priceLimit = Math.random();
        ice = 4;
        lemon = 8;
        sugar = 3;
        return;
    }

    
    /** 
     * @param price
     * @param lemCt
     * @param sugCt
     * @param iceCt
     * @return boolean
     */
    public boolean similar(double price, int lemCt, int sugCt, int iceCt)
    {
        lemDiff = lemCt - lemon;
        sugarDiff = sugCt - sugar;
        iceDiff = iceCt - ice;

        if (price > priceLimit)
        {
            return false;
        }
        if (Math.abs(lemDiff) + Math.abs(sugarDiff) + Math.abs(iceDiff) < tolerance)
        {
            return true; // yummy
        }
        else
        {
            return false;
        }
    }

    
    /** 
     * @param temp
     * @param price
     * @return String
     */
    public String critic(int temp, double price) // comment on what needs to be changed. 
    {
        if (price > priceLimit)
            return "$$$";

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