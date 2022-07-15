package SlimeLand;
import java.util.Random;

public class YellowSlime {
    public Random ranatt = new Random();
    public Random ranexp = new Random();

    public String name = "노랑 슬라임";
    public int hp = 20;
    public int att = ranatt.nextInt(15);
    public int exp = ranexp.nextInt(30)+5;

    public void dmg(int dmg) {
        this.hp = this.hp-dmg;
        if(this.hp <= 0)
        {
            this.hp = 0;
        }
        System.out.println("---------------------");
        System.out.println(this.name+"은" + dmg +"공격을 받았습니다.");
        System.out.println("남은 HP : "+this.hp);
        System.out.println("---------------------");
    }
    public int att()
    {
        System.out.println(this.name+"의"+att+"데미지 공격!");
        return att;
    }
    }