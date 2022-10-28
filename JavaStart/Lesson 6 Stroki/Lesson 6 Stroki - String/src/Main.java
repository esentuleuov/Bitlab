import com.sun.security.jgss.GSSUtil;

import java.net.SecureCacheResponse;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
//        Tutorial
//        Scanner in = new Scanner(System.in);
//
//        String str1 = "Bitlab";
//        for(int i=0; i<str1.length(); i++){
//            System.out.println(str1.charAt(i));
//        }

//        Scanner in = new Scanner(System.in);
//        String str1 = " Bitlab ";
//        String str2 = "bitlab";
//        str1 = str1.toLowerCase(); //Запишет все с маленькой буквы
//        str2 = str2.toLowerCase();
//
//        str1 = str1.trim(); //Убирает пробелы слева и справа
//        str2 = str2.trim();
//        if(str1.equals(str2)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("NO");
//        }

//        Scanner in = new Scanner(System.in);
//        String str1 = " H E L L O World";
//        str1 = str1.replace("H","L"); //Меняет символ на другой символ. Так же можно и с пробелами
//        System.out.println(str1);

//        Scanner in = new Scanner(System.in);
//        String str1 = "HELLO WORLD";
//        System.out.println(str1.substring(0,5)); //Выводит символы от индекса 0 до 5
//
//        1) Tutorial Task
//        Scanner in = new Scanner(System.in);
//        String login = in.next();
//        // В логине должно быть 2 цифры
//        // И Заглавная буква
//
//        int digitCount = 0;
//        int upperCount = 0;
//        for(int i=0; i<login.length(); i++){
//            //Character.isDigit(login.charAt(i)) - Проверяем если в логине есть цифры
//            if(Character.isDigit(login.charAt(i))){
//                digitCount++;
//            }
//            if(Character.isUpperCase(login.charAt(i))){
//                upperCount++;
//            }
//        }
//
//        if(digitCount>=2 && upperCount>=1){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }

        /* Task 1
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(str.length());
         */

        /* Task 2
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(str.charAt(0));
         */

        /* Task 3
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(str.equals("BITLAB")){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
         */

        /* Task 4
         Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toLowerCase();
        if(str.equals("java")){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
         */

        /* Task 5
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.equals(str2)){
            System.out.println("THEY ARE EQUAL");
        }
        else{
            System.out.println("THEY ARE NOT EQUAL");
        }
         */

        /* Task 6
         Scanner in = new Scanner(System.in);
        String str1 = in.next();
        char letter = in.next().toLowerCase().charAt(0);

        int index = str1.indexOf(letter);
        if(index == -1){
            System.out.println("THERE IS NO SUCH LETTER");
        }
        else{
            System.out.println(index);
        }
         */

        /* Task 7
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.trim();
        System.out.println("("+str+")");
         */

        /* Task 8
         Scanner in = new Scanner(System.in);
        String number = in.next();
        if(number.equals("zero")){
            System.out.println(0);
        }
        else if(number.equals("one")){
            System.out.println(1);
        }
        else if(number.equals("two")){
            System.out.println(2);
        }
        else if(number.equals("three")){
            System.out.println(3);
        }
        else if(number.equals("four")){
            System.out.println(4);
        }
        else if(number.equals("five")){
            System.out.println(5);
        }
        else if(number.equals("six")){
            System.out.println(6);
        }
        else if(number.equals("seven")){
            System.out.println(7);
        }
        else if(number.equals("eight")){
            System.out.println(8);
        }
        else if(number.equals("nine")){
            System.out.println(9);
        }
         */

        /* Task 9
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
         */

        /* Task 10
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
            System.out.print(str.charAt(i));
        }
         */

        /* Task 11
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        char a = in.next().toLowerCase().charAt(0);
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == a){
                count++;
            }
        }
        System.out.println(count);
         */

        /* Task 12
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(str.replace("a","o"));
         */

        /* Task 13
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
         */

        /* Task 14
         Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        if(s1.contains(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
         */

        /* Task 15
          Scanner in = new Scanner(System.in);
        int count = 0;
        String str = in.next();
        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            char let = str.charAt(i);
            if( let=='a'|| let=='e'|| let=='i'|| let=='o'|| let=='u' ){
                count++;
            }
        }
        System.out.println(count);
         */

        /*
        Reshenie Task 15
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                count++;
            }
        }
        System.out.println(count);
         */

        /* Task 16
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum = sum + Character.getNumericValue(str.charAt(i)); //Возвращает целоцисловое значение символа
            }
        }
        System.out.println(sum);
         */

        /* Task 17
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        String s1new = "";
        String s2new = "";

        for(int i=0; i<s1.length(); i++){
            s1new =s1new + s1.charAt(i);
        }

        for (int i=s2.length()-1; i>=0; i--){
            s2new = s2new + s2.charAt(i);
        }

        if(s1new.equals(s2new)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
         */

        /* Task 19
         Scanner in = new Scanner(System.in);
        String str = in.next();
        String strnew = "";

        for(int i=str.length()-1; i>=0; i--){
            strnew = strnew + str.charAt(i);
        }

        if(str.equals(strnew)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
         */

        /* Task 20
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(str.charAt(1)+String.valueOf(Integer.parseInt(String.valueOf(str.charAt(0)))*2));
         */

        /* Task 21
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] symbols = str.split(" ");

        switch (symbols[1]) {
            case "+":
                str = String.valueOf(Integer.parseInt(String.valueOf(symbols[0])) + Integer.parseInt(String.valueOf(symbols[2])));
                System.out.println(str);
                break;
            case "-":
                str = String.valueOf(Integer.parseInt(String.valueOf(symbols[0])) - Integer.parseInt(String.valueOf(symbols[2])));
                System.out.println(str);
                break;
            case "*":
                str = String.valueOf(Integer.parseInt(String.valueOf(symbols[0])) * Integer.parseInt(String.valueOf(symbols[2])));
                System.out.println(str);
                break;
            case "/":
                str = String.valueOf(Integer.parseInt(String.valueOf(symbols[0])) / Integer.parseInt(String.valueOf(symbols[2])));
                System.out.println(str);
                break;
        }
         */

        /* Task 22
          Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = "";
        String str2 = "";
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                str1 = str1 + str.toLowerCase().charAt(i);
            }
            if(Character.isSpaceChar(str.charAt(i))){
                str1 = str1 + " ";
            }
            else if(Character.isLowerCase(str.charAt(i))){
                str1 = str1 + str.toUpperCase().charAt(i);
            }
        }
        System.out.println(str1);
        */

        /* Task 23
         Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.replaceAll("[1-9]", "0");
        System.out.println(str);
         */

        /* Task 24
         Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
         */

        /* Task 25
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] symbols = str.split(" ");
        for(int i=0; i<symbols.length; i++){
            symbols[i] = symbols[i].substring(0,1).toUpperCase() + symbols[i].substring(1);
            System.out.print(symbols[i] + " ");
        }
         */

        /* Task 27
          Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String s1 = in.next();
        String s2 = in.next();
        String[] res = text.split(" ");

        for(int i=0; i< res.length; i++){
            if(res[i].toLowerCase().equals(s1.toLowerCase())){
                text = text.replaceAll(res[i],s2);
            }
        }
        System.out.println(text);
         */

        /* Task 27 Vtoroe reshenie
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
            System.out.println(str.replaceAll("(?i)" + s2,s3)); //"(?i)" - Меняет местами s2 игнорируя все и только сравнивает символы
         */

        /* Task 28
         Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toLowerCase();
        String[] res = str.split(" ");

        for(int i=0; i<res.length; i++){
            switch (res[i]){
                case "zero":str = str.replace(res[i],"0");
                    break;
                case "one":str = str.replace(res[i],"1");
                    break;
                case "two":str = str.replace(res[i],"2");
                    break;
                case "three":str = str.replace(res[i],"3");
                    break;
                case "four":str = str.replace(res[i],"4");
                    break;
                case "five":str = str.replace(res[i],"5");
                    break;
                case "six":str = str.replace(res[i],"6");
                    break;
                case "seven":str = str.replace(res[i],"7");
                    break;
                case "eight":str = str.replace(res[i],"8");
                    break;
                case "nine": str = str.replace(res[i], "9");
                    break;
                case "ten": str = str.replace(res[i], "10");
                    break;
            }
        }
        System.out.println(str);
         */

        /* Task 29

         */

        /* Task 30
        Scanner in = new Scanner(System.in);
        String rev="";
        String str = in.nextLine();
        String[] arr = str.split(" ");

        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length()-1; j>=0; j--){
                rev = rev + arr[i].charAt(j);
            }
            rev = rev + " ";
        }
        System.out.println(rev);
         */






    }
}