


public final class utilidadesArrays{

    private utilidadesArrays(){

    }

    //Llena el vector con numeros aleatorios entre los limites que le pasamos como parametros

    public static void llenarVector(int[]miMatriz,int limiteInferior,int limiteSuperior){
        for (int i = 0; i < miMatriz.length; i++) {
            miMatriz[i]= utilidadesMatematicas.numAleatorioEntero(limiteInferior,limiteSuperior);
        }
    }

    //Ordena el vector tanto de menos a mas como mas a menos dependiendo de si el boolean es 1 o 0

    public static void ordenarVector(double[] miMatriz,boolean Ordenascendente){
        /*
        Ordenar matrices si el booleano es true de menor a mayor si es false de menor a mayor.
         */
        double aux=0;
        if (Ordenascendente){
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]< miMatriz[j]){
                            aux=miMatriz[i];
                            miMatriz[i]=miMatriz[j];
                            miMatriz[j]=aux;
                        }
                    }
                }
            }
        }else{
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]> miMatriz[j]){
                            aux=miMatriz[j];
                            miMatriz[j]=miMatriz[i];
                            miMatriz[i]=aux;
                        }
                    }
                }
            }
        }
    }

    public static void ordenarVector(int[] miMatriz,boolean Ordenascendente){
        /*
        Ordenar matrices si el booleano es true de menor a mayor si es false de menor a mayor.
         */
        int aux=0;
        if (Ordenascendente){
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]< miMatriz[j]){
                            aux=miMatriz[i];
                            miMatriz[i]=miMatriz[j];
                            miMatriz[j]=aux;

                        }
                    }

                }

            }
        }else{
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]> miMatriz[j]){
                            aux=miMatriz[j];
                            miMatriz[j]=miMatriz[i];
                            miMatriz[i]=aux;
                        }
                    }
                }
            }
        }
    }

    //Escribe los valores del vector

    public static void escribirVector(int[]miMatriz){
        for (int i = 0; i < miMatriz.length ; i++) {
            System.out.println("Posicion "+i+"-->"+miMatriz[i]);
        }
    }

    public static void escribirMatriz(int[][] miMatriz) {
        String aux="";

        for (int i = 0; i < 10; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < miMatriz[0].length ; i++) {
            System.out.print("C"+i+" ");

        }
        System.out.println("");
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.print("Fila->" + i + "  ");

            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print("|");

                if (miMatriz[i][j] < 10 ) {
                    System.out.print(0);
                    System.out.print(0);
                } else if (miMatriz[i][j] >= 10 & miMatriz[i][j]<100) {
                    System.out.print(0);

                }


                System.out.print(miMatriz[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }

    }

    //Escribe una mtriz de 3x3 para poder usarla como plantilla para jugar al tres en raya

    public static void tresEnRaya(String[][] miMatriz) {
        System.out.print("     0   1   2 ");
        System.out.println("");
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.print("" + i + "  ");

            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print("|");
                System.out.print(miMatriz[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }

    }


}