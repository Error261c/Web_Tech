class Mammals{
    void func()
    {
        System.out.println("I am mammal");
    }
}
class MarineAnimals extends Mammals{
    void func()
    {
        System.out.println("I am a marine animal");
    }
    void func_parent()
    {
        super.func();
    }
}
class BlueWhale extends MarineAnimals{
    void func()
    {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void func_parent1()
    {
        super.func();
    }
    void func_parent2()
    {
        super.funcParent();
    }
}

public class Q1{
    public static void main(String args[]){
        Mammals mammal = new Mammals();
        MarineAnimals marine_animal = new MarineAnimals();
        BlueWhale blue_whale = new BlueWhale();

        mammal.func();
        marine_animal.func();
        blue_whale.func();

        blue_whale.func_parent1();
        blue_whale.func_parent2();
    }
}