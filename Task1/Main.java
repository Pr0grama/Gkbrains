import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product{
    String name;
    int volume;
    public Product(String name, int volume)
    {
        this.name = name;
        this.volume = volume;
    }
    public String getName(){
        return name;
    }

    public void Init(List<HotDrinks> a)
    {

    }
}

class HotDrinks extends Product
{
    int tempreture;
    public HotDrinks(String name, int volume, int temp)
    {
        super(name,volume);
        this.tempreture = temp;
    }

    public String getName()
    {
        return name;
    }
}


class Main {
    public static void main(String[] args)
    {
        List<HotDrinks> hotdrink = new ArrayList<HotDrinks>(Arrays.asList(
            new HotDrinks("Coffee", 3, 90),
            new HotDrinks("Tea", 1, 80),
            new HotDrinks("Milk", 3, 50)));
        Product in = new Product(null, 0);
        in.Init(hotdrink);
    }
}
