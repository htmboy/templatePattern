package com.imooc.template;
/**
 * ��������, �ṩ�˿����Ʊ��ľ���ʵ��
 * @author aooled-laptop
 *
 */
public class Coffee extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("�����Ǻ�ţ��");
	}

	@Override
	protected void brew() {
		System.out.println("�÷�ˮ���ݿ���");
	}

}
