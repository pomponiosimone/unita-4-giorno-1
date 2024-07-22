public class EsercizioUno {

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(int num1, String str1) {
        return str1 + " " + num1;
    }

    public static String[] inserisciInArray(String[] array, String str2) {
        if (array.length < 5) {

        }
        array[4] = str2;
        return array;
    }

    public static void main(String[] args) {
        System.out.println(multi(4, 4));
        System.out.println(concatena(4, "Ciao sono numero"));

        String[] array = new String[5];
        array = inserisciInArray(array, "Nuovo elemento");
        for (String element : array) {
            System.out.println(element);
        }
    }
}