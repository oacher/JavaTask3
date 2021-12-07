/* 2. Пользователь вводит с клавиатуры строчку, являющуюся паролем.
Проверить, надежно ли составлен пароль. Пароль считается надежным,
если он состоит из 8 или более символов. Символом может быть цифра,
английская буква, знак подчеркивания. Пароль должен содержать хотя бы
одну заглавную букву, одну маленькую букву и одну цифру. */

import java.util.Scanner;
import java.util.regex.*;

public class JavaTask3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Придумайте пароль, состоящий из более чем 8 символов ");
        System.out.println("и содержащий хотя бы одну заглавную букву, маленькую букву  и цифру: ");
        String password = sc.nextLine();
        String pattern = "\\W";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        int k = 0;
        //StringBuffer password2 = new StringBuffer();
        //StringBuilder password3 = new StringBuilder();
        //password2 = sc.nextLine();
        //password3 = sc.nextLine();

        if (password.length() > 7) {

            while (m.find()) {

                k += 1;
            }
            if (k > 0) {
                System.out.print("В пароле использованы запрещенные символы");
            } else
                System.out.print("Пароль надежный");
        }
        else {
                System.out.print("Пароль состоит из менее 8 символов. Повторите попытку");

        }


            sc.close();
        }
    }

