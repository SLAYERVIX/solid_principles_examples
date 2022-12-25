package dependency_inverstion.solution;

public class Calculator
{

    public ICalculator calculator = null;

    public Calculator(ICalculator calculator)
    {
        this.calculator = calculator;
    }

    public double Solve(double x, double y)
    {
        // Calculations will be based on the "injected" ICalculatorOperation.
        return calculator.Calculate(x, y);
    }
}