package mooc;
public class Week2_2 {
    public static void main(String[] args) {
        int RANGE=100;
        boolean[] booleans = new boolean[RANGE];
        for (int i = 0; i <RANGE ; i++) {
            booleans[i]=true;//初始化整个数组
        }
        booleans[0]=false;//将第一个数置为false
        for (int i = 1 ; i <100 ; i++) {
            if(booleans[i]){
                for (int j = 2; j*(i+1) <=RANGE ; j++) {
                    booleans[j*(i+1)-1]=false;  //将所有i的整数倍置为false
                }
            }
        }
        int nNum=1;
        for (boolean b:booleans) {
            if (b){//打印出所有true所对应的数字
                System.out.println(nNum);
            }
            nNum++;
        }
    }
}
