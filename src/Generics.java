import java.util.ArrayList;
import java.util.List;

public class Generics<N> {
    private List<N> elements;

    public Generics() {
        this.elements = new ArrayList<>();
    }

    public void add(N something) {
        elements.add(something);
    }

    public N get(int index) {
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }

}
