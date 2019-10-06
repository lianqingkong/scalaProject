import java.util.List;

public class TestNull {
    public static void main(String[] args) {

       /*
        TestNull test = null ;
        // 1. 不会出现空指针异常
        System.out.println(test.name);
        // 2. 空指针异常  调用一个为空(Null)对象的 成员属性或 成员方法，会出现空指针异常。
        System.out.println(test.age);
        */

        // 3. 自动拆箱操作也可能出现空指针异常
        TestNull test = new TestNull() ;
        Integer i = null ;
        //test.test(i.intValue());
        test.test(i);

        //4.增强for底层 进行了迭代操作(Iterator) ，所以会有空指针异常
        List list = null;

        for (Object obj:list) {
            System.out.println(1);
        }

    }
    public void test(int i){
        System.out.println(i);
    }
    public static String name = "zhangsan" ;

}
