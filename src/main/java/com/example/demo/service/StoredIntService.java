package com.example.demo.service;

import com.example.demo.file.bucket.BucketComponent;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StoredIntService {
    private final BucketComponent bucketComponent;
    private static final String FILE_NAME = "stored-int.txt";
    private static final Random random = new Random();

    @SneakyThrows
    public String handleStoredInt() {
        File file = new File(FILE_NAME);

        if (file.exists()) {
            String content = new String(Files.readAllBytes(Paths.get(FILE_NAME)));
            return "Nombre stocké: " + content;
        } else {
            int randomNumber = random.nextInt(1000);
            String numberStr = String.valueOf(randomNumber);

            FileWriter writer = new FileWriter(FILE_NAME);
            writer.write(numberStr);
            writer.close();

            return "Nouveau nombre généré: " + numberStr;
        }
    }
}

