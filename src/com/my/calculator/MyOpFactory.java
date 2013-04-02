package com.my.calculator;

	class MyOpFactory implements OperationFactory{
		 
		    int operationCode;
		    private Operation operation;
		    
		    public Operation getOpInstance(int op) {
		        this.operationCode = op;
		        switch (operationCode){
		            case 0:
		                operation = new OpPlus();
		                break;
		            
		            case 1:
		                operation = new OpMinus();
		                break;
		            
		            case 2:
		                operation = new OpMultiply();
		                break;
		            
		            case 3:
		                operation = new OpDivision();
		                break;
		            case 4:
		                operation = new OpFactorial();
		                break;
		            case 5:
		                operation = new OpKvkorin();
		                break;
		            case 6:
		                operation = new OpCos();
		                break;
		            case 7:
		                operation = new OpSin();
		                break;
		            
		            default:
		                operation = null;
		            
		        }
		        return operation;
		    }
		}

