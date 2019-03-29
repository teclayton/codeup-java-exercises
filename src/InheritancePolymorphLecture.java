public class InheritancePolymorphLecture {

    public String inheritedString;

//    public InheritancePolymorphLecture(String str) {
//        this.inherittedString = str;
//    }

    public void inheritedMethod() {
        System.out.printf("Hello from %s", this.inheritedString);
    }

    public InheritancePolymorphLecture(){
        this.inheritedString = "Parent";
    }

    public static void main(String[] args) {

        InheritancePolymorphLecture parent = new InheritancePolymorphLecture();
        parent.inheritedMethod();

    }
}


/*
//////NOTES////////

- A subclass inherits the fields of it's superclass

- Parent constructor referred to as "super constructor"

- Default constructors: public 'classname'(){}

- Anything in constructor class method runs every time a new one or child is constructed

- Near identical child methods overwrite the parent method (in terms of priority)

- Child methods can't be used unless they are initialized with their own class. ex Cat cat = new Cat(),
  rather than: Animal cat = new Cat();

- Four levels of access in Java program: public, private, protected, package

- Protected: not visible outside the classes/subclasses where it is defined.

- Can use super.method() to call the parent classes method within a child class method of the same name

- Super is like this except refers to parent instead of itself

- Private can be worked around with the super.whatever call

- Leave off static if you just want instance variable

- Can't inherit from 'final' class
















 */