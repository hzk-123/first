import java.util.*;

import javax.swing.*;

public class Project1{
	public static void main(String [] args){
		
		
		//�����������ͳ�ʼ����
		int N,K;
		Scanner input=new Scanner(System.in);
		N=Integer.parseInt(JOptionPane.showInputDialog(null, "������������N"));
		K=Integer.parseInt(JOptionPane.showInputDialog(null, "�������ʼ����K"));
		
		
		//����һά����洢N���˵�����
		System.out.println("������N���ձ���ÿ�˵�����");
		int[] code = new int[N];
		for(int i=0;i<N;i++){
			code[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "���������Ϊ"+(i+1)+"���˳�ʼ����"));
		}
		
		
		//�����������
		int[] flag = new int[N];
		for(int i=0;i<N;i++){
			flag[i]=1;
		}
		
		
		//��ʾ����������
		JOptionPane.showMessageDialog(null,"�뿪�����˵��������Ϊ��", "result dialog", JOptionPane.PLAIN_MESSAGE);
		
		
		
		//����whileѭ��ɸѡ�뿪�����˵����
		int num=0,p=K,i=0,j=1;
		while(num!=N){
			while(true){
				if(flag[i]==0){
					i++;
					continue;
				}
				if(j==p){	
							JOptionPane.showMessageDialog(null," "+(i+1), "result dialog", JOptionPane.PLAIN_MESSAGE);
							p=code[i];
							if(num+1!=N) flag[i]=0;
							break;
				}
				i++;
				j++;
				if(i==N) i=0;
			}
			i++;
			if(i==N) i=0;
			num++;
			j=1;
		}
		
		
		//��������ժ���ձ��˵����
		for(int k=0;k<N;k++){
			if(flag[k]!=0) JOptionPane.showMessageDialog(null,"���ȥ��ժ���ձ��˵����Ϊ"+(k+1), "result dialog", JOptionPane.PLAIN_MESSAGE);
		}
	}
}