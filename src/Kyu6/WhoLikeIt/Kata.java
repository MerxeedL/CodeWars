package Kyu6.WhoLikeIt;

public class Kata {

    public static void main(String[] args) {

        String[] names = new String[]{"Alex", "Max", "John", "Mark","z","x","c","v","v","v","v"};
        System.out.println(whoLikesIt(names));

    }

    public static String whoLikesIt(String... names) {


        String result = "";

        for (int i = 0; i <= names.length; i++) {
            if (names.length == 0) {
                result = "no one" + " " + "like this";
            } else if (i == 0) {
                result = names[0] + " " + "likes this";
            } else if (i == 1) {
                result = names[0] + " and " + names[1] + " " + "likes this";
            } else if (i == 2) {
                result = names[0] + ", " + names[1] + " and " + names[2] + " " + "likes this";
            } else if (i >= 3){
                result = names[0] + ", " + names[1] + " and " + (i-2) + " others " + "likes this";
            }
        }
        return result;
    }

}


