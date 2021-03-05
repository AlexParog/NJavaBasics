package Generics4_1.task1;

// типизированный класс Box <T>
public class Box<T> {
    private T obj;

    // типизированный конструктор
    // параметр T, который будет заменен на реальный тип в момент создания объекта
    public Box(T obj) {
        this.obj = obj;
    }

    // getObj() примечателен тем, что в качестве возвращающего объекта он вернет объект типа T
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
