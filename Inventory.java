import java.util.List;
import java.util.ArrayList;


public class inventory{
    public static void main (String[]args){
        item p1 = new item("Surf","detergent bar", 6.00f);
        item p2 = new item("Downy","fabric conditioner", 6.00f);
        item p3 = new item("Bioderm","soap", 18.00f);
        item p4 = new item("EQ","diaper", 12.00f);
        item p5 = new item("Chupa-Chups","candy", 13.00f);
        item p6 = new item("SunSilk","shampoo", 6.00f)
        item p7 = new item("Nescafe","coffee", 8.00f)
        item p8 = new item("Chippy","junkfood", 7.00f)
        item p9 = new item("Pepsi","softdrinks", 10.00f)
        item p10 = new item("Sting","energy drink", 15.00f)
        
        List<item> inv = new ArrayList<item>();
        inv.add(p1);
        inv.add(p2);
        inv.add(p3);
        inv.add(p4);
        inv.add(p5);
        inv.add(p6);
        inv.add(p7);
        inv.add(p8);
        inv.add(p9);
        inv.add(p10);


        for(item x: inv){
            System.out.println("Item Name: " + x.getname());
            System.out.println("Item Type: " + x.getcategory());
            System.out.println("Price: " + x.getprice());
        }
    }
}
