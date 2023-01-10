public class Main {
    public static void main(String[] args) {
        Printabile[] printabiles={createObject("Dog"),createObject("Cat"),createObject("Mouse")} ;
        for (Printabile printabile:printabiles) {
            printabile.print();
        }

    }

    public static Printabile createObject(String className) {
        switch (className) {
            case "Dog":
                return new Dog("Aktoch");
            case "Cat":
                return new Cat(5);
            case "Mouse":
                return new Mouse("Bllek");


        }


        return null;
    }
}