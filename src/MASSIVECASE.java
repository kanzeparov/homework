public class MASSIVECASE {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) { /* Обратите внимание на фрагмент i<10,
выполнение цикла, как было сказано в прошлых уроках, заканчивается на значении
i=9!*/
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int[] array = { 0, 1, 2, 3 , 4};

        int[] array2 = new int[4];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
    }
}
