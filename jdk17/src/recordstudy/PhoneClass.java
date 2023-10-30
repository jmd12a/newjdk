package recordstudy;

import java.io.Serializable;

public class PhoneClass implements Serializable {

    private String type;

    private String code;

    public PhoneClass(String type, String code) {
        this.type = type;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PhoneClass{" +
                "type='" + type + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
