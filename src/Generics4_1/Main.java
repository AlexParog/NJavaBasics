package Generics4_1;

import Generics4_1.task1.Box;
import Generics4_1.task2.BoxTwoParameters;
import Generics4_1.task3.*;

public class Main {
    public static void main(String[] args) {

        // TASK № 1
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);

        System.out.println();
        System.out.println("------------------------------");
        System.out.println();

        // TASK № 2
        // параметризируем класс типом String для ключа и значения
        BoxTwoParameters<String, String> sample4 = new BoxTwoParameters<>("имя", "Нетология");
        System.out.println(sample4);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        BoxTwoParameters<Integer, Boolean> sample5 = new BoxTwoParameters<>(1, Boolean.TRUE);
        System.out.println(sample5);

        System.out.println();
        System.out.println("------------------------------");
        System.out.println();

        // TASK № 3
        ProductBoxFruit<String, Banana> bananaBox = new ProductBoxFruit<>("banana", new Banana());
        bananaBox.getObj().printClass();

        ProductBoxFruit<String, Apple> appleBox = new ProductBoxFruit<>("apple", new Apple());
        appleBox.getObj().printClass();

        ProductBoxFruit<String, Fruit> fruitBox = new ProductBoxFruit<>("fruit", new Fruit());
        fruitBox.getObj().printClass();
        // Мы не можем использовать капусту в классе generic ProductBox из-за того, что
        // данный класс использует ограниченную типизацию (использует только объекты классы Fruit)
        ProductBoxVegetable<String, Cabbage> cabbageBox = new ProductBoxVegetable<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}
