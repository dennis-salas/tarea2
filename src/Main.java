public class Main {
    public static void main(String[] args) {


        int numeroIf = -1;
        int numeroWhile = 0;
        int contador = 3;
        var estacion = "PRIMAVERA";

        if(numeroIf < 0) {
            System.out.println("Es Negativo");
        } else {
            System.out.println("Es Positivo...");
        }


        while (numeroWhile <= 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }


        do {
            System.out.println(contador);
            contador = contador + 1;
        } while(contador <= 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch(estacion) {
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Estoy en default");
        }

    }
}