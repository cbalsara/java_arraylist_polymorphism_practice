// Will change the stock to an arraylist
// Will use polymorphism to tunr objects into multiple things(do this through interface(s)
// Will add more fruit to the supermarket as well!
// Will try casting to return edible objects as certain fruit objects
import java.util.*;
public class SuperMarket{

private String name;
private ArrayList<Edible> stock;


public SuperMarket(String storeName){
  this.name = storeName;
  this.stock = new ArrayList<Edible>();
}

public String storeName(){
  return this.name;
}

public int stockLevel(){
  return this.stock.size();
}

public void addStock(Edible item){
  this.stock.add(item);
}
  
public void removeStock(){
  this.stock.clear();
}

public Edible returnStock(){
 if ( stockLevel() > 0 ) {
   return this.stock.remove(0);
 }
 return null;
}


}