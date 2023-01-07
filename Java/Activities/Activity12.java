package activities;

interface Addable{
    int Sum(int a, int b);
}
public class Activity12 {

    public static void main (String[] args) {
        Addable ad1= (a,b) ->(a+b);
        Addable ad2= (int a, int b)->{
            int c=a+b;
            return c;
        };

        System.out.println((ad1.Sum(12,23)));
        System.out.println((ad2.Sum(23,45)));
    }

}
