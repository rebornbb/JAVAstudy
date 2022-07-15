import SlimeLand.*;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int slimeCase = r.nextInt(3);

        String slime = "";
        boolean game = true;
        boolean GameStart = true;
        boolean UserInfo = true;

        // --------------------------닉네임구간--------------------------------------------------------------

        while (UserInfo) {
            System.out.println("이름을 정해주세요.");
            String UserName = input.next();
            Force worrior = new Force(UserName);

            System.out.println("---------------------");
            System.out.println("용사의 이름은" + worrior.name + "입니다.");
            System.out.println("---------------------");
            UserInfo = false;
            game = true;

            // ---------------------------------------------------게임시작-------------------------------------------

            while (game) {

                boolean going = true; // 전투 While문 true , false
                GameStart = true;
                // ----------------------------객체 생성----------------------------------------
                GreenSlime greenSlime = new GreenSlime();
                YellowSlime yellowSlime = new YellowSlime();
                RedSlime redSlime = new RedSlime();
                //------------------------------------------------------------------------------
                while (GameStart) {

                    System.out.println("선택하세요.");
                    System.out.println("---------------------");
                    System.out.println("1.던전입장 2.용사정보 3.보스전 4.종료하기");
                    System.out.println("---------------------");
                    int Start = input.nextInt();
                    if (Start >= 5) {
                        System.out.println("---------------------");
                        System.out.println("다시 입력해주세요.");
                        System.out.println("---------------------");
                        continue;
                    }

                    switch (Start) {

                        case 1: {

                            System.out.println("1. 던전 입장");
                            going = true;
                            // 슬라임 생성
                            switch (slimeCase) {
                                case 0: {
                                    System.out.println("---------------------");
                                    System.out.println("초록 슬라임 등장!");
                                    System.out.println(" ");
                                    slime = "green";
                                   
                                    System.out.println("-----" + greenSlime.name + "-----");
                                    System.out.println("HP :" + greenSlime.hp);
                                    System.out.println("---------------------");

                                    break;
                                }
                                case 1: {
                                    System.out.println("---------------------");
                                    System.out.println("노랑 슬라임 등장!");
                                    System.out.println(" ");
                                   
                                    slime = "yellow";
                                    System.out.println("-----" + yellowSlime.name + "-----");
                                    System.out.println("HP :" + yellowSlime.hp);

                                    break;
                                }
                                case 2: {
                                    System.out.println("---------------------");
                                    System.out.println("빨강 슬라임 등장!");
                                    System.out.println(" ");
                                    slime = "red";
                                    
                                    System.out.println("-----" + redSlime.name + "-----");
                                    System.out.println("HP : " + redSlime.hp);
                                    System.out.println("---------------------");

                                    break;
                                }

                            }
                            // 전투
                            while (going == true) {
                                // -------------------------------------------------------------------------------
                                int input_att = r.nextInt(16); // 용사 공격력
                                int greenAtt = r.nextInt(11); // 초록 슬라임 공격력
                                int yellowAtt = r.nextInt(20); // 노랑 슬라임 공격력
                                int redAtt = r.nextInt(30); // 빨강 슬라임 공격력
                                worrior.att = input_att;
                                greenSlime.att = greenAtt;
                                yellowSlime.att = yellowAtt;
                                redSlime.att = redAtt;
                                // -------------------------------------------------------------------------------

                                System.out.println("선택하세요.");
                                System.out.println("---------------------");
                                System.out.println("1.공격하기 2.회복하기 3.도망치기");
                                System.out.println("---------------------");
                                int UserSelect = input.nextInt();

                                switch (UserSelect) {
                                    case 1:
                                        switch (slime) {
                                            case "green":
                                                greenSlime.dmg(worrior.att);
                                                worrior.dmg(greenSlime.att);
                                                if (greenSlime.hp == 0) {
                                                    greenSlime.hp = 0;
                                                    System.out.println("초록 슬라임을 물리쳤습니다!");
                                                    System.out.println("---------------------");
                                                    System.out.println(greenSlime.exp + "의 경험치를 얻었습니다.");
                                                    System.out.println("---------------------");
                                                    worrior.exp(greenSlime.exp);
                                                    game = true;
                                                    going = false;
                                                    slime = null;
                                                    // greenSlime = null;
                                                    slimeCase = r.nextInt(3);
                                                    break;
                                                }
                                                if (worrior.hp == 0) {
                                                    System.out.println("당신은 용사의 씨앗이 아니였군요!");
                                                    System.out.println("---------------------");
                                                    game = false;
                                                    going = false;
                                                    GameStart = false;
                                                    UserInfo = true;
                                                    UserName = null;
                                                    break;
                                                }

                                                break;

                                            case "yellow":
                                                yellowSlime.dmg(worrior.att);
                                                worrior.dmg(yellowSlime.att);
                                                if (yellowSlime.hp == 0) {
                                                    yellowSlime.hp = 0;
                                                    System.out.println("노랑 슬라임을 물리쳤습니다!");
                                                    System.out.println("---------------------");
                                                    System.out.println(yellowSlime.exp + "의 경험치를 얻었습니다.");
                                                    System.out.println("---------------------");
                                                    worrior.exp(yellowSlime.exp);
                                                    game = true;
                                                    going = false;
                                                    slime = null;
                                                    // yellowSlime = null;
                                                    slimeCase = r.nextInt(3);
                                                    break;
                                                }

                                                if (worrior.hp == 0) {
                                                    System.out.println("당신은 용사의 씨앗이 아니였군요!");
                                                    System.out.println("---------------------");

                                                    game = false;
                                                    going = false;
                                                    GameStart = false;
                                                    UserInfo = true;
                                                    UserName = null;
                                                    break;
                                                }

                                                break;

                                            case "red":
                                                redSlime.dmg(worrior.att);
                                                worrior.dmg(redSlime.att);
                                                if (redSlime.hp == 0) {
                                                    redSlime.hp = 0;
                                                    System.out.println("빨강 슬라임을 물리쳤습니다!");
                                                    System.out.println("---------------------");
                                                    System.out.println(redSlime.exp + "의 경험치를 얻었습니다.");
                                                    System.out.println("---------------------");
                                                    worrior.exp(redSlime.exp);
                                                    going = false;
                                                    game = true;
                                                    slime = null;
                                                    // redSlime = null;
                                                    slimeCase = r.nextInt(3);
                                                    break;
                                                }

                                                if (worrior.hp == 0) {
                                                    System.out.println("당신은 용사의 씨앗이 아니였군요!");
                                                    System.out.println("---------------------");
                                                    game = false;
                                                    going = false;
                                                    GameStart = false;
                                                    UserInfo = true;
                                                    UserName = null;
                                                    break;
                                                }

                                                break;

                                        }
                                }
                            }
                        }
                        case 2: {// 해당 케이스 왜 읽히는지 확인하기
                            System.out.println("---------------------");
                            System.out.println("용사 정보 :" + worrior.name);
                            System.out.println("현재 LEVEL :" + worrior.level);
                            System.out.println("현재 HP :" + worrior.hp);
                            System.out.println("현재 MP :" + worrior.mp);
                            System.out.println("현재 EXP :" + worrior.exp);
                            System.out.println("---------------------");
                        }
                    }

                }

            }
        }
    }
}