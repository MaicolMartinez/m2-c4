public class Duck extends Animal implements CanFly {

    private String color;

    public Duck(String name, Integer age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void fly() {
        System.out.printf("%s The duck is flying.%n", getName());
    }
    
    public void swim() {
        System.out.printf("%s The duck is swimming.%n", getName());
    }

    public void run() {
        System.out.printf("%s The duck is running.%n", getName());
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
