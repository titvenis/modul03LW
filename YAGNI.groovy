//Избыточное создание абстракций
public class Circle
{
    private double _radius;

    public Circle(double radius)
    {
        _radius = radius;
    }

    public double CalculateArea()
    {
        return Math.PI * _radius * _radius;
    }
}
//Излишняя параметризация методов
public class MathOperations
{
    public int Add(int a, int b)
    {
        return a + b;
    }
}

