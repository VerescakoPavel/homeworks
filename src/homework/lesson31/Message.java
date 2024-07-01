package homework.lesson31;

public class Message<T> {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Message{" +
                "object=" + object +
                '}';
    }
}
