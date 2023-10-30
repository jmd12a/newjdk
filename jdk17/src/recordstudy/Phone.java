package recordstudy;

import java.io.Serializable;

public record Phone(String type,String code,String brand) implements Serializable {
    public Phone{
        System.out.println("Record在反序列化时的调用");
    }
}
