import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ChaRu {
    public static void main(String[] args) {
        System.out.println("ll");
        int[] arr = {4,6,2,10,8};
        InsertSort(arr,arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }


    //插入排序(最好结果是n,最坏情况是n*n)
    static void InsertSort(int[] arr,int len)
    {
        for (int i = 1; i < len; i++)
        {
            int key = arr[i];
            while (arr[i - 1] > key)
            {
                arr[i] = arr[i - 1];
                i--;
                if (i == 0)
                {
                    break;
                }
            }
            arr[i] = key;
        }
    }
}
