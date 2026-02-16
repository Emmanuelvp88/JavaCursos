public class SumaMatrices {
    public static void main(String[] args) {
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int resultado[][] = new int[3][3];

        //for para rellenar "matriz1"
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }

        //for para rellenar matriz2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }

        //for para sumar matriz1 y matriz2
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        //For para imprimir los resultados
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("m1[" + matriz1[i][j] + "]");
            }
            if (i == 1) {
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("m2[" + matriz2[i][j] + "]");
            }
            if (i == 1) {
                System.out.print(" =  ");
            } else {
                System.out.print("    ");
            }
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("mr[" + resultado[i][j] + "]");
            }
            System.out.println();
        }
    }
}
