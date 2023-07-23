import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    JButton button;
    JLabel label;
    /*
    declaring necessary components
    This can also be done in various ways
    Personally my favorite is object-oriented and unfortunately scene Builder was so bad in IntelliJ that I decided to use Swing
     */

    Frame(){
        button = new JButton("GUI MANIA");//making a button
        button.setBounds(300,400,250,100);//Position and size of button
        button.setFocusable(false);//Removing button border
        button.setFont(new Font("Arial",Font.PLAIN,20));//Font of the button text
        button.setBackground(Color.DARK_GRAY);//Button Color
        button.setForeground(Color.BLACK);//Text Color
        button.addActionListener(e -> System.out.println("I like GUI applications"));//Displaying message

        label = new JLabel("GUI ARE FUN");//Creating Title
        label.setBounds(330,130,250,300);//Text Position and Size
        label.setFont(new Font("Arial",Font.PLAIN,30));//text editing
        label.setForeground(Color.BLACK);//More text editing

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//When closing the application the program ends
        this.setTitle("GUI MANIA");//Title
        this.getContentPane().setBackground(new Color(100,20,30));//Background color
        this.setResizable(false);//Cannot resize the application
        this.setLayout(null);//Editing the layout manager
        this.setSize(850,850);//The size in pixels
        this.setVisible(true);//Setting the application visible
        this.add(button);//Adding button to application
        this.add(label);//Adding label to application

        ImageIcon image = new ImageIcon("C:\\Users\\STAGKOSARISTEIDIS\\Pictures\\Saved Pictures\\Icon.png");//File Path of generated icon image
        this.setIconImage(image.getImage());//Adding icon to the application

    }

}
