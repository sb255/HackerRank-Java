//https://www.hackerrank.com/challenges/java-interface/problem

class MyCalculator implements AdvancedArithmetic{
 
    int sum = 0;

    public int divisor_sum(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum = sum +i; 
            }
        }
        return sum; 
    }
}
