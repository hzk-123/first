import java.util.*;

import javax.swing.*;

public class Project2 {

	public static void main(String[] args) {
		
		int flag=1;//��ǲ�����
		
		int num=0;//��ʼ��������
		
		while(flag<=10) {
			
			JOptionPane.showMessageDialog(null,"����������ɷ����ź�", "result dialog", JOptionPane.PLAIN_MESSAGE);
			
			int day=0;//�������
			
			int randomRoom=1+(int)(Math.random()*50);//��ʼ���������
			
			//�������1-50֮��ķ����
			//��үү����̶�Ϊ1��
			//whileѭ��ֱ���ҵ�1���˳�
			//�ҵ�1�����жϳ��Ƿ����к�«�޶�����
			
			while(randomRoom!=1) {
				
				day++;
				
				num++;
				
				randomRoom=1+(int)(Math.random()*50);//��������������
				
			}
			
			JOptionPane.showMessageDialog(null,"��үү��"+flag+"��֪���������Ƿ�����Ҫ"+day+"��", "result dialog", JOptionPane.PLAIN_MESSAGE);
			
			flag++;//��үүÿ֪��һ���������Ƿ��ڣ�flag��1
			
		}
		
		JOptionPane.showMessageDialog(null,"����10����үү��Ҫ������ƽ��ֵΪ"+num/10, "result dialog", JOptionPane.PLAIN_MESSAGE);
		
	}
}