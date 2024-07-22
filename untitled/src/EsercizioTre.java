public class EsercizioTre {
    public static double perimetroRettangolo(double lat1, double lat2) {
        return (lat1 + lat2) * 2;
    }

    public static int pariDispari(int num1) {
        if ((num1 % 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double perimetroTriangolo(double num1, double num2, double num3) {

        double s = (num1 + num2 + num3) / 2;


        double area1 = Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));

        return area1;
    }

    public static void main(String[] args) {
        System.out.println(perimetroRettangolo(8.5, 4));
        System.out.println(pariDispari(15));
        System.out.println(perimetroTriangolo(30.7, 15.4, 10.1));
    }
}