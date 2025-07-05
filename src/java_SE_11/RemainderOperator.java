package java_SE_11;

public class RemainderOperator {
    public static void main(String[] args) {

        System.out.println(7%3);

        plusRemainder();
        minusRemainder();
        allMinus();
        exercise();

    }

    public static void plusRemainder(){

        System.out.println(-7%3);
    }

    public static void minusRemainder(){

        System.out.println(7%-3);
    }

    public static void allMinus(){
        System.out.println(-7%-3);
    }

    public static void exercise(){

        int [] ai = {0,1,2,3};

        int idx = (int)(Math.random() * 101)-50;

        System.out.println(ai[idx%ai.length]);

    }

}
