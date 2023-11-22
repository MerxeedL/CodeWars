package Katas7.DisemvowelTrolls;

public class Troll {

    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        disemvowel(str);
    }
    public static String disemvowel(String str) {

        String words[] = {"a","e","i","o","u","A","E","I","O","U"};

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(words[i])) {
                str = str.replace(words[i], "");
            }
        }
        return str;
    }
}