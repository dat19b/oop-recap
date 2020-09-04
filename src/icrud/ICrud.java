package icrud;

public interface ICrud {

    void create(Person p);
    Person read(int id);
    void update(Person p);
    void delete(int id);
}
