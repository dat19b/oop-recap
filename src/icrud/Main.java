package icrud;

public class Main {

    public static void main(String[] args) {
        ICrud p = new PersonDBRepository();
        p.create(new Person("Claus", "12345"));
        System.out.println(p.read(0));
    }
}
