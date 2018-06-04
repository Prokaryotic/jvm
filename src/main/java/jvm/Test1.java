package jvm;

/**
 *-XX:-DoEscapeAnalysis   -XX:-EliminateAllocations   -XX:-UseTLAB    -XX:+PrintGC   (减号是不进行 加好是进行)
 *   关闭逃逸分析             关闭比标量替换               关闭本地内存      打印GC 信息
 *
 * @author lijunxue
 * @create 2018-04-15 23:48
 **/
public class Test1 {

    class User{
        int id ;
        String name ;

        User(int id ,String name){
            this.id = id;
            this.name = name;
        }
    }

    void alloc(int i){
        User u = new User(i,"name" +i); // 这个对象只是在方法里的 是可以放在栈上面的 是可以逃逸的 （不会逃脱方法的控制）
    }


    public static void main(String[] args) {
        Test1 t = new Test1();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++ ){
            t.alloc(i);
        }
        long s2 = System.currentTimeMillis();
        System.out.println(s2 - s1);

    }


}
