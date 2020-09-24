

public class evaluacion_diagnostica {

    private int[] numeros;
    private int longitud;

    public evaluacion_diagnostica(int longitud) {
        this.longitud = longitud;
        numeros = new int[longitud];
        generar_numeros();
    }

    private void generar_numeros() {
        for (int n = 0; n < longitud; n++) {
            numeros[n] = (int) (Math.random()*999)+1;
        }
    }

    public String toString() {
        String aux = "";
        for (int n = 0; n < longitud; n++) {
            aux += ", " + Integer.toString(numeros[n]);
        }
        return aux;
    }

    public String buscar(int num) {
        String respuesta = "";
        for (int n = 0; n < longitud; n++) {
            String aux = Integer.toString(numeros[n]);
            aux = "" + aux.charAt(aux.length() - 1);
            if (aux.equals(Integer.toString(num)))
                respuesta += " " + Integer.toString(numeros[n]);
        }
        return respuesta;
    }

    public static void main(String[] args) {
        evaluacion_diagnostica eva_diag = new evaluacion_diagnostica(100);
        System.out.print(eva_diag.buscar(5));
    }
}