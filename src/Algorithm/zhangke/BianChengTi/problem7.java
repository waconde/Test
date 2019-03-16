package Algorithm.zhangke.BianChengTi;

/**
 * @author zhangke
 * @version 1.0
 * @className problem7
 * @description TODO 指的是这样一个数列：1、1、2、3、5、8、13、21、34、⋯⋯在数学上，
 * 斐波纳契数列以如下被以递归的方法定义：F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * @date 2019/2/25 下午5:34
 **/
public class problem7 {
    public static void main(String arg[]){
        int k=10;
        for(int i=0;i<k;i++){
            System.out.println(Fibonacci(i));
        }
    }
    public  static int Fibonacci(int n) {
        if(n==0){return 0;}
        else if(n==1){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
/**
 * 改进
 *
 *
 *     public static void fibo(int n){
 int[] arr = new int[n];
 for(int i=0;i<n&&i<2;i++){
 arr[i] = 1;
 }
 for(int i=2;i<n;i++){
 arr[i] = arr[i-1]+arr[i-2];
 }
 System.out.println(Arrays.toString(arr));
 }
 public static void fibo(int n){
 int a = 1;
 int b = 1;
 int c = 0;
 for(int i=2;i<n;i++){
 c = a + b;
 System.out.println(c);
 a = b;
 b = c;
 }
 }

 */