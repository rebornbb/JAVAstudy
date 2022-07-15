package SlimeLand;
import SlimeLand.Sword;

public class Sword {
    public String name = "롱소드";
    public int gang = 10;
    

    Force force = new Force();
    
    public void sword(){

    }



    public int powersword() {
        System.out.println(this.name + "은" +10+ "공격력을 부여합니다");
        return 10;
    }

    public void printsword(Force force) {
        
        force.att = force.att + this.gang;

        System.out.println("--------------아이템 사용--------------");

        System.out.print("당신의 인벤토리에 있는 ");

        System.out.println(this.name +"(이)가 사용 되었습니다.");

        System.out.println( this.gang + "만큼 힘이 증가 하였습니다.");
    }

}