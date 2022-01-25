/* 剑指Offer 10 斐波那契数列 */

public class Fib {
    public int fib(int n) {

        if(n == 0) return 0;
        int fn0 = 0;
        int fn1 = 1;
        int temp;
        for(int i = 2; i <= n; i++){
            temp = fn0 + fn1;
            fn0 = fn1;
            fn1 = temp% 1000000007; // 每次运算都取模 避免越界
        }
        return fn1;

    }
}
