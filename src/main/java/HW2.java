import java.util.Scanner;
public class HW2 {

        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
        // (типа float), и возвращает введенное значение. Ввод текста вместо числа не
        // должно приводить к падению приложения, вместо этого, необходимо повторно
        // запросить у пользователя ввод данных.
        public static float floatInput() {
            Scanner sc = new Scanner(System.in);
            float inputNum;
            while (true) {
                System.out.print("Введите дробноe число: ");
                try {
                    inputNum = Float.parseFloat(sc.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод! Введите дробноe число!");
                }
            }
            return inputNum;
        }
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит
    // пустую строку. Пользователю должно показаться сообщение, что пустые строки
    // вводить нельзя.
    public static void strInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        if (!str.isEmpty()) {
            System.out.println(str);
        } else {
            System.out.println("Пустые строки вводить нельзя");
            throw new RuntimeException("Строка пустая!");
        }
    }


    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

        public static void main(String[] args) {
            System.out.println(floatInput());

            // Если необходимо, исправьте данный код
            // try {
            // int d = 0;
            // double catchedRes1 = intArray[8] / d;
            // System.out.println("catchedRes1 = " + catchedRes1);
            // } catch (ArithmeticException e) {
            // System.out.println("Catching exception: " + e);
            // }


            int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            try {
                int d = 0;
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.err.println("Catching exception: " + e);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Catching IndexOutOfBoundsException: " + e);
            }
            // Дан следующий код, исправьте его там, где требуется

            // public static void main(String[] args) throws Exception {
            // try {
            // int a = 90;
            // int b = 3;
            // System.out.println(a / b);
            // printSum(23, 234);
            // int[] abc = { 1, 2 };
            // abc[3] = 9;
            // } catch (Throwable ex) {
            // System.out.println("Что-то пошло не так...");
            // } catch (NullPointerException ex) {
            // System.out.println("Указатель не может указывать на null!");
            // } catch (IndexOutOfBoundsException ex) {
            // System.out.println("Массив выходит за пределы своего размера!");
            // }
            // }
            // public static void printSum(Integer a, Integer b) throws
            // FileNotFoundException {
            // System.out.println(a + b);
            // }
                try {
                    int a = 90;
                    int b = 3;
                    System.out.println(a / b);
                    printSum(23, 234);
                    int[] abc = { 1, 2 };
                    abc[3] = 9;
                } catch (ArithmeticException ex) {
                    System.out.println("На ноль делить нельзя!");
                } catch (NullPointerException ex) {
                    System.out.println("Указатель не может указывать на null!");
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Массив выходит за пределы своего размера!");
                } catch (Throwable ex) {
                    System.out.println("Что-то пошло не так...");
                }
        strInput();
        }

}
