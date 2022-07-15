package SlimeLand;
import java.util.Random;


public class RedSlime {
    public Random random= new Random();
    public Random ranexp = new Random();

    //필드값 (슬라임의 hp, att,)
    public String name;
    public int hp;
    public int att;
    public int exp = ranexp.nextInt(50)+10;
    public boolean isLive=true;

    //레드슬라임 생성자( 슬라임 클래스를 인스턴스로 만들 때 매개변수를 받아서 객체만들기)
    public RedSlime(){
        this.name= "빨강 슬라임";
        this.hp = 25;
    }
    public void dmg(int dmg) {
        this.hp = this.hp-dmg;
        if(this.hp <= 0)
        {
            this.hp = 0;
        }
        System.out.println("---------------------");
        System.out.println(this.name+"은" + dmg +"의 공격을 받았습니다.");
        System.out.println("남은 HP : "+this.hp);
        System.out.println("---------------------");
    }

    public RedSlime(int att) {
        this.att = att;
    }

}