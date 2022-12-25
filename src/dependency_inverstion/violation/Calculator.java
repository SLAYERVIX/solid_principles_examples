package dependency_inverstion.violation;

public class Calculator
{
    public double Add(double x, double y)
    {
        return x + y;
    }

    public double Subtract(double x, double y)
    {
        return x - y;
    }

    // if we want to add new operation then this will violate OCP
}
