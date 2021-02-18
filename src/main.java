import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        StartApp();
    }

    public static void StartApp(){
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], "" + i);
        }

        ArrStringToInt s = new ArrStringToInt();
        System.out.println(s.stringToInt(arr));

    }
}
