import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class guiWelcomeFrame extends JFrame implements ActionListener{
	
	private JPanel guidePanel;
	public JLabel welcomeLabel;
	public JButton welcomeButton;	
	
	public Font titleFont;
	
	protected guiWelcomeFrame() {
		super();
		
		guidePanel = new JPanel();
		welcomeLabel = new JLabel("本地智能备份 杜绝隐私泄漏");
		welcomeButton = new JButton("让我们开始吧");
		welcomeButton.addActionListener(this);
		
		titleFont = new Font("SourcesHanSans",Font.CENTER_BASELINE,20);
		welcomeLabel.setFont(titleFont);
		
		this.add(welcomeLabel,BorderLayout.CENTER);
		this.add(welcomeButton,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String buttonCommand = e.getActionCommand();
		if (e.equals("让我们开始吧"))
			this.dispose();
	}
	
}
