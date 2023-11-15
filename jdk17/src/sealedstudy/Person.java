package sealedstudy;

// 通过 sealed来修饰一个类/接口, 则这个类是被密封的，只能被指定的类所继承/实现
public sealed class  Person  permits Male,Female{
    public static final int V = 1;

}

// 实现被sealed修饰的类, 需要使用final或者non-sealed修饰，前者不可以被继承，或者可以
final class  Female extends Person{

}

// non-sealed修饰的子类可以被继承
non-sealed class Male extends Person {

}

class HappyPerson extends Male{
   static  {
       if (V == 1) {
           System.out.println("密封类被non-sealed修饰的子类可以被继承，且继承这个子类的类可以使用密封类的属性");
       }

   }
}

