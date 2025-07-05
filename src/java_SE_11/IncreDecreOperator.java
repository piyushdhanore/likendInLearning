package java_SE_11;

public class IncreDecreOperator {
    public static void main(String[] args) {
        
        postIncrement();
        preIncrement();
        postIncrement();
        exercise();
    }

    public static void postIncrement() {

        int i = 99;

        System.out.println(++i);
    }

    public static void preIncrement() {

        int i = 99;

        System.out.println(i++);
        System.out.println(i++);
    }

    public void postPreIncrement(){

        int i = 99;

//        System.out.println(++i++); compilation error
    }

    public static void exercise(){

        int x = 1;
        int z;

        try {

            z = 100/--x;
        } catch (Exception e){
            System.out.println("bang");
        }
        System.out.println(x);
    }
}
