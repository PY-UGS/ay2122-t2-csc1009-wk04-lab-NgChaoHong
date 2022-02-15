package Lab4;

public class StackOfIntegers {
    private int elements[];
    private int size;


    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty(){
        return (this.size == 0)?true:false;
    }

    public int peek(){
        try{
            return (this.elements[this.size-1]);
        }
        catch(Exception e){
            System.out.println("List is empty");
        }
        return 0;      
    }

    public void push(int value){
        
        this.elements[this.size] = value;
        this.size += 1;
    }

    public int pop(){
        int return_this = this.elements[this.size-1];
        this.size -= 1;       
        return return_this;
    }

    public int getsize(){        
        return this.size;
    }

}
