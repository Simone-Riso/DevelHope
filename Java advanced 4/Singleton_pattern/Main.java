package Singleton_pattern;

public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        user1.setNome("Emiliano");
        user1.setEtà(22);
        System.out.println("Info User1: " + user1);

        User user2 = User.getInstance();
        user2.setNome("Simone");
        user2.setEtà(22);
        System.out.println("Info User2: " + user2);

        System.out.println("\nNuove Info degli user");
        System.out.println("Info User1: " + user1);
        System.out.println("Info User2: " + user2);
    }
}
