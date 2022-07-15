package slime;

import java.util.Random;

public class papaslime {
    
    Random ranexp = new Random();

    public String name = "미친 아빠 슬라임";
    public int hp = 60;
    public int exp = ranexp.nextInt(100)+30;
    public int input_demage = ranexp.nextInt(40)+0;
    
    public void info(){
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 몹이 등장했다 `**+ㅇO..*..+`*");
        System.out.println(" ");
        System.out.println(this.name+ ": '나는 사람 찢기를 좋아해' m(` O ` )m ");
        System.out.println("인육을 좋아하는 몹의 이름은 " + name + "입니다");
        System.out.println(this.name + "의 HP = "+ this.hp);
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 어머 무사와요 `**+ㅇO..*..+`*");
        System.out.println(" ");
    }

    
    public void demage(int dmg) {
        this.hp = this.hp - dmg;
        System.out.println(this.name + "은 " + dmg + " 공격을 받았습니다");
        
        if(this.hp < 1) {
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 안녕 " +name+ " 잘가 `**+ㅇO..*..+`*");
        System.out.println(" ");
        System.out.println(this.name + "은 아마도 좋은 곳에 갔을 것이다...");
        this.hp = 0;
        } else {
        System.out.println(" ");
        System.out.println("__ "+this.name+"의 현재 상태 __");
        System.out.println(" ");
        System.out.println(this.name + "HP = "+ this.hp);
        System.out.println(" ");
        System.out.println("___________________________");
        System.out.println(" ");
        }
    }

    public int PapaAttack() {
        System.out.println(this.name +"은 당신을 " + input_demage + " 공격 했습니다!");
        return input_demage;
    }
    

}