package Exercise2;

//Created Animal.Animal class
public class Animal {

    //Adding attributes used to animals
    public int age;
    public String colour;
    public String name;
    public String sound;

    //Constructor which makes it possible to use the attributes in other classes, included the children classes, Dog and Cat
    public Animal(int age, String colour, String name, String sound) {
        this.age = age;
        this.colour = colour;
        this.name = name;
        this.sound = sound;
    }

    //When we override the toString method it makes it return the values of the objects
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
