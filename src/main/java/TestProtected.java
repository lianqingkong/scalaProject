import javafx.scene.Parent;

public class TestProtected {
    public static void main(String[] args) {

        User user = new User() ;
        // protected 修饰的成员方法：同类、同包、子类 的类对象才能调用
        // 1、 .只代表从属关系，并不是调用关系，只是代表clone是属于User类的方法。
        // 2、 这里对clone的调用者是TestProtected，而不是User
      //  user.clone();

    }
}

class User {

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}

