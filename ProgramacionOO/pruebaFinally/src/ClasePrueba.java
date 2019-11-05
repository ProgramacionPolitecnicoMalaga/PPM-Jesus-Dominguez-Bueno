import java.util.Objects;

public class ClasePrueba {
    private int valor;
    private String cadena;

    public ClasePrueba(int valor, String cadena) {
        this.valor = valor;
        this.cadena = cadena;
    }

    public int getValor() {
        return valor;
    }

    public String getCadena() {
        return cadena;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "CP{" +
                "v=" + valor +
                ", c='" + cadena + '\'' +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClasePrueba that = (ClasePrueba) o;
        return cadena.equals(that.cadena);
    }*/

    @Override
    public boolean equals(Object o) {
        return ((ClasePrueba) o).getCadena().equals(cadena);

    }
}
