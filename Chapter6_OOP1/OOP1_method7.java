package Chapter6_OOP1;

public class OOP1_method7 {
    public static void main(String[] args) {
        Book b = new Book();
        b.changePublisher("a publisher");
        System.out.println(Book.publisher);
    }
}
