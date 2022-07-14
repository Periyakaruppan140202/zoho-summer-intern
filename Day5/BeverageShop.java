import java.util.ArrayList;
import java.util.Scanner;

public class BeverageShop {
    static int max = 0;
    static ArrayList<Integer> path = new ArrayList<>();
    static ArrayList<Integer> num = new ArrayList<>();

    static int chooseBottle(int arr[], int left, int right, int sum, int times) {
        if (left == right) {
            sum = sum + times * arr[left];
            if (max < sum) {
                path = new ArrayList<>(num);
                path.add(arr[left]);
                max = sum;
            }
            return max;
        }
        num.add(arr[left]);
        sum += times * arr[left];
        chooseBottle(arr, left + 1, right, sum, times + 1);
        num.remove(num.size() - 1);
        sum -= times * arr[left];
        num.add(arr[right]);
        sum += times * arr[right];
        chooseBottle(arr, left, right - 1, sum, times + 1);
        num.remove(num.size() - 1);
        sum -= times * arr[right];
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        chooseBottle(arr, 0, arr.length - 1, 0, 1);
        for (int i = 0; i < path.size(); i++)
            System.out.print(path.get(i) + "");
        System.out.print(" value -> " + max);
    }
}