public class App {
    public static void main(String[] args) throws Exception {
        
        var eagle = new Eagle("maria", 2, "hembra", "calva");
        var lion = new Lion("Simba", 5, "macho", "amarillo");
        var fish = new Fish("Nemo", 1, "macho", "naranja", true);
        var duck = new Duck("Donald", 3, "macho", "blanco");

        System.out.println("Eagle's name: " + eagle.getName());

        eagle.fly();
        eagle.hunt();
        eagle.happyBirthday();
        System.out.println("Eagle's age after birthday: " + eagle.getAge()+" years.");
        System.out.println("The egle have eggs? " + (eagle.canOutEggs() ? "Yes" : "No"));


        System.out.println("Lion's name: " + lion.getName());

        lion.roar();
        lion.hunt();
        lion.run(); 
        lion.happyBirthday();
        System.out.println("The lion's age after birthday: " + lion.getAge()+" years.");


        System.out.println("Fish's name: " + fish.getName());

        fish.swin();
        fish.hunt();
        fish.happyBirthday();
        System.out.println("The fish's age after birthday: " + fish.getAge()+" years.");
        System.out.println("The fish have eggs? " + (fish.canPutEggs() ? "Yes" : "No"));
        System.out.println("The fish is from the sea? " + (fish.IsFormSea() ? "Is the sea" : "is the river"));
    

        System.out.println("Duck's name: " + duck.getName());
        duck.hunt();
        duck.makeNoise();
        System.out.println("The duck's age after birthday: " + duck.getAge()+" years.");

    
    
    
    }



}
