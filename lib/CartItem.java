package lib;
import java.util.ArrayList;

public record CartItem(String sku, String name, double price, int quantity){

    public class CartI {
        private ArrayList<CartItem> items = new ArrayList<>();
        
        public void addItem (CartItem item){
            items.add(item);
        }
        public ArrayList<CartItem> getItems(){
            return items;
        }
    }

}