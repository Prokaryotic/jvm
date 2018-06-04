package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出
 * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=F:\test\jvm\jvm.dump -XX:+PrintGCDetails
 * -Xms10M  程序起始的时候分配多少堆内存     -Xmx10M   最大值能到多少      一般调优的时候2个一样
 *
 * 内存文件的查看工具 VisualVM
 *
 * @author lijunxue
 * @create 2018-04-16 8:50
 **/
public class Test4 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 666666666; i++) {
           list.add(new byte[6666*6666]);

        }

    }
}
