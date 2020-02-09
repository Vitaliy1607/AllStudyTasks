package Interfaces;

import java.nio.channels.ShutdownChannelGroupException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          info info1 = new Animal(1);
          info info2 = new Person("Bob");
          info1.showInfo();
          info2.showInfo();
	}

}
