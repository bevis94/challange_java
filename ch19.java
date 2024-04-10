class Volume{
    public void show(){
        System.out.println("printed from class Volume");
    }
    public int vol() {
        return 1;
    }
}

class Box extends Volume{
    int length;
    int width;
    int height;
    public Box(){
        length = 1;
        width = 1;
        height = 1;
    }
    public Box(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
    public void show(){
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);
    }
    public int vol(){
        return length*width*height;
    }

}

public class ch19 {
    public static void main(String[] args) {
        Box box1=new Box(2,3,4);
        Box box2=new Box();
        box1.show();
        System.out.println(box1.vol());
        box2.show();
        System.out.println(box2.vol());
    }
}
