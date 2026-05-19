package chapter8.downcasting;

import java.util.ArrayList;

class Shape{
	void draw()
	{
		System.out.println("draw Shape");
	}
}

class Circle extends Shape{
	void draw()
	{
		System.out.println("draw Circle");
	}
	void circle()
	{
		System.out.println("�� �Դϴ�.");
	}
}

class Rectangle extends Shape{
	void draw()
	{
		System.out.println("draw Rectangle");
	}
	void rectangle()
	{
		System.out.println("�簢�� �Դϴ�.");
	}
}

class Triangle extends Shape{
	void draw()
	{
		System.out.println("draw Triangle");
	}
	void triangle()
	{
		System.out.println("�ﰢ�� �Դϴ�.");
	}
}


public class ShapeTest {

	ArrayList<Shape> sList = new ArrayList<Shape>();
	
	static void main(String[] args) {
		
		ShapeTest sTest = new ShapeTest();
		sTest.addShape();
		System.out.println("���� Ÿ������ �ٿ� ĳ���� ");
		sTest.testCasting();
		
	}
	
	public void addShape()
	{
		sList.add(new Circle());    //ArrayList �� �߰��Ǹ鼭 Shape Ÿ������ �� ��ȯ
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		for( Shape s : sList){     // ��� Shape Ÿ������ ������ draw ȣ���ϸ�
			s.draw();              // �������̵��� �Լ��� ȣ�� ��
		}
	}
	
	public void testCasting()
	{
		for(int i=0; i<sList.size(); i++){  //��� �迭 �׸���� �ϳ��� ���鼭
			
			Shape s = sList.get(i);        // �ϴ� Shape Ÿ������ ������
			if(s instanceof Circle c){       //Circle �̸�
                //Circle �� ����ȯ
                c.circle();
			}
			else if(s instanceof Rectangle r){
                r.rectangle();
			}
			else if(s instanceof Triangle t){
                t.triangle();
			}
			else{
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			}
		}
	}
}
