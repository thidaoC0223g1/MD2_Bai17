package storeage;

import controller.Manager;
import model.ElectricCable;

import java.io.*;
import java.util.List;

public class InOutFile {
    public static void writeFile(List<ElectricCable> equipmentList) {
        File filecable = new File("./txt/fileCable.dat");
        try {
            ObjectOutputStream filewriter = new ObjectOutputStream(new FileOutputStream(filecable));
            filewriter.writeObject(equipmentList);
            filewriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
public static List<ElectricCable> readFile(){
        File filecable = new File("./txt/fileCable.dat");
        List<ElectricCable> equipmentlist;
    try {
        ObjectInputStream filereader = new ObjectInputStream(new FileInputStream(filecable));
        equipmentlist= (List<ElectricCable>)filereader.readObject();
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    return equipmentlist;
}

//    public static void main(String[] args) {
//        Manager manager = new Manager();
//        InOutFile.writeFile(manager.getEquipmentlist());
//    }
}
