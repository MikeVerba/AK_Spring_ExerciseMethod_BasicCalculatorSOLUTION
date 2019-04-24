package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

import org.springframework.stereotype.Service;

@Service
public class CalculatorSimple {

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    public int division(int a, int b) throws IllegalArgumentException {
        if(b!=0){
            return a/b;
        }
        else throw new IllegalArgumentException("Can't divide by ZERO");
    }
}
