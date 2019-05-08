package solid_Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CSV_Parser {

    public List<String> linesList(String filePath) {
        List<String> lineList = new ArrayList<>();
        try {
            lineList = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineList;
    }

    public int getOrderId(String filePath) {
        return Integer.parseInt(linesList(filePath).get(0).substring(10));
    }

    public Date getOrderDate(String filePath) throws ParseException {
        return new SimpleDateFormat("dd.MM.yyyy").parse(linesList(filePath).get(2).substring(12));
    }

    public int getUserId(String filePath) {
        return Integer.parseInt(linesList(filePath).get(1).substring(9));
    }

    public List<String> getProductsList(String filePath) {
        List<String> productsList = new ArrayList<>();
        for (int i = 4; i < linesList(filePath).size(); i++) {
            productsList.add(String.valueOf(i));
        }
        return productsList;
    }

}
