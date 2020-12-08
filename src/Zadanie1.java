public class Zadanie1 {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 3;
        int thirdNumber = 68;
        int fourthNumber = 1;

        int sum1 = firstNumber + secondNumber;
        int sum2 = thirdNumber + fourthNumber;

        if ((sum1 % 2 == 0) && (sum2 % 2 == 0)) {
            System.out.println("Wszystkie liczby są patrzyste.");
        } else {
            System.out.println("Te liczby nie są patrzyste.");
        }
    }
}
