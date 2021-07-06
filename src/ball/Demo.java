package ball;

import cn.tedu.util.App;
public class Demo extends App{
    public int a = 1;

    public void a(){
        System.out.println("AAAA");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.b();
    }

    public void b(){
        a();
        System.out.println(this.a);
    }
}
