package inner;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("Ihor" , 55);
        Person.Pet pet1 = person1.new Pet("tuzil");
        Person.Pet pet2 = person1.new Pet("pushok");

        pet1.test();
        person1.printPetNick(pet1);
    }
}
