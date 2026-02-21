public class MultiplicacionMtrices {
    public static void main(String[] args) {
        int matriz1[][] = new int[2][3];
        int matriz2[][] = new int[3][2];
        int resultado[][] = new int[2][2];

        //llenado de 'matriz1'
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de 'matriz2'
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 5);
            }
        }

//        for(int i = 0; i < matriz1.length; i++){
//            for(int j = 0; j  < matriz1[i].length; j ++){
//             matriz1[i][j] *= matriz2[i][j];
//
//            }
//        }

        //Impresión de resultados

        for (int i = 0; i < matriz2.length; i++) {
            if(matriz1.length < 2) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    System.out.print("1[" + matriz1[i][j] + "]");
                }
            }

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("2[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }

//            System.out.println("");



//        for (int i = 0; i < matriz2.length; i++) {
//            for (int j = 0; j < matriz2[i].length; j++) {
//                System.out.print("2[" + matriz2[i][j] + "]");
//            }
//            System.out.println("");
//        }

    }

}


//        System.out.print("    ");

//        for(int i = 0; i  < matriz2.length; i++) {
//            for (int j = 0; j < matriz2[i].length; j++) {
//                System.out.print("[" + matriz2[i][j] + "]");
//            }
//            System.out.println("");
//        }

