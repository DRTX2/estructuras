package Clases;

public enum LetrasTeclado {
    IZQUIERDA(new Character[]{'Q', 'W', 'E', 'R', 'T', 'A', 'S', 'D', 'F', 'G', 'Z', 'X', 'C', 'V', 'B'}),
    DERECHA(new Character[]{'Y', 'U', 'I', 'O', 'P', 'H', 'J', 'K', 'L', 'N', 'M'});

    private final Character[] letras;

    LetrasTeclado(Character[] letras) {
        this.letras = letras;
    }

    // Método para obtener los valores asociados
    public Character[] getLetras() {
        return letras;
    }
}
