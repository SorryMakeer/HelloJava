public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int i=0;
        String str = "abc";
        try {
            i = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("侬脑子瓦特啦！");
        }

        System.out.println(i);

//        1. '0'~'9'
//        2. +，-
//        3. 溢出问题，int N位，-2^(N-1) ~ 2^(N-1)-1,解决方案：123:1*100+2*10+3
//        4. Exception
    }
}
