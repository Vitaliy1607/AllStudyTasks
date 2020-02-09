public /*final*/ class Person {
    public static final int HEAD_COUNT;

    private static int count;

    static {
        System.out.println("doing some job");
        count = 0;
        HEAD_COUNT = 1;
    }

    private String name;
    private final int age;
    private final String gender;
    private final Address address;


    public Person(String name, int age, String gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        count++;
    }

    public final void sleep(int hours) {
        System.out.println(name + " will be sleeping during " + hours + "h.");
    }

    public static void test() {
//        System.out.println(name);
//        sleep(5);
    }


    public static int getCount() {
        return count;
    }

    public Address getAddress() {
        return address;
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

    public String getGender() {
        return gender;
    }

//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }


}