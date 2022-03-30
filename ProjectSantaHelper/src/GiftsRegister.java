import java.util.ArrayList;
import java.util.HashMap;

public class GiftsRegister {

    private final ArrayList<ChildEntry> children = new ArrayList<>();
    private final ArrayList<GiftsEntry> gifts = new ArrayList<>();
    private final HashMap<ChildEntry, GiftsEntry> hmGiftsRegister = new HashMap<>();


    public void addChildEntry(String name, String surname) {
        children.add(new ChildEntry(name, surname));
    }

    public void addGiftsEntry(String name) {
        gifts.add(new GiftsEntry(name));
    }

    public void assignAllChildToGift(ChildEntry children, GiftsEntry gifts) {
        hmGiftsRegister.put(new ChildEntry(children.getName(), children.getSurname()), new GiftsEntry(gifts.getGift()));
    }
}


