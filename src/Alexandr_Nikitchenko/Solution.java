package Alexandr_Nikitchenko;

import java.io.BufferedReader;
import java.io.InputStreamReader;
        /*Три числа
        Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры.
        Затем происходит сравнение, и если мы находим число, которое отличается от двух других,
        выводим на экран его порядковый номер.
        */

public class Solution {
    public static void main(String[] args) throws Exception {
        //Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();

        //Преобразование строки в число
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);

        // Сравнение чисел
        if(a != b && a != c && b == c) System.out.println("1");
        else if(b != a && b != c && a == c) System.out.println("2");
        else if(c != a && c != b && a == b) System.out.println("3");
    }
}
