import java.util.Scanner;

public class OddOrEven1 {

    static void reverse(String arr[], int i) {
        int len = arr[i].length();
        String temp = "";
        for (int k = 0; k < len; k++) {
            temp += arr[i].charAt(len - k - 1);
        }
        arr[i] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String var = sc.nextLine();
        if (var.equals("odd")) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    reverse(arr, i);
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    reverse(arr, i);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
// Input : he likes apples
// odd
// Output : eh likes selppa
