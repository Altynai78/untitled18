public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Name "+name);

    }
}
