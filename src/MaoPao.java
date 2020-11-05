public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {2, 10, 9, 80, 64};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                int temp;
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            System.out.print("第"+(i+1)+"次遍历");
            for (int a:arr){
                System.out.print(+a+" ");
            }
            System.out.println();
        }
    }
}
