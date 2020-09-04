package icrud;

import java.util.ArrayList;
import java.util.List;

public class PersonArrayListRepository implements ICrud {

    private List<Person> personList;

    public  PersonArrayListRepository(){
        personList = new ArrayList<>();
    }


    @Override
    public void create(Person p) {
        personList.add(p);
    }

    @Override
    public Person read(int id) {
        return personList.get(id);
    }

    @Override
    public void update(Person p) {
        personList.add(1, p);
    }

    @Override
    public void delete(int id) {
        personList.remove(id);
    }
}
