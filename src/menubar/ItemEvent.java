package menubar;

public class ItemEvent {
    private final Object o;
    public ItemEvent(Object o) {
        this.o = o;
    }
    public Object getItem() {
        return o;
    }
}
