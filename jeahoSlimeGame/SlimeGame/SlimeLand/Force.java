package SlimeLand;
import java.util.*;


public class Force {
    Random Forcerendom = new Random();

    public String name;
    public int Max_hp = 200;
    public int Max_mp = 50;
    public int hp = 50;
    public int mp = 50;
    public int exp = 0;
    public int level = 1;
    public int att = 0; 
    public int gang = 10; 
    
    public Force(String UserName)
    {
        this.name = UserName;
    }

    public Force(int input_att)
    {
        this.att = input_att;
    }

    public Force() {
    }
    public void info() {
        System.out.println("---------------------");
        System.out.println("--------"+this.att+"-------");

        System.out.println("---------------------");
    }
    public void dmg(int dmg) {
        this.hp = this.hp - dmg;
        if(this.hp <= 0)
        {
            this.hp = 0;
        }
        
        System.out.println( this.name+"은" + dmg + "의 공격을 받았습니다");
        System.out.println("남은 HP : "+this.hp);
        System.out.println("---------------------");
    }

    public int att() {
        return att;
    }
    public void exp(int exp){
        this.exp+=exp;
        if(100<=this.exp){
            this.level++;
            System.out.println("==============================");
            System.out.println("\tLEVEL UP!");
            System.out.println("체력과 공격력이 증가했습니다.");
            System.out.println("==============================");
            this.exp-=100;
            this.Max_hp += 20;
            this.hp = Max_hp;
            this.Max_mp += 10;
            this.mp = Max_mp;
            this.att +=3; 
        }
    }
    //롱소드사용했을때



    }