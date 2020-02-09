import java.util.Random;

public class OOP {
    int age;
    String nick;
    String gender;

    OOP(){

    }

    OOP(int a , String n, String g){
        age = a;
        nick = n;
        gender = g;
    }

    void makeVoice(){
        if (nick != null) {
            System.out.println(nick + ": hav-hav");
        }else{
            System.out.println("hav - hav");
        }

    }
    boolean bite(String target){
        if (new Random().nextInt()< 0){
            System.out.println(nick + "is biting" + target);
            return true;
        }else{
            System.out.println(nick + " failed");
            return false;
        }
    }
}
