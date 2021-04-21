package service;

public class ServiceSum implements IService {
    @Override
    public int calculateSum(int a, int b){
        return a+b;
    }
}
