package reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {
	public static void main(String[] args) {
	   //Ҫ��ȡprint(int ,int )����  1.Ҫ��ȡһ���������ǻ�ȡ�����Ϣ����ȡ�����Ϣ����Ҫ��ȡ���������
		A a1 = new A();
		Class c = a1.getClass();
		/*
		 * 2.��ȡ���� ���ƺͲ����б�������  
		 * getMethod��ȡ����public�ķ���
		 * getDelcaredMethod�Լ������ķ���
		 */
	    try {
			//Method m =  c.getMethod("print", new Class[]{int.class,int.class});
	    	Method m = c.getMethod("print", int.class,int.class);
	    	
	    	//�����ķ������  
	    	//a1.print(10, 20);�����ķ����������m���������з������� ��a1.print���õ�Ч����ȫ��ͬ
	        //�������û�з���ֵ����null,�з���ֵ���ؾ���ķ���ֵ
	    	//Object o = m.invoke(a1,new Object[]{10,20});
	    	Object o = m.invoke(a1, 10,20);
	    	System.out.println("==================");
	    	//��ȡ����print(String,String)
             Method m1 = c.getMethod("print",String.class,String.class);
             //�÷������з������
             //a1.print("hello", "WORLD");
             o = m1.invoke(a1, "hello","WORLD");
             System.out.println("===================");
           //  Method m2 = c.getMethod("print", new Class[]{});
                Method m2 = c.getMethod("print");
               // m2.invoke(a1, new Object[]{});
                m2.invoke(a1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     
	}
}
class A{
	public void print(){
		System.out.println("helloworld");
	}
	public void print(int a,int b){
		System.out.println(a+b);
	}
	public void print(String a,String b){
		System.out.println(a.toUpperCase()+","+b.toLowerCase());
	}
}
