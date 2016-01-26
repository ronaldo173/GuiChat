package big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex on 28.12.2015.
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String result = null;
        try {
            result = reader.readLine();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            try {
                result = reader.readLine();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return result;
    }

    public static int readInt() {
        int result = 0;

        try {
            result = Integer.parseInt(readString());
        } catch (NumberFormatException e) {
            System.out.println("Произошла ошибка при попытке ввода числа");
            result = readInt();
        }

        return result;
    }

}