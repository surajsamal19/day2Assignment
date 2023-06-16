public class EmpWagePerMonth{
public static void main(String args[]){
System.out.println("Welcome to Employee Wage Computation programm");
final int isPresent = 1;
final int isAbsent = 0;
final int isPartTime = 2;
int daily_wage_per_hour = 100;
int working_day = 20;
int Total_salary = 0;
int dailyWorkhour;
int dailySalary;
for(int day = 0; day<=working_day; day++){
int return_value = 0;
int checkAttendence = (int)((Math.random()*10)%3);
switch(checkAttendence){
case isPrsent:{
dailyWorkHour = 5;
return_value = dailyWorkHour;
break;
}
default:{
dailyWorkHour =0;
return_value = dailyWorkHour;
break;
}
}
dailySalary = daily_wage_per_hour*dailyWorkHour;
System.out.println("Daily salary =" +dailySalary);
Total_salary= Total_Salary+dailySalary;
}
System.out.println("------------------");
System.out.println("Monthly salary=" +Total_Salary);
}
}