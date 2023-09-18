public class Customer
{
    double priceLimit;
    Recipe prefer = new Recipe(int lemons, int ice, int sugar);
    int bandWagon;

    public void Customer(Recipe preference, double priceLim, int wagoner)
    {
        prefer = preference;
        priceLimit = priceLim;
        bandWagon = wagoner;
        return;
    }
}