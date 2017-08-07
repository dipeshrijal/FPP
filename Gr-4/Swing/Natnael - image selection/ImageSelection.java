package lesson5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ImageSelection extends JFrame{
    private JLabel label0;
    private ImageIcon image1;
    private JLabel label1;
    private JLabel nameLabel;
     
    ImageSelection(){
        setLayout(new BorderLayout());
        setSize(900,500);
        label0=new JLabel("Click on an image");
        label0.setFont(new Font("Serif", Font.ITALIC, 24));
        label0.setHorizontalAlignment(SwingConstants.CENTER);
        label0.setPreferredSize(new Dimension(200, 100)); 
        add(label0,BorderLayout.NORTH);
        
        image1=new ImageIcon(getClass().getResource("nati.jpg"));
        label1=new JLabel(image1);
        label1.setPreferredSize(new Dimension(400, 200)); 
        label1.addMouseListener(new MouseListener()
        { @Override
            public void mouseClicked(MouseEvent e){  
        		if(nameLabel.getText() != "Natnael Getachew") 
        			nameLabel.setText("Natnael Getachew"); 
        		else nameLabel.setText("");
        	}
            public void mousePressed(MouseEvent e){ }
            public void mouseExited(MouseEvent e){  }
            public void mouseEntered(MouseEvent e){ }
            public void mouseReleased(MouseEvent e) {  }
        });
        add(label1,BorderLayout.WEST);
        
        nameLabel=new JLabel("");
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setPreferredSize(new Dimension(200, 100)); 
        nameLabel.setFont(new Font("monospaced", Font.ITALIC, 20));
        nameLabel.setForeground(Color.BLUE);
        add(nameLabel,BorderLayout.SOUTH);
        
    }
    public static void main(String[] args){
        ImageSelection sele=new ImageSelection();
        sele.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sele.setVisible(true);
        sele.pack();
        sele.setTitle("Select an image");
    }
}
