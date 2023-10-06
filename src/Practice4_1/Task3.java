package Practice4_1;

class Person {
    private String fullName;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " moves");
    }

    public void talk() {
        System.out.println(fullName + " talks");
    }
}

class Task3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Ivanov Ivan");
        person1.setAge(30);

        Person person2 = new Person("Petrov Petr", 25);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}