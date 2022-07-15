package person;
import java.util.*;

public class Programmer {
    private static Scanner sc = new Scanner(System.in);

    boolean ongame = true;

    public String job = "개발자";
    public int hp = 10;
    public int mp = 10;
    
    //캐릭터정보
    public void info(){
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 내 캐릭터 정보는...? `**+ㅇO..*..+`*");
        System.out.println(" ");
        System.out.println("나의 직업은 거지같이 퀭해보이는 "+this.job+"입니다!");
        System.out.println(this.job + "의 HP = "+ this.hp);
        System.out.println(this.job + "의 MP = "+ this.mp);
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 나 정말 지쳐보여! `**+ㅇO..*..+`*");
        System.out.println(" ");
    }

    //캐릭터 공격 당했을때
    public void demage(int input_demage){
        this.hp = this.hp - input_demage;
        System.out.println(this.job + "은 " + input_demage + " 공격을 받았습니다");

        if(this.hp < 1) {
            System.out.println(" ");
            System.out.println("*`+ㅇO..*..+**` 안녕 " +this.job+ " 수고 `**+ㅇO..*..+`*");
            System.out.println(" ");
            System.out.println(this.job + "는 아마도 좋은 곳에 갔을 것이다...");
            this.hp = 0;

          while(ongame){
            System.out.println("게임을 재개 하려면 Y / 게임을 종료하려면 N");
            String endgame = sc.nextLine();
            if(endgame.equals("y") || endgame.equals("Y")){
              System.out.println("*`+ㅇO..*..+**` 개같이 부활합니다 `**+ㅇO..*..+`*");
             break;
            } else if(endgame.equals("n") || endgame.equals("N")) {
              System.out.println("*`+ㅇO..*..+**` 게임을 종료합니다 `**+ㅇO..*..+`*");
              ongame = false;
            } else {
              System.out.println("다시 입력해 주세요");
          }
          }

        } else {
            System.out.println(" ");
            System.out.println("__ "+this.job+"의 현재 상태 __");
            System.out.println(" ");
            System.out.println(this.job + "HP = "+ this.hp);
            System.out.println(this.job + "MP = "+ this.mp);
            System.out.println(" ");
            System.out.println("_______________________");
            System.out.println(" ");
        }
        
    }

    //캐릭터 공격 했을때
    public int BasicAttack() {
        // System.out.println(this.job + "는 " +10+ " 공격을 했습니다!");
        // return 10;
        double RandomAttack = Math.random();
        int basicattack = (int)(RandomAttack * 10) + 20;
        System.out.println(this.job +"은 " + basicattack + " 공격 했습니다!");
        return basicattack;
    }

    //캐릭터스킬사용할때
    //보스를 잡았을때 스킬 생성
    public int SkillAttack(){
    double RandomAttack = Math.random();
    int skillattack = (int)(RandomAttack * 60) + 30;
    System.out.println(this.job +"은 스킬을 사용해 " + skillattack + " 공격 했습니다!");
    return skillattack;
    }

    //캐릭터 상태
    public void state(){
      System.out.println(" ");
      System.out.println("__ "+this.job+"의 현재 상태 __");
      System.out.println(" ");
      System.out.println(this.job + "HP = "+ this.hp);
      System.out.println(this.job + "MP = "+ this.mp);
      System.out.println(" ");
      System.out.println("_______________________");
      System.out.println(" ");
  }

    //HP포션먹었을때 
    public void eatpotion1(int input_HPpotion){
      this.hp = this.hp + input_HPpotion;
      System.out.println(this.job + "은 포션을 먹어 " + input_HPpotion + " 회복했습니다");
    }

    //MP포션먹었을때 
    public void eatpotion2(int input_MPpotion){
      this.mp = this.mp + input_MPpotion;
      System.out.println(this.job + "은 포션을 먹어 " + input_MPpotion + " 회복했습니다");
    }

    //HPMP포션먹었을때 
    public void eatpotion3(int input_HPMPpotion){
    this.hp = this.hp + input_HPMPpotion;
    this.mp = this.mp + input_HPMPpotion;
    System.out.println(this.job + "은 포션을 먹어 " + input_HPMPpotion + " 회복했습니다");
    }

    }