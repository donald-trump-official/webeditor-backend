package com.example.demo.elementSelection;

import com.example.demo.design.Design;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;

@Service
public class ElementsService {
    public List<Elements> getElements() {
        return List.of(
            new Elements("电阻", "both", "src/main/resources/icons/resistors.svg"),
            new Elements("电容", "single", "src/main/resources/icons/ic.svg")
        );
    }

    public String getElementByName(String filename) throws Exception {
        // open file, throw exception if file not exist
        File fin = new File("src/main/resources/store/" + filename);
        if(!fin.exists()) throw new Exception("File " + filename + " not found.");
        // read file into a String
        InputStreamReader reader = new InputStreamReader(new FileInputStream(fin));
        char[] buf = new char[1000000];
        int len = reader.read(buf);
        // construct JSON object
        return new String(buf, 0, len);
    }
}

