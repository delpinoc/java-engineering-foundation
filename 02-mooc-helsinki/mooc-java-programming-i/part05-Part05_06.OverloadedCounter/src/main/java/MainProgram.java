
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter contador = new Counter();
        Counter contador2 = new Counter(10);
        
        System.out.println(contador);
        System.out.println(contador2);
        
        contador2.decrease();
        contador.increase();
        
        System.out.println(contador);
        System.out.println(contador2);
        
        contador2.decrease(5);
        
        System.out.println(contador);
        System.out.println(contador2);
    }
}
