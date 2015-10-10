import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Basic initializations
        Scanner input = new Scanner(System.in);

        //Global variables
        boolean isAC = false;
        boolean isPolar = false;
        int totalLoops = 0;
        String[] mesh = new String[5];
        double resultDC;
        String resultAC;

        while(true){
            System.out.println("Welcome to Meshy! Please type \"AC\" or " +
                    "\"DC\" for the circuit you wish to solve: ");
            String isACtemp;
            boolean runAC;

            //assigns isAC
            do{
                isACtemp = input.nextLine();
                switch (isACtemp) {
                    case "AC":
                        isAC = true; runAC = false; break;
                    case "ac":
                        isAC = true; runAC = false; break;
                    case "DC":
                        isAC = false; runAC = false; break;
                    case "dc":
                        isAC = false; runAC = false; break;
                    default:
                        System.out.println("invalid input; please try again.");
                        runAC = true;
                }
           }while(runAC);

           //Assigns isPolar if isAC == true
           if(isAC){
               System.out.println("Please enter \"Polar\" or \"Rect\" for the" +
                       " mesh you are solving for: ");
               String isPolarTemp;
               boolean runComplex;
               do{
                   isPolarTemp = input.nextLine();
                   switch (isPolarTemp) {
                       case "Polar":
                           isPolar = true; runComplex = false; break;
                       case "polar":
                           isPolar = true; runComplex = false; break;
                       case "Rect":
                           isPolar = false; runComplex = false; break;
                       case "rect":
                           isPolar = false; runComplex = false; break;
                       default:
                           System.out.println("invalid input; please try again.");
                           runComplex = true;
                   }
               }while(runComplex);
           }

           //assigns totalLoops
           System.out.println("How many loops are in the circuit (maximum = " +
                   "5)? ");
           totalLoops = input.nextInt();
            System.out.println("Enter each loop's equation, separated by a " +
                    "newline");
           for(int i = 0; i <= totalLoops; i++){
               mesh[i] = input.nextLine();
           }

           //takes input and sends to appropriate calculation class and method
           if(!isAC){
               resultDC = dcMesh.calculate(totalLoops, mesh);
           }else if(isAC && isPolar){
               resultAC = acMeshPolar.calculate(totalLoops, mesh);
           }else if(isAC && !isPolar){
               resultAC = acMeshRect.calculate(totalLoops, mesh);
           }else{
               System.out.println("Error: method error");
           }

           //output for debugging purposes
            System.out.println("isAC: " + isAC + "; isPolar: " + isPolar +
                    "; totalLoops: " + totalLoops);

        }
    }
}
