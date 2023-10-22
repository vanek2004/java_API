package seminar.seminar_1;

public class example_4 {
    /* 
    Во фразе "Добро пожаловать на курс по java" переставить слова в обратном порядке.
    */
    public static void main(String[] args) {

        String string = "Добро пожаловать на курс по java";

        String[] words = string.split(" ");                 //получили массив слов

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
