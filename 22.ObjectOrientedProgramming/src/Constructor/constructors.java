package Constructor;

class rectangle {
    double length;
    double breadth;
    public  rectangle(){
        length=1;
        breadth=2;
    }
    public rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    public rectangle(double s){
        length=breadth=s;
    }
}
public class constructors {
    public static void main(String[] args) {
        rectangle r=new rectangle(10,5);
        rectangle r2= new rectangle();
        System.out.println("Length and Breadth of Rectangle 1 are: "+r.length +" "+ r.breadth);
        System.out.println("Length and Breadth of Rectangle 2 are: "+r2.length +" "+ r2.breadth);
    }
}
