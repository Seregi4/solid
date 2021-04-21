import io.*;
import model.Model;
import service.IService;
import service.ServiceSum;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterConsole();
        IService service = new ServiceSum();

        IData data = new Data(reader,printer);
        Model model = new Model();

        model.init(data);
        model.calc(service);
        model.done(data);


    }
}
