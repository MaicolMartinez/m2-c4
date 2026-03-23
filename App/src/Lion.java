public class Lion extends Animal {

    private String color;

    public Lion(String name, Integer age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void roar() {
        System.out.printf("%s The lion is roaring.%n", getName());
    }

    public void run() {
        System.out.printf("%s The lion is running.%n", getName());
    }
    
    @Override
    public void hunt() {
        System.out.printf("%s The lion is hunting in the savannah.%n", getName());
    }
    
    @Override
    public void makeNoise() {
        System.out.printf("%s The lion is making noise.%n", getName());
    }

}
