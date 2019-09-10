package com.techlabs.facade.pattern;

public class ShopKeeper {
	private IMobileShop iphone;
	private IMobileShop oneplus;

	public ShopKeeper() {
		iphone = new IPhone();
		oneplus = new OnePlus();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void onePlus() {
		oneplus.modelNo();
		oneplus.price();
	}

}
