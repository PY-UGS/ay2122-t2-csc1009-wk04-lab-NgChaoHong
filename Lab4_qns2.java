package Lab4;

public class Lab4_qns2 {
    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();

        for (int i=0; i<10; i++)
        {
            stack.push(i);
        }
        

        while(stack.empty() != true){
           System.out.print(stack.pop() + " ");
        }     
    }
    
}
