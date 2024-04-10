class Hello{
    String name;
    public void say_hi(){
        System.out.println("Hi, everyone");
    }
    public void say_hi(String str){
        name = str;
        System.out.println("Hi, " + str);
    }
}

public class ch18 {
    public static void main(String[] args) {
        Hello ojb = new Hello();
        ojb.say_hi();
        ojb.say_hi("Tim");
    }
}
