package slime;

public class bigslime {
    public String name = "김종국슬라임";
    public int hp = 100;
    public int mp = 0;
    

    //몹정보
    //void 빈칸 
    public void info(){
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 몹이 등장했다 `**+ㅇO..*..+`*");
        System.out.println(" ");
        System.out.println(this.name+ ": '나는 사람을 찢어 ㅎㅎ' m(` O ` )m ");
        System.out.println("사람을 좋아하는 몹의 이름은 " + name + "입니다");
        System.out.println(this.name + "의 HP = "+ this.hp);
        System.out.println(this.name + "의 MP = "+ this.mp);
        System.out.println(" ");
        System.out.println("*`+ㅇO..*..+**` 어머 귀여워라 `**+ㅇO..*..+`*");
        System.out.println(" ");
    }
    
    //몹 공격 당했을때
    public void demage(int input_demage){
        this.hp = this.hp - input_demage;
        System.out.println(this.name + "은 " + input_demage + " 공격을 받았습니다");
        
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
            System.out.println(this.name + "MP = "+ this.mp);
            System.out.println(" ");
            System.out.println("___________________________");
            System.out.println(" ");
        }
    
    }

    //몹 공격 했을때
    public int SlimeAttack() {
        System.out.println(this.name + " 은 " +50+ " 공격을 했습니다!");
        return 50;
    }


    }