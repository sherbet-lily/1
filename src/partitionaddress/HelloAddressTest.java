package partitionaddress;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class HelloAddressTest {

	@Test
	public void test1() {
		partition1 person = new partition1();
		assertTrue(person.getName(4,"1!����,����ʡ����13756899511�й�¥�������ֵ�����·110�ź�������һ��").equals("����"));
	}


	@Test
	public void test2() {
		partition1 person = new partition1();
		assertTrue(person.getTelephone(16,"����ʡ����13756899511�й�¥�������ֵ�����·110�ź�������һ��").equals("13756899511"));
	}

	@Test
	public void test3() {
		partition1 person = new partition1();
		person.addressResolution1("����ʡ�����й�¥�������ֵ�����·110�ź�������һ��");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("����ʡ");answer.add("������");answer.add("��¥��");answer.add("�����ֵ�");answer.add("����·110�ź�������һ��");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test4() {
		partition1 person = new partition1();
		person.addressResolution1("����ʡ�����й�¥����һ��·123�Ÿ��ݹ�¥ҽԺ");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("����ʡ");answer.add("������");answer.add("��¥��");answer.add("");answer.add("��һ��·123�Ÿ��ݹ�¥ҽԺ");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test5() {
		partition1 person = new partition1();
		person.addressResolution2("�㶫ʡ��ݸ�з�����ƽ·13��");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("�㶫ʡ");answer.add("��ݸ��");answer.add("");answer.add("�����");answer.add("��ƽ·");answer.add("13��");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}

	@Test
	public void test6() {
		partition1 person = new partition1();
		person.addressResolution1("�����ж����������ڶ����1�ű����ж���������Ժ");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("����");answer.add("������");answer.add("������");answer.add("");answer.add("�����ڶ����1�ű����ж���������Ժ");
		boolean test = true;
		System.out.println(person.address);
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test7() {
		partition1 person = new partition1();
		person.addressResolution2("����ʡ�����й�¥�������ֵ�����·110�ź�������һ��");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("����ʡ");answer.add("������");answer.add("��¥��");answer.add("�����ֵ�");answer.add("����·");answer.add("110��");answer.add("��������һ��");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}

	@Test
	public void test8() {
		partition1 person = new partition1();
		person.addressResolution2("����ʡ�����й�������ɽ��Ū24��");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("����ʡ");answer.add("������");answer.add("������");answer.add("");answer.add("��ɽ��Ū");answer.add("24��");answer.add("");
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test9() {
		partition1 person = new partition1();
		person.addressResolution2("����ʡ�����ж��Ⱦ��ÿ���������·19��");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("����ʡ");answer.add("������");answer.add("���Ⱦ��ÿ�����");answer.add("");answer.add("����·");answer.add("19��");answer.add("");
		System.out.println(person.address);
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	@Test
	public void test10() {
		partition1 person = new partition1();
		person.addressResolution1("���������������Ͻ����ݴ�ѧ10#111");
		ArrayList<String> answer =new ArrayList<String>();
		answer.add("����ʡ");answer.add("������");answer.add("������");answer.add("�Ͻ���");answer.add("���ݴ�ѧ10#111");
		System.out.println(person.address);
		boolean test = true;
		for (int j = 0; j < answer.size(); j++) 
		{
			String obj =answer.get(j);
			if (!person.address.contains(obj))
				{
					test=false;
				}
		}
		assertTrue(test);
	}
	
	
}
