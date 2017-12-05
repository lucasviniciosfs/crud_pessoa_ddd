package ddd_project.util;

public class Wrapper<T> {
    private T wrapped;

    public Wrapper(T wrapped) {
        this.wrapped = wrapped;
    }

    public T get() {
        return wrapped;
    }

    public void set(T wrapped) {
        this.wrapped = wrapped;
    }
}
