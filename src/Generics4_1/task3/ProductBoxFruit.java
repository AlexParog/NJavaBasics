package Generics4_1.task3;

// ограничение типизации, класс Fruit - базовый класс ограничения
public class ProductBoxFruit<K, T extends Fruit> {
    private K name;
    private T obj;

    // типизированный конструктор
    // параметры T, K, которые будут заменены на реальные типы в момент создания объектов
    public ProductBoxFruit(K name, T obj) {
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
        return "ProductBoxFruit{" +
                "name=" + name +
                "; nameType=" + name.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
