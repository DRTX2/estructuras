package Clases;

import java.util.Random;

public class Sequence {

    //  enum
    LetrasTeclado letters;
    String sequence;
    int maxSize;

    public Sequence(LetrasTeclado l, int maxSize) {
        this.letters = l;
        this.sequence = null;
        this.maxSize = maxSize;
    }

    public void genSequence() {
        this.sequence = genSeqRec(this.maxSize);
    }
    
    private String genSeqRec(int longitud) {
        if (longitud == 0) {
            return "";
        } else {
            Random random = new Random();
            int index = random.nextInt(this.letters.getLetras().length);
            index = index % this.letters.getLetras().length; // Utilizamos el operador módulo para hacer que el índice sea circular
            return this.letters.getLetras()[index] + genSeqRec(longitud - 1);
        }
    }

    public String obtenerSecuencia() {
        return this.sequence;
    }

    
}
