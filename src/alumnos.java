public class alumnos {
    int numerodeAlumnos=10;
    String [] nombres = new String[numerodeAlumnos];
    int [] notas = new int[numerodeAlumnos];


    int posicionNotaMaxima=Integer.MIN_VALUE;
    private int posicionNotaMinima=Integer.MAX_VALUE;

    public void setPosicionNotaMaxima(int posicionNotaMaxima) {
        this.posicionNotaMaxima = posicionNotaMaxima;
    }

    public void setPosicionNotaMinima(int posicionNotaMinima) {
        this.posicionNotaMinima = posicionNotaMinima;
    }

    public int getPosicionNotaMaxima() {
        return posicionNotaMaxima;
    }

    public int getPosicionNotaMinima() {
        return posicionNotaMinima;
    }

    public alumnos(){
        rellenarCampos();
    }

    private void rellenarCampos(){
        String[] nombres = {"Andres","Brais","Carlos","Daniel","Francisco","Elena","Alba","Marta"};

        for (int i = 0; i < nombres.length; i++) {
            nombres[i]="*";
        }
        for (int i = 0; i < nombres.length ; i++) {
            notas[i]=-1;
        }



        for (int i = 0; i < 7; i++) {
            nombres[i]=nombres[utilidadesMatematicas.numAleatorioEntero(0,7)];
        }
        for (int i = 0; i < 7 ; i++) {
            notas[i]=utilidadesMatematicas.numAleatorioEntero(0,10);
        }
    }

}
