package Exercise2;
//Created Main class, so that I can run a program
public class Main2 {
    public static void main(String[] args) {

        //Making a new cat with the attribute from the Animal class (Age, colour,name, and sound) and with the attribute from the Cat class (Whiskers)
        Cat newCat = new Cat(5,"Black and white","Figaro","Miaw", 2.9);
        //Making a new dog again with the attribute from the Animal class and with the attribute from the Dog class
        Dog newDog = new Dog(10,"Yellow","Pluto","Wuf", 0.7);

        //Method from the cat class
        System.out.println("The cats details is: ");
        newCat.printCatDetail();

        //Method from the dog class
        System.out.println("The dogs details is: ");
        newDog.getDogDetails();

    }


}
