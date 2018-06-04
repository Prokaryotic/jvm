package jvm;

/**
 * 线程栈大小
 * -Xss128k      128 512
 * 这个东西调的小线程的并发量可以大
 * 调的大递归可以很深
 *
 *
 * @author lijunxue
 * @create 2018-04-16 8:50
 **/
public class Test5 {
    static int count = 0;

    static void r(){
        count++;
        r();
    }



    public static void main(String[] args) {
      try {
          r();
      }catch (Throwable t){
          t.printStackTrace();
          System.out.println(count);
      }
    }

}
