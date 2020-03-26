package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exe1 {
    public static void main(String args[]) {

        int co=0,index=0;
        int old[]={17,3,4,5,0,0,6,6,0,5,4,7,6,7,50,5,56,0,67,45,234};


        //获取 i新的数组长度
        co=getnewL(old);
        System.out.println(co);
        ////声明新的数组
        int b[]=new int[co];
        // System.out.println(count);
        ///为新数组赋值

        for(int tem:old)
        {
            if (tem!=0)
            {
                b[index]=tem;
                index++;
            }


        }

       /* for(int j=0;j<old.length;j++)
         {
           if (old[j]!=0)
           {b[index]=old[j] ;
           System.out.println(b[index]+"index:"+index);
           index++;
           }

         } */

    }


    public static int getnewL(int a[])
    {
        int count=0;
        for(int tem:a)
        {if (tem!=0)
            count++   ;   }

        return count;
    }
}


        /*打印新的数组
        for(int tem:b)
        {System.out.println(tem);}


        for(int k=0;k<b.length;k++)
        {System.out.println(b[k]);}   */


     /*
     public static int getLength(int a[])
     {
       int count=0;

       for(int i:a)
          {if (i!=0)
             count++;           }

       return count;
     }


     for(int j:old)
        {if (j!=0)
         {b[index]=j ;
         index++;
         }
        }




   /* public static int count(int a[])
     {
       int co=0;

          for(int i:a)
          {if (i!=0)
            co++;
          }
          return co;
     }

     public static int[] create(int a[],int b[])
     {
           int index=0;

          for(int j:a)
          {if (j!=0)
           b[index++]=j ;}


          for(int k:b)
          {System.out.println(k);}

          return b;

       }*/

