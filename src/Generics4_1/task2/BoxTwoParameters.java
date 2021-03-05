package Generics4_1.task2;

// типизированный класс Box <K, T>
public class BoxTwoParameters<K, T> {
    // два типизированных поля
    private K key;
    private T obj;

    // типизированный конструктор
    // параметры T, K, которые будут заменены на реальные типы в момент создания объектов
    public BoxTwoParameters(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    // вернет объект T-параматера при вызове
    public T getObj() {
        return obj;
    }

    // вернет объект K-параматера при вызове
    public K getKey() {
        return key;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
