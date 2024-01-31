
public class ifStatementdemo{

   public static void main(String args[]){
    
      int number1=Integer.parseInt(args[0]);
      
      int number2=Integer.parseInt(args[1]);
      
      if((number1>=1)&& (number1<=15)&&(number2>=1)&&(number2<=15)){
                 
         if((number1>=1)&&(number1<10)){
            System.out.println(number1 +" + "+ number2+" is within range");
            }else{
            System.out.println(number1 + "is not within the range of 1 - 10");
            
         
      }else if((number1==16) && (number2==20)){
         System.out.println("number value 1 = "+number1 +" = & number 2 value = "+ number2);
          }
    
   }
   
}  