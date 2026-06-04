import java.util.ArrayList;
class Appform{
    static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.remove(0);
        System.out.println(fruits);
    }
}
