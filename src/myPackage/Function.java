package myPackage;

public class Function{
    public static void main(String[] args){
   
   countPrimeFactorsOf(100);
}
public static void countPrimeFactorsOf(int number){

    int factor = 0;
    for (int count = 2; count <= number; count++){
        while (number % count == 0){ 
            number = number / count;
            factor += count;
          if(number == 1)
            System.out.println(factor);     
            }
    
        
    } 
      

}

}
