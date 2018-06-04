package jvm;

/**
 * 通过Runtime类大致计算内存情况
 * @author lijunxue
 * @create 2018-04-16 8:50
 **/
public class Test3 {
    public static void main(String[] args) {
        prontMemoryInfo();
        byte[] b = new byte[1024*1024];
        System.out.println("---------------------");
        prontMemoryInfo();
    }

    static void prontMemoryInfo(){
        System.out.println("total"+Runtime.getRuntime().totalMemory()); // 近似值
        System.out.println("free"+Runtime.getRuntime().freeMemory());
    }
}
