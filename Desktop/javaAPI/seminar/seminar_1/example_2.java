package seminar.seminar_1;

public class example_2 {
    //Дан массив двоичных чисел, например [1,1,0,1,1,1],
    // вывести максимальное количество подряд идуших 1.
    public static void main(String[] args) {
        
        int[] mas = {1,1,0,1,1,1};    // or  int[] mas = new int[] {1,1,0,1,1,1};

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            
            if (mas[i] == 1) {
                count++;
            }
            
            else if (maxCount < count){ 
                maxCount = count;
                count = 0;
            }
            else count = 0;
        }
        if (maxCount < count){ 
                maxCount = count;
                count = 0;
            }
        System.out.println(maxCount);


    }
}
