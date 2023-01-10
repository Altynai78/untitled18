public class Mouse extends Animal{
    private String colour;

    public Mouse(String colour) {
        this.colour = colour;
    }

    @Override
    public void print() {
        System.out.println("Colour " +colour);
    }
}
