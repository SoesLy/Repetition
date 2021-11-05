package Exercise2;

public class Cat extends Animal{

    //Attribute specially for the Cat class
    private double whiskers;

    //Constructor with the inherited parent class' attribute
    public Cat(int age, String colour, String name, String sound, double whiskers) {
        super(age, colour, name, sound);
        this.whiskers = whiskers;
    }

    //We override the toString method so that we can use the values of the object
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", whiskers=" + whiskers +
                "} " + super.toString();
    }

    //Making a method so that I can print out the details more nicely
    public void printCatDetail(){
        System.out.println("Age: " + this.age);
        System.out.println("Colour: " + this.colour);
        System.out.println("Name: " + this.name);
        System.out.println("Sound: " + this.sound);
        System.out.println("Whiskers: " + this.whiskers);

    }
}
