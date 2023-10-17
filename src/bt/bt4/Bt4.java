package bt.bt4;

import ra.config.Config;

public class Bt4 {
    public static void main(String[] args) {
        int [] newArr = getArr();
        System.out.print("Nhập số bạn muốn tìm: \n");
        int number = Integer.parseInt(Config.scanner().nextLine());
       if (findIndex(newArr, number)>=0){
           System.out.printf("Phần tử %d có vị trí là %d \n", number, findIndex(newArr, number));
       }else {
           System.out.println("Không tìm thấy");
       }
    }
    private static int findIndex(int[] arr,int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
    private static int[] getArr(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
