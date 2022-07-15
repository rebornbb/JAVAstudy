import person.*;
import slime.*;
import inventory.*;
import java.util.*;


public class field {


    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] arg) {

        Programmer programmer = new Programmer();
        slime1 slimeRed = new slime1();
        bigslime slimebig = new bigslime();
        Potion potionHP = new Potion();
        papaslime kingslime = new papaslime();
        Pet choco = new Pet();

        boolean ongame = true;
        


        while(ongame){ 
        System.out.println("================================");
        System.out.println("게임을 시작합니다! 당신의 직업 고르시오");
        System.out.println("================================");
        System.out.println("1. 개발자 | 2. 전사 | 3. 마법사");
        System.out.println("================================");
        System.out.print("직업 선택(번호) : ");

        String jobselect = sc.nextLine();
        
        switch(jobselect){
            case "1":
                programmer.info();
                break;
            case "2":
                System.out.println("당신의 직업은 전사입니다");
                break;
            case "3":
                System.out.println("당신의 직업은 마법사입니다");
                break;
            default:
                System.out.println("반드시 직업을 골라야 합니다");
                return;
        }

            System.out.println("=========================================");
            System.out.println("1. HP 물약 | 2. MP 물약 | 3. 무지개 물약");
            System.out.println("=========================================");
            System.out.print("아이템 선택(번호) : ");
    
            String itemselect = sc.nextLine();
            
            switch(itemselect){
                case "1":
                System.out.println("HP 물약을 선택했습니다");
                programmer.eatpotion1(potionHP.input_HPpotion());
                programmer.state();
                    break;
                case "2":
                System.out.println("MP 물약을 선택했습니다");
                programmer.eatpotion2(potionHP.input_MPpotion());
                programmer.state();
                    break;
                case "3":
                System.out.println("방패를 선택했습니다");
                programmer.eatpotion3(potionHP.input_HPMPpotion());
                programmer.state();
                    break;
                default:
                    System.out.println("아이템창 닫기");
                    return;
            }

        System.out.print("enter키를 눌러 게임을 진행해 주세요");

        String enter1000 = sc.nextLine();
        // == 이 아니라 equal
        if(enter1000.equals("")){
            System.out.println("당신은 길을 가는 도중 익숙한 모습을 보았습니다");
            System.out.println("헐 쟤가 왜 여기있어!!!!!");
        } else {
        System.out.print("enter키를 눌러 게임을 진행해 주세요");}

        String enter1001 = sc.nextLine();
        if(enter1001.equals("")){
            System.out.println("그 정체는....");
            choco.info();
        } else {
        System.out.print("enter키를 눌러 게임을 진행해 주세요");}

        String enter1004 = sc.nextLine();
        if(enter1004.equals("")){
            choco.cute();
            //초코의 애교
            } else {
            System.out.print("enter키를 눌러 게임을 진행해 주세요");}

// -----------------------------------------------

        String enter0 = sc.nextLine();
        // == 이 아니라 equal
        if(enter0.equals("")){
            System.out.println("당신은 길을 가는 도중 몬스터를 만났습니다");
        } else {
        System.out.print("enter키를 눌러 게임을 진행해 주세요");}

        
        String enter1 = sc.nextLine();
        if(enter1.equals("")){
            slimeRed.info();
            //슬라임1 등장
            } else {
            System.out.print("enter키를 눌러 게임을 진행해 주세요");}



            // ==============================

            String enter1002 = sc.nextLine();
            if(enter1002.equals("")){
                System.out.println("버르장머리없는 몬스터는 당신의 펫을 공격합니다.");
                //레드슬라임이 펫을 공격
                choco.demage(slimeRed.SlimeAttack());
             }      

             String enter1003 = sc.nextLine();
             if(enter1003.equals("")){
                 System.out.println("버르장머리없는 몬스터는 당신의 펫을 공격합니다.");
                 //펫이 레드슬라임 공격
                 slimeRed.demage(choco.PetAttack());
              }      

              String enter1005 = sc.nextLine();
              if(enter1005.equals("")){
                  choco.state();
                  //초코의 상태
                  } else {
                  System.out.print("enter키를 눌러 게임을 진행해 주세요");}
                  
            // ==============================

        String enter2 = sc.nextLine();
        if(enter2.equals("")){
            System.out.println("당신은 대담하고 무자비한 살상을 즐깁니다. 몬스터를 공격합니다.");
            // 용사의 레드슬라임 공격
            slimeRed.demage(programmer.BasicAttack());
        }


        String enter3 = sc.nextLine();
        if(enter3.equals("")){
            System.out.println("가여운 몬스터는 살기위해 당신을 공격합니다.");
            //레드슬라임의 공격
            programmer.demage(slimeRed.SlimeAttack());
         }   
                   
         String enter4 = sc.nextLine();
         if(enter4.equals("")){
             System.out.println("스킬로 불쌍한 슬라임을 더욱 세게 공격합니다");
            //  용사의 레드슬라임 스킬공격
            // this.hp = this.hp - input_demage; 숫자와숫자 연산해야기때문에 void xx
             slimeRed.demage(programmer.SkillAttack());
          }   


         String enter7 = sc.nextLine();
         if(enter7.equals("")){
             System.out.println("아빠 몬스터가 옵니다.");
             //아빠슬라임 등장
             slimebig.info();
          }   

          String enter8 = sc.nextLine();
          if(enter8.equals("")){
              System.out.println("아빠 몬스터가 당신을 공격합니다.");
              //아빠슬라임의 공격
              programmer.demage(slimebig.SlimeAttack());
           }   


         String enter100 = sc.nextLine();
         if(enter100.equals("")){
             kingslime.info();
             //대왕슬라임 등장
             } else {
             System.out.print("enter키를 눌러 게임을 진행해 주세요");}


             String enter101 = sc.nextLine();
             if(enter101.equals("")){
                 System.out.println("당신은 대담하고 무자비한 살상을 즐깁니다. 몬스터를 공격합니다.");
                 // 용사의 대왕슬라임 공격
                 kingslime.demage(programmer.BasicAttack());
             }
    
    
             String enter102 = sc.nextLine();
             if(enter102.equals("")){
                 System.out.println("가여운 몬스터는 살기위해 당신을 공격합니다.");
                 //대왕슬라임의 공격
                 programmer.demage(kingslime.PapaAttack());
              }   

// -----------------------------------------------

        
          System.out.println("게임을 재개 하려면 Y / 게임을 종료하려면 N");
          String endgame = sc.nextLine();
          if(endgame.equals("y") || endgame.equals("Y")){
            System.out.println("*`+ㅇO..*..+**` 개같이 부활합니다 `**+ㅇO..*..+`*");
           ongame = true;
          } else if(endgame.equals("n") || endgame.equals("N")) {
            System.out.println("*`+ㅇO..*..+**` 게임을 종료합니다 `**+ㅇO..*..+`*");
            ongame = false;
          } else {
            System.out.println("다시 입력해 주세요");
        }
     }



   }
}