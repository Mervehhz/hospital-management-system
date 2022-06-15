
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NavigableMap;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HospitalSystem h = new HospitalSystem("deneme");
        Administrator a = new Administrator(h);


        try {
            File myObj = new File("./resources/equipment.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                Integer num=myReader.nextInt();
                String equipmentName = myReader.next();
                String equipmentUnit = myReader.next();
                Equipment equipment=new Equipment(equipmentName,equipmentUnit,null);
                h.equipmentList.put(num,equipment);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println( h.equipmentList);
        h.equipmentList.remove(7893);
        System.out.println( h.equipmentList);
        System.out.println(h.equipmentList.get(4544));

        System.out.println();

        a.selectionSort();

    }

}
