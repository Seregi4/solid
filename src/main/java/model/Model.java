package model;

import io.IData;
import service.IService;

public class Model {
    int a, b, sum;

    public void init(IData data) {
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }

    public void calc(IService service) {
        sum = service.calculateSum(a, b);
    }

    public void done(IData data) {
        data.print("Result: ");
        data.print(sum);
    }
}
