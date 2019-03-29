public class Chupacabra extends Animal {

    public static void main(String[] args) {

        Chupacabra chuy = new Chupacabra();
        chuy.setAge(9);
        chuy.foodPref("human flesh");
        int age = chuy.age;
        String food = chuy.foodPreference;
        System.out.printf("This Chupacabra is %d years old and LOVES to chow down on some %s! This sweet angel will live for %d more years, hopefully!", age, food, age*13);


    }
}
