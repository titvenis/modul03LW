// Избегание чрезмерного использования абстракций
public class Calculator
{
    public int Add(int a, int b)
    {
        return a + b;
    }
}

// Избегание избыточного использования шаблонов проектирования 
public class Client
{
    private readonly Singleton _singleton = new Singleton();

    public void Execute()
    {
        _singleton.DoSomething();
    }
}

public class Singleton
{
    public void DoSomething()
    {
        Console.WriteLine("Doing something...");
    }
}
