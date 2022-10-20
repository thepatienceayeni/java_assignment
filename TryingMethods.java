//This class is an assignment to test how much we understand methods and loops
public class TryingMethods {

 public static void main(String[] args) {
    sumLessThan1000();
    System.out.println (sumLessThan1000());

 }   

 // It return a string of the day of the week based on the argument that was provided. 
 // Use a switch case in the body of the method.

 public String dayOfWeek(int x) {
    String dayOfTheWeek = "";
    
    switch (x) {
        case 1:
            dayOfTheWeek = "Sunday";
            break;
        case 2:
            dayOfTheWeek = "Monday";
            break;  
        case 3:
            dayOfTheWeek = "Tuesday";
            break;      
        case 4:
            dayOfTheWeek = "Wednesday";
            break;
        case 5:
            dayOfTheWeek = "Thursday";
            break;  
        case 6:
            dayOfTheWeek = "Friday";
            break;  
        case 7:
            dayOfTheWeek = "Saturday";
            break;    
        default:
            dayOfTheWeek = "Invalid entry. Please try again!";
            break;
    }

    return dayOfTheWeek;
    
 }


public static void userLogin(String name) {
    
    if(name == "Sarah"){
        System.out.println("Welcome to HR Department portal");
    }
    else  if(name == "Mike"){
        System.out.println("Welcome to Finance Department portal");
    }
    else if(name == "Albert"){
        System.out.println("Welcome to IT Department portal");
    }
    else{
        System.out.println("Access Denied 🚫");

    }}
     
    public static int sumLessThan1000(){
        int sum = 0;
        int value = 1;
        while (value < 1000) {
            sum += value;
            value++;
        }
        return sum;
    }



 
}