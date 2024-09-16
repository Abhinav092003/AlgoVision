package Menu_Sceen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main_menu {
        public static final int width = 1920;
        public static final int heigth = 1080;

        JFrame jf;
        JPanel jp;
        JLabel jl;
        Font f0,f1;
        JButton b1,b2,b3;


        public Main_menu(){
            initComponenet();
        }

    private void initComponenet() {
    jf = new JFrame("AlgoVision");
    jf.setLayout(null);
    jf.setBackground(Color.darkGray);
    jf.setBounds(0,0,width,heigth);
    jf.setLocationRelativeTo(null);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   jp = new JPanel();
   jp.setBounds(0,0,width,heigth);
   jp.setBackground(Color.darkGray);
   jp.setLayout(null);

   f0 = new Font("simpleText",Font.PLAIN,20);
   f1 = new Font("Bold",Font.BOLD,40);

   jl = new JLabel("AlgoVision",SwingConstants.CENTER);
   jl.setBounds((width/2)-500,100,1000,50);
   jl.setFont(f1);
   jl.setForeground(Color.RED);
   jp.add(jl);

   b1 = new JButton("Data Structure");
   b1.setBounds((width/2)-150,250,300,50);
   b1.setBackground(Color.darkGray.darker());
   b1.setForeground(Color.white);
   b1.setFont(f0);
   b1.setBorder(null);
   b1.setFocusable(false);
   b1.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {

       }
   });
   b1.addMouseListener(new MouseListener() {

       @Override
       public void mouseClicked(MouseEvent e) {

       }

       @Override
       public void mousePressed(MouseEvent e) {

       }

       @Override
       public void mouseReleased(MouseEvent e) {

       }

       @Override
       public void mouseEntered(MouseEvent e) {
                if(b1.isEnabled()){
                    b1.setBackground(Color.darkGray.darker().darker());
                }
       }

       @Override
       public void mouseExited(MouseEvent e) {
           b1.setBackground(Color.darkGray.darker());
       }
   });
   jp.add(b1);



   b2 = new JButton("Algorthm");
   b2.setBounds((width/2)-150,325,300,50);
   b2.setBackground(Color.darkGray.darker());
   b2.setFont(f0);
   b2.setFocusable(false);
   b2.setForeground(Color.white);
   b2.setBorder(null);

   b2.addMouseListener(new MouseListener() {
       @Override
       public void mouseClicked(MouseEvent e) {

       }

       @Override
       public void mousePressed(MouseEvent e) {

       }

       @Override
       public void mouseReleased(MouseEvent e) {

       }

       @Override
       public void mouseEntered(MouseEvent e) {
            if(b2.isEnabled()) b2.setBackground(Color.darkGray.darker().darker());
       }

       @Override
       public void mouseExited(MouseEvent e) {
        b2.setBackground(Color.darkGray.darker());
       }
   });

   jp.add(b2);


   b3 = new JButton("Exit");
   b3.setBounds((width/2)-150,400,300,50);
   b3.setBackground(Color.darkGray.darker());
   b3.setFont(f0);
   b3.setForeground(Color.WHITE);
   b3.setFocusable(false);
   b3.setBorder(null);
   b3.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
            System.exit(0);
       }
   });
   b3.addMouseListener(new MouseListener() {
       @Override
       public void mouseClicked(MouseEvent e) {

       }

       @Override
       public void mousePressed(MouseEvent e) {

       }

       @Override
       public void mouseReleased(MouseEvent e) {

       }

       @Override
       public void mouseEntered(MouseEvent e) {
            if(b3.isEnabled()) b3.setBackground(Color.darkGray.darker().darker());
       }

       @Override
       public void mouseExited(MouseEvent e) {
            b3.setBackground(Color.darkGray.darker());
       }
   });

   jp.add(b3);


   jp.setVisible(true);
   jf.add(jp);
   jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Main_menu();
    }
}
