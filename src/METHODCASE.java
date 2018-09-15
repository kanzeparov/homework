public class METHODCASE {
    public static void main(String[] args) {
        System.out.println(summ(5, 5)); // для работы метода summ нужно подать 2 числа
        printSomeText(); // этот метод просто вызываем не ожидая возврата каких-либо значений(void)
        printMyText("Java"); // для работы метода подаем ему в качестве параметра строку
    }
    // метод возвращает целое число, принимает на вход два целых числа
    public static int summ(int a, int b) {
        return a + b; // возвращаем сумму чисел
    }
    // метод ничего не возвращает, не требует входных данных
    public static void printSomeText() {
        System.out.println("Hello"); // печатаем Hello в консоль
    }
    // метод ничего не возвращает, принимает на вход строку
    public static void printMyText(String txtToPrint) {
        System.out.println(txtToPrint); // выводим строку txtToPrint в консоль
    }
}
