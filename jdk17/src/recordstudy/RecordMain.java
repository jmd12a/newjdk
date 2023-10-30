package recordstudy;

import java.io.*;

public class RecordMain {

    public static void main(String[] args) throws Exception {

       /* PersonRecord personRecord = new PersonRecord("张三", "洛阳市开元大道263号", new Phone("联通", "13137040796"));

        PersonRecord personRecord1 = new PersonRecord("张三", "洛阳市开元大道263号", new Phone("联通", "13137040796"));

        boolean equals = personRecord1.equals(personRecord);

        System.out.println(equals); //true


        *//* record中的属性只能读取不能修改，相当与所有的属性都是final的
        * record中的所有属性都是public的
        * record中的属性可以是其他的Record, 也可以是其他的类
        * 两个属性相同的Record，他们的一定是相等的，不需要我们去重写equals()方法
        * record可以继承接口，定义方法等
        * record可以理解为是一组不可变数据的集合，存储一组不可变的数据
        *
        *//*
        System.out.println(personRecord);

        Phone phoneRecord = personRecord.phone();

        PhoneClass phoneClass = new PhoneClass("联通","13137040796");

        // 序列化与class的对比

        File file = new File("F:\\data");

        if (file.exists()) {
            file.delete();
        }

        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream("F:\\data");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(phoneClass);
        objectOutputStream.writeObject(phoneRecord);*/

        FileInputStream fileInputStream = new FileInputStream("F:\\data");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//        // java类在反序列化时不会调用构造函数
//        Object o = objectInputStream.readObject();
//
//        // record在反序列化时一定会调用全构造函数
//        Object o1 = objectInputStream.readObject();
//
//        System.out.println(o);
//
//         System.out.println(o1);


    }
}
