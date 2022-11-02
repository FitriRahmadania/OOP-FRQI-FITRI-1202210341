import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> listMenu = new ArrayList<Menu>();

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu) {
        listMenu.add(menu);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i).MenuName + "." + listMenu.get(i).MenuCategory + "." +listMenu.get(i).MenuPrice);
        }
    }

    // TODO Create Method to Search Menu from Database
    public void searchMenu(String keyword) {
        for (int i = 0; i < listMenu.size(); i++) {
            if (keyword.toLowerCase() == listMenu.get(i).MenuName) {
                System.out.println(listMenu.get(i).MenuName + "." + listMenu.get(i).MenuCategory + "." +listMenu.get(i).MenuPrice);
            }
            
        }
    }
    


}