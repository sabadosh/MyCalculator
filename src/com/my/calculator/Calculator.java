package com.my.calculator;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

class Calculator { 
	private Scanner in;
	private PrintStream out;
	private Map<Integer, OperationUnary> unaryOperations;
	private Map<Integer, OperationBinary> binaryOperations;
	private double arg1;
	private double arg2;
	Double res;
	private int inpOperation;
	private int whatDo;

	    public Calculator(){
	    	out = System.out;
	        unaryOperations = MyOpFactory.getUnaryOperators();
			binaryOperations = MyOpFactory.getBinaryOperators();
	    }
	   
	    public void exec(){   						// Основний метод калькулятора
	        boolean nextStep = true;                //  Умова виходу з циклу

	        do {
	        	try{ 
	
	        		inpFirstArg();
	        		
	        		inpOperation();
	           	 	
	           	 	res = unOp(inpOperation);
	           	 	if (res != null){	
	           	 			out.println(res);   //Виконується і виводиться унарна операція
	           	 	}else{
	           	 			inpSecondArg();
	           	 			res = binOp(inpOperation);
	           	 			if(res != null){
	           	 				out.println(res);	//Виконується і виводиться бінарна операція
	           	 			} else if ((inpOperation>7)||(inpOperation<0)){
	           	 				out.println("Відсутня операція з таким номером!");
	           	 			}
	           	 	}	
	           	 	
	           	 	inpWhatToDo();
	           		if (whatDo == 2) nextStep = false;
	        	 }catch(Exception e){
				    out.println("ПОМИЛКА!!! Введіть число.");
	        	 }
	        } while (nextStep);
	    }
	    
	    private Double inpFirstArg(){		//Метод вводу 1-го числа
	     	in = new Scanner(System.in);
            out.println("Введіть аргумент:");
            arg1 = in.nextDouble(); 
            return arg1;
	    }
	    
	    private Double inpSecondArg(){		//Метод вводу 2-го числа
	    	in = new Scanner(System.in);
        	out.println("Введіть другий аргумент:");
        	arg2 = in.nextDouble(); 
            return arg2;
	    }
	    
	    private int inpOperation(){			//Метод вводу операції
	    	in = new Scanner(System.in);
        	out.println("Виберіть операцію:");
        	out.println("----------------------------------------------");
        	out.print(" [0] - сумма     |");  
        	out.println(" [1] - різниця  	   |");
        	out.print(" [2] - множення  |");
        	out.println(" [3] - ділення 	   |");
        	out.print(" [4] - факторіал |");
        	out.println(" [5] - корінь квадратний |");
        	out.print(" [6] - cos кута  |");
       	 	out.println(" [7] - sin кута	   |");
       	 	out.println("----------------------------------------------");
       	 	inpOperation = in.nextInt();
       	 	return inpOperation;
	    }
	    
	    private int inpWhatToDo(){			//Метод вводу кінцевої дії калькулятора
            in = new Scanner(System.in);
            out.println("Хочете продовжувати?");
            out.print("1 - Продовжити ");
            out.println("2 - Вийти");  
            whatDo = in.nextInt();
            return whatDo;
	    }
	    
	    public Double binOp(int inpOperation) { 	// Метод виконання бінарних операцій
	    	if (binaryOperations.get(inpOperation) != null) {
				return Double.valueOf(binaryOperations.get(inpOperation).exec(arg1, arg2));
	    	}return null;
		}

		private Double unOp(int inpOperation) {		// Метод виконання унарних операцій
			if (unaryOperations.get(inpOperation) != null) {
				return Double.valueOf(unaryOperations.get(inpOperation).exec(arg1));
			} return null;
		}
		
		public Double forTestUn(int inpOperation, double valueOne) {
			arg1 = valueOne;
			Double res = unOp(inpOperation);
			return res;
		}

		public Double forTestBin(int inpOperation, double valueOne, double valueTwo) {
			arg1 = valueOne;
			arg2 = valueTwo;
			Double res = binOp(inpOperation);
			return res;
		}
}