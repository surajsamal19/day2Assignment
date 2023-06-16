import java.util.Random;
public class EmpWageCheck{
public static void main(String args[]){
int isPresent = 1;
Random random = new Random();
int randomCheck = random.nextInt(2);
System.out.println(randomCheck);
if(randomCheck == isPresent){
System.out.println("Emp is present");
}
else{
System.out.println("Emp is absent");
}
}
}