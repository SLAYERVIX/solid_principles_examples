package dependency_inverstion.solution;

public class AddCalculatorOperation implements ICalculator{
    @Override
    public double Calculate(double x, double y)
    {
        return x + y;
    }
}
