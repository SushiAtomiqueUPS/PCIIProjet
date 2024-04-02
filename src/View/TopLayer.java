package View;

import javax.swing.*;
import java.awt.*;
public class TopLayer extends JPanel{

    //Attribute that contains the JPanel with a gridLayout with the textual informations
    private JPanel textPanel;
    /**
     * Constructor that creates the top layer with the title
     * @param str the title of the top layer
     */
    public TopLayer(String str){
        super(new BorderLayout());
        this.setBackground(Color.darkGray);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.setPreferredSize(new Dimension(Constant_view.WIDTH_WINDOW/4, Constant_view.HEIGHT_WINDOW));

        this.textPanel = new JPanel(new GridLayout(2,1));
        JTextField score = new JTextField("Score : 0");
        score.setEditable(false);
        score.setHorizontalAlignment(JTextField.CENTER);
        score.setBackground(Color.LIGHT_GRAY);
        this.textPanel.add(score);

        JTextField top = new JTextField(str);
        top.setEditable(false);
        top.setHorizontalAlignment(JTextField.CENTER);
        top.setBackground(Color.LIGHT_GRAY);
        this.textPanel.add(top);

        this.add(this.textPanel, BorderLayout.NORTH);
    }

    //Method setTitle that changes the text of the second JTextField with the new title
    public void setTitle(String str){
        ((JTextField) this.textPanel.getComponent(1)).setText(str);
    }

    //Method setScore that changes the text of the first JTextField with the new score
    public void updateScore(int score){
        ((JTextField) this.textPanel.getComponent(0)).setText("Score : " + score);
    }

    /**
     * Main method to test the TopLayer class
     */
    public static void main(String[] args) {
        //Test the TopLayer class
        JFrame frame = new JFrame();
        TopLayer top = new TopLayer("Gardener's "+"1"+" actions :");

        //Panel buttons
        JPanel buttonsPanel = new JPanel(new GridLayout(10,2));
        JButton b1 = new JButton("Change title");
        b1.addActionListener(e -> top.setTitle("Menu"));
        buttonsPanel.add(b1);

        buttonsPanel.add(new JButton("Market2"));
        buttonsPanel.add(new JButton("Market3"));
        buttonsPanel.add(new JButton("Market4"));

        top.add(buttonsPanel, BorderLayout.CENTER);
        frame.add(top);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
