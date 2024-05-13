import Decorator_Design_Pattern.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //DECORATOR MAIN
        //BasePizza pizza = new FarmHousePizza();
        BasePizza pizza2= new ExtraCheese(new FarmHousePizza());
        System.out.println(pizza2.cost());
    }
}