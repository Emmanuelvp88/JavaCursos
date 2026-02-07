public class FuncionesTrigonometricas {
    public static void main(String[] args) {

        double grados = 45;
        double radianes = Math.toRadians(grados);
        double resultado = 0;
        double cos = Math.cos(radianes);
        double tan = Math.tan(radianes);

        System.out.println("**************Sacar el Seno, Coseno y Tangente de " + grados + "° ************************\n");

        resultado = Math.sin(radianes);
        System.out.println("El seno de " + grados + "° = " + resultado );

        resultado = Math.cos(radianes);
        System.out.println("El coseno de " + grados + "° = " + resultado);

        resultado = Math.tan(radianes);
        System.out.println("La tangente de " + grados + "° = " + resultado);


        System.out.println("\n**************Sacar el Arcoseno, Arcocoseno y Arcotangente de " + grados + "° ************************\n");

        resultado = Math.asin(radianes);
        System.out.println("El Arcoseno de " + grados + "° = " + resultado );

        resultado = Math.acos(radianes);
        System.out.println("El Arcocoseno de " + grados + "° = " + resultado );

        resultado = Math.atan(radianes);
        System.out.println("El Arcotangente de " + grados + "° = " + resultado );
    }
}
