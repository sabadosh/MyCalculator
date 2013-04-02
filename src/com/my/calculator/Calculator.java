package com.my.calculator;
import java.util.Scanner;
class Calculator { 
	    MyOpFactory myOpFactory;
	    
	    public Calculator(MyOpFactory myOpFactory){
	        this.myOpFactory = myOpFactory;
	    }
	   
	    public void exec(){   
	        boolean nextStep = true;                //  Умова виходу з циклу

	        do {  
	        	Scanner in = new Scanner(System.in);
	            System.out.println("Введіть аргумент:");
	            double arg1 = in.nextDouble(); 
	            
	            Scanner p = new Scanner(System.in);
	            System.out.println("Виберіть операцію:");
	            System.out.print("| [0] - сумма |");  
	            System.out.print(" [1] - різниця |");
	            System.out.print(" [2] - множення |");
	            System.out.print(" [3] - ділення |");
	            System.out.println(" [4] - факторіал |");
	            System.out.print("| [5] - корінь квадратний |");
	            System.out.print(" [6] - cos кута |");
	            System.out.print(" [7] - sin кута |");
	            System.out.println();
	            int operation = p.nextInt();
	            int s = operation;
	            
	            Scanner ar2 = new Scanner(System.in);
	             if (s == 4){
	            	 double arg2 = 0;
	             Operation op = myOpFactory.getOpInstance(operation);
            	 System.out.println("Результат: "+(op.exec(arg1, arg2)));
	            	
	             }
	                
	             else if (s == 5){
	            	 double arg2 = 0;
	             Operation op = myOpFactory.getOpInstance(operation);
            	 System.out.println("Результат: "+(op.exec(arg1, arg2)));
	             }
	             else if (s == 6){
	            	 double arg2 = 0;
	            	 Operation op = myOpFactory.getOpInstance(operation);
	            	 System.out.println("Результат: "+(op.exec(arg1, arg2)));
	             }
	             else if(s == 7){
	            	 double arg2 = 0;
	            	 Operation op = myOpFactory.getOpInstance(operation);
	            	 System.out.println("Результат: "+(op.exec(arg1, arg2)));
	             }
	             else { 
	             System.out.println("Введіть другий аргумент");double arg2 = ar2.nextDouble();
	             System.out.print("Результат: ");
	 	         Operation op = myOpFactory.getOpInstance(operation);
	 	            if (op != null)System.out.println(op.exec(arg1, arg2));
		            else System.out.println("Недопустима операція!!!");
	             }
	             
	            Scanner chtodelat = new Scanner(System.in);
	            System.out.println("Хочете продовжувати?");
	            System.out.print("1 - Продовжити ");
	            System.out.println("2 - Вийти");
	            int whatDo = chtodelat.nextInt();
	            if (whatDo == 2) nextStep = false;
	        } while (nextStep);
	    }
	}
