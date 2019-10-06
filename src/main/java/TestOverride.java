public class TestOverride {
    public static void main(String[] args) {
        //动态绑定原则：
        // 1.  调用对象的成员方法时候，JVM 会将对象的实际内存和当前的方法进行绑定。
        //     只有成员方法会进行动态绑定。
        // 2.  成员变量没有动态绑定的操作，成员变量的调用在哪里生命就在哪里使用。
        A a = new A() ;
        System.out.println(a.getResult()); // 20

        B b = new B() ;
        System.out.println(b.getResult()); // 40

        A a2 = new B() ;
        // 实际内存为B的，当前的方法getResult()在B中存在，所以B中的内存绑定B中的getResult()方法
        // 但是B中有自己的i=20 和 继承过来的i=10,所以有B内存中有两个 i。
        // 那么 getResult() {i+20} 的结果为什么是40 而不是 30 呢？
        /* 因为 B中内存的两个i分别是 this.i =20 ,和 super.i =10,
           getResult() 是B类的，完整的写法应该是 getResult() {this.i+20}
         */

        System.out.println(a2.getResult()); // 40

        A a3 = new C() ;
        // 实际内存为C 的，C内存中的i只有一个：super.i = 10;
        // 因为当前的方法getResult()在C中没有，所以使用的是父类A中的getResult()方法。
        // 那么A中的getResult()完整写法为{this.i +10} ,这里的this指的是父类A
        // 所以 用C内存中继承过来的super.i = 10 和 getResult()方法进行动态绑定。
        System.out.println(a3.getResult()); // 20


        A a4 = new D() ;
        // 1. 调用getResult2()的使用，D类中没有使用父类A中的，getI()+i 中 邦定的i 是A中的 i (=10)
        // 2. 但是在调用getI()成员方法时候，仍然会重新进行动态绑定：发现D中自己有这个getI(){i}方法，这里绑定
        //的i 是this.i D中自己的i值 20 ；所以结果是 30
        System.out.println(a4.getResult2()); // 30

    }
}
class A {
    public int i= 10 ;
    public int getResult(){
        return i+10 ;
    }
    public int getResult2(){
        return getI()+i ;
    }
    public int getI(){
        return i ;
    }
}
class B extends A{
    public int i =20 ;
    public int getResult(){
        return i+ 20 ;
    }
}
class C extends A{
    public int i =20 ;
}

class D extends A{
    public int i =20 ;
    public int getI(){
        return i ;
    }
}