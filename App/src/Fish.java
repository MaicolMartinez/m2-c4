public class Fish extends Animal {

    private String color;
    private Boolean isFormSea;


    public Fish(String name, Integer age, String gender, String color, Boolean isFormSea) {
        super(name , age, gender);

        this.color = color;
        this.isFormSea = isFormSea;
    }


    public String getColor() {
        return color;
    }


    public Boolean IsFormSea() {
        return isFormSea;
    }


    public void swin() {
        System.out.printf("%s The fish is swimming.%n", getName());
    }

    public boolean canPutEggs() {
        return getGender().equalsIgnoreCase("Hembra");
    }
    

    @Override
    public void hunt() {
        System.out.printf("%s The fish is hunting in the water.%n", getName());
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s The fish is making noise.%n", getName());
    }
    
}
