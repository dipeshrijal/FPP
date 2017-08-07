package lesson2.staticdemo;

public class CountInstances {
    private static int count;
    CountInstances() {
        ++count;
    }
    
    public int getCount(){
        return count;
    }
    
    public static void main(String[] args){
        for(int i = 0; i < 10; ++i){
            new CountInstances();
        }
        System.out.println("Num instances created: " 
          + CountInstances.count);
    }
}