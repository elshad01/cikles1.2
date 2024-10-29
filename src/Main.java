public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("task 1");
        for (int i=0; i< 11; i=i+1){
            System.out.println("Итерация цикла "+ i);
        }

        // task 2
        System.out.println("task 2");
        for (int i=10; i > 0; i=i-1){
            System.out.println("Итерация цикла "+ i);
        }

        // task 3
        System.out.println("task 3");
        for (int i=0; i < 17; i=i+2) {
            System.out.println("Итерация цикла " + i);
        }

        // task 4
        System.out.println("task 4");
        for (int i=10; i > -11 && i< 11; i=i-1){
            System.out.println("Итерация цикла "+ i);
        }

        // task 5
        System.out.println("task 5");
        for (int i=1904; i < 2097; i=i+4) {
            System.out.println(  i + " год является високосным ");
        }

        // task 6
        System.out.println("task 6");
        for (int i=7;  i< 99; i=i+7) {
            System.out.println("Итерация цикла " + i);
        }

        // task 7
        System.out.println("task 7");
        for (int i=1;  i< 513; i=i*2) {
            System.out.println("Итерация цикла " + i);
        }

        // task 8
        System.out.println("task 8");
        int amount = 29000;
        int total =  0;
        for ( int i = 0;  i < 13; i=i+1) {
            total = total +amount;
            System.out.println("Месяц " + i +"  сумма накоплений равна "+ total+ " рублей");}

        // task 9
        System.out.println("task 9");
        int amountt = 29000;
        int totall =  0;
        for ( int i = 0;  i < 12; i=i+1) {
            totall= totall + totall/100;
            totall = totall + amountt;
            System.out.println("Месяц " + i +"  сумма накоплений равна "+ totall+ " рублей");}


        // task 10
        System.out.println("task 10");
        int nomber= 2;
        for (int i= 2; i < 11; i=i+1) {
            System.out.println( nomber+ "*"+ i+ " =" +nomber* i);
        }




    }
}