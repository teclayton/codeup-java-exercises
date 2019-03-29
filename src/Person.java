public class Person {

    public String name;

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {

        Person p = new Person("Name-o");

//        System.out.println(p.getName());
//        p.setName("new name");
//        System.out.println(p.getName());
//        p.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, " + this.name);
    }
}
