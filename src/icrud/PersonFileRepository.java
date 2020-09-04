package icrud;

public class PersonFileRepository implements ICrud {
    @Override
    public void create(Person p) {

    }

    @Override
    public Person read(int id) {
        return new Person("Fin", "3232323");
    }

    @Override
    public void update(Person p) {

    }

    @Override
    public void delete(int id) {

    }
}
