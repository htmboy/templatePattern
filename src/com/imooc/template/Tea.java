package com.imooc.template;

public class Tea extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬!");
	}
	
	@Override
	protected void brew() {
		System.out.println("用100度的热水泡茶3分钟...");
	}
	/**
	 * 子类通过覆盖的形式挂在钩子函数
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		// TODO Auto-generated method stub
		return false;
	}

}
