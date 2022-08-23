package ru.koylubaevnt.patterns.structural.decorator;

import ru.koylubaevnt.patterns.structural.decorator.decorators.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Клиентский код
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        Path tempFile = Files.createTempFile("decorator-example", ".txt");
        String tempFileName = tempFile.getFileName().toString();

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(tempFileName)
                )
        );

        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource(tempFileName);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
