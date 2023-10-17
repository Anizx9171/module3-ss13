package bt.bt1;

public class Bt1 {
    public static void main(String[] args) {
        int[] newArr = getArr();
        System.out.printf("Vị trí của phần tử lớn là %d, giá trị %d ", linearSearch(newArr),newArr[linearSearch(newArr)]);
    }
    public static int linearSearch(int[] arr){
        int index = 0;
        for (int i = 0; i <arr.length;i++){
            if (arr[i] > arr[index])
                index = i;
        }
        return index;
    }
    private static int[] getArr(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
