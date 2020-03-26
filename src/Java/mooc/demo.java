package mooc;

public class demo {
    public static void main(String[] args) {
        int[] arr = new int[100];   //定义数组
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        } //数组元素从2~100
        for (int i = 2; i < arr.length; i++)
        {
            if (arr[i] != 0) {
                int j, temp;
                temp = arr[i];
                for (j = 2 * temp; j < arr.length; j = j + temp)
                {
                    arr[j] = 0;
                }
                System.out.print(arr[i] + " ");//筛选出素数2~100素数
            }
        }
    }
}