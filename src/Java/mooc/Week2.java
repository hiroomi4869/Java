package mooc;

public class Week2 {
    public static void main(String[] args) {
        int[] prime = new int[100];
        prime[0]=2;
        int i = 3;
        int q = 1;
        boolean flag=false;
        do {
            for (int a:prime) {
                flag=false;
                if (a==0)break;
                if (i%a==0){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                prime[q]=i;
                q++;
            }
            i++;
        }while (i<100);
        for (int x:prime) {
            if (x==0)break;
            System.out.println(x);
        }
    }
}
