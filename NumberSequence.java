public class NumberSequence{
    private int x;
    public NumberSequence(int num){
    x = num;
    }
    public int getNum(){
    return x;
    }
    public int fibonacci(int x){
        if(x == 0){
            return 1;
        }
        else if(x == 1){
            return 1; 
        }
        else{
        return fibonacci(x-1) + fibonacci(x-2);
        }
    }
    public int Cubic(int x){
        for(int i=1; i < x; i++){
        System.out.println(i*i*i);
        }
        return x*x*x;
        }
    public int triangle(int x){
        
            if(x==0){
            return 0;
            }
            else{
            return triangle(x-1)+x;
        }
        
    }
    public int square(int x){
        for(int i = 1; i < x; i++){
        System.out.println(i*i*i*i);
        
        }
        return x*x*x*x;
    }
}
        
        
        