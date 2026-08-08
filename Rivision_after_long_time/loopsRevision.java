// ====== loops (all in one) ======

public class loopsRevision {

    public static void main(String[] args) {
        forLoop();
        forLoopReverse();
        evenNo();
        oddNo();
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
    

}