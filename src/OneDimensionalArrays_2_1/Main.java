package OneDimensionalArrays_2_1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"}; // массив продуктов
        int[] prices = new int[]{100, 200, 300}; // ценны продуктов
        int[] basket = new int[3]; // корзина
        int allSum = 0; // подсчёт всей суммы
        instruction();

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                getBasket(products,prices,basket); // вывод корзины
                break;
            }
            String[] order = input.split(" ");
            int productNumber = Integer.parseInt(order[0]) - 1; // номер продукта
            int productCount = Integer.parseInt(order[1]); // количество
            if (productNumber >= 0 && productNumber < products.length) {
                basket[productNumber] += productCount;
            } else
                System.out.println("Товара с таким номером нет, пожалуйста, выберете другой!");
        }
    }

    public static void instruction() {
        System.out.println("Список возможных товаров для покупки");
        System.out.println("1. Хлеб");
        System.out.println("2. Яблоки");
        System.out.println("3. Молоко");
    }

    public static void getBasket(String[] products, int[] prices, int[] basket) {
        String productName;
        int price, productCount, count;
        int allSum = 0;

        System.out.println("Ваша корзина:");
        System.out.printf("%-10s%17s%17s%20s%n", "Наименование товара",
                "Количество", "Цена/за.ед", "Общая стоимость");

        for (int i = 0; i < products.length; i++) {
            if (basket[i] != 0) {
                productName = products[i];
                price = prices[i];
                productCount = basket[i];
                count = price * productCount;
                allSum += count;
                System.out.printf("%-10s%17s%19s%15s%n", productName, productCount, price, count);
            }
        }
        System.out.printf("%49s%12s%n", "Итого:", allSum);
    }
}
