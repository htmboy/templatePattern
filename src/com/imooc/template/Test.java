package com.imooc.template;

public class Test {

	public static void main(String[] args) {
		System.out.println("咖啡制备中.....");
		RefreshBeverage b1 = new Coffee();
		b1.prepareBeverageTemplate();
		System.out.println("咖啡好了!");
		System.out.println("-------------------------");
		System.out.println("茶制备中.....");
		RefreshBeverage b2 = new Tea();
		b2.prepareBeverageTemplate();
		System.out.println("茶好了!");
	}

}
