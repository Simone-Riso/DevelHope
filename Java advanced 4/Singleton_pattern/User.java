package Singleton_pattern;

public class User {
    private String nome;
    private int età;
    private static User instance;

    private User(){

    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        } return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", età: " + età;
    }

}
