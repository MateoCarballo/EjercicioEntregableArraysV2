import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class materia {
    alumnos misAlumnos =new alumnos();
    int notaMaxima= Integer.MIN_VALUE;
    int notaMinima= Integer.MAX_VALUE;
    int notaMedia=0;

    public materia(){

    }

    public materia(int notaMaxima, int notaMinima, int notaMedia, int filaNotaMinima, int filaNotaMaxima, String[] alumnos, int[] notas) {
        this.notaMaxima = notaMaxima;
        this.notaMinima = notaMinima;
        this.notaMedia = notaMedia;

    }

    public void escribirNotas(){
        for (int i = 0; i < misAlumnos.nombres.length; i++) {
            System.out.println("Nota "+i+": "+misAlumnos.nombres[i]+" "+misAlumnos.notas[i]);
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
            for (int i = 0; i < misAlumnos.nombres.length; i++) {
                if ((misAlumnos.nombres[i].equals("*")) & (!añadido)) {
                    misAlumnos.nombres[i] = nombre;
                    misAlumnos.notas[i] = Integer.parseInt(nota);
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
        for (int i = 0; i < misAlumnos.nombres.length; i++) {
            if(misAlumnos.nombres.equals(nombreAlumno)){
                misAlumnos.nombres[i]="*";
                misAlumnos.notas[i]=-1;
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
        for (int i = 0; i < misAlumnos.notas.length; i++) {
            if(misAlumnos.notas[i]<5){
                System.out.println(misAlumnos.nombres[i]+" ha suspendido con una nota de "+misAlumnos.notas[i]);
            }
        }
    }
    public int notaMedia() {
        int numerodeNotas=0;
        for (int i = 0; i < misAlumnos.notas.length; i++) {
            if ((misAlumnos.notas[i])!=-1) {
                notaMedia += misAlumnos.notas[i];
                numerodeNotas++;
            }
            notaMedia=notaMedia/numerodeNotas;
        }
        return notaMedia;
    }
    public int notaMaxima (){
        for (int i = 0; i < misAlumnos.notas.length; i++) {
            if (misAlumnos.notas[i]>notaMedia) {
              notaMaxima=misAlumnos.notas[i];
              misAlumnos.setPosicionNotaMaxima(i);
            }
        }
        return (notaMaxima);
    }
    public int notaMinima (){
        for (int i = 0; i < misAlumnos.notas.length; i++) {
            if ((misAlumnos.notas[i]<notaMinima)&(misAlumnos.notas[i]>0)) {
                notaMinima=misAlumnos.notas[i];
                misAlumnos.setPosicionNotaMinima(i);
            }
        }
        return (notaMinima);
    }
}
