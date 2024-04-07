package Builder_pattern;

public class Main {
    public static void main(String[] args) {
        Builder personBuilder = new Builder();
        Person person1 = personBuilder
                .setFirstName("Simone")
                .setLastName("Riso")
                .setAge(22)
                .setAddress("Via Giuseppe Molteni")
                .build();

        Person person2 = new Builder()
                .setFirstName("Emiliano")
                .setLastName("Riso")
                .setAge(22)
                .setAddress("Via Degli Avieri")
                .build();

        System.out.println("Person info: " + person1 + person2);
    }
}