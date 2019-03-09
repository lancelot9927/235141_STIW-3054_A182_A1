/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class Assignment extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" *******Assignment 1 **********");
        cal();
    }
    
    public static void cal(){
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("       Table 1. Weighting Actors for Complexity ");
        System.out.println("Please Enter Simple(Defined API) Qnty : ");
        int Table1Simple = scan.nextInt();
        System.out.println("Please Enter Average(Interactive or Protocol driven interface) Qnty : ");
        int Table1Average = scan.nextInt();
        System.out.println("Please Enter Complex(Graphical User Interface)  Qnty : ");
        int Table1Complex = scan.nextInt();
        System.out.println("Simple Sub total is : "+ Table1Simple*1 );
        System.out.println("Average Sub total is : " +Table1Average*2);
        System.out.println("Complex Sub total is : "+Table1Complex*3);
        int TAP = Table1Complex*3+Table1Average*2+Table1Simple;
        System.out.println("Total Actor Points  : "+ TAP);
        
         System.out.println("\n\n\n\n");
        
        System.out.println("       Table 2. Weighting Use Cases for Complexity  ");
        System.out.println("Please Enter Simple(3 or fewer transactions ) Qnty : ");
        int Table2Simple = scan.nextInt();
        System.out.println("Please Enter Average(4 to 7 transactions)  Qnty : ");
        int Table2Average = scan.nextInt();
        System.out.println("Please Enter Complex(Greater than 7 transactions) Qnty : ");
        int Table2Complex = scan.nextInt();
        System.out.println("Simple Sub total is : "+ Table2Simple*5 );
        System.out.println("Average Sub total is : " +Table2Average*10);
        System.out.println("Complex Sub total is : "+ Table2Complex*15);
        int TUC = Table2Complex*15+Table2Average*10+Table2Simple*5;
        System.out.println("Total Use Cases  : "+ TUC);
        System.out.println("\n\n");
        
        
        int UUCP = TAP + TUC;
        System.out.println("UUPC is : "+ UUCP);
        
        
        System.out.println("\n\n\n\n");
        
        
        System.out.println("       Table 3. Weighting Technical Factors  ");
        
        System.out.print("Please Enter Project Rating for 'Must have a distributed solution' : ");
        int T1 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T1*2);
        
        System.out.print("\nPlease Enter Project Rating for 'Must respond to specific performance objectives ' : ");
        int T2 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T2*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must meet end-user efficiency desires' : ");
        int T3 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T3*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Complex internal processing' : ");
        int T4 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T4*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Code must be reusabl' : ");
        int T5 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T5*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must be easy to instal' : ");
        int T6 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T6*0.5);
         
        System.out.print("\nPlease Enter Project Rating for 'Must be easy to use ' : ");
        int T7 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T7*0.5);
         
        System.out.print("\nPlease Enter Project Rating for 'Must be portable ' : ");
        int T8 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T8*2);
        
        System.out.print("\nPlease Enter Project Rating for 'Must be easy to change ' : ");
        int T9 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T9*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must allow concurrent user ' : ");
        int T10 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T10*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Includes special security feature ' : ");
        int T11 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T11*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must provide direct access for 3rd partie ' : ");
        int T12 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T12*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Requires special user training facilitie' : ");
        int T13 = scan.nextInt();
        System.out.println("\n This Sub total is :"+T13*1);
        
        double TFactor = T1*2+T2*1+T3*1+T4*1+T5*1+T6*0.5+T7*0.5+T8*2+T9*1+T10*1+T11*1+T12*1+T13*1;
        System.out.println("\n Total TFactor is : "+TFactor);
        
        double TCF = 0.01*TFactor + 0.6;
        double SzUC = UUCP * TCF;
        System.out.println("SzUC is :"+SzUC);
        
        
        System.out.println("\n\n\n\n");
        
        int count = 0;
        System.out.println("       Table 4. Weighting Experience Factors   ");
        
        System.out.print("\nPlease Enter Project Rating for 'Familiar with FPT software proces' : ");
        int E1 = scan.nextInt();
        if (E1<3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E1*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Application experience  ' : ");
        int E2 = scan.nextInt();
        if (E2<3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E2*0.5);
        
        System.out.print("\nPlease Enter Project Rating for 'Paradigm experience (OO)  ' : ");
        int E3 = scan.nextInt();
        if (E3<3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E3*1);
         
        System.out.print("\nPlease Enter Project Rating for 'Lead analyst capabilit  ' : ");
        int E4 = scan.nextInt();
        if (E4<3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E4*0.5);
         
        System.out.print("\nPlease Enter Project Rating for 'Motivation ' : ");
        int E5 = scan.nextInt();
        if (E5<3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E5*0);
         
        System.out.print("\nPlease Enter Project Rating for 'Stable Requirements ' : ");
        int E6 = scan.nextInt();
        if (E6<3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E6*2);
         
        System.out.print("\nPlease Enter Project Rating for 'Part-time workers  ' : ");
        int E7 = scan.nextInt();
        if (E7>=3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E7*-1);
         
        System.out.print("\nPlease Enter Project Rating for 'Difficulty of programming language ' : ");
        int E8 = scan.nextInt();
        if (E8>=3) {
            count ++;
        }
        System.out.println("\n This Sub total is :"+E8*-1);
        
        double EFactor = E1*1+E2*0.5+E3*1+E4*0.5+E5*0+E6*2+E7*-1+E8*-1;
        System.out.println("\nTotal EFactor is "+ EFactor);
        
        double EF = -0.03*EFactor + 1.4;
        System.out.println("\nTotal EF is "+ EF);
        double UCP = SzUC * EF;
        System.out.println("UCP is :"+UCP);
        int ER;
       System.out.println("count is " + count);
        if (count <=2){
            ER = 20;
        }else{
            ER = 28;
        }
         System.out.println("ER is :"+ER);
        double manhours = ER*UCP;
        System.out.println("\nTotal man-hours is "+ manhours);
        double adjusted = 1.05*manhours;
        System.out.println("adjusted man-hours is :"+ adjusted);
        // TODO code application logic here
        
        
    }catch(Exception e){
    System.out.println("Wrong input\n");
    cal();
    }
    
}
}

