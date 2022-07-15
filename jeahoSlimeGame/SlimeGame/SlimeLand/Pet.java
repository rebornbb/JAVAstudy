package SlimeLand;

public class Pet {

    boolean ongame = true;

    public String name = "초코";
    public String animal = "강아지";
    public int hp = 10000;
    
    //초코정보
    public void info(){
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 그 정체는 바로!!!! `**+ㅇO..*..+`*");
        System.out.println(" ");
        System.out.println("발에서 꼬순내가나는 귀여운 " +this.animal+" "+this.name+"입니다!");
        System.out.println(this.name + "의 HP = "+ this.hp);
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 나보다 강하잖아?!!! `**+ㅇO..*..+`*");
        System.out.println(" ");
    }
    //초코 공격 특성 - 첫싸움시 소개 
    public void attinfo(){
        System.out.println("초코는 피통은 최홍만이지만 공격력은 약합니다.");
        System.out.println("그렇습니다 초코는 그저 거들뿐 결국엔 귀여운 "+this.animal+"입니다.");
    }

    //초코 공격 당했을때
    public void demage(int dmg){
        this.hp = this.hp - dmg;
        System.out.println(this.name + "은 " + dmg + " 공격을 받았습니다");

        if(this.hp < 1) {
            System.out.println(" ");
            System.out.println("*`+ㅇO..*..+**` 안돼 " +this.name+ " 위험해!! `**+ㅇO..*..+`*");
            System.out.println(" ");
            System.out.println(this.name + "걱정마 " +this.name+ "는 죽지 않아... never die....");
            this.hp = 10000;
          } else {
            System.out.println(" ");
            System.out.println("__ "+this.name+"의 현재 상태 __");
            System.out.println(" ");
            System.out.println(this.name + "HP = "+ this.hp);
            System.out.println(" ");
            System.out.println("_______________________");
            System.out.println(" ");
        }
    }


    //초코 공격 했을때
    public int PetAttack() {
        // System.out.println(this.name + "는 " +10+ " 공격을 했습니다!");
        // return 10;
        double RandomAttack = Math.random();
        int basicattack = (int)(RandomAttack * 0) + 10;
        System.out.println(this.name +"은 " + basicattack + " 공격 했습니다!");
        if(basicattack == 0){
            System.out.println(this.name+": 끼잉....n(= 오 = n)...");
            System.out.println("귀여운 "+this.name+ "은 시무룩해졌습니다.");
        }else{
            System.out.println("그래 " +this.name+ " 잘하고 있어!");
        }
        return basicattack;
    }

    //초코 애교
    public void cute(){
        System.out.println("`+ㅇO..*..+**` n( >  오  < )n `**+ㅇO..*..+`*");
        System.out.println(this.name+": 멍머러멍멍멍.왕왕앙왕앙앙.와르르르.컹컹");
        System.out.println("...");
        System.out.println("지나가던 행인 : 어디서 " +this.animal +"짖는 소리 좀 안나게 하라~~~!!!!!!!");
    }

    //초코 상태
    public void state(){
      System.out.println(" ");
      System.out.println("__ "+this.animal+" "+this.name+"의 현재 상태 __");
      System.out.println(" ");
      System.out.println(this.name + "HP = "+ this.hp);
      System.out.println(" ");
      System.out.println("_______________________");
      System.out.println(" ");
  }

    
}
