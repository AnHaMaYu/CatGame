public class NrThree {
    //hallo
    public static void main(String [] args){

    Out.print("Please input your budget: ");
    double budget = In.readDouble();
    int duration = 0;
    int stars = 0;

    // invalid budget
    if (!In.done()|| budget <= 0 ){
        Out.println("Invalid travel budget.");
        return;
    }

    //  duration of stay
    if (budget < 200){
        duration = 2;
    } else if (budget >= 200 && budget < 650){
        duration = 7;
    } else if (budget > 650){
        Out.println("Please enter your preferred star rating 1-5");
        stars = In.readInt();
        if(!In.done() || stars > 5 || stars < 0){
            Out.println("Invalid star rating.");
            return;
        } else {
            duration = (int)(0.02*(budget/stars));
        }
    }
    double cost = budget/duration;
    Out.println(String.format("Your stay lasts for %d days"+"\n"+"The price for your stay is %.2f", duration,cost));


    }
    
}
