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


   public abstract void hunt();

   public abstract void makeNoise();

   protected void happyBirthday() {
    this.age++;

   }
   

}
