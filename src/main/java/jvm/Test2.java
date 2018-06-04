package jvm;

/**
 *  -XX:-DoEscapeAnalysis   -XX:-EliminateAllocations   -XX:-UseTLAB    -XX:+PrintGCDetails   (减号是不进行 加好是进行)
 *   关闭逃逸分析             关闭比标量替换                  关闭本地内存       打印GC 信息详细
 *   
 * @author lijunxue
 * @create 2018-04-16 0:09
 **/
public class Test2 {

    public static void main(String[] args) {
        byte [] B = new byte[1024];
    }
}
