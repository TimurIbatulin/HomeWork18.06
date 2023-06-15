import java.lang.reflect.Array;

public class HW {
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
private static void stOvFl() {
    int count = 0;
    while (true) {
        count += 1000000000;
        stOvFl();
    }
}
private static void ovLen(int [] array){
    int z = array.length + 1;
    for(int i = 0; i < z; i++){
        array[i] = i;
    }
}
private static void sumAr(int [] array, int [] arra){
    int z;
    if (array.length <= arra.length){
        for (int i=0; i < arra.length; i++){
            z = array[i] + arra[i];
        }
    } else {
        for (int i=0; i < array.length; i++){
            z = array[i] + arra[i];
        }
    }
}


public static void main(String[] args) {
    String [][] v = new String[2][5];
    int f = 0;
    for(int i = 0; i < v.length; i++){
        for(int j = 0; j<v[i].length; j++){
            v[i][j] = "Str" + Integer.toString(f);
            f+=1;
        }
    };
    System.out.println(sum2d(v));
}


//    Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    System.out.println("Не верный тип данных");
                    return -1;
                }

            }
        }
        return sum;
    }




//    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
//    элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.


//* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
// элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
private static int[] three(int [] array1, int [] array2, int [] arraySum){
    if (array2.length != array1.length){
        System.out.println("Длинны массивов не равны. Необходимы массивы равной длинны");
        return null;
    }
    if (array2.length > arraySum.length){
        System.out.println("Длинна  конечного массива меньше требуемой. Задайте большую длинну конечного массива");
        return null;
    }
    for(int i = 0; i < array2.length; i++){
        arraySum[i] = array1[i] + array2[i];
    }
    return arraySum;
}
}
