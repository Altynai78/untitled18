public class Cat extends Animal{
    private int age;

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Age "+age);

    }
}
