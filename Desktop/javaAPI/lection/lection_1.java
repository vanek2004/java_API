
// import java.util.Scanner;

/**
 * lection_1
 */
public class lection_1 { // "class"
    public static void main(String[] args) { // точка входа "main"
        // System.out.println("grgrrg"); // сниппет - "sysout"
        // /*-----------------------------------------------------------------------------------------
        // */
        // String a = null;
        // System.out.println(a);
        // /*-----------------------------------------------------------------------------------------*/
        // int b = 4; //(int) занимает 4 байта
        // /*-----------------------------------------------------------------------------------------*/
        // float c = 4.5f; // (float) - вещественное число
        // double d = 34.56;
        /*-----------------------------------------------------------------------------------------*/
        // var grgr = 123; // неявная типизация
        // System.out.println(getType (grgr));

        // static String getType(Object o){
        // return o.getClass().getSimpleName();
        // }
        /*-----------------------------------------------------------------------------------------*/
        // int l = 13;
        // System.out.println(Integer.MAX_VALUE); // (Integer) - класс обертка.
        // Максимальное или минимальное значение типа данных
        // /*-----------------------------------------------------------------------------------------*/
        // String s = "grgr";
        // System.out.println(s.charAt(1)); // обращение к конкретному символу в строке
        // /*-----------------------------------------------------------------------------------------*/

        /* JAVA OPERATION */
        // Присваивание: =
        // Арифметические: *,/,+,-,%,++,--
        // Операции сравнения: <,>,==,!=,>=,<=
        // Логические операции: ||,&&,^,!
        // Побитовые операции: <<,>>,&,|,!

        /*-----------------------------------------------------------------------------------------*/

        /* ARRAY */
        // int[] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);

        // int[][] arrr = new int[4][5];

        /*-----------------------------------------------------------------------------------------*/

        /* ПРЕОБРАЗОВАНИЯ */

        // int i = 123; double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // d = 3.1415; i = (int)d;
        // System.out.println(d); // 3.1415
        // System.out.println(i); // 3
        // d = 3.9415; i = (int)d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range

        /*-----------------------------------------------------------------------------------------*/

        /* ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА */
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!\n", name);
        // iScanner.close();

        /*-----------------------------------------------------------------------------------------*/

        /* Форматированный вывод */

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

        // Виды спецификаторов:
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00

        /*-----------------------------------------------------------------------------------------*/

        /* Оператор выбора */

        // int m = 1;

        // switch (m) {
        // case 1: System.out.println("a");
        // break;

        // case 2: System.out.println("b");
        // break;
        // }

        /*-----------------------------------------------------------------------------------------*/

        /* оператор continue */

        // for (int i = 0; i < 10; i++) {
        // if (i % 2 == 0){
        // continue;
        // }
        // System.out.println(i);
        // }

        /*-----------------------------------------------------------------------------------------*/

        /* foreach - для коллекций */

        // int[] arr = new int[] {1,2,3,4,5,6,6};
        // for (int item : arr) {
        // System.out.println(item);
        // }

        /*-----------------------------------------------------------------------------------------*/
        /* РАБОТА С ФАЙЛАМИ */
        /* СОЗДАНИЕ, ЗАПИСЬ, ДОЗАПИСЬ */

        // import java.io.FileWriter;
        // import java.io.IOException;
        // public class Program {
        // public static void main(String[] args) {
        // try (FileWriter fw = new FileWriter("file.txt", false)) {
        // fw.write("line 1");
        // fw.append('\n');
        // fw.append('2');
        // fw.append('\n');
        // fw.write("line 3");
        // fw.flush();
        // } catch (IOException ex) {
        // System.out.println(ex.getMessage());

        /* ЧТЕНИЕ, ВАРИАНТ ПОСИМВОЛЬНО */

        // import java.io.*;
        // public class Program {
        // public static void main(String[] args) throws Exception {
        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        // char ch = (char) c;
        // if (ch == '\n') {
        // System.out.print(ch);
        // } else {
        // System.out.print(ch);

        /* ВАРИАНТ ПОСТРОЧНО */

        // import java.io.*;
        // public class Program {
        // public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        // System.out.printf("== %s ==\n", str);
        // }
        // br.close();
    }

}   
