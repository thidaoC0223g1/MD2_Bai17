package controller;

import model.ElectricCable;
import storeage.InOutFile;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;
    List<ElectricCable> equipmentlist = new ArrayList<>();
    public void addNewCable(ElectricCable cable){
        equipmentlist.add(cable);
        InOutFile.writeFile(equipmentlist);
    }
    public Manager() {
    }
    public Manager(String name, List<ElectricCable> equipmentlist) {
        this.name = name;
        this.equipmentlist = equipmentlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElectricCable> getEquipmentlist() {
        return equipmentlist;
    }

    public void setEquipmentlist(List<ElectricCable> equipmentlist) {
        this.equipmentlist = equipmentlist;
    }

}
