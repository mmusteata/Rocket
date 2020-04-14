package generic_task;

import java.util.List;

public class Coffee<T> {

    private List<T> t;

    public Coffee(List<T> t) {
        this.t = t;
    }

    public List<T> getT() {
        System.out.println("Waiter serve you with " + t + " coffee");
        return t;
    }

    public void setT(List<T> t) {
        this.t = t;
    }


    public void printCoffe() {
        System.out.println("coffee");
    }
}