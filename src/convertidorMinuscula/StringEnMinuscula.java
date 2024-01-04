package convertidorMinuscula;

public class StringEnMinuscula {

    public static void main(String[] args) {


        String[] myArray = {"Java" , "Programming" , "LANGUAGE"};

        //use string join para unir los elementos y toLowerCase para que sean en miniscula
        String convertir = String.join(" " , myArray).toLowerCase();

        //Imprime por consola el resultado
        System.out.println(convertir);


    }

}
