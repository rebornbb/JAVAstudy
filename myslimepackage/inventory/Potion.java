package inventory;

public class Potion {
    public String name = "HP 물약";

    public int input_HPpotion() {
        System.out.println(this.name + " 은 HP를 " +20+ "을 공급해줍니다");
        return 20;
    }

    public int input_MPpotion() {
        System.out.println(this.name + " 은 MP를 " +20+ "을 공급해줍니다");
        return 20;
    }

    public int input_HPMPpotion() {
        System.out.println(this.name + " 은 HP/MP를 " +20+ "을 공급해줍니다");
        return 20;
    }

}
