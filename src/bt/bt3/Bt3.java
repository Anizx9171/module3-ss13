package bt.bt3;

import ra.config.Config;

import java.util.ArrayList;
import java.util.List;

public class Bt3 {
    static List<int[]> findValue = new ArrayList<>();
    public static void main(String[] args) {
        int[][] arr = getArr();
        for (int[] a:arr) {
            for (int n:a) {
                System.out.print("[" + n + " " + "]");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Nhập số cần tìm");
        int num = Config.scanner().nextInt();
        if (!searchAll(arr, num)){
            System.out.println("Không tồn tại giá trị cần tìm");
        }else{
            System.out.printf("số %d xuất hiện %d lần, các vị trí xuất hiện là: ", num, findValue.size());
            findValue.forEach(value ->{
                System.out.printf("(%d,%d) ",value[0], value[1]);
            });
        }
    }

    private static boolean searchAll(int[][] arr, int number) {
        int count = 0;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (number == arr[i][j]) {
                    int[] cache = {i,j};
                    findValue.add(cache);
                    check = true;
                }
            }
        }
        return check;
    }
    private static int[][] getArr(){
        int[][] arr = new int[20][30];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
}
