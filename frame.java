package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame extends JFrame{

	SimpleDateFormat timeFormat;
	JLabel timeLabel;
	SimpleDateFormat dayFormat;
	JLabel daylabel;
	String time;
	String day;
		
	frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("The Clockster");
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		this.setResizable(true);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("MMMMM,d,y");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		daylabel = new JLabel();
		daylabel.setFont(new Font("Ink Free",Font.PLAIN,35));

		
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		this.add(timeLabel);
		this.add(daylabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		while(true){
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			daylabel.setText(day);
		}
	}
	

	
}
