import java.util.HashMap;
import java.util.Objects;

public class ChildEntry {
    private String name;
    private String surname;

    public ChildEntry(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildEntry that = (ChildEntry) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
