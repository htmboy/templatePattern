package com.imooc.template;

public class Tea extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("��������!");
	}
	
	@Override
	protected void brew() {
		System.out.println("��100�ȵ���ˮ�ݲ�3����...");
	}
	/**
	 * ����ͨ�����ǵ���ʽ���ڹ��Ӻ���
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		// TODO Auto-generated method stub
		return false;
	}

}
