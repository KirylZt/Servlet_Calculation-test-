package by.tms.dao;

import by.tms.exceptions.OperationTypeException;

import java.util.ArrayList;
import java.util.List;


public class CalculationDAO{
    private static List<String> request = new ArrayList<>();


    public static double calc(double num1, double num2, int operation) throws OperationTypeException {
        switch (operation){
            case 1:return sum(num1,num2);
            case 2:return dif(num1,num2);
            case 3:return multiplied(num1,num2);
            case 4:return divide(num1,num2);
            default: throw new OperationTypeException(operation);
        }
    }

    static double sum(double num1, double num2){
        double result = num1+num2;
        request.add("Summary of variables "+ num1 + " and " + num2 + ".(result = " + result + ")\n");
        return result;
    }

    static double dif(double num1, double num2){
        double result = num1-num2;
        request.add("Difference of variables "+ num1 + " and " + num2 + ".(result = " + result + ")\n");
        return result;
    }

    static double multiplied(double num1, double num2){
        double result = num1*num2;
        request.add("Multiplied variables "+ num1 + " and " + num2 + ".(result = " + result + ")\n");
        return result;
    }

    static double divide(double num1, double num2){
        double result = num1/num2;
        request.add("Divide "+ num1 + " from " + num2 + ".(result = " + result + ")\n");
        return result;
    }

    public static List<String> getRequests(){
        return request;
    }
}
