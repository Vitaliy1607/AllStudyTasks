public class Cat extends Animal{

    private String name;
    private int age;

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + "eating");
    }

    public Cat(String name, int age) {
        super(name, age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
