public class Hero {
    String name; //姓名
      
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
    int killtimes;
 
    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }
 
    //获取护甲值
    float getArmor(){
        return armor;
    }
     
    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }
     void legendary() {
    	 System.out.println("超神");
     }
     float getHp(){
    	 return hp;
     }
     void recovery(float blood) {
    	 hp = hp + blood;
     }
}