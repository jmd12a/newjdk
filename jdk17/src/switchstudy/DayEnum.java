package switchstudy;

public enum DayEnum {

    DAY_WORK("工作日",new int[]{1,2,3,4,5}),
    DAY_RELAXATION("休息日", new int[]{6}),
    DAY_PLAY("玩耍日",new int[]{7});


    final String desc;
    final int[] value;

    DayEnum(String name, int[] value) {
        this.desc = name;
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }


    public int[] getValue() {
        return value;
    }

}
