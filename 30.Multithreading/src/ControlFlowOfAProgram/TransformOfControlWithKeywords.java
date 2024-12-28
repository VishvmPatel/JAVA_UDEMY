package ControlFlowOfAProgram;

public class TransformOfControlWithKeywords {
    public static void main(String[] args) {
        System.out.println("Example of Break Keyword");
        for(int i = 0; i<10; i++){
            if(i ==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println("Example of Continue Keyword");
        for(int j=0; j<10; j++){
            if(j==5){
                continue;
            }
            System.out.println(j);
        }
    }
}
