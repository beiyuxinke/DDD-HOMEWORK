package order;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {

	public ItemRepository(Map<Item, Integer> itemMap){
		itemStoreMap.putAll(itemMap);
	}
	
	public boolean addItemToStore(Item item, int increment){
		
		if(itemStoreMap.containsKey(item)){
			itemStoreMap.put(item, itemStoreMap.get(item)+increment);
		}else{
			itemStoreMap.put(item, increment);
		}
		
		return true;
	}
	
	public boolean removeItemFromStore(Item item, int decrement){
		
		if(!itemStoreMap.containsKey(item)){
			System.out.println("Repository doesn't have this item.");
			return false;
		}else if(decrement > itemStoreMap.get(item)){
			System.out.println("Repository doesn't have so many items.");
			return false;
		}else{
			itemStoreMap.put(item, itemStoreMap.get(item)-decrement);
		}
		
		return true;
	}
	
	public Item getItemById(String itemId){
		for(Item item : itemStoreMap.keySet()){
			if(item.getItemId().equals(itemId)){
				return item;
			}
		}
		return null;
	}
	
	private static volatile Map<Item, Integer> itemStoreMap = new HashMap<Item, Integer>();
}


