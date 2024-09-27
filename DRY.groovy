//Использование методов для устранения дублирования кода:
public class OrderService
{
    private void LogOrder(string action, string productName, int quantity, double price)
    {
        double totalPrice = quantity * price;
        Console.WriteLine($"Order for {productName} {action}. Total: {totalPrice}");
    }

    public void CreateOrder(string productName, int quantity, double price)
    {
        LogOrder("created", productName, quantity, price);
    }

    public void UpdateOrder(string productName, int quantity, double price)
    {
        LogOrder("updated", productName, quantity, price);
    }
}
//#Использование общих базовых классов:
public abstract class Vehicle
{
    public void Start()
    {
        Console.WriteLine($"{this.GetType().Name} is starting");
    }

    public void Stop()
    {
        Console.WriteLine($"{this.GetType().Name} is stopping");
    }
}

public class Car : Vehicle { }

public class Truck : Vehicle { }

