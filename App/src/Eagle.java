public class Eagle extends Animal {
    

    private String type;

    public Eagle(String name, Integer age, String gender, String type) {

        super(name, age, gender);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void fly() {
        System.out.printf("%s The eagle is flying.%n", getName());
    }

    public void squeal(){
        System.out.printf("%s The eagle is squealing.%n", getName());
    }

    public boolean canOutEggs(){
        return getGender().equalsIgnoreCase("Hembra");
    }

    @Override
    public void hunt() {
        System.out.printf("%s The eagle is hunting in the sky.%n", getName());
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s The eagle is making noise.%n", getName());
    }

}
