public class application {
    public static void main(String[] args) {
        OOP dog = new OOP();
        dog.age = 4;
        dog.gender = "male";
        dog.nick = "tuzik";
        OOP myVariable = new OOP(3, "Pushok", "male");
        System.out.println(myVariable.nick);
        System.out.println(myVariable.age);
        System.out.println(dog.nick);
        System.out.println(myVariable.nick);
        dog.makeVoice();  // звертаємся до метода
    dog.bite("john");
        dog.bite("Anton");
        dog.bite("Petro");
        dog.bite("Anna");
        changeNick(dog);
        System.out.println(dog.nick);
    }
    static void changeNick(OOP dog){
        dog.nick = "SOME new nick";
    }
}
