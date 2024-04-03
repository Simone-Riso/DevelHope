package Checkpoint_03_04_24;

public class Rubrica {
    Contatto[] contatti;

    public Rubrica() {
        this.contatti = new Contatto[10];
    }

    public Contatto[] getContatti() {
        return contatti;
    }

    public void setContatti(Contatto[] contatti) {
        this.contatti = contatti;
    }

    public void addContatto(Contatto contatto) {
        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i] == null) {
                contatti[i] = contatto;
                break;
            }
        }
    }

    public void removeContatto(Contatto contatto) {
        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i] == contatto) {
                contatti[i] = null;
                break;
            }
        }
    }

    public void stampaRubrica() {
        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i] != null) {
                System.out.println(contatti[i]);
            }
        }
    }

    public void ricercaPerContatto(String name) {
        System.out.println("Ricerca contatto | " + name + " | in corso...");
        boolean contattoTrovato = false;
        for (Contatto contatto : contatti) {
            if (contatto != null && contatto.getNome().equals(name)) {
                contattoTrovato = true;
                System.out.println("Trovato il Contatto " + name + ": " + contatto);
                break;
            }
        }

        if (!contattoTrovato) {
            System.out.println("Contatto | " + name + " | non trovato");
        }
    }

}
