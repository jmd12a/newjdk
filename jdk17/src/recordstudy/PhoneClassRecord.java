package recordstudy;

import java.util.Objects;


// 一个record实际上相当于一条这样的记录
public class PhoneClassRecord {

    public final String type;
    public final String code;
    public final  String brand;

    public  PhoneClassRecord(String type, String code, String brand){
        this.type = type;
        this.code = code;
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "PhoneClassRecord{" +
                "type='" + type + '\'' +
                ", code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneClassRecord that = (PhoneClassRecord) o;
        return Objects.equals(type, that.type) && Objects.equals(code, that.code) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, code, brand);
    }
}
