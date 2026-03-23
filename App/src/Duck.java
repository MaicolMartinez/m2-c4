public class Duck extends Animal {

    private String color;

    public Duck(String name, Integer age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    @Override
    public void hunt() {
        System.out.printf("%s The duck is hunting in the pond.%n", getName());
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s The duck is quacking.%n", getName());
    }
    
}
