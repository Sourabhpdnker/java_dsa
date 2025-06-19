public class PassingArguments {
    public static void updatemarks(int marks[]){
        for (int i = 0; i <marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {68,98,99};
        updatemarks(marks);
        for(int i = 0; i<marks.length;i++){
            System.out.println("updated marks is "+marks[i]);
        }
    }
    
}
