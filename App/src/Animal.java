public abstract class Animal {
   private String name;
   private Integer age;
   private String gender;


   
   public Animal(String name, Integer age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
   }



   public String getName() {
    return name;
   }



   public Integer getAge() {
    return age;
   }



   public String getGender() {
    return gender;
   }


   public void hunt(){
    System.out.println("The animal is hunting.");
   }

   protected void happyBirthday() {
    this.age++;

   }
   

}
