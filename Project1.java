import java.util.*;

import javax.swing.*;

public class Project1{
	public static void main(String [] args){
		
		
		//输入总人数和初始密码
		int N,K;
		Scanner input=new Scanner(System.in);
		N=Integer.parseInt(JOptionPane.showInputDialog(null, "请输入总人数N"));
		K=Integer.parseInt(JOptionPane.showInputDialog(null, "请输入初始密码K"));
		
		
		//利用一维数组存储N个人的密码
		System.out.println("请输入N个日本人每人的密码");
		int[] code = new int[N];
		for(int i=0;i<N;i++){
			code[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "请输入序号为"+(i+1)+"的人初始密码"));
		}
		
		
		//创建标记数组
		int[] flag = new int[N];
		for(int i=0;i<N;i++){
			flag[i]=1;
		}
		
		
		//提示即将输出序号
		JOptionPane.showMessageDialog(null,"离开队伍人的序号依次为：", "result dialog", JOptionPane.PLAIN_MESSAGE);
		
		
		
		//利用while循环筛选离开队伍人的序号
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
		
		
		//最后输出采摘的日本人的序号
		for(int k=0;k<N;k++){
			if(flag[k]!=0) JOptionPane.showMessageDialog(null,"最后去采摘的日本人的序号为"+(k+1), "result dialog", JOptionPane.PLAIN_MESSAGE);
		}
	}
}