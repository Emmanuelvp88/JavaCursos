public class SumaMatrices {
    public static void main(String[] args) {
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int resultado[][] = new int[3][3];

        //for para rellenar "matriz1"
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random()*100);
            }
        }

        //for para rellenar matriz2
        for(int i = 0; i < matriz2.length; i ++){
            for(int j = 0; j < matriz2[i].length; j++){
                matriz2[i][j] = (int)(Math.random()*100);
            }
        }

        //for para sumar matriz1 y matriz2
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                resultado[i][j] = matriz1[i][j]  + matriz2[i][i];
            }
        }

        //For para imprimir los resultados
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[i].length; j++) {
                System.out.print(" M1(" + matriz1 [i][j] + ")");
            }
            for(int j = 0; j < matriz1[i].length; j++) {
                System.out.print(" M2(" + matriz2 [i][j] + ")");
            }
            System.out.println(" ");
        }
        System.out.println(" + ");

//        for(int i = 0; i < matriz2.length; i++) {
//            for(int j = 0; j < matriz2[i].length; j++) {
//                System.out.print("(" + matriz2 [i][j] + ")");
//            }
//            System.out.println("");
//        }

    }
}
