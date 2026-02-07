public class Conversiones {
    public static void main(String[] args) {
        double grados = 45;
        double radianes = 0;

        System.out.println("****************Conversion de grados a radianes~*************");
        radianes = Math.toRadians(grados);
        System.out.println("Conversion de " + grados + "°  =  " + radianes + " rad");

        System.out.println();

        System.out.println("*****************Conversion de radianes a grados**************");
        grados = Math.toDegrees(radianes);
        System.out.println("Conversion de " + radianes + " rad = "  + grados + "°");

    }
}
