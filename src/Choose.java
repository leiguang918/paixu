import java.util.Arrays;

public class Choose{


    public static void main(String[] args) {
        int[] arr = {4,6,2,10,8};
        selectSort(arr,arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void selectSort(int [] arr,int n){
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            int j;
            // 找出最小值得元素下标
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
            System.out.println(Arrays.toString(arr));
        }

    }


}
