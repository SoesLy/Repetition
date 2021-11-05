package Exercise2;

//Created Animal.Animal.Dog class and extend it with the Animal.Animal class
public class Dog extends Animal {

    //New attribute specially for the Animal.Animal.Dog class
    private double furLength;

    //Constructor with the inherited parent class' attribute
    public Dog(int age, String colour, String name, String sound, double furLength) {
        super(age, colour, name, sound);
        this.furLength = furLength;
    }

    //We override the toString method so that we can use the values of the object
    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", furLength=" + furLength +
                "} " + super.toString();
    }

    //Making a method so that I can print out the details more nicely
    public void getDogDetails(){
        System.out.println("Age: " + this.age);
        System.out.println("Colour: " + this.colour);
        System.out.println("Name: " + this.name);
        System.out.println("Sound: " + this.sound);
        System.out.println("Fur length: " + this.furLength);

    }

}
