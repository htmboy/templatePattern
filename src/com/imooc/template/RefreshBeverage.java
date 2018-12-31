package com.imooc.template;
/**
 * �������, Ϊ���������ṩһ���㷨���
 * @author aooled-laptop
 * ��������
 */
public abstract class RefreshBeverage {
	/**
	 * �Ʊ����ϵ�ģ�巽��
	 * ��װ���������๲ͬ��ѭ���㷨���
	 */
	public final void prepareBeverageTemplate() {
		// ����1 ��ˮ��� ���Ȳ�Ҷ ��ͬ�ķ���
		boilWater();
		// ����2 �������� ���Ȳ�Ҷ�ǲ�ͬ��
		brew();
		// ����3 �����ϵ��뱭�� ���Ҳ�Ǵ�ҹ�ͬ���еķ���
		pourInCup();
		
		// ����4 �����ζ�� ����ǲ�ͬ��
//		addCondiments();
		
		if(isCustomerWantsCondiments()) {
			addCondiments();
		}
	}
	/**
	 * Hook, ���Ӻ���, �ṩĬ�ϻ�յ�ʵ��
	 * ���������������о����Ƿ�ҹ��Լ���ιҹ�
	 * ѯ���û��Ƿ�������
	 * @return
	 */
	protected boolean isCustomerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}

	protected abstract void addCondiments();

	private void pourInCup() {
		System.out.println("���뱭��");
	}

	protected abstract void brew();

	private void boilWater() {
		System.out.println("��ˮ���");
	}
}
