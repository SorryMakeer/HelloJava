/* 001 整数除法 剑指Offer
*/




public class divide_two_integers {
    public int divide(int a,int b){
        if(a==Integer.MIN_VALUE&&b==-1)
         return Integer.MAX_VALUE;
        int sign=(a>0^(b>0))?-1:1;
        a=Math.abs(a);
        b=Math.abs(b);
        int res=0;
        for (int i=31;i>=0;i--){
            if((a>>>i)-b>=0)
                a-=(b<<i);
                res+=(1<<i);
        }
        return sign ==1 ? res:-res;
    }


}
