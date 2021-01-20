import java.util.ArrayList;

public class Inventory {
   private  ArrayList<Item> items;

   public Inventory() {
       items = new ArrayList<Item>();
   }

   public boolean addItem(Item item) {
        return items.add(item);
   }


   public Item removeItem(String name) {
       for (int i=0; i<items.size(); i++) {
           if (name.equals(items.get(i).getName())) {
              return items.remove(i); 
           }
       }

       return null;
   }

   public String toString() {
       String msg = "";

       for (Item i : items) {
           msg += i.getName() + "/" ;
       }
       return msg;
   }
}
