package com.imooc.template;

public class Test {

	public static void main(String[] args) {
		System.out.println("�����Ʊ���.....");
		RefreshBeverage b1 = new Coffee();
		b1.prepareBeverageTemplate();
		System.out.println("���Ⱥ���!");
		System.out.println("-------------------------");
		System.out.println("���Ʊ���.....");
		RefreshBeverage b2 = new Tea();
		b2.prepareBeverageTemplate();
		System.out.println("�����!");
	}

}
