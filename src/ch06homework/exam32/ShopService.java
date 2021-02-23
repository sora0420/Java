package ch06homework.exam32;
//Q18
public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return singleton;
	}
}
