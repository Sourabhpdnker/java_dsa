// ====== loops (all in one) ======

public class loopsRevision {

    public static void main(String[] args) {
        forLoop();
        forLoopReverse();
        evenNo();
        oddNo();
        whileloop();
        Dowhileloop();
        multiplicationTable();
        nestedloop();

    }

    static void forLoop() {
        System.out.println("1. FOR LOOP\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
    // ============================================================
        // 2. FOR LOOP - REVERSE
        // ============================================================

    static void forLoopReverse() {
        System.out.println("1. FOR LOOP - reverse\n");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
    // ============================================================
        // 3. PRINT EVEN NUMBERS
        // ============================================================
    static void evenNo() {
        System.out.println("EVEN NO \n");

        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    // ============================================================
        // 3. PRINT odd NUMBERS
        // ============================================================
    static void oddNo() {
        System.out.println("ODD NO \n");
        for (int i = 1; i <= 20; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    // ============================================================
        // 5. WHILE LOOP
        // ============================================================

    static void whileloop(){
        int i =1;

        while( i <= 5){
            System.out.println(i);
            i++;
        }

    }
    // do while loop
    static void Dowhileloop(){
         System.out.println("Do while loop");
        int i =1;

        do{
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
    static void multiplicationTable(){
        for(int i = 1; i<=10; i++){
            System.out.println("5 X "+ i +" = "+ (5*i));
        }

    }
    static void nestedloop(){
        for(int i = 1; i<=10; i++){
            for(int j =1; j<=i; j++){
                System.out.print("0");

            }
            System.out.println();
        }
        for (int row = 1; row <= 5; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}