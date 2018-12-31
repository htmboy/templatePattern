package com.imooc.template;
/**
 * 抽象基类, 为所有子类提供一个算法框架
 * @author aooled-laptop
 * 提神饮料
 */
public abstract class RefreshBeverage {
	/**
	 * 制备饮料的模板方法
	 * 封装了所有子类共同遵循的算法框架
	 */
	public final void prepareBeverageTemplate() {
		// 步骤1 将水煮沸 咖啡茶叶 共同的方法
		boilWater();
		// 步骤2 炮制饮料 咖啡茶叶是不同的
		brew();
		// 步骤3 将饮料倒入杯中 这个也是大家共同具有的方法
		pourInCup();
		
		// 步骤4 加入调味料 这个是不同的
//		addCondiments();
		
		if(isCustomerWantsCondiments()) {
			addCondiments();
		}
	}
	/**
	 * Hook, 钩子函数, 提供默认或空的实现
	 * 具体的子类可以自行决定是否挂钩以及如何挂钩
	 * 询问用户是否加入调料
	 * @return
	 */
	protected boolean isCustomerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}

	protected abstract void addCondiments();

	private void pourInCup() {
		System.out.println("倒入杯中");
	}

	protected abstract void brew();

	private void boilWater() {
		System.out.println("降水煮沸");
	}
}
