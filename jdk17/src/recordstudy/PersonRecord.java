package recordstudy;

import java.io.Serializable;

public record PersonRecord(String name, String address, Phone phone) implements Serializable {

    // 可以在Record的构造函数中对Record的
     public PersonRecord{ // 紧凑型的Record构造函数


    }

}
