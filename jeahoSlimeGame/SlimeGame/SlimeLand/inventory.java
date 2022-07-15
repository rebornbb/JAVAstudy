package SlimeLand;

import SlimeLand.Sword;
import java.util.*;

public class inventory {
    Scanner sc = new Scanner(System.in);

    public String iventory;
    

    String[] iven = new String[5];

    

    private String name;
    
    Sword sword = new Sword();

    public void iven() {
        iven[0] = "롱소드";
        iven[1] = "빨간 포션";
    }
    
    public void printInventory() {
        int count = 0;
        iven();
        for(int i=0; i<iven.length; i++){
            if(iven[i] == null){
                count++;
            }
        }
        //비어있는 inven의 칸 갯수 세기
        System.out.println("--------------인벤토리--------------");


        //비어있는 inven의 칸과 inven의 총길이가 같으면 비어있음 
        if(count == iven.length){
            System.out.println("인벤토리가 비었습니다.");
        }
        
        if(count != iven.length){
            System.out.print("당신의 인벤토리에 ");

            for(int i=0; i<iven.length-count; i++){
                System.out.print((i+1)+"."+iven[i]+ " ");
            }
    
            System.out.println("(이)가 있습니다");
        }

    }

    
        public void printitems() {
            
            String choice = sc.nextLine();
            
            // iven();
            
            
            switch(choice) {
                case "1" :
                System.out.println(iven[0]+"이 선택되었습니다.");
                break;
    
                case "2" :
                System.out.println(iven[1]+"이 선택되었습니다.");
                break;
    
                case "3" :
                System.out.println(iven[2]+"이 선택되었습니다.");
                break;
    
                case "4" :
                System.out.println(iven[3]+"이 선택되었습니다.");
                break;
    
                case "5" :
                System.out.println(iven[4]+"이 선택되었습니다.");
                break;
    
                default :
                System.out.println("다시 선택해주세요.");
                break;
            }            
            
        }
        
        public void useitem(){
            iven();

            System.out.println("사용 할 아이템을 선택 해주세요.");
            int useitem = sc.nextInt();

            iven[useitem-1] = null;

            printInventory();
        }
        
}