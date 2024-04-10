class Trapezoid{
    int upper;
    int base;
    int height;
    public void show(){
        System.out.println(upper);
        System.out.println(base);
        System.out.println(height);
    }
    public void area(){
        System.out.println((upper + base) * height / 2);
    }
}

public class ch17 {
    public static void main(String[] args) {
        Trapezoid obj = new Trapezoid();
        obj.upper = 4;
        obj.base = 9;
        obj.height = 5;
        obj.show();
        obj.area();
    }
}
