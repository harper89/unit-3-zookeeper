import java.util.Random;

public class Animal {

    // creat a private instance variable to store the animal type (e.g. "Tiger" or "Bear" or any other type of animal)
    private String animalType;
    // create Static/class variable to track how many Animal objects have been created
    private static int numberOfAnimals;
    // No-argument constructor:
    // - Creates a random animal type using the randomAnimalType() method you should write in this class
      public Animal() {
      this.animalType = randomAnimalType();
      numberOfAnimals++;
    }

    // Write a constructor that takes an animal type parameter
    public Animal(String animalType) {
      this.animalType = animalType;
      numberOfAnimals++;
    }

    // Create a getter/accessor method that returns the static variable that counts how many
    // animals have been instatiated
    public static int getNumberOfAnimals() {
      return numberOfAnimals;
    }

    // Create a getter/accessor method for returning the animal type
    public String getAnimalType() {
      return animalType;
    }
    // Create a getter/ accessor method for updating the animal type
    public void setAnimalType(String animalType) {
      this.animalType = animalType;
    }
    // Creat a speak() method that uses the animal type and returns
    // a sound based on the animal type. You can just return a String with the animal noise
    public String speak() {
      if (animalType.equals("Elephant")) return "Trumpet";
      else if (animalType.equals("Wolf")) return "Howl";
      else if (animalType.equals("Goat")) return "Bleat";
      else if (animalType.equals("Leopard")) return "Roar";
      else if (animalType.equals("Mouse")) return "Squeak";
      else if (animalType.equals("Snake")) return "Hiss";
      return "Hello!";
    }

    // Create the speakBackward() method that calls speak() and returns the reversed String
   public String speakBackward() {
      String str = this.speak();
      String newStr = "";
      for (int i = str.length()-1;i>=0; i--) {
         newStr+=str.substring(i,i+1);
      }
      return newStr;
    }

    // Create the toString() method which returns friendly description of the animal
    public String toString() {
      return "This animal is a " + animalType;
    
    }
    // Create a static method called "randomAnimalType" that returns a random
    // animale type
    // HINT: Decide how many animal types you want to be able to create, pick a random number
    // and then use if/else/if statements to determine what the animal should say
   public static String randomAnimalType() {
      int myInt =  (int) (6*Math.random());
      if (myInt == 5) return "Elephant";
      else if (myInt == 4) return "Wolf";
      else if (myInt == 3) return "Goat";
      else if (myInt == 2) return "Leopard";
      else if (myInt == 1) return "Mouse";
      return "Snake";
   }
}
