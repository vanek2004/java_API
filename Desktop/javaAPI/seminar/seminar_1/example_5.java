package seminar.seminar_1;

public class example_5 {
    /*
    Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
    Пример 1: а = 3, b = 2, ответ: 9
    Пример 2: а = 2, b = -2, ответ: 0.25
    Пример 3: a = 3, b = 0, ответ: 1
    */
    public static void main(String[] args) {
        int a = 2; 
        int b = 0;
        System.out.println(pow(a, b));
    }

    public static double pow(double a, int b){
        
        if(b == 0){
            return 1;
        }

        double res = a;

        if (b < 0) {
            res = 1.0 / a;
            a = res;
            b = -b;
        }

        for (int i = 1; i < b; i++) {
            res *= a;
        }
        return res; 
    }
}
