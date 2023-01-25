import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class materia {
    int notaMaxima= Integer.MIN_VALUE;
    int notaMinima= Integer.MAX_VALUE;
    int notaMedia=0;
    int filaNotaMinima=0;
    int filaNotaMaxima=0;
    int numerodeAlumnos=10;
    private String [] alumnos = new String[numerodeAlumnos];
    private int [] notas = new int[numerodeAlumnos];



    public materia(){
        rellenarCampos();
    }


    public materia(int notaMaxima, int notaMinima, int notaMedia, int filaNotaMinima, int filaNotaMaxima, String[] alumnos, int[] notas) {
        this.notaMaxima = notaMaxima;
        this.notaMinima = notaMinima;
        this.notaMedia = notaMedia;
        this.filaNotaMinima = filaNotaMinima;
        this.filaNotaMaxima = filaNotaMaxima;
        this.alumnos = alumnos;
        this.notas = notas;
    }
    private void rellenarCampos(){
        String[] nombres = {"Andres","Brais","Carlos","Daniel","Francisco","Elena","Alba","Marta"};

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i]="*";
        }
        for (int i = 0; i < alumnos.length ; i++) {
            notas[i]=-1;
        }



        for (int i = 0; i < 7; i++) {
            alumnos[i]=nombres[utilidadesMatematicas.numAleatorioEntero(0,7)];
        }
        for (int i = 0; i < 7 ; i++) {
            notas[i]=utilidadesMatematicas.numAleatorioEntero(0,10);
        }
    }
    public void escribirNotas(){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nota "+i+": "+alumnos[i]+" "+notas[i]);
        }
    }
    public void añadirNota()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean añadido=false;
        String nombre="";
        String nota="";

            System.out.println("Nombre");
            nombre = br.readLine();
            System.out.println("Nota");
            nota = br.readLine();
            for (int i = 0; i < alumnos.length; i++) {
                if ((alumnos[i].equals("*")) & (!añadido)) {
                    alumnos[i] = nombre;
                    notas[i] = Integer.parseInt(nota);
                    añadido=true;
                }
            }
            if (!añadido){
                System.out.println("No quedan posiciones libres borra un alumno y su nota y vuelve a intentarlo");
            }
    }

    public void borrarNota()throws IOException {
        String nombreAlumno="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("De que alumno desea borra la nota?");
        nombreAlumno=br.readLine();
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].equals(nombreAlumno)){
                alumnos[i]="*";
                notas[i]=-1;
            }
        }
        System.out.println("Nota borrada con exito");
    }

    public void estadisticas(){
        System.out.println("La nota media de la clase es "+notaMedia());
        System.out.println("La nota mas alta es un "+notaMaxima());
        System.out.println("La nota mas baja es un "+notaMinima());
    }
    public void verSuspensos(){
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]<5){
                System.out.println(alumnos[i]+" ha suspendido con una nota de "+notas[i]);
            }
        }
    }
    public int notaMedia() {
        int numerodeNotas=0;
        for (int i = 0; i < notas.length; i++) {
            if ((notas[i])!=-1) {
                notaMedia += notas[i];
                numerodeNotas++;
            }
            notaMedia=notaMedia/numerodeNotas;
        }
        return notaMedia;
    }
    public int notaMaxima (){
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>notaMedia) {
              notaMaxima=notas[i];
              filaNotaMaxima=i;
            }
        }
        return (notaMaxima);
    }
    public int notaMinima (){
        for (int i = 0; i < notas.length; i++) {
            if ((notas[i]<notaMinima)&(notas[i]>0)) {
                notaMinima=notas[i];
                filaNotaMinima = i;
            }
        }
        return (notaMinima);
    }
}
