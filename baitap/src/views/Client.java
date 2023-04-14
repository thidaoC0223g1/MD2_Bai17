package views;

import controller.Manager;
import model.ElectricCable;
import storeage.InOutFile;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1: them san pham vao list");
        System.out.println("2: hien thi danh sach san pham");
        System.out.println("3: tim kiem san pham theo ID");
        while(true){
            System.out.println("nhap vao lua chon cua ban");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    manager.addNewCable(getNewCable());
                    break;
                case 2:
                    displayList();
                    break;
                case 3:
                    System.out.println("moi nhap vao id can tim");
                    Scanner inputid = new Scanner(System.in);
                    int id= inputid.nextInt();
                    searchById(id);
                    break;

                case 0:
                    System.out.println("thoat khoi chuong trinh");
                    System.exit(0);
            }

        }


    }
    public static List<ElectricCable> listofthi = InOutFile.readFile();
    public static Manager manager = new Manager("Thi", listofthi);
    public static ElectricCable getNewCable() {
        System.out.println("moi nhap vao id san pham");
        Scanner inputid = new Scanner(System.in);
        int id = inputid.nextInt();
        System.out.println("moi nhap vao quy cach san pham");
        Scanner inputname = new Scanner(System.in);
        String name = inputname.nextLine();
        System.out.println("moi nhap vao nha san xuat");
        Scanner inputproducer = new Scanner(System.in);
        String producer = inputproducer.nextLine();
        System.out.println("moi nhap vao gia san pham (/m)");
        Scanner inputprice= new Scanner(System.in);
        int price= inputprice.nextInt();
        ElectricCable cable = new ElectricCable(id, name, producer,price);
        return cable;
    }
    public static void displayList(){
        for(ElectricCable cable: manager.getEquipmentlist()) {
            System.out.println(cable);
        }
    }
    public static void searchById(int id){
        List<ElectricCable> list = manager.getEquipmentlist();
        for(ElectricCable cable: list){
            if( cable.getId()==id){
                System.out.println(cable);
            }
        }

    }
}
