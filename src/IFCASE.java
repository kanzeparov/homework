public class IFCASE {
    public static void main(String[] args) {
        int num = 100;/*присваиваем переменной num значение 100*/
        if (num>50) { /*num = 100>50, то есть, условие в скобках выполняется и имеет значение true*/
            num = num + 1;/* «++» означает «увеличить значение переменной на один», эти команды будут рассмотрены позже */
        }
        //num = 101

        if(num == 101) {
            System.out.println("сто один");
        }

        System.out.println(num);
    }
}
