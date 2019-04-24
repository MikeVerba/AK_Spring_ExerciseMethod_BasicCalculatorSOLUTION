package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

import org.springframework.stereotype.Service;

@Service
public class CalculatorAverage {
    public int squareOf(int a) {
        return a*a;
    }

    public boolean isPrimeNumber(int a) {

        for(int i = 2; i<a; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public int factorial(int a) {

        int result = 1;
        for(int i = 1; i<=a;i++){
            result = result*i;
        }
        return result;
    }

    public int elementOf(int a) {

        return (int)Math.sqrt(a);
    }
}
