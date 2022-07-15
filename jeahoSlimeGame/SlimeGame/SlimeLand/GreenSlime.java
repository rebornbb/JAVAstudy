package SlimeLand;

import java.util.Random;

public class GreenSlime {
    
    Random random = new Random();
    
    Random ranexp = new Random();

    public String name = "초록 슬라임";
    public int hp = 15;
    public int att = 0;
    public int exp = ranexp.nextInt(20)+3;
    
    
    public void dmg(int dmg) {
        this.hp = this.hp - dmg;
        if(this.hp <= 0)
        {
            this.hp = 0;
        }
        System.out.println("---------------------");
        System.out.println(this.name + "은 " + dmg + "의 공격을 받았습니다.");
        System.out.println("남은 HP : "+this.hp);
        System.out.println("---------------------");
    }

    public GreenSlime(int att)
    {
        this.att = att;
    }

    public GreenSlime() {

    }

}