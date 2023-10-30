package switchstudy;

public class SwitchMain {
    public static void main(String[] args) {

        DayEnum dayPlay = DayEnum.DAY_WORK;

        testSwitch(dayPlay);
    }

    public static void testSwitch(DayEnum dayEnum){

        // switch表达式和switch语句不同，需要穷举出所有的可能，或者在最后加上default
        // switch表达式中可以用yield返回值
        // switch可以匹配枚举类
        // switch表达式可以一次匹配多个值
        // switch表达式不需要break，只执行括号内的
        // switch表达式可以简写到只有一行


        int[] ints = switch (dayEnum){
            case DAY_WORK ->{  // switch可以匹配枚举类
                System.out.println("今天是:" + DayEnum.DAY_WORK.getDesc()+", 好好工作吧");
                yield DayEnum.DAY_WORK.getValue(); // switch表达式中可以用yield返回值
            }
           /* case DAY_PLAY -> {
                System.out.println("今天是:" + DayEnum.DAY_PLAY.getDesc()+", 好好玩吧");
                yield DayEnum.DAY_PLAY.getValue();
            }

            case DAY_RELAXATION -> {
                System.out.println("今天是:" + DayEnum.DAY_RELAXATION.getDesc()+", 好好休息吧");
                yield DayEnum.DAY_RELAXATION.getValue();
            }*/

            case DAY_PLAY, DAY_RELAXATION -> { // switch可以一次匹配多个值
                System.out.println("今天是周末:" + "不需要工作啦");
                yield new int[]{6, 7};
            }

            /*default -> {
                System.out.println("今天是:" + DayEnum.DAY_RELAXATION.getName()+", 好好休息吧");
                yield DayEnum.DAY_RELAXATION.getValue();
            }*/

        };

        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < ints.length; i++) {
            stringBuffer.append("星期").append(ints[i]).append(";");
        }

        String substring = stringBuffer.substring(0, stringBuffer.length() - 1)+"。";

        System.out.println(substring);

        // Switch的简写形式，如果只有一行代码就直接简写
        int[] i = switch (dayEnum){
            case DAY_WORK -> DayEnum.DAY_WORK.getValue();
            case DAY_PLAY -> DayEnum.DAY_PLAY.getValue();
            case DAY_RELAXATION -> DayEnum.DAY_RELAXATION.getValue();
        };



        /*switch (i[0]){
            case 1 -> System.out.println(123); // 数字类型无需所有可能
        }*/
    }


}
