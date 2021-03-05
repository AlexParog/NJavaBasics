package Generics4_1.task3;

public class ProductBoxVegetable<K, T extends Vegetable> {
    private K name;
    private T obj;

    // типизированный конструктор
    // параметры T, K, которые будут заменены на реальные типы в момент создания объектов
    public ProductBoxVegetable(K name, T obj) {
        this.name = name;
        this.obj = obj;
    }

    // вернет объект T-параматера при вызове
    public T getObj() {
        return obj;
    }

    // вернет объект K-параматера при вызове
    public K getName() {
        return name;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void setName(K name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductBoxVegetable{" +
                "name=" + name +
                "; nameType=" + name.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
