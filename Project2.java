import java.util.*;

import javax.swing.*;

public class Project2 {

	public static void main(String[] args) {
		
		int flag=1;//标记采样数
		
		int num=0;//初始化总天数
		
		while(flag<=10) {
			
			JOptionPane.showMessageDialog(null,"现在随机生成房间门号", "result dialog", JOptionPane.PLAIN_MESSAGE);
			
			int day=0;//标记天数
			
			int randomRoom=1+(int)(Math.random()*50);//初始化房间号数
			
			//随机产生1-50之间的房间号
			//老爷爷房间固定为1号
			//while循环直到找到1再退出
			//找到1即可判断出是否所有葫芦娃都健在
			
			while(randomRoom!=1) {
				
				day++;
				
				num++;
				
				randomRoom=1+(int)(Math.random()*50);//随机产生房间号数
				
			}
			
			JOptionPane.showMessageDialog(null,"老爷爷第"+flag+"次知道所有人是否健在需要"+day+"天", "result dialog", JOptionPane.PLAIN_MESSAGE);
			
			flag++;//老爷爷每知道一次所有人是否健在，flag加1
			
		}
		
		JOptionPane.showMessageDialog(null,"采样10次老爷爷需要天数的平均值为"+num/10, "result dialog", JOptionPane.PLAIN_MESSAGE);
		
	}
}