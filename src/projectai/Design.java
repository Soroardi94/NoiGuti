/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectai;

/**
 *
 * @author BACKUP
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Design {

    JFrame frame = new JFrame();

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    // file access from folder this process (new ImageIcon("folder name/imagename"));..
    ///... this image not accept in jar file
    
    //ImageIcon bimage = new ImageIcon("image/imageb1.png");
    
    // file access from project inside this process(new ImageIcon(getClass().getResource("imageb1.png"));..
    //... this image accept in jar file
    
    ImageIcon bimage = new javax.swing.ImageIcon(getClass().getResource("imageb1.png"));
    ImageIcon simage = new javax.swing.ImageIcon(getClass().getResource("images2.jpg"));

    JButton xbtn = new JButton("X Move");
    JButton ybtn = new JButton("Y Move");

    JButton b1 = new JButton("  ");
    JButton b2 = new JButton("  ");
    JButton b3 = new JButton("  ");
    JButton b4 = new JButton("  ");
    JButton b5 = new JButton("  ");
    JButton b6 = new JButton("  ");
    JButton b7 = new JButton("  ");
    JButton b8 = new JButton("  ");
    JButton b9 = new JButton("  ");
    JButton b10 = new JButton("  ");
    JButton b11 = new JButton("  ");
    JButton b12 = new JButton("  ");
    JButton b13 = new JButton("  ");
    JButton b14 = new JButton("  ");
    JButton b15 = new JButton("  ");
    JButton b16 = new JButton("  ");
    JButton b17 = new JButton("  ");
    JButton b18 = new JButton("  ");
    JButton b19 = new JButton("  ");
    JButton b20 = new JButton("  ");
    JButton b21 = new JButton("  ");
    JButton b22 = new JButton("  ");
    JButton b23 = new JButton("  ");
    JButton b24 = new JButton("  ");

    JButton startbtn = new JButton("Start Game");
    JButton restartbtn = new JButton("Restart Game");
    JButton quitbtn = new JButton("Game Credit");
    JButton rulesbtn = new JButton("Instructions");

    JButton rb1 = new JButton("1");
    JButton rb2 = new JButton("2");
    JButton rb3 = new JButton("3");
    JButton rb4 = new JButton("4");
    JButton rb5 = new JButton("5");
    JButton rb6 = new JButton("6");
    JButton rb7 = new JButton("7");

    JButton gb1 = new JButton("1");
    JButton gb2 = new JButton("2");
    JButton gb3 = new JButton("3");
    JButton gb4 = new JButton("4");
    JButton gb5 = new JButton("5");
    JButton gb6 = new JButton("6");
    JButton gb7 = new JButton("7");

    JLabel label1 = new JLabel("Computer Destroy Human:");
    JLabel label2 = new JLabel("Human Destroy Computer:");
    JLabel label3 = new JLabel("  ");
    JLabel label4 = new JLabel(" ");

    JTextField count = new JTextField("000");

    JTextField move = new JTextField(" ");

    int red = 9;
    int gre = 9;
    int ac, brek;
    int arr[] = new int[30];
    int arrgr[] = new int[30];
    int ared[] = new int[30];

    int h = 1;

    int c = 0, ansr = 9, ansg = 9, ck, ckcmp, a, fm = 0, sm = 0, rkn = 0, grset, tgr, fargr = 0;
    int thregr = 0;
    int hck, cck, chkone, time=0;

    private long start;
    private Timer timer;

    public Design() // set up graphics window
    {
        frame.setTitle("SPIDER   AGENT");
        frame.setVisible(true);
        frame.setResizable(false);

        Insets insetsf = frame.getInsets();
        frame.setSize(950 + insetsf.left + insetsf.right,
                600 + insetsf.top + insetsf.bottom);

        frame.setLocationRelativeTo(null);

        initComponents();
        // frame here
        // JFrame frame = new JFrame();
        //  frame.setSize(950, 600);
        //java.awt.Graphics.drawLine(int x1, int y1, int x2, int y2)
        // panel1  here
        // JPanel panel1 = new JPanel();
//            panel1.setSize(insetsf.left + 200+insetsf.right,
//                 600 + insetsf.top + insetsf.bottom);

        //LineBorder border = new LineBorder(Color.RED, thickness)
        // panel1.setBorder(border)
    }

    void initComponents() {

        frame.add(panel1);
        panel1.setBackground(null);
        panel1.setLayout(null);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel1.add(b8);
        panel1.add(b9);
        panel1.add(b10);
        panel1.add(b11);
        panel1.add(b12);
        panel1.add(b13);
        panel1.add(b14);
        panel1.add(b15);
        panel1.add(b16);
        panel1.add(b17);
        panel1.add(b18);
        panel1.add(b19);
        panel1.add(b20);
        panel1.add(b21);
        panel1.add(b22);
        panel1.add(b23);
        panel1.add(b24);

        Insets insets = panel1.getInsets();

        Dimension size = panel1.getPreferredSize();
        panel1.setBounds(insets.left, insets.top,
                size.width + 950, size.height + 600);

        // Line 1
        size = b1.getPreferredSize();
        b1.setBounds(100 + insets.left, 60 + insets.top,
                size.width + 10, size.height + 10);

        size = b2.getPreferredSize();
        b2.setBounds(350 + insets.left, 60 + insets.top,
                size.width + 10, size.height + 10);
        size = b3.getPreferredSize();
        b3.setBounds(600 + insets.left, 60 + insets.top,
                size.width + 10, size.height + 10);

        // Line2
        size = b4.getPreferredSize();
        b4.setBounds(180 + insets.left, 120 + insets.top,
                size.width + 10, size.height + 10);
        size = b5.getPreferredSize();
        b5.setBounds(350 + insets.left, 120 + insets.top,
                size.width + 10, size.height + 10);
        size = b6.getPreferredSize();
        b6.setBounds(535 + insets.left, 120 + insets.top,
                size.width + 10, size.height + 10);

        //Line3
        size = b7.getPreferredSize();
        b7.setBounds(250 + insets.left, 180 + insets.top,
                size.width + 10, size.height + 10);
        size = b8.getPreferredSize();
        b8.setBounds(350 + insets.left, 180 + insets.top,
                size.width + 10, size.height + 10);
        size = b9.getPreferredSize();
        b9.setBounds(470 + insets.left, 180 + insets.top,
                size.width + 10, size.height + 10);

        // Line 4
        size = b19.getPreferredSize();
        b19.setBounds(100 + insets.left, 290 + insets.top,
                size.width + 10, size.height + 10);
        size = b16.getPreferredSize();
        b16.setBounds(100 + insets.left, 520 + insets.top,
                size.width + 10, size.height + 10);

        // Line 5
        size = b20.getPreferredSize();
        b20.setBounds(180 + insets.left, 290 + insets.top,
                size.width + 10, size.height + 10);
        size = b13.getPreferredSize();
        b13.setBounds(180 + insets.left, 460 + insets.top,
                size.width + 10, size.height + 10);

        // Line 6
        size = b21.getPreferredSize();
        b21.setBounds(250 + insets.left, 290 + insets.top,
                size.width + 10, size.height + 10);
        size = b10.getPreferredSize();
        b10.setBounds(250 + insets.left, 410 + insets.top,
                size.width + 10, size.height + 10);

        // Line 7
        size = b17.getPreferredSize();
        b17.setBounds(360 + insets.left, 520 + insets.top,
                size.width + 10, size.height + 10);
        size = b18.getPreferredSize();
        b18.setBounds(600 + insets.left, 520 + insets.top,
                size.width + 10, size.height + 10);

        // Line 8
        size = b14.getPreferredSize();
        b14.setBounds(360 + insets.left, 460 + insets.top,
                size.width + 10, size.height + 10);
        size = b15.getPreferredSize();
        b15.setBounds(535 + insets.left, 460 + insets.top,
                size.width + 10, size.height + 10);

        // Line 9
        size = b11.getPreferredSize();
        b11.setBounds(360 + insets.left, 410 + insets.top,
                size.width + 10, size.height + 10);
        size = b12.getPreferredSize();
        b12.setBounds(470 + insets.left, 410 + insets.top,
                size.width + 10, size.height + 10);

        // Line 10
        size = b24.getPreferredSize();
        b24.setBounds(600 + insets.left, 290 + insets.top,
                size.width + 10, size.height + 10);

        // Line 11
        size = b23.getPreferredSize();
        b23.setBounds(535 + insets.left, 290 + insets.top,
                size.width + 10, size.height + 10);

        // Line 12
        size = b22.getPreferredSize();
        b22.setBounds(470 + insets.left, 290 + insets.top,
                size.width + 10, size.height + 10);

       
        panel1.add(startbtn);
        size = startbtn.getPreferredSize();
        //startbtn.setBounds(750 + insets.left, 250 + insets.top,
        //   size.width + 60, size.height + 30);
        startbtn.setBounds(750 + insets.left, 340 + insets.top,
                size.width + 60, size.height + 30);
        startbtn.setBackground(Color.ORANGE);

        // restartbtn
        // panel1.add(restartbtn);
        size = restartbtn.getPreferredSize();
        restartbtn.setBounds(750 + insets.left, 340 + insets.top,
                size.width + 60, size.height + 30);
        restartbtn.setBackground(Color.yellow);

        // quitbtn
        panel1.add(quitbtn);
        size = quitbtn.getPreferredSize();
        quitbtn.setBounds(750 + insets.left, 430 + insets.top,
                size.width + 60, size.height + 30);
        quitbtn.setBackground(Color.white);

        // rulesbtn
        panel1.add(rulesbtn);
        size = rulesbtn.getPreferredSize();
        rulesbtn.setBounds(750 + insets.left, 520 + insets.top,
                size.width + 60, size.height + 30);
        rulesbtn.setBackground(Color.GREEN);

        // label1 for red eating list
        label1.setBackground(Color.red);
        panel1.add(label1);
        size = label1.getPreferredSize();
        label1.setBounds(750 + insets.left, 20 + insets.top,
                size.width + 50, size.height + 10);
        label1.setForeground(Color.BLUE);

        // label2 for green eating list
        label2.setBackground(Color.red);
        panel1.add(label2);
        size = label2.getPreferredSize();
        label2.setBounds(750 + insets.left, 170 + insets.top,
                size.width + 50, size.height + 10);
        label2.setForeground(Color.BLUE);

        // label3 for background image frame
        panel1.add(label3);
        size = label3.getPreferredSize();
        label3.setBounds(70 + insets.left, 30 + insets.top,
                size.width + 600, size.height + 550);
        label3.setIcon(bimage);

        panel1.add(label4);
        size = label4.getPreferredSize();
        label4.setBounds(700 + insets.left, 30 + insets.top,
                size.width + 250, size.height + 550);
        label4.setIcon(simage);

        //    turn Text field
        panel1.add(move);
        size = move.getPreferredSize();
        move.setBounds(310 + insets.left, 250 + insets.top,
                size.width + 140, size.height + 100);
        move.setFont(new Font("Courier New", Font.BOLD, 12));
        move.setBackground(Color.white);
        move.setForeground(Color.BLUE);
        move.setEditable(false);

        // Eating red button 
        panel1.add(rb1);
        size = rb1.getPreferredSize();
        rb1.setBounds(750 + insets.left, 50 + insets.top,
                size.width + 5, size.height + 5);
        rb1.setEnabled(false);

        panel1.add(rb2);
        size = rb2.getPreferredSize();
        rb2.setBounds(800 + insets.left, 50 + insets.top,
                size.width + 5, size.height + 5);
        rb2.setEnabled(false);

        panel1.add(rb3);
        size = rb3.getPreferredSize();
        rb3.setBounds(850 + insets.left, 50 + insets.top,
                size.width + 5, size.height + 5);
        rb3.setEnabled(false);

        panel1.add(rb4);
        size = rb4.getPreferredSize();
        rb4.setBounds(900 + insets.left, 50 + insets.top,
                size.width + 5, size.height + 5);
        rb4.setEnabled(false);

        panel1.add(rb5);
        size = rb5.getPreferredSize();
        rb5.setBounds(750 + insets.left, 100 + insets.top,
                size.width + 5, size.height + 5);
        rb5.setEnabled(false);

        panel1.add(rb6);
        size = rb6.getPreferredSize();
        rb6.setBounds(800 + insets.left, 100 + insets.top,
                size.width + 5, size.height + 5);
        rb6.setEnabled(false);

        panel1.add(rb7);
        size = rb7.getPreferredSize();
        rb7.setBounds(850 + insets.left, 100 + insets.top,
                size.width + 5, size.height + 5);
        rb7.setEnabled(false);

        // Eating Green button 
        panel1.add(gb1);
        size = gb1.getPreferredSize();
        gb1.setBounds(750 + insets.left, 200 + insets.top,
                size.width + 5, size.height + 5);
        gb1.setEnabled(false);

        panel1.add(gb2);
        size = gb2.getPreferredSize();
        gb2.setBounds(800 + insets.left, 200 + insets.top,
                size.width + 5, size.height + 5);
        gb2.setEnabled(false);

        panel1.add(gb3);
        size = gb3.getPreferredSize();
        gb3.setBounds(850 + insets.left, 200 + insets.top,
                size.width + 5, size.height + 5);
        gb3.setEnabled(false);

        panel1.add(gb4);
        size = gb4.getPreferredSize();
        gb4.setBounds(900 + insets.left, 200 + insets.top,
                size.width + 5, size.height + 5);
        gb4.setEnabled(false);

        panel1.add(gb5);
        size = gb5.getPreferredSize();
        gb5.setBounds(750 + insets.left, 250 + insets.top,
                size.width + 5, size.height + 5);
        gb5.setEnabled(false);

        panel1.add(gb6);
        size = gb6.getPreferredSize();
        gb6.setBounds(800 + insets.left, 250 + insets.top,
                size.width + 5, size.height + 5);
        gb6.setEnabled(false);

        panel1.add(gb7);
        size = gb7.getPreferredSize();
        gb7.setBounds(850 + insets.left, 250 + insets.top,
                size.width + 5, size.height + 5);
        gb7.setEnabled(false);

        // X,Y Move select...
//        if (h == 1) {
//            if (ansr <= 2) {
//                // Text field you loss
//            }
//            h = 0;
//            c = 1;
//            human();
//        }
        startbtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Game Start working");

                function();
                startbtn.setEnabled(false);

            }

        }
        );

        rulesbtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                JOptionPane.showMessageDialog(null, "Game Rules: \n"
                        + "1. Red color button is Human \n"
                        + "2. Green color button is Computer \n");

            }

        }
        );

        quitbtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                JOptionPane.showMessageDialog(null, "Game Credit: \n"
                        + "1. Name: Hossain Shahid Soroardi \n"
                        + "   Reg. No: 2012331544 \n"
                        + "2. Name: Bidhan Biswas \n"
                        + "   Reg. No: 2012331536 \n"
                       );

            }
        }
        );
    }
  
    private void function() {

        Random rand1 = new Random();
        int m = rand1.nextInt(2) + 1;

        if (m == 1) {
            xbtn.setEnabled(true);
            ybtn.setEnabled(false);
            xbtn.setBackground(Color.red);
        } else {
            xbtn.setEnabled(false);
            ybtn.setEnabled(true);
            ybtn.setBackground(Color.green);

        }

        for (int j = 1; j <= 24; j++) {
            arrgr[j] = 0;
            arr[j] = 0;
            ared[j] = 0;
        }

        for (;;) {

            if (red < 1) {
                break;
            }
            Random rand = new Random();
            int n = rand.nextInt(24) + 1;

            if (arr[n] == 0) {
                fun1(n);
            }
        }

        for (;;) {

            if (gre < 1) {
                break;
            }
            Random rand = new Random();
            int n = rand.nextInt(24) + 1;

            if (arr[n] == 0) {
                fun2(n);
            }
        }

        timer = new Timer(10000, new ActionListener() {
            //  @Override

            public void actionPerformed(ActionEvent e) {

                
                time=time+1;
                System.out.println("All Turn Number"+time);
                
                int rcount = 0, gcount = 0;
                for (int k = 1; k <= 24; k++) {
                    if (ared[k] == 1) {
                        rcount = rcount + 1;
                    }
                }

                if (rcount == 8) {
                    rb1.setBackground(Color.red);
                } else if (rcount == 7) {
                    rb2.setBackground(Color.red);
                } else if (rcount == 6) {
                    rb3.setBackground(Color.red);
                } else if (rcount == 5) {
                    rb4.setBackground(Color.red);
                } else if (rcount == 4) {
                    rb5.setBackground(Color.red);
                } else if (rcount == 3) {
                    rb6.setBackground(Color.red);
                } else if (rcount == 2) {
                    rb7.setBackground(Color.red);
                }

                for (int l = 1; l <= 24; l++) {
                    if (arrgr[l] == 1) {
                        gcount = gcount + 1;
                    }
                }
                if (gcount == 8) {
                    gb1.setBackground(Color.green);
                } else if (gcount == 7) {
                    gb2.setBackground(Color.green);
                } else if (gcount == 6) {
                    gb3.setBackground(Color.green);
                } else if (gcount == 5) {
                    gb4.setBackground(Color.green);
                } else if (gcount == 4) {
                    gb5.setBackground(Color.green);
                } else if (gcount == 3) {
                    gb6.setBackground(Color.green);
                } else if (gcount == 2) {
                    gb7.setBackground(Color.green);
                }

                a = 0;
                int cntr = 0, cntg = 0;
                System.out.println("Human");

                for (int i = 1; i <= 24; i++) {
                    if (ared[i] == 1) {
                        cntr += 1;
                    }
                    if (arrgr[i] == 1) {
                        cntg += 1;
                    }
                }

                if (cntr == 2 || cntg == 2) {
                    if (cntr == cntg && cntr == 2) {
                        JOptionPane.showMessageDialog(null, "   Match Draw   ");
                    } else if (cntr > 2) {
                        JOptionPane.showMessageDialog(null, "      Human Win    ");
                    } else {
                        JOptionPane.showMessageDialog(null, "      Computer Win  ");
                    }

                    for (int j = 1; j <= 24; j++) {
                        arrgr[j] = 0;
                        arr[j] = 0;
                        ared[j] = 0;
                    }
                    b1.setBackground(null);
                    b2.setBackground(null);
                    b3.setBackground(null);
                    b4.setBackground(null);
                    b5.setBackground(null);
                    b6.setBackground(null);
                    b7.setBackground(null);
                    b8.setBackground(null);
                    b9.setBackground(null);
                    b10.setBackground(null);
                    b11.setBackground(null);
                    b12.setBackground(null);
                    b13.setBackground(null);
                    b14.setBackground(null);
                    b15.setBackground(null);
                    b16.setBackground(null);
                    b17.setBackground(null);
                    b18.setBackground(null);
                    b19.setBackground(null);
                    b20.setBackground(null);
                    b21.setBackground(null);
                    b22.setBackground(null);
                    b23.setBackground(null);
                    b24.setBackground(null);

                    move.setText(null);

                    startbtn.setEnabled(true);

                    rb1.setBackground(null);
                    rb2.setBackground(null);
                    rb3.setBackground(null);
                    rb4.setBackground(null);
                    rb5.setBackground(null);
                    rb6.setBackground(null);
                    rb7.setBackground(null);
                    gb1.setBackground(null);
                    gb2.setBackground(null);
                    gb3.setBackground(null);
                    gb4.setBackground(null);
                    gb5.setBackground(null);
                    gb6.setBackground(null);
                    gb7.setBackground(null);

                    timer.stop();
                    return;
                }
                move.setText(null);
                move.setText("```Human Thinking'''");

                ac = 0;

                // green button enabled( false).
                if (arrgr[1] == 1) {
                    b1.setEnabled(false);
                }
                if (arrgr[2] == 1) {
                    b2.setEnabled(false);
                }
                if (arrgr[3] == 1) {
                    b3.setEnabled(false);
                }
                if (arrgr[4] == 1) {
                    b4.setEnabled(false);
                }
                if (arrgr[5] == 1) {
                    b5.setEnabled(false);
                }
                if (arrgr[6] == 1) {
                    b6.setEnabled(false);
                }
                if (arrgr[7] == 1) {
                    b7.setEnabled(false);
                }
                if (arrgr[8] == 1) {
                    b8.setEnabled(false);
                }
                if (arrgr[9] == 1) {
                    b9.setEnabled(false);
                }
                if (arrgr[10] == 1) {
                    b10.setEnabled(false);
                }
                if (arrgr[11] == 1) {
                    b11.setEnabled(false);
                }
                if (arrgr[12] == 1) {
                    b12.setEnabled(false);
                }
                if (arrgr[13] == 1) {
                    b13.setEnabled(false);
                }
                if (arrgr[14] == 1) {
                    b14.setEnabled(false);
                }
                if (arrgr[15] == 1) {
                    b15.setEnabled(false);
                }
                if (arrgr[16] == 1) {
                    b16.setEnabled(false);
                }
                if (arrgr[17] == 1) {
                    b17.setEnabled(false);
                }
                if (arrgr[18] == 1) {
                    b18.setEnabled(false);
                }
                if (arrgr[19] == 1) {
                    b19.setEnabled(false);
                }
                if (arrgr[20] == 1) {
                    b20.setEnabled(false);
                }
                if (arrgr[21] == 1) {
                    b21.setEnabled(false);
                }
                if (arrgr[22] == 1) {
                    b22.setEnabled(false);
                }
                if (arrgr[23] == 1) {
                    b23.setEnabled(false);
                }
                if (arrgr[24] == 1) {
                    b24.setEnabled(false);
                }

                // arr value check.......
                for (int j = 1; j <= 24; j++) {
                    if (arr[j] == 1) {
                        System.out.print("h" + j);
                    }
                }
                //  System.out.println(""+arr[1]);
                // a red button action........
                b1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        int check = chk(1);

                        if (arr[1] == 1 && ac == 0 && check <= 2) {
                            ared[1] = 0;
                            arr[1] = 0;
                            ac = 5;
                            fm = 1;
                            // System.out.println("" +arr[1]); ....jbutton.setBackground(new Color(240, 240, 240));
                            b1.setBackground(new Color(240, 240, 240));

                            // b1.setEnabled(false);
                            //  test();
                        }
                    }

                });

                b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[1] == 0 && ac == 5) && (fm == 2 || fm == 4 || fm == 19)) {
                            arr[1] = 1;
                            ared[1] = 1;
                            ac += 1;
                            b1.setBackground(Color.RED);
                            sm = 1;
                            // b1.setEnabled(true);
                            calhuman(1);
                            // computer();
                            a += 1;
                            // System.out.println("shuvo");
                        }
                    }
                });

                b2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        int check = chk(2);
                        if (arr[2] == 1 && ac == 0 && check <= 2) {
                            ared[2] = 0;
                            arr[2] = 0;
                            ac = 5;
                            fm = 2;
                            // System.out.println("" +arr[1]);

                            b2.setBackground(new Color(240, 240, 240));

                            // b2.setEnabled(false);
                        }
                    }
                });

                b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[2] == 0 && ac == 5) && (fm == 1 || fm == 3 || fm == 5)) {
                            arr[2] = 1;
                            ared[2] = 1;
                            ac += 1;
                            b2.setBackground(Color.RED);
                            sm = 2;
                            // b3.setEnabled(true);
                            calhuman(2);
                            // System.out.println("shuvo");
                            a += 1;
                            //computer();

                        }
                    }
                });

                b3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(3);

                        if (arr[3] == 1 && ac == 0 && check <= 2) {
                            ared[3] = 0;
                            arr[3] = 0;
                            ac = 5;
                            fm = 3;
                            // System.out.println("" +arr[1]);
                            b3.setBackground(new Color(240, 240, 240));
                            // b3.setEnabled(false);
                        }
                    }
                });

                b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[3] == 0 && ac == 5) && (fm == 2 || fm == 6 || fm == 24)) {
                            arr[3] = 1;
                            ared[3] = 1;
                            b3.setBackground(Color.RED);
                            ac += 1;
                            sm = 3;
                            //  b2.setEnabled(true);
                            calhuman(3);
                            // System.out.println("shuvo");
                            a += 1;
                        }
                    }
                });

                b4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(4);

                        if (arr[4] == 1 && ac == 0 && check <= 3) {
                            ared[4] = 0;
                            arr[4] = 0;
                            ac = 5;
                            fm = 4;
                            // System.out.println("" +arr[1]);
                            b4.setBackground(new Color(240, 240, 240));
                            // b4.setEnabled(false);
                        }
                    }
                });

                b4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[4] == 0 && ac == 5) && (fm == 1 || fm == 5 || fm == 7 || fm == 20)) {
                            arr[4] = 1;
                            ared[4] = 1;
                            b4.setBackground(Color.RED);
                            ac += 1;
                            sm = 4;
                            // b1.setEnabled(true);
                            calhuman(4);
                            // System.out.println("shuvo");
                            a += 1;
                        }
                    }
                });

//                if (ac == 5) {
//                    return;
//                }
                b5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(5);

                        if (arr[5] == 1 && ac == 0 && check <= 3) {
                            ared[5] = 0;
                            arr[5] = 0;
                            ac = 5;
                            fm = 5;
                            // System.out.println("" +arr[1]);
                            b5.setBackground(new Color(240, 240, 240));
                            // b5.setEnabled(false);
                        }
                    }
                });

                b5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[5] == 0 && ac == 5) && (fm == 2 || fm == 4 || fm == 6 || fm == 8)) {
                            arr[5] = 1;
                            ared[5] = 1;
                            b5.setBackground(Color.RED);
                            ac += 1;
                            sm = 5;
                            //   b4.setEnabled(true);
                            calhuman(5);
                            // System.out.println("shuvo");
                            a += 1;
                            //computer();
                        }
                    }
                });

                b6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(6);

                        if (arr[6] == 1 && ac == 0 && check <= 3) {
                            ared[6] = 0;
                            arr[6] = 0;
                            ac = 5;
                            fm = 6;
                            // System.out.println("" +arr[1]);
                            b6.setBackground(new Color(240, 240, 240));
                            //  b6.setEnabled(false);
                        }
                    }
                });

                b6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[6] == 0 && ac == 5) && (fm == 3 || fm == 5 || fm == 9 || fm == 23)) {
                            arr[6] = 1;
                            ared[6] = 1;
                            b6.setBackground(Color.RED);
                            ac += 1;
                            sm = 6;
                            //  b5.setEnabled(true);
                            calhuman(6);
                            // System.out.println("shuvo");
                            a += 1;
                            //   computer();
                        }
                    }
                });

                b7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(7);

                        if (arr[7] == 1 && ac == 0 && check <= 2) {
                            ared[7] = 0;
                            arr[7] = 0;
                            ac = 5;
                            fm = 7;
                            // System.out.println("" +arr[1]);
                            b7.setBackground(new Color(240, 240, 240));
                            //  b7.setEnabled(false);
                        }
                    }
                });

                b7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[7] == 0 && ac == 5) && (fm == 4 || fm == 8 || fm == 21)) {
                            arr[7] = 1;
                            ared[7] = 1;
                            ac += 1;
                            b7.setBackground(Color.RED);
                            sm = 7;
                            // b4.setEnabled(true);
                            calhuman(7);
                            // System.out.println("shuvo");
                            a += 1;
                            //computer();
                        }
                    }
                });

                b8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(8);

                        if (arr[8] == 1 && ac == 0 && check <= 2) {
                            ared[8] = 0;
                            arr[8] = 0;
                            ac = 5;
                            fm = 8;
                            // System.out.println("" +arr[1]);
                            b8.setBackground(new Color(240, 240, 240));
                            //  b8.setEnabled(false);
                        }
                    }
                });

                b8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[8] == 0 && ac == 5) && (fm == 5 || fm == 7 || fm == 9)) {
                            arr[8] = 1;
                            ared[8] = 1;
                            b8.setBackground(Color.RED);
                            ac += 1;
                            sm = 8;
                            // b7.setEnabled(true);
                            calhuman(8);
                            //     computer();
                        }
                    }
                });

                b9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(9);

                        if (arr[9] == 1 && ac == 0 && check <= 2) {
                            ared[9] = 0;
                            arr[9] = 0;
                            ac = 5;
                            fm = 9;
                            // System.out.println("" +arr[1]);
                            b9.setBackground(new Color(240, 240, 240));
                            //  b9.setEnabled(false);
                        }
                    }
                });

                b9.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[9] == 0 && ac == 5) && (fm == 6 || fm == 8 || fm == 22)) {
                            arr[9] = 1;
                            ared[9] = 1;
                            b9.setBackground(Color.RED);
                            ac += 1;
                            sm = 9;
                            // b8.setEnabled(true);
                            calhuman(9);
                            //      computer();
                        }
                    }
                });

                b10.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(10);

                        if (arr[10] == 1 && ac == 0 && check <= 2) {
                            ared[10] = 0;
                            arr[10] = 0;
                            ac = 5;
                            fm = 10;
                            // System.out.println("" +arr[1]);
                            b10.setBackground(new Color(240, 240, 240));
                            // b10.setEnabled(false);
                        }
                    }
                });

                b10.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[10] == 0 && ac == 5) && (fm == 11 || fm == 13 || fm == 21)) {
                            arr[10] = 1;
                            ared[10] = 1;
                            b10.setBackground(Color.RED);
                            ac += 1;
                            sm = 10;
                            // b11.setEnabled(true);
                            calhuman(10);
                            //      computer();
                        }
                    }
                });

                b11.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(11);

                        if (arr[11] == 1 && ac == 0 && check <= 2) {
                            ared[11] = 0;
                            arr[11] = 0;
                            ac = 5;
                            fm = 11;
                            // System.out.println("" +arr[1]);
                            b11.setBackground(new Color(240, 240, 240));
                            //  b11.setEnabled(false);

                        }
                    }
                });

                b11.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[11] == 0 && ac == 5) && (fm == 10 || fm == 12 || fm == 14)) {
                            arr[11] = 1;
                            ared[11] = 1;
                            b11.setBackground(Color.RED);
                            ac += 1;
                            sm = 11;
                            // b10.setEnabled(true);
                            calhuman(11);
                            //        computer();
                        }
                    }
                });

                b12.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(12);

                        if (arr[12] == 1 && ac == 0 && check <= 2) {
                            ared[12] = 0;
                            arr[12] = 0;
                            ac = 5;
                            fm = 12;
                            // System.out.println("" +arr[1]);
                            b12.setBackground(new Color(240, 240, 240));
                            //  b12.setEnabled(false);
                        }
                    }
                });

                b12.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[12] == 0 && ac == 5) && (fm == 11 || fm == 15 || fm == 22)) {
                            arr[12] = 1;
                            ared[12] = 1;
                            ac += 1;
                            sm = 12;
                            b12.setBackground(Color.RED);
                            // b11.setEnabled(true);
                            calhuman(12);
                            //        computer();
                        }
                    }
                });

                b13.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(13);

                        if (arr[13] == 1 && ac == 0 && check <= 3) {
                            ared[13] = 0;
                            arr[13] = 0;
                            ac = 5;
                            fm = 13;
                            // System.out.println("" +arr[1]);
                            b13.setBackground(new Color(240, 240, 240));
                            // b13.setEnabled(false);
                        }
                    }
                });

                b13.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[13] == 0 && ac == 5) && (fm == 10 || fm == 14 || fm == 16 || fm == 20)) {
                            arr[13] = 1;
                            ared[13] = 1;
                            b13.setBackground(Color.RED);
                            ac += 1;
                            sm = 13;
                            //  b10.setEnabled(true);
                            calhuman(13);
                            //         computer();
                        }
                    }
                });

                b14.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(14);

                        if (arr[14] == 1 && ac == 0 && check <= 3) {
                            ared[14] = 0;
                            arr[14] = 0;
                            ac = 5;
                            fm = 14;
                            // System.out.println("" +arr[1]);
                            b14.setBackground(new Color(240, 240, 240));
                            //  b14.setEnabled(false);
                        }
                    }
                });

                b14.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[14] == 0 && ac == 5) && (fm == 11 || fm == 13 || fm == 15 || fm == 17)) {
                            arr[14] = 1;
                            ared[14] = 1;
                            b14.setBackground(Color.RED);
                            ac += 1;
                            sm = 14;
                            // b13.setEnabled(true);
                            calhuman(14);
                            //         computer();

                        }
                    }
                });

                b15.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(15);

                        if (arr[15] == 1 && ac == 0 && check <= 3) {
                            ared[15] = 0;
                            arr[15] = 0;
                            ac = 5;
                            fm = 15;
                            // System.out.println("" +arr[1]);
                            b15.setBackground(new Color(240, 240, 240));
                            // b15.setEnabled(false);

                        }
                    }
                });

                b15.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[15] == 0 && ac == 5) && (fm == 12 || fm == 14 || fm == 18 || fm == 23)) {
                            arr[15] = 1;
                            ared[15] = 1;
                            b15.setBackground(Color.RED);
                            ac += 1;
                            sm = 15;
                            //  b14.setEnabled(true);
                            calhuman(15);
                            //         computer();

                        }
                    }
                });

                b16.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(16);

                        if (arr[16] == 1 && ac == 0 && check <= 2) {
                            ared[16] = 0;
                            arr[16] = 0;
                            ac = 5;
                            fm = 16;
                            // System.out.println("" +arr[1]);
                            b16.setBackground(new Color(240, 240, 240));
                            //  b16.setEnabled(false);

                        }
                    }
                });

                b16.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[16] == 0 && ac == 5) && (fm == 13 || fm == 17 || fm == 19)) {
                            arr[16] = 1;
                            ared[16] = 1;
                            b16.setBackground(Color.RED);
                            ac += 1;
                            sm = 16;
                            //  b13.setEnabled(true);
                            calhuman(16);
                            //        computer();

                        }
                    }
                });

                b17.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(17);

                        if (arr[17] == 1 && ac == 0 && check <= 2) {
                            ared[17] = 0;
                            arr[17] = 0;
                            ac = 5;
                            fm = 17;
                            // System.out.println("" +arr[1]);
                            b17.setBackground(new Color(240, 240, 240));
                            //  b17.setEnabled(false);

                        }
                    }
                });

                b17.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[17] == 0 && ac == 5) && (fm == 14 || fm == 16 || fm == 18)) {
                            arr[17] = 1;
                            ared[17] = 1;
                            ac += 1;
                            sm = 17;
                            b17.setBackground(Color.RED);
                            //  b16.setEnabled(true);
                            calhuman(17);
                            //       computer();

                        }
                    }
                });

                b18.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(18);

                        if (arr[18] == 1 && ac == 0 && check <= 2) {
                            ared[18] = 0;
                            arr[18] = 0;
                            ac = 5;
                            fm = 18;
                            // System.out.println("" +arr[1]);
                            b18.setBackground(new Color(240, 240, 240));
                            //   b18.setEnabled(false);
                        }
                    }
                });

                b18.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[18] == 0 && ac == 5) && (fm == 15 || fm == 17 || fm == 24)) {
                            arr[18] = 1;
                            ared[18] = 1;
                            b18.setBackground(Color.RED);
                            ac += 1;
                            sm = 18;
                            // b17.setEnabled(true);
                            calhuman(18);
                            //      computer();

                        }
                    }
                });

                b19.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(19);

                        if (arr[19] == 1 && ac == 0 && check <= 2) {
                            ared[19] = 0;
                            arr[19] = 0;
                            ac = 5;
                            fm = 19;
                            // System.out.println("" +arr[1]);
                            b19.setBackground(new Color(240, 240, 240));
                            //  b19.setEnabled(false);
                        }
                    }
                });

                b19.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[19] == 0 && ac == 5) && (fm == 1 || fm == 16 || fm == 20)) {
                            arr[19] = 1;
                            ared[19] = 1;
                            b19.setBackground(Color.RED);
                            ac += 1;
                            sm = 19;
                            // b16.setEnabled(true);
                            calhuman(19);
                            //        computer();

                        }
                    }
                });

                b20.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(20);

                        if (arr[20] == 1 && ac == 0 && check <= 3) {
                            ared[20] = 0;
                            arr[20] = 0;
                            ac = 5;
                            fm = 20;
                            // System.out.println("" +arr[1]);
                            b20.setBackground(new Color(240, 240, 240));
                            //  b20.setEnabled(false);
                        }
                    }
                });

                b20.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[20] == 0 && ac == 5) && (fm == 4 || fm == 13 || fm == 19 || fm == 21)) {
                            arr[20] = 1;
                            ared[20] = 1;
                            b20.setBackground(Color.RED);
                            ac += 1;
                            sm = 20;
                            // b19.setEnabled(true);
                            calhuman(20); //computer();

                        }
                    }
                });

                b21.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(21);

                        if (arr[21] == 1 && ac == 0 && check <= 2) {
                            ared[21] = 0;
                            arr[21] = 0;
                            ac = 5;
                            fm = 21;
                            // System.out.println("" +arr[1]);
                            b21.setBackground(new Color(240, 240, 240));
                            //  b21.setEnabled(false);
                        }
                    }
                });

                b21.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[21] == 0 && ac == 5) && (fm == 7 || fm == 10 || fm == 20)) {
                            arr[21] = 1;
                            ared[21] = 1;
                            b21.setBackground(Color.RED);
                            ac += 1;
                            sm = 21;
                            //  b20.setEnabled(true);
                            calhuman(21);// computer();

                        }
                    }
                });

                b22.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(22);

                        if (arr[22] == 1 && ac == 0 && check <= 2) {
                            ared[22] = 0;
                            arr[22] = 0;
                            ac = 5;
                            fm = 22;
                            // System.out.println("" +arr[1]);
                            b22.setBackground(new Color(240, 240, 240));
                            //   b22.setEnabled(false);

                        }
                    }
                });

                b22.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[22] == 0 && ac == 5) && (fm == 9 || fm == 12 || fm == 23)) {
                            arr[22] = 1;
                            ared[22] = 1;
                            ac += 1;
                            sm = 22;
                            b22.setBackground(Color.RED);
                            //  b23.setEnabled(true);
                            calhuman(22); //computer();

                        }
                    }
                });

                b23.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(23);

                        if (arr[23] == 1 && ac == 0 && check <= 3) {
                            ared[23] = 0;
                            arr[23] = 0;
                            ac = 5;
                            fm = 23;
                            // System.out.println("" +arr[1]);
                            b23.setBackground(new Color(240, 240, 240));
                            //  b23.setEnabled(false);

                        }
                    }
                });

                b23.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[23] == 0 && ac == 5) && (fm == 6 || fm == 15 || fm == 22 || fm == 24)) {
                            arr[23] = 1;
                            ared[23] = 1;
                            b23.setBackground(Color.RED);
                            ac += 1;
                            sm = 23;
                            //  b22.setEnabled(true);
                            calhuman(23); //computer();

                        }
                    }
                });

                b24.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                        int check = chk(24);

                        if (arr[24] == 1 && ac == 0 && check <= 2) {
                            ared[24] = 0;
                            arr[24] = 0;
                            ac = 5;
                            fm = 24;
                            // System.out.println("" +arr[1]);
                            b24.setBackground(new Color(240, 240, 240));
                            //  b24.setEnabled(false);
                        }
                    }
                });

                b24.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if ((arr[24] == 0 && ac == 5) && (fm == 3 || fm == 18 || fm == 23)) {
                            arr[24] = 1;
                            ared[24] = 1;
                            b24.setBackground(Color.RED);
                            ac += 1;
                            sm = 24;
                            //  b23.setEnabled(true);
                            calhuman(24);// computer();

                        }
                    }
                });
//                if (ac == 5) {
//                    return;
//                    // computer();
//                    // System.out.println("" + ckcmp);
//                }
                //System.out.println(""+n);       

            }
        }
        );

        timer.start();
        start = System.currentTimeMillis();
    }
// function() method for human turn...UP...

// eatgr() method because Human red button eat 1 green button ....Down...   
    void eatgr() {

        brek = 0;

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[1] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[1] = 0;
                    arr[1] = 0;
                    ansg -= 1;
                    b1.setBackground(null);
                    computer();
                    // return;
                }
            }
        });

        if (brek == 5) {
            return;
        }

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[2] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[2] = 0;
                    arr[2] = 0;
                    ansg -= 1;
                    b2.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[3] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[3] = 0;
                    arr[3] = 0;
                    ansg -= 1;
                    b3.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[4] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[4] = 0;
                    arr[4] = 0;
                    ansg -= 1;
                    b4.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[5] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[5] = 0;
                    arr[5] = 0;
                    ansg -= 1;
                    b5.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[6] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[6] = 0;
                    arr[6] = 0;
                    ansg -= 1;
                    b6.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[7] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[7] = 0;
                    arr[7] = 0;
                    ansg -= 1;
                    b7.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[8] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[8] = 0;
                    arr[8] = 0;
                    ansg -= 1;
                    b8.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[9] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[9] = 0;
                    arr[9] = 0;
                    ansg -= 1;
                    b9.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[10] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[10] = 0;
                    arr[10] = 0;
                    ansg -= 1;
                    b10.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[11] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[11] = 0;
                    arr[11] = 0;
                    ansg -= 1;
                    b11.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[12] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[12] = 0;
                    arr[12] = 0;
                    ansg -= 1;
                    b12.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[13] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[13] = 0;
                    arr[13] = 0;
                    ansg -= 1;
                    b13.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[14] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[14] = 0;
                    arr[14] = 0;
                    ansg -= 1;
                    b14.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[15] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[15] = 0;
                    arr[15] = 0;
                    ansg -= 1;
                    b15.setBackground(null);
                    computer();
                    //   return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[16] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[16] = 0;
                    arr[16] = 0;
                    ansg -= 1;
                    b16.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[17] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[17] = 0;
                    arr[17] = 0;
                    ansg -= 1;
                    b17.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[18] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[18] = 0;
                    arr[18] = 0;
                    ansg -= 1;
                    b18.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[19] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[19] = 0;
                    arr[19] = 0;
                    ansg -= 1;
                    b19.setBackground(null);
                    computer();
                    // return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[20] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[20] = 0;
                    arr[20] = 0;
                    ansg -= 1;
                    b20.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[21] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[21] = 0;
                    arr[21] = 0;
                    ansg -= 1;
                    b21.setBackground(null);
                    computer();
                    //   return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[22] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[22] = 0;
                    arr[22] = 0;
                    ansg -= 1;
                    b22.setBackground(null);
                    computer();
                    //   return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[23] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[23] = 0;
                    arr[23] = 0;
                    ansg -= 1;
                    b23.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if (arrgr[24] == 1 && brek == 0) {
                    brek = 5;
                    arrgr[24] = 0;
                    arr[24] = 0;
                    ansg -= 1;
                    b24.setBackground(null);
                    computer();
                    //  return;
                }
            }
        });
        if (brek == 5) {
            return;
        }
    }
// eatgr() method because Human red button eat 1 green button ....UP...  

// grenbl Method for enable green button because  Human eat 1 green button....Down....
    void grenbl() {
        if (arrgr[1] == 1) {
            b1.setEnabled(true);
        }
        if (arrgr[2] == 1) {
            b2.setEnabled(true);
        }
        if (arrgr[3] == 1) {
            b3.setEnabled(true);
        }
        if (arrgr[4] == 1) {
            b4.setEnabled(true);
        }
        if (arrgr[5] == 1) {
            b5.setEnabled(true);
        }
        if (arrgr[6] == 1) {
            b6.setEnabled(true);
        }
        if (arrgr[7] == 1) {
            b7.setEnabled(true);
        }
        if (arrgr[8] == 1) {
            b8.setEnabled(true);
        }
        if (arrgr[9] == 1) {
            b9.setEnabled(true);
        }
        if (arrgr[10] == 1) {
            b10.setEnabled(true);
        }
        if (arrgr[11] == 1) {
            b11.setEnabled(true);
        }
        if (arrgr[12] == 1) {
            b12.setEnabled(true);
        }
        if (arrgr[13] == 1) {
            b13.setEnabled(true);
        }
        if (arrgr[14] == 1) {
            b14.setEnabled(true);
        }
        if (arrgr[15] == 1) {
            b15.setEnabled(true);
        }
        if (arrgr[16] == 1) {
            b16.setEnabled(true);
        }
        if (arrgr[17] == 1) {
            b17.setEnabled(true);
        }
        if (arrgr[18] == 1) {
            b18.setEnabled(true);
        }
        if (arrgr[19] == 1) {
            b19.setEnabled(true);
        }
        if (arrgr[20] == 1) {
            b20.setEnabled(true);
        }
        if (arrgr[21] == 1) {
            b21.setEnabled(true);
        }
        if (arrgr[22] == 1) {
            b22.setEnabled(true);
        }
        if (arrgr[23] == 1) {
            b23.setEnabled(true);
        }
        if (arrgr[24] == 1) {
            b24.setEnabled(true);
        }
    }
// grenbl() Method for enable green button because  Human red button eat 1 green button....Down....

// chk() method Because red button chk connect all side 1 button is any color r,g,0 count then red button click another 
    // connect null button and red transfer ............. Down..........
    int chk(int pos) {

        int rp1 = pos + 1;
        int rp2 = pos + 2;

        int dm3 = pos - 3;
        int dm6 = pos - 6;

        int dp3 = pos + 3;
        int dp6 = pos + 6;

        int up = pos - 1;
        int dw = pos + 1;

        int lm3 = pos - 3;
        int rp3 = pos + 3;

        int lm1 = pos - 1;
        int lm2 = pos - 2;

        if (pos == 1) {
            int jog = 0;

            jog += arr[rp1];
            jog += arr[dp3];
            jog += arr[19];

            return jog;
        }

        if (pos == 2) {
            int jog = 0;

            jog += arr[up];
            jog += arr[dw];
            jog += arr[dp3];

            return jog;
        }

        if (pos == 3) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[dp3];
            jog += arr[24];

            return jog;
        }

        if (pos == 4) {
            int jog = 0;

            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[rp1];
            jog += arr[20];

            return jog;
        }
        if (pos == 5) {
            int jog = 0;

            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[up];
            jog += arr[dw];

            return jog;
        }

        if (pos == 6) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[23];

            return jog;
        }

        if (pos == 7) {
            int jog = 0;

            jog += arr[dm3];
            jog += arr[rp1];
            jog += arr[21];

            return jog;
        }

        if (pos == 8) {
            int jog = 0;

            jog += arr[up];
            jog += arr[dw];
            jog += arr[dm3];

            return jog;
        }

        if (pos == 9) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[dm3];
            jog += arr[22];

            return jog;
        }

        if (pos == 19) {
            int jog = 0;

            jog += arr[rp1];
            jog += arr[1];
            jog += arr[16];

            return jog;
        }

        if (pos == 20) {
            int jog = 0;

            jog += arr[up];
            jog += arr[dw];
            jog += arr[4];
            jog += arr[13];

            return jog;
        }

        if (pos == 21) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[7];
            jog += arr[10];

            return jog;
        }

        if (pos == 22) {
            int jog = 0;

            jog += arr[rp1];
            jog += arr[9];
            jog += arr[12];

            return jog;
        }

        if (pos == 23) {
            int jog = 0;

            jog += arr[up];
            jog += arr[dw];
            jog += arr[6];
            jog += arr[15];

            return jog;
        }

        if (pos == 24) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[3];
            jog += arr[18];

            return jog;
        }

        if (pos == 10) {
            int jog = 0;

            jog += arr[rp1];
            jog += arr[dp3];
            jog += arr[21];

            return jog;
        }

        if (pos == 11) {
            int jog = 0;

            jog += arr[up];
            jog += arr[dw];
            jog += arr[dp3];

            return jog;
        }

        if (pos == 12) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[dp3];
            jog += arr[22];

            return jog;
        }

        if (pos == 13) {
            int jog = 0;

            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[rp1];
            jog += arr[20];

            return jog;
        }

        if (pos == 14) {
            int jog = 0;

            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[up];
            jog += arr[dw];

            return jog;
        }

        if (pos == 15) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[23];

            return jog;
        }

        if (pos == 16) {
            int jog = 0;

            jog += arr[rp1];
            jog += arr[dm3];
            jog += arr[19];

            return jog;
        }

        if (pos == 17) {
            int jog = 0;

            jog += arr[up];
            jog += arr[dw];
            jog += arr[dm3];

            return jog;
        }

        if (pos == 18) {
            int jog = 0;

            jog += arr[lm1];
            jog += arr[dm3];
            jog += arr[24];

            return jog;
        }

        return 0;
    }
// chk method Because red button chk connect all side 1 button is r,g,0 count then red button click another 
// connect null button and red transfer ............. UP....

// calhuman(int pos) method Because..grenbl();..eatgr();..computer(); method call...(Down)...
    void calhuman(int pos) {

        int rp1 = pos + 1;
        int rp2 = pos + 2;

        int dm3 = pos - 3;
        int dm6 = pos - 6;

        int dp3 = pos + 3;
        int dp6 = pos + 6;

        int up = pos - 1;
        int dw = pos + 1;

        int lm3 = pos - 3;
        int rp3 = pos + 3;

        int lm1 = pos - 1;
        int lm2 = pos - 2;

        if (pos == 1) {
            int jog = 0, jog1 = 0, jog2 = 0;
            jog += ared[1];
            jog1 += ared[1];
            jog2 += ared[1];

            jog += ared[rp1];
            jog += ared[rp2];

            jog1 += ared[dp3];
            jog1 += ared[dp6];

            jog2 += ared[19];
            jog2 += ared[16];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                //human();
                // return;
            } else {
                computer();

            }
        } else if (pos == 2) {
            int jog = 0, jog1 = 0;

            jog += ared[2];
            jog1 += ared[2];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[dp3];
            jog1 += ared[dp6];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                // human();
                // return;
            } else {
                computer();

            }
        } else if (pos == 3) {
            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[3];
            jog1 += ared[3];
            jog2 += ared[3];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[dp3];
            jog1 += ared[dp6];

            jog2 += ared[18];
            jog2 += ared[24];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                //computer();
                //  human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 4) {
            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[4];
            jog1 += ared[4];
            jog2 += ared[4];

            jog += ared[lm3];
            jog += ared[rp3];

            jog1 += ared[rp1];
            jog1 += ared[rp2];

            jog2 += ared[20];
            jog2 += ared[13];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                //  human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 5) {

            int jog = 0, jog1 = 0;

            jog += ared[5];
            jog1 += ared[5];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[lm3];
            jog1 += ared[rp3];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                // human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 6) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[6];
            jog1 += ared[6];
            jog2 += ared[6];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[lm3];
            jog1 += ared[rp3];

            jog2 += ared[23];
            jog2 += ared[15];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                // human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 7) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[7];
            jog1 += ared[7];
            jog2 += ared[7];

            jog += ared[dm3];
            jog += ared[dm6];

            jog1 += ared[rp1];
            jog1 += ared[rp2];

            jog2 += ared[10];
            jog2 += ared[21];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                //  human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 8) {

            int jog = 0, jog1 = 0;

            jog += ared[8];
            jog1 += ared[8];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[dm3];
            jog1 += ared[dm6];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                // human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 9) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[9];
            jog1 += ared[9];
            jog2 += ared[9];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[dm3];
            jog1 += ared[dm6];

            jog2 += ared[22];
            jog2 += ared[12];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                // human();
                //  return;
            } else {
                computer();
            }
        } else if (pos == 19) {

            int jog = 0, jog1 = 0;

            jog += ared[19];
            jog1 += ared[19];

            jog += ared[rp1];
            jog += ared[rp2];

            jog1 += ared[1];
            jog1 += ared[16];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //  human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 20) {

            int jog = 0, jog1 = 0;

            jog += ared[20];
            jog1 += ared[20];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[4];
            jog1 += ared[13];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //  human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 21) {

            int jog = 0, jog1 = 0;

            jog += ared[21];
            jog1 += ared[21];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[7];
            jog1 += ared[10];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //   human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 22) {

            int jog = 0, jog1 = 0;

            jog += ared[22];
            jog1 += ared[22];

            jog += ared[rp1];
            jog += ared[rp2];

            jog1 += ared[9];
            jog1 += ared[12];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //   human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 23) {

            int jog = 0, jog1 = 0;

            jog += ared[23];
            jog1 += ared[23];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[6];
            jog1 += ared[15];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //   human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 24) {

            int jog = 0, jog1 = 0;

            jog += ared[24];
            jog1 += ared[24];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[3];
            jog1 += ared[18];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //    human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 10) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[10];
            jog1 += ared[10];
            jog2 += ared[10];

            jog += ared[rp1];
            jog += ared[rp2];

            jog1 += ared[dp3];
            jog1 += ared[dp6];

            jog2 += ared[7];
            jog2 += ared[21];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                //   human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 11) {

            int jog = 0, jog1 = 0;

            jog += ared[11];
            jog1 += ared[11];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[dp3];
            jog1 += ared[dp6];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //   human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 12) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[12];
            jog1 += ared[12];
            jog2 += ared[12];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[dp3];
            jog1 += ared[dp6];

            jog2 += ared[22];
            jog2 += ared[9];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                //    human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 13) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[13];
            jog1 += ared[13];
            jog2 += ared[13];

            jog += ared[lm3];
            jog += ared[rp3];

            jog1 += ared[rp1];
            jog1 += ared[rp2];

            jog2 += ared[20];
            jog2 += ared[4];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                //   human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 14) {

            int jog = 0, jog1 = 0;

            jog += ared[14];
            jog1 += ared[14];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[lm3];
            jog1 += ared[rp3];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //  human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 15) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[15];
            jog1 += ared[15];
            jog2 += ared[15];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[lm3];
            jog1 += ared[rp3];

            jog2 += ared[23];
            jog2 += ared[6];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                //  human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 16) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[16];
            jog1 += ared[16];
            jog2 += ared[16];

            jog += ared[dm3];
            jog += ared[dm6];

            jog1 += ared[rp1];
            jog1 += ared[rp2];

            jog2 += ared[19];
            jog2 += ared[1];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                // computer();
                //    human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 17) {

            int jog = 0, jog1 = 0;

            jog += ared[17];
            jog1 += ared[17];

            jog += ared[up];
            jog += ared[dw];

            jog1 += ared[dm3];
            jog1 += ared[dm6];

            if (jog == 3 || jog1 == 3) {
                grenbl();
                eatgr();
                // computer();
                //    human();
                // return;
            } else {
                computer();
            }
        } else if (pos == 18) {

            int jog = 0, jog1 = 0, jog2 = 0;

            jog += ared[18];
            jog1 += ared[18];
            jog2 += ared[18];

            jog += ared[lm1];
            jog += ared[lm2];

            jog1 += ared[dm3];
            jog1 += ared[dm6];

            jog2 += ared[24];
            jog2 += ared[3];

            if (jog == 3 || jog1 == 3 || jog2 == 3) {
                grenbl();
                eatgr();
                //  computer();
                //    human();
                // return;
            } else {
                computer();
            }
        }
    }
    // calhuman(int pos) method ............. (UP)

//  red2chk method for chk 2 connect red button and green button eat 1 red button... ...Down...
    void red2chk(int pos) {

        int rp1 = pos + 1;
        int rp2 = pos + 2;

        int dm3 = pos - 3;
        int dm6 = pos - 6;

        int dp3 = pos + 3;
        int dp6 = pos + 6;

        int up = pos - 1;
        int dw = pos + 1;

        int lm3 = pos - 3;
        int rp3 = pos + 3;

        int lm1 = pos - 1;
        int lm2 = pos - 2;

        if (pos == 1 && ared[1] == 1) {
            int jog = 0;

            jog += ared[1];
            jog += ared[rp1];
            jog += ared[dp3];
            jog += ared[19];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[1] = 0;
                arr[1] = 0;
                b1.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 2 && ared[2] == 1) {
            int jog = 0;

            jog += ared[2];
            jog += ared[up];
            jog += ared[dw];
            jog += ared[dp3];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[2] = 0;
                arr[2] = 0;
                b2.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 3 && ared[3] == 1) {
            int jog = 0;

            jog += ared[3];
            jog += arr[lm1];
            jog += arr[dp3];
            jog += arr[24];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[3] = 0;
                arr[3] = 0;
                b3.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 4 && ared[4] == 1) {
            int jog = 0;

            jog += ared[4];
            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[rp1];
            jog += arr[20];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[4] = 0;
                arr[4] = 0;
                b4.setBackground(null);
                ck = 1;
                return;
            }
        }
        if (pos == 5 && ared[5] == 1) {
            int jog = 0;
            jog += ared[5];

            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[up];
            jog += arr[dw];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[5] = 0;
                arr[5] = 0;
                b5.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 6 && ared[6] == 1) {
            int jog = 0;
            jog += ared[6];

            jog += arr[lm1];
            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[23];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[6] = 0;
                arr[6] = 0;
                b6.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 7 && ared[7] == 1) {
            int jog = 0;
            jog += ared[7];

            jog += arr[dm3];
            jog += arr[rp1];
            jog += arr[21];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[7] = 0;
                arr[7] = 0;
                b7.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 8 && ared[8] == 1) {
            int jog = 0;
            jog += ared[8];

            jog += arr[up];
            jog += arr[dw];
            jog += arr[dm3];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[8] = 0;
                arr[8] = 0;
                b8.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 9 && ared[9] == 1) {
            int jog = 0;
            jog += ared[9];

            jog += arr[lm1];
            jog += arr[dm3];
            jog += arr[22];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[9] = 0;
                arr[9] = 0;
                b9.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 19 && ared[19] == 1) {
            int jog = 0;
            jog += ared[19];

            jog += arr[rp1];
            jog += arr[1];
            jog += arr[16];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[19] = 0;
                arr[19] = 0;
                b19.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 20 && ared[20] == 1) {
            int jog = 0;
            jog += ared[20];

            jog += arr[up];
            jog += arr[dw];
            jog += arr[4];
            jog += arr[13];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[20] = 0;
                arr[20] = 0;
                b20.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 21 && ared[21] == 1) {
            int jog = 0;
            jog += ared[21];

            jog += arr[lm1];
            jog += arr[7];
            jog += arr[10];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[21] = 0;
                arr[21] = 0;
                b21.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 22 && ared[22] == 1) {
            int jog = 0;
            jog += ared[22];

            jog += arr[rp1];
            jog += arr[9];
            jog += arr[12];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[22] = 0;
                arr[22] = 0;
                b22.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 23 && ared[23] == 1) {
            int jog = 0;
            jog += ared[23];

            jog += arr[up];
            jog += arr[dw];
            jog += arr[6];
            jog += arr[15];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[23] = 0;
                arr[23] = 0;
                b23.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 24 && ared[24] == 1) {
            int jog = 0;
            jog += ared[24];

            jog += arr[lm1];
            jog += arr[3];
            jog += arr[18];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[24] = 0;
                arr[24] = 0;
                b24.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 10 && ared[10] == 1) {
            int jog = 0;
            jog += ared[10];

            jog += arr[rp1];
            jog += arr[dp3];
            jog += arr[21];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[10] = 0;
                arr[10] = 0;
                b10.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 11 && ared[11] == 1) {
            int jog = 0;
            jog += ared[11];

            jog += arr[up];
            jog += arr[dw];
            jog += arr[dp3];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[11] = 0;
                arr[11] = 0;
                b11.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 12 && ared[12] == 1) {
            int jog = 0;
            jog += ared[12];

            jog += arr[lm1];
            jog += arr[dp3];
            jog += arr[22];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[12] = 0;
                arr[12] = 0;
                b12.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 13 && ared[13] == 1) {
            int jog = 0;
            jog += ared[13];

            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[rp1];
            jog += arr[20];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[13] = 0;
                arr[13] = 0;
                b13.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 14 && ared[14] == 1) {
            int jog = 0;
            jog += ared[14];

            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[up];
            jog += arr[dw];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[14] = 0;
                arr[14] = 0;
                b14.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 15 && ared[15] == 1) {
            int jog = 0;
            jog += ared[15];

            jog += arr[lm1];
            jog += arr[lm3];
            jog += arr[rp3];
            jog += arr[23];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[15] = 0;
                arr[15] = 0;
                b15.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 16 && ared[16] == 1) {
            int jog = 0;
            jog += ared[16];

            jog += arr[rp1];
            jog += arr[dm3];
            jog += arr[19];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[16] = 0;
                arr[16] = 0;
                b16.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 17 && ared[17] == 1) {
            int jog = 0;
            jog += ared[17];

            jog += arr[up];
            jog += arr[dw];
            jog += arr[dm3];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[17] = 0;
                arr[17] = 0;
                b17.setBackground(null);
                ck = 1;
                return;
            }
        }

        if (pos == 18 && ared[18] == 1) {
            int jog = 0;
            jog += ared[18];

            jog += arr[lm1];
            jog += arr[dm3];
            jog += arr[24];

            if (jog >= 2) {
                rkn += 1;
                ansr -= 1;
                ared[18] = 0;
                arr[18] = 0;
                b18.setBackground(null);
                ck = 1;
                return;
            }
        }

        return;
    }
//  red2chk method for chk 2 connect red button and green button eat 1 red button... UP

// eatred() method for computer green button eat 1 red button ....Down   
    void eatred() {
        ck = 0;
        for (int i = 1; i <= 24; i++) {
            if (ck == 0) {
                red2chk(i);
                // gamecontrol();
            }
        }
        System.out.println("red eat" + ck);
        if (ck == 0 && ck < 1) {
            for (int j = 1; j <= 24; j++) {
                if (ared[j] == 1) {
                    rkn += 1;
                    ared[j] = 0;
                    arr[j] = 0;
                    ansr -= 1;
                    if (j == 1) {
                        b1.setBackground(null);
                        break;
                    }
                    if (j == 2) {
                        b2.setBackground(null);
                        break;
                    }
                    if (j == 3) {
                        b3.setBackground(null);
                        break;
                    }
                    if (j == 4) {
                        b4.setBackground(null);
                        break;
                    }
                    if (j == 5) {
                        b5.setBackground(null);
                        break;
                    }
                    if (j == 6) {
                        b6.setBackground(null);
                        break;
                    }
                    if (j == 7) {
                        b7.setBackground(null);
                        break;
                    }
                    if (j == 8) {
                        b8.setBackground(null);
                        break;
                    }
                    if (j == 9) {
                        b9.setBackground(null);
                        break;
                    }
                    if (j == 10) {
                        b10.setBackground(null);
                        break;
                    }
                    if (j == 11) {
                        b11.setBackground(null);
                        break;
                    }
                    if (j == 12) {
                        b12.setBackground(null);
                        break;
                    }
                    if (j == 13) {
                        b13.setBackground(null);
                        break;
                    }
                    if (j == 14) {
                        b14.setBackground(null);
                        break;
                    }
                    if (j == 15) {
                        b15.setBackground(null);
                        break;
                    }
                    if (j == 16) {
                        b16.setBackground(null);
                        break;
                    }
                    if (j == 17) {
                        b17.setBackground(null);
                        break;
                    }
                    if (j == 18) {
                        b18.setBackground(null);
                        break;
                    }
                    if (j == 19) {
                        b19.setBackground(null);
                        break;
                    }
                    if (j == 20) {
                        b20.setBackground(null);
                        break;
                    }
                    if (j == 21) {
                        b21.setBackground(null);
                        break;
                    }
                    if (j == 22) {
                        b22.setBackground(null);
                        break;
                    }
                    if (j == 23) {
                        b23.setBackground(null);
                        break;
                    }
                    if (j == 24) {
                        b24.setBackground(null);
                        break;
                    }
                }
            }
        }
    }
// eatred() method for computer green button eat 1 red button ....UP   

    // Computer turn  .......... (Down).......
    void computer() {
        ckcmp = 1;
        move.setText(null);
        move.setText("'''Computer Thinking'''");

        System.out.println("computer");
      //  System.out.println("" + ckcmp);

        // green button enabled( true).
        if (arrgr[1] == 1) {
            b1.setEnabled(true);
        }
        if (arrgr[2] == 1) {
            b2.setEnabled(true);
        }
        if (arrgr[3] == 1) {
            b3.setEnabled(true);
        }
        if (arrgr[4] == 1) {
            b4.setEnabled(true);
        }
        if (arrgr[5] == 1) {
            b5.setEnabled(true);
        }
        if (arrgr[6] == 1) {
            b6.setEnabled(true);
        }
        if (arrgr[7] == 1) {
            b7.setEnabled(true);
        }
        if (arrgr[8] == 1) {
            b8.setEnabled(true);
        }
        if (arrgr[9] == 1) {
            b9.setEnabled(true);
        }
        if (arrgr[10] == 1) {
            b10.setEnabled(true);
        }
        if (arrgr[11] == 1) {
            b11.setEnabled(true);
        }
        if (arrgr[12] == 1) {
            b12.setEnabled(true);
        }
        if (arrgr[13] == 1) {
            b13.setEnabled(true);
        }
        if (arrgr[14] == 1) {
            b14.setEnabled(true);
        }
        if (arrgr[15] == 1) {
            b15.setEnabled(true);
        }
        if (arrgr[16] == 1) {
            b16.setEnabled(true);
        }
        if (arrgr[17] == 1) {
            b17.setEnabled(true);
        }
        if (arrgr[18] == 1) {
            b18.setEnabled(true);
        }
        if (arrgr[19] == 1) {
            b19.setEnabled(true);
        }
        if (arrgr[20] == 1) {
            b20.setEnabled(true);
        }
        if (arrgr[21] == 1) {
            b21.setEnabled(true);
        }
        if (arrgr[22] == 1) {
            b22.setEnabled(true);
        }
        if (arrgr[23] == 1) {
            b23.setEnabled(true);
        }
        if (arrgr[24] == 1) {
            b24.setEnabled(true);
        }

        int i, j, k, pos;
        j = 1;
        rkn = 0;
        for (pos = 1; pos <= 24; pos++) {

            int rp1 = pos + 1;
            int rp2 = pos + 2;

            int dm3 = pos - 3;
            int dm6 = pos - 6;

            int dp3 = pos + 3;
            int dp6 = pos + 6;

            int up = pos - 1;
            int dw = pos + 1;

            int lm3 = pos - 3;
            int rp3 = pos + 3;

            int lm1 = pos - 1;
            int lm2 = pos - 2;

            if (arr[pos] == 0) {

// Computer  turn Because 2 Green side by side check and include 3 Green side by side ..... ..Down...  
                if (pos == 1) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[1];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[1];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[1];
                    jog2 += arrgr[19];
                    jog2 += arrgr[16];

                    chk += arr[1];
                    chk += arr[rp1];
                    chk += arr[rp2];

                    chk1 += arr[1];
                    chk1 += arr[dp3];
                    chk1 += arr[dp6];

                    chk2 += arr[1];
                    chk2 += arr[19];
                    chk2 += arr[16];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b1.setBackground(Color.green);
                            b4.setBackground(null);

                            eatred();
                            // human();
                            return;

                        } else if (arrgr[19] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b1.setBackground(Color.green);
                            b19.setBackground(null);
                            eatred();
                            // human();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b1.setBackground(Color.green);
                            b2.setBackground(null);
                            eatred();
                            // human();

                            return;

                        } else if (arrgr[19] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b1.setBackground(Color.green);
                            b19.setBackground(null);
                            eatred();
                            // human();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b1.setBackground(Color.green);
                            b4.setBackground(null);
                            eatred();
                            // human();

                            return;

                        } else if (arrgr[rp1] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b1.setBackground(Color.green);
                            b2.setBackground(null);
                            eatred();
                            // human();

                            return;

                        }
                    }
                } else if (pos == 2) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[2];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[2];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    chk += arr[2];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[2];
                    chk1 += arr[dp3];
                    chk1 += arr[dp6];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b2.setBackground(Color.green);
                            b5.setBackground(null);
                            eatred();

                            return;

                        }

                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b2.setBackground(Color.green);
                            b1.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b2.setBackground(Color.green);
                            b3.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 3) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[3];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[3];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[3];
                    jog2 += arrgr[18];
                    jog2 += arrgr[24];

                    chk += arr[3];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[3];
                    chk1 += arr[dp3];
                    chk1 += arr[dp6];

                    chk2 += arr[3];
                    chk2 += arr[18];
                    chk2 += arr[24];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b3.setBackground(Color.green);
                            b6.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[24] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b3.setBackground(Color.green);
                            b24.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b3.setBackground(Color.green);
                            b2.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[24] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b3.setBackground(Color.green);
                            b24.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b3.setBackground(Color.green);
                            b2.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dp3] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b3.setBackground(Color.green);
                            b6.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 4) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[4];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog1 += arrgr[4];
                    jog1 += arrgr[rp1];
                    jog1 += arrgr[rp2];

                    jog2 += arrgr[4];
                    jog2 += arrgr[13];
                    jog2 += arrgr[20];

                    chk += arr[4];
                    chk += arr[lm3];
                    chk += arr[rp3];

                    chk1 += arr[4];
                    chk1 += arr[rp1];
                    chk1 += arr[rp2];

                    chk2 += arr[4];
                    chk2 += arr[13];
                    chk2 += arr[20];

                    if (jog == chk && jog == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b4.setBackground(Color.green);
                            b5.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[20] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b4.setBackground(Color.green);
                            b20.setBackground(null);
                            eatred();

                            return;
                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b4.setBackground(Color.green);
                            b1.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[20] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b4.setBackground(Color.green);
                            b20.setBackground(null);
                            eatred();

                            return;
                        } else if (arrgr[rp3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b4.setBackground(Color.green);
                            b7.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b4.setBackground(Color.green);
                            b5.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[lm3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b4.setBackground(Color.green);
                            b1.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b4.setBackground(Color.green);
                            b7.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 5) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[5];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[5];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    chk += arr[5];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[5];
                    chk1 += arr[lm3];
                    chk1 += arr[rp3];

                    if (jog == chk && jog == 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b5.setBackground(Color.green);
                            b2.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b5.setBackground(Color.green);
                            b8.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b5.setBackground(Color.green);
                            b4.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b5.setBackground(Color.green);
                            b6.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 6) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[6];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[6];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    jog2 += arrgr[6];
                    jog2 += arrgr[23];
                    jog2 += arrgr[15];

                    chk += arr[6];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[6];
                    chk1 += arr[lm3];
                    chk1 += arr[rp3];

                    chk2 += arr[6];
                    chk2 += arr[23];
                    chk2 += arr[15];

                    if (jog == chk && jog == 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b6.setBackground(Color.green);
                            b3.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b6.setBackground(Color.green);
                            b9.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[23] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b6.setBackground(Color.green);
                            b23.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b6.setBackground(Color.green);
                            b5.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[23] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b6.setBackground(Color.green);
                            b23.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b6.setBackground(Color.green);
                            b5.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b6.setBackground(Color.green);
                            b9.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[lm3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b6.setBackground(Color.green);
                            b3.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 7) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[7];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[7];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[7];
                    jog2 += arrgr[21];
                    jog2 += arrgr[10];

                    chk += arr[7];
                    chk += arr[rp1];
                    chk += arr[rp2];

                    chk1 += arr[7];
                    chk1 += arr[dm3];
                    chk1 += arr[dm6];

                    chk2 += arr[7];
                    chk2 += arr[21];
                    chk2 += arr[10];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b7.setBackground(Color.green);
                            b4.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[21] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b7.setBackground(Color.green);
                            b21.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b7.setBackground(Color.green);
                            b8.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[21] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b7.setBackground(Color.green);
                            b21.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b7.setBackground(Color.green);
                            b8.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dm3] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b7.setBackground(Color.green);
                            b4.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 8) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[8];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[8];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    chk += arr[8];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[8];
                    chk1 += arr[dm3];
                    chk1 += arr[dm6];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b8.setBackground(Color.green);
                            b5.setBackground(null);
                            eatred();

                            return;

                        }

                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b8.setBackground(Color.green);
                            b7.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b8.setBackground(Color.green);
                            b9.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 9) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[9];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[9];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[9];
                    jog2 += arrgr[12];
                    jog2 += arrgr[22];

                    chk += arr[9];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[9];
                    chk1 += arr[dm3];
                    chk1 += arr[dm6];

                    chk2 += arr[9];
                    chk2 += arr[12];
                    chk2 += arr[22];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b9.setBackground(Color.green);
                            b6.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[22] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b9.setBackground(Color.green);
                            b22.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b9.setBackground(Color.green);
                            b8.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[22] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b9.setBackground(Color.green);
                            b22.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b9.setBackground(Color.green);
                            b8.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dm3] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b9.setBackground(Color.green);
                            b6.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 10) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[10];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[10];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[10];
                    jog2 += arrgr[21];
                    jog2 += arrgr[7];

                    chk += arr[10];
                    chk += arr[rp1];
                    chk += arr[rp2];

                    chk1 += arr[10];
                    chk1 += arr[dp3];
                    chk1 += arr[dp6];

                    chk2 += arr[10];
                    chk2 += arr[21];
                    chk2 += arr[7];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b10.setBackground(Color.green);
                            b13.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[21] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b10.setBackground(Color.green);
                            b21.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b10.setBackground(Color.green);
                            b11.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[21] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b10.setBackground(Color.green);
                            b21.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b10.setBackground(Color.green);
                            b11.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dp3] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b10.setBackground(Color.green);
                            b13.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 11) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[11];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[11];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    chk += arr[11];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[11];
                    chk1 += arr[dp3];
                    chk1 += arr[dp6];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b11.setBackground(Color.green);
                            b14.setBackground(null);
                            eatred();

                            return;

                        }

                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b11.setBackground(Color.green);
                            b10.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b11.setBackground(Color.green);
                            b12.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 12) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[12];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[12];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[12];
                    jog2 += arrgr[9];
                    jog2 += arrgr[22];

                    chk += arr[12];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[12];
                    chk1 += arr[dp3];
                    chk1 += arr[dp6];

                    chk2 += arr[12];
                    chk2 += arr[9];
                    chk2 += arr[22];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b12.setBackground(Color.green);
                            b15.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[22] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b12.setBackground(Color.green);
                            b22.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b12.setBackground(Color.green);
                            b11.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[22] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b12.setBackground(Color.green);
                            b22.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b12.setBackground(Color.green);
                            b11.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dp3] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b12.setBackground(Color.green);
                            b15.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 13) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[13];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog1 += arrgr[13];
                    jog1 += arrgr[rp1];
                    jog1 += arrgr[rp2];

                    jog2 += arrgr[13];
                    jog2 += arrgr[4];
                    jog2 += arrgr[20];

                    chk += arr[13];
                    chk += arr[lm3];
                    chk += arr[rp3];

                    chk1 += arr[13];
                    chk1 += arr[rp1];
                    chk1 += arr[rp2];

                    chk2 += arr[13];
                    chk2 += arr[4];
                    chk2 += arr[20];

                    if (jog == chk && jog == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b13.setBackground(Color.green);
                            b14.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[20] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b13.setBackground(Color.green);
                            b20.setBackground(null);
                            eatred();

                            return;
                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b13.setBackground(Color.green);
                            b10.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[20] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b13.setBackground(Color.green);
                            b20.setBackground(null);
                            eatred();

                            return;
                        } else if (arrgr[rp3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b13.setBackground(Color.green);
                            b16.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b13.setBackground(Color.green);
                            b14.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[lm3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b13.setBackground(Color.green);
                            b10.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b13.setBackground(Color.green);
                            b16.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 14) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[14];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[14];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    chk += arr[14];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[14];
                    chk1 += arr[lm3];
                    chk1 += arr[rp3];

                    if (jog == chk && jog == 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b14.setBackground(Color.green);
                            b11.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b14.setBackground(Color.green);
                            b17.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b14.setBackground(Color.green);
                            b13.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b14.setBackground(Color.green);
                            b15.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 15) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[15];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[15];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    jog2 += arrgr[15];
                    jog2 += arrgr[23];
                    jog2 += arrgr[6];

                    chk += arr[15];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[15];
                    chk1 += arr[lm3];
                    chk1 += arr[rp3];

                    chk2 += arr[15];
                    chk2 += arr[23];
                    chk2 += arr[6];

                    if (jog == chk && jog == 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b15.setBackground(Color.green);
                            b12.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b15.setBackground(Color.green);
                            b18.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[23] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b15.setBackground(Color.green);
                            b23.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b15.setBackground(Color.green);
                            b14.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[23] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b15.setBackground(Color.green);
                            b23.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b15.setBackground(Color.green);
                            b14.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[lm3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b15.setBackground(Color.green);
                            b12.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b15.setBackground(Color.green);
                            b18.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 16) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[16];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[16];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[16];
                    jog2 += arrgr[1];
                    jog2 += arrgr[19];

                    chk += arr[16];
                    chk += arr[rp1];
                    chk += arr[rp2];

                    chk1 += arr[16];
                    chk1 += arr[dm3];
                    chk1 += arr[dm6];

                    chk2 += arr[16];
                    chk2 += arr[1];
                    chk2 += arr[19];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b16.setBackground(Color.green);
                            b13.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[19] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b16.setBackground(Color.green);
                            b19.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b16.setBackground(Color.green);
                            b17.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[19] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b16.setBackground(Color.green);
                            b19.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b16.setBackground(Color.green);
                            b17.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dm3] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b16.setBackground(Color.green);
                            b13.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 17) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[17];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[17];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    chk += arr[17];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[17];
                    chk1 += arr[dm3];
                    chk1 += arr[dm6];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b17.setBackground(Color.green);
                            b14.setBackground(null);
                            eatred();

                            return;

                        }

                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b17.setBackground(Color.green);
                            b16.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b17.setBackground(Color.green);
                            b18.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 18) {
                    int jog = 0, jog1 = 0, jog2 = 0, chk = 0, chk1 = 0, chk2 = 0;

                    jog += arrgr[18];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[18];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[18];
                    jog2 += arrgr[3];
                    jog2 += arrgr[24];

                    chk += arr[18];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[18];
                    chk1 += arr[dm3];
                    chk1 += arr[dm6];

                    chk2 += arr[18];
                    chk2 += arr[3];
                    chk2 += arr[24];

                    if (jog == chk && jog == 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b18.setBackground(Color.green);
                            b15.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[24] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b18.setBackground(Color.green);
                            b24.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b18.setBackground(Color.green);
                            b17.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[24] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b18.setBackground(Color.green);
                            b24.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog2 == chk2 && jog2 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b18.setBackground(Color.green);
                            b17.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dm3] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b18.setBackground(Color.green);
                            b15.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 19) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[19];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[19];
                    jog1 += arrgr[1];
                    jog1 += arrgr[16];

                    chk += arr[19];
                    chk += arr[rp1];
                    chk += arr[rp2];

                    chk1 += arr[19];
                    chk1 += arr[1];
                    chk1 += arr[16];

                    if (jog == chk && jog == 2) {
                        if (arrgr[1] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[1] = 0;
                            arr[1] = 0;
                            b19.setBackground(Color.green);
                            b1.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[16] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[16] = 0;
                            arr[16] = 0;
                            b19.setBackground(Color.green);
                            b16.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b19.setBackground(Color.green);
                            b20.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 20) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[20];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[20];
                    jog1 += arrgr[4];
                    jog1 += arrgr[13];

                    chk += arr[20];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[20];
                    chk1 += arr[4];
                    chk1 += arr[13];

                    if (jog == chk && jog == 2) {
                        if (arrgr[4] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[4] = 0;
                            arr[4] = 0;
                            b20.setBackground(Color.green);
                            b4.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[13] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[13] = 0;
                            arr[13] = 0;
                            b20.setBackground(Color.green);
                            b13.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b20.setBackground(Color.green);
                            b19.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b20.setBackground(Color.green);
                            b21.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 21) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[21];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[21];
                    jog1 += arrgr[7];
                    jog1 += arrgr[10];

                    chk += arr[21];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[21];
                    chk1 += arr[7];
                    chk1 += arr[10];

                    if (jog == chk && jog == 2) {
                        if (arrgr[7] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[7] = 0;
                            arr[7] = 0;
                            b21.setBackground(Color.green);
                            b7.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[10] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[10] = 0;
                            arr[10] = 0;
                            b21.setBackground(Color.green);
                            b10.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b21.setBackground(Color.green);
                            b20.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 22) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[22];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[22];
                    jog1 += arrgr[9];
                    jog1 += arrgr[12];

                    chk += arr[22];
                    chk += arr[rp1];
                    chk += arr[rp2];

                    chk1 += arr[22];
                    chk1 += arr[9];
                    chk1 += arr[12];

                    if (jog == chk && jog == 2) {
                        if (arrgr[9] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[9] = 0;
                            arr[9] = 0;
                            b22.setBackground(Color.green);
                            b9.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[12] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[12] = 0;
                            arr[12] = 0;
                            b22.setBackground(Color.green);
                            b12.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b22.setBackground(Color.green);
                            b23.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 23) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[23];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[23];
                    jog1 += arrgr[6];
                    jog1 += arrgr[15];

                    chk += arr[23];
                    chk += arr[up];
                    chk += arr[dw];

                    chk1 += arr[23];
                    chk1 += arr[6];
                    chk1 += arr[15];

                    if (jog == chk && jog == 2) {
                        if (arrgr[6] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[6] = 0;
                            arr[6] = 0;
                            b23.setBackground(Color.green);
                            b6.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[15] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[15] = 0;
                            arr[15] = 0;
                            b23.setBackground(Color.green);
                            b15.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[up] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b23.setBackground(Color.green);
                            b22.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b23.setBackground(Color.green);
                            b24.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                } else if (pos == 24) {
                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;

                    jog += arrgr[24];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[24];
                    jog1 += arrgr[3];
                    jog1 += arrgr[18];

                    chk += arr[24];
                    chk += arr[lm1];
                    chk += arr[lm2];

                    chk1 += arr[24];
                    chk1 += arr[3];
                    chk1 += arr[18];

                    if (jog == chk && jog == 2) {
                        if (arrgr[3] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[3] = 0;
                            arr[3] = 0;
                            b24.setBackground(Color.green);
                            b3.setBackground(null);
                            eatred();

                            return;

                        } else if (arrgr[18] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[18] = 0;
                            arr[18] = 0;
                            b24.setBackground(Color.green);
                            b18.setBackground(null);
                            eatred();

                            return;

                        }
                    } else if (jog1 == chk1 && jog1 == 2) {
                        if (arrgr[lm1] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b24.setBackground(Color.green);
                            b23.setBackground(null);
                            eatred();

                            return;

                        }
                    }
                }
            }
        }

        if (rkn == 0) {

            System.out.println("red not eat");

            thregr = 0;

            threegr();

            if (thregr == 0) {

                System.out.println("3 green not found");

                grset = 0;

                //  red 2 check side by side and and 1 green color for 1 green and 2 red connect......
                setgr();

                if (grset == 0) {

                    System.out.println("2 red not found");

                    tgr = 0;

                    // 1 green check side by side another green and create 2 green side by side....
                    twogr();

                    if (tgr == 0) {

                        System.out.println("Green not found");

                        fargr = 0;

                        //  far green check and close 1 green to another green ........
                        fargr();

                        if (fargr == 0) {

                            System.out.println(" not found");
                            chkone = 0;
                            onestep();

                        }

                        if (chkone == 0) {

                            System.out.println(" not valid");

                        }

                    }
                }
            }
        }
    }
// computer () method for computer turn start.......UP...

    void threegr() {

        int pos;

        for (pos = 1; pos <= 24; pos++) {

            int rp1 = pos + 1;
            int rp2 = pos + 2;

            int dm3 = pos - 3;
            int dm6 = pos - 6;

            int dp3 = pos + 3;
            int dp6 = pos + 6;

            int up = pos - 1;
            int dw = pos + 1;

            int lm3 = pos - 3;
            int rp3 = pos + 3;

            int lm1 = pos - 1;
            int lm2 = pos - 2;

            if (arrgr[pos] == 1) {

// Computer  turn Because 2 Green side by side check and include 3 Green side by side ..... ..Down...  
                if (pos == 1) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[1];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[1];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[1];
                    jog2 += arrgr[19];
                    jog2 += arrgr[16];

                    if (jog == 3) {
                        if ((ared[dp3] == 0 && ared[19] == 0) && (arr[4] == 0)) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b4.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if ((ared[dp3] == 0 && ared[19] == 0) && (arr[19] == 0)) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[19] = 1;
                            arr[19] = 1;
                            b19.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if ((ared[rp1] == 0 && ared[19] == 0) && (arr[19] == 0)) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[19] = 1;
                            arr[19] = 1;
                            b19.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if ((ared[rp1] == 0 && ared[19] == 0) && (arr[2] == 0)) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[2] = 1;
                            arr[2] = 1;
                            b2.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if ((ared[dp3] == 0 && ared[rp1] == 0) && (arr[4] == 0)) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b4.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if ((ared[dp3] == 0 && ared[rp1] == 0) && (arr[2] == 0)) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[2] = 1;
                            arr[2] = 1;
                            b2.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 2) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[2];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[2];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    if (jog == 3) {
                        if (arr[dp3] == 0) {
                            arrgr[2] = 0;
                            arr[2] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b5.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if ((ared[up] == 0 && ared[dw] == 0) && arr[1] == 0) {
                            arrgr[2] = 0;
                            arr[2] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b1.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            thregr = 1;
                            return;
                        } else if ((ared[up] == 0 && ared[dw] == 0) && arr[3] == 0) {
                            arrgr[2] = 0;
                            arr[2] = 0;
                            arrgr[3] = 1;
                            arr[3] = 1;
                            b3.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 3) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[3];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[3];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[3];
                    jog2 += arrgr[18];
                    jog2 += arrgr[24];

                    if (jog == 3) {
                        if (ared[dp3] == 0 && ared[24] == 0 && arr[6] == 0) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b6.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            thregr = 1;
                            return;

                        } else if (ared[dp3] == 0 && ared[24] == 0 && arr[24] == 0) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[24] = 1;
                            arr[24] = 1;
                            b24.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm1] == 0 && ared[24] == 0 && arr[24] == 0) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[24] = 1;
                            arr[24] = 1;
                            b24.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[lm1] == 0 && ared[24] == 0 && arr[2] == 0) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[2] = 1;
                            arr[2] = 1;
                            b2.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        }
                    } else if (jog2 == 3) {
                        if (ared[lm1] == 0 && ared[dp3] == 0 && arr[2] == 0) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b2.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[dp3] == 0 && arr[6] == 0) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[6] = 1;
                            arr[6] = 1;
                            b6.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 4) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[4];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog1 += arrgr[4];
                    jog1 += arrgr[rp1];
                    jog1 += arrgr[rp2];

                    jog2 += arrgr[4];
                    jog2 += arrgr[13];
                    jog2 += arrgr[20];

                    if (jog == 3) {
                        if (ared[rp1] == 0 && ared[20] == 0 && arr[5] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b5.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[rp1] == 0 && ared[20] == 0 && arr[20] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[20] = 1;
                            arr[20] = 1;
                            b20.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm3] == 0 && ared[20] == 0 && ared[7] == 0 && arr[1] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[lm3] = 1;
                            arr[lm3] = 1;
                            b1.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm3] == 0 && ared[20] == 0 && ared[7] == 0 && arr[20] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[20] = 1;
                            arr[20] = 1;
                            b20.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[lm3] == 0 && ared[20] == 0 && ared[7] == 0 && arr[7] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[7] = 1;
                            arr[7] = 1;
                            b7.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[rp1] == 0 && ared[1] == 0 && ared[7] == 0 && arr[7] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[7] = 1;
                            arr[7] = 1;
                            b7.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[rp1] == 0 && ared[1] == 0 && ared[7] == 0 && arr[1] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[1] = 1;
                            arr[1] = 1;
                            b1.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[rp1] == 0 && ared[1] == 0 && ared[7] == 0 && arr[5] == 0) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[5] = 1;
                            arr[5] = 1;
                            b5.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 5) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[5];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[5];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    if (jog == 3) {
                        if (ared[lm3] == 0 && ared[8] == 0 && arr[2] == 0) {
                            arrgr[5] = 0;
                            arr[5] = 0;
                            arrgr[lm3] = 1;
                            arr[lm3] = 1;
                            b2.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm3] == 0 && ared[8] == 0 && arr[8] == 0) {
                            arrgr[5] = 0;
                            arr[5] = 0;
                            arrgr[8] = 1;
                            arr[8] = 1;
                            b8.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[up] == 0 && ared[dw] == 0 && arr[4] == 0) {
                            arrgr[5] = 0;
                            arr[5] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b4.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[up] == 0 && ared[dw] == 0 && arr[6] == 0) {
                            arrgr[5] = 0;
                            arr[5] = 0;
                            arrgr[6] = 1;
                            arr[6] = 1;
                            b6.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 6) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[6];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[6];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    jog2 += arrgr[6];
                    jog2 += arrgr[23];
                    jog2 += arrgr[15];

                    if (jog == 3) {
                        if (ared[lm3] == 0 && ared[9] == 0 && ared[23] == 0 && arr[3] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[lm3] = 1;
                            arr[lm3] = 1;
                            b3.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[lm3] == 0 && ared[9] == 0 && ared[23] == 0 && arr[9] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[9] = 1;
                            arr[9] = 1;
                            b9.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm3] == 0 && ared[9] == 0 && ared[23] == 0 && arr[23] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[23] = 1;
                            arr[23] = 1;
                            b23.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm1] == 0 && ared[23] == 0 && arr[5] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b5.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[23] == 0 && arr[23] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[23] = 1;
                            arr[23] = 1;
                            b23.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[lm1] == 0 && ared[9] == 0 && ared[3] == 0 && arr[9] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[9] = 1;
                            arr[9] = 1;
                            b9.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[9] == 0 && ared[3] == 0 && arr[5] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[5] = 1;
                            arr[5] = 1;
                            b5.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[9] == 0 && ared[3] == 0 && arr[3] == 0) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[3] = 1;
                            arr[3] = 1;
                            b3.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 7) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[7];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[7];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[7];
                    jog2 += arrgr[21];
                    jog2 += arrgr[10];

                    if (jog == 3) {
                        if (ared[dm3] == 0 && ared[21] == 0 && arr[4] == 0) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b4.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[dm3] == 0 && ared[21] == 0 && arr[21] == 0) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[21] = 1;
                            arr[21] = 1;
                            b21.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[rp1] == 0 && ared[21] == 0 && arr[8] == 0) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b8.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[rp1] == 0 && ared[21] == 0 && arr[21] == 0) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[21] = 1;
                            arr[21] = 1;
                            b21.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[rp1] == 0 && ared[4] == 0 && arr[8] == 0) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b8.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[rp1] == 0 && ared[4] == 0 && arr[4] == 0) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[4] = 1;
                            arr[4] = 1;
                            b4.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 8) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[8];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[8];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    if (jog == 3) {
                        if (arr[dm3] == 0) {
                            arrgr[8] = 0;
                            arr[8] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b5.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[up] == 0 && ared[dw] == 0 && arr[7] == 0) {
                            arrgr[8] = 0;
                            arr[8] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b7.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[up] == 0 && ared[dw] == 0 && arr[9] == 0) {
                            arrgr[8] = 0;
                            arr[8] = 0;
                            arrgr[9] = 1;
                            arr[9] = 1;
                            b9.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 9) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[9];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[9];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[9];
                    jog2 += arrgr[12];
                    jog2 += arrgr[22];

                    if (jog == 3) {
                        if ((ared[dm3] == 0 && ared[22] == 0) && arr[6] == 0) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b6.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if ((ared[dm3] == 0 && ared[22] == 0) && arr[22] == 0) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[22] = 1;
                            arr[22] = 1;
                            b22.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm1] == 0 && ared[22] == 0 && arr[8] == 0) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b8.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[22] == 0 && arr[22] == 0) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[22] = 1;
                            arr[22] = 1;
                            b22.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[lm1] == 0 && ared[6] == 0 && arr[8] == 0) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b8.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[6] == 0 && arr[6] == 0) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[6] = 1;
                            arr[6] = 1;
                            b6.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 10) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[10];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[10];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[10];
                    jog2 += arrgr[21];
                    jog2 += arrgr[7];

                    if (jog == 3) {
                        if (ared[dp3] == 0 && ared[21] == 0 && arr[13] == 0) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b13.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[dp3] == 0 && ared[21] == 0 && arr[21] == 0) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[21] = 1;
                            arr[21] = 1;
                            b21.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[rp1] == 0 && ared[21] == 0 && arr[11] == 0) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b11.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[rp1] == 0 && ared[21] == 0 && arr[21] == 0) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[21] = 1;
                            arr[21] = 1;
                            b21.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[rp1] == 0 && ared[13] == 0 && arr[11] == 0) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b11.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[rp1] == 0 && ared[13] == 0 && arr[13] == 0) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[13] = 1;
                            arr[13] = 1;
                            b13.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 11) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[11];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[11];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    if (jog == 3) {
                        if (arr[dp3] == 0) {
                            arrgr[11] = 0;
                            arr[11] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b14.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }

                    } else if (jog1 == 3) {
                        if (ared[up] == 0 && ared[dw] == 0 && arr[up] == 0) {
                            arrgr[11] = 0;
                            arr[11] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b10.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[up] == 0 && ared[dw] == 0 && arr[12] == 0) {
                            arrgr[11] = 0;
                            arr[11] = 0;
                            arrgr[12] = 1;
                            arr[12] = 1;
                            b12.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 12) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[12];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[12];
                    jog1 += arrgr[dp3];
                    jog1 += arrgr[dp6];

                    jog2 += arrgr[12];
                    jog2 += arrgr[9];
                    jog2 += arrgr[22];

                    if (jog == 3) {
                        if (ared[dp3] == 0 && ared[22] == 0 && arr[15] == 0) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b15.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[dp3] == 0 && ared[22] == 0 && arr[22] == 0) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[22] = 1;
                            arr[22] = 1;
                            b22.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm1] == 0 && ared[22] == 0 && arr[11] == 0) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b11.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[22] == 0 && arr[22] == 0) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[22] = 1;
                            arr[22] = 1;
                            b22.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        }
                    } else if (jog2 == 3) {
                        if (ared[lm1] == 0 && ared[15] == 0 && arr[11] == 0) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b11.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[lm1] == 0 && ared[15] == 0 && arr[15] == 0) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[15] = 1;
                            arr[15] = 1;
                            b15.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 13) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[13];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog1 += arrgr[13];
                    jog1 += arrgr[rp1];
                    jog1 += arrgr[rp2];

                    jog2 += arrgr[13];
                    jog2 += arrgr[4];
                    jog2 += arrgr[20];

                    if (jog == 3) {
                        if (ared[rp1] == 0 && ared[20] == 0 && arr[14] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b14.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[rp1] == 0 && ared[20] == 0 && arr[20] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[20] = 1;
                            arr[20] = 1;
                            b20.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm3] == 0 && ared[20] == 0 && ared[16] == 0 && arr[10] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[lm3] = 1;
                            arr[lm3] = 1;
                            b10.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm3] == 0 && ared[20] == 0 && ared[16] == 0 && arr[20] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[20] = 1;
                            arr[20] = 1;
                            b20.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[lm3] == 0 && ared[20] == 0 && ared[16] == 0 && arr[16] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[16] = 1;
                            arr[16] = 1;
                            b16.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[rp1] == 0 && ared[10] == 0 && ared[16] == 0 && arr[14] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b14.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[rp1] == 0 && ared[10] == 0 && ared[16] == 0 && arr[10] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[10] = 1;
                            arr[10] = 1;
                            b10.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[rp1] == 0 && ared[10] == 0 && ared[16] == 0 && arr[16] == 0) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[16] = 1;
                            arr[16] = 1;
                            b16.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 14) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[14];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[14];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    if (jog == 3) {
                        if (ared[lm3] == 0 && ared[17] == 0 && arr[11] == 0) {
                            arrgr[14] = 0;
                            arr[14] = 0;
                            arrgr[lm3] = 1;
                            arr[lm3] = 1;
                            b11.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm3] == 0 && ared[17] == 0 && arr[17] == 0) {
                            arrgr[14] = 0;
                            arr[14] = 0;
                            arrgr[17] = 1;
                            arr[17] = 1;
                            b17.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        }
                    } else if (jog1 == 3) {
                        if (ared[up] == 0 && ared[dw] == 0 && arr[13] == 0) {
                            arrgr[14] = 0;
                            arr[14] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b13.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[up] == 0 && ared[dw] == 0 && arr[15] == 0) {
                            arrgr[14] = 0;
                            arr[14] = 0;
                            arrgr[15] = 1;
                            arr[15] = 1;
                            b15.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 15) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[15];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[15];
                    jog1 += arrgr[lm3];
                    jog1 += arrgr[rp3];

                    jog2 += arrgr[15];
                    jog2 += arrgr[23];
                    jog2 += arrgr[6];

                    if (jog == 3) {
                        if (ared[lm3] == 0 && ared[18] == 0 && ared[23] == 0 && arr[12] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[lm3] = 1;
                            arr[lm3] = 1;
                            b12.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[lm3] == 0 && ared[18] == 0 && ared[23] == 0 && arr[18] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[18] = 1;
                            arr[18] = 1;
                            b18.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm3] == 0 && ared[18] == 0 && ared[23] == 0 && arr[23] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[23] = 1;
                            arr[23] = 1;
                            b23.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm1] == 0 && ared[23] == 0 && arr[14] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b14.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[23] == 0 && arr[23] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b23.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[lm1] == 0 && ared[12] == 0 && ared[18] == 0 && arr[14] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b14.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[12] == 0 && ared[18] == 0 && arr[12] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[12] = 1;
                            arr[12] = 1;
                            b12.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[12] == 0 && ared[18] == 0 && arr[18] == 0) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[18] = 1;
                            arr[18] = 1;
                            b18.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 16) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[16];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[16];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[16];
                    jog2 += arrgr[1];
                    jog2 += arrgr[19];

                    if (jog == 3) {
                        if (ared[dm3] == 0 && ared[19] == 0 && arr[13] == 0) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b13.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[dm3] == 0 && ared[19] == 0 && arr[19] == 0) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[19] = 1;
                            arr[19] = 1;
                            b19.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[rp1] == 0 && ared[19] == 0 && arr[17] == 0) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b17.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[rp1] == 0 && ared[19] == 0 && arr[19] == 0) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[19] = 1;
                            arr[19] = 1;
                            b19.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[rp1] == 0 && ared[13] == 0 && arr[17] == 0) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b17.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[rp1] == 0 && ared[13] == 0 && arr[13] == 0) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[13] = 1;
                            arr[13] = 1;
                            b13.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 17) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[17];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[17];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    if (jog == 3) {
                        if (arr[dm3] == 0) {
                            arrgr[17] = 0;
                            arr[17] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b14.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }

                    } else if (jog1 == 3) {
                        if (ared[up] == 0 && ared[18] == 0 && arr[16] == 0) {
                            arrgr[17] = 0;
                            arr[17] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b16.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[up] == 0 && ared[18] == 0 && arr[18] == 0) {
                            arrgr[17] = 0;
                            arr[17] = 0;
                            arrgr[18] = 1;
                            arr[18] = 1;
                            b18.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 18) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[18];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[18];
                    jog1 += arrgr[dm3];
                    jog1 += arrgr[dm6];

                    jog2 += arrgr[18];
                    jog2 += arrgr[3];
                    jog2 += arrgr[24];

                    if (jog == 3) {
                        if (ared[dm3] == 0 && ared[24] == 0 && arr[15] == 0) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b15.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[dm3] == 0 && ared[24] == 0 && arr[24] == 0) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[24] = 1;
                            arr[24] = 1;
                            b24.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[lm1] == 0 && ared[24] == 0 && arr[17] == 0) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b17.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[lm1] == 0 && ared[24] == 0 && arr[24] == 0) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[24] = 1;
                            arr[24] = 1;
                            b24.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog2 == 3) {
                        if (ared[lm1] == 0 && ared[15] == 0 && arr[17] == 0) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b17.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[lm1] == 0 && ared[15] == 0 && arr[15] == 0) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[15] = 1;
                            arr[15] = 1;
                            b15.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 19) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[19];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[19];
                    jog1 += arrgr[1];
                    jog1 += arrgr[16];

                    if (jog == 3) {
                        if (ared[1] == 0 && ared[16] == 0 && arr[1] == 0) {
                            arrgr[19] = 0;
                            arr[19] = 0;
                            arrgr[1] = 1;
                            arr[1] = 1;
                            b1.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[1] == 0 && ared[16] == 0 && arr[16] == 0) {
                            arrgr[19] = 0;
                            arr[19] = 0;
                            arrgr[16] = 1;
                            arr[16] = 1;
                            b16.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (arr[rp1] == 0) {
                            arrgr[19] = 0;
                            arr[19] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b20.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 20) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[20];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[20];
                    jog1 += arrgr[4];
                    jog1 += arrgr[13];

                    if (jog == 3) {
                        if (ared[4] == 0 && ared[13] == 0 && arr[4] == 0) {
                            arrgr[20] = 0;
                            arr[20] = 0;
                            arrgr[4] = 1;
                            arr[4] = 1;
                            b4.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[4] == 0 && ared[13] == 0 && arr[13] == 0) {
                            arrgr[20] = 0;
                            arr[20] = 0;
                            arrgr[13] = 1;
                            arr[13] = 1;
                            b13.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[up] == 0 && ared[21] == 0 && arr[19] == 0) {
                            arrgr[20] = 0;
                            arr[20] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b19.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[up] == 0 && ared[21] == 0 && arr[21] == 0) {
                            arrgr[20] = 0;
                            arr[20] = 0;
                            arrgr[21] = 1;
                            arr[21] = 1;
                            b21.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 21) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[21];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[21];
                    jog1 += arrgr[7];
                    jog1 += arrgr[10];

                    if (jog == 3) {
                        if (ared[7] == 0 && ared[10] == 0 && arr[7] == 0) {
                            arrgr[21] = 0;
                            arr[21] = 0;
                            arrgr[7] = 1;
                            arr[7] = 1;
                            b7.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[7] == 0 && ared[10] == 0 && arr[10] == 0) {
                            arrgr[21] = 0;
                            arr[21] = 0;
                            arrgr[10] = 1;
                            arr[10] = 1;
                            b10.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (arr[lm1] == 0) {
                            arrgr[21] = 0;
                            arr[21] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b20.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 22) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[22];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog1 += arrgr[22];
                    jog1 += arrgr[9];
                    jog1 += arrgr[12];

                    if (jog == 3) {
                        if (ared[9] == 0 && ared[12] == 0 && arr[9] == 0) {
                            arrgr[22] = 0;
                            arr[22] = 0;
                            arrgr[9] = 1;
                            arr[9] = 1;
                            b9.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[9] == 0 && ared[12] == 0 && arr[12] == 0) {
                            arrgr[22] = 0;
                            arr[22] = 0;
                            arrgr[12] = 1;
                            arr[12] = 1;
                            b12.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (arr[rp1] == 0) {
                            arrgr[22] = 0;
                            arr[22] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b23.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 23) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[23];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog1 += arrgr[23];
                    jog1 += arrgr[6];
                    jog1 += arrgr[15];

                    if (jog == 3) {
                        if (ared[6] == 0 && ared[15] == 0 && arr[6] == 0) {
                            arrgr[23] = 0;
                            arr[23] = 0;
                            arrgr[6] = 1;
                            arr[6] = 1;
                            b6.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        } else if (ared[6] == 0 && ared[15] == 0 && arr[15] == 0) {
                            arrgr[23] = 0;
                            arr[23] = 0;
                            arrgr[15] = 1;
                            arr[15] = 1;
                            b15.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (ared[up] == 0 && ared[24] == 0 && arr[22] == 0) {
                            arrgr[23] = 0;
                            arr[23] = 0;
                            arrgr[up] = 1;
                            arr[up] = 1;
                            b22.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[up] == 0 && ared[24] == 0 && arr[24] == 0) {
                            arrgr[23] = 0;
                            arr[23] = 0;
                            arrgr[24] = 1;
                            arr[24] = 1;
                            b24.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    }
                } else if (pos == 24) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[24];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog1 += arrgr[24];
                    jog1 += arrgr[3];
                    jog1 += arrgr[18];

                    if (jog == 3) {
                        if (ared[3] == 0 && ared[18] == 0 && arr[3] == 0) {
                            arrgr[24] = 0;
                            arr[24] = 0;
                            arrgr[3] = 1;
                            arr[3] = 1;
                            b3.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        } else if (ared[3] == 0 && ared[18] == 0 && arr[18] == 0) {
                            arrgr[24] = 0;
                            arr[24] = 0;
                            arrgr[18] = 1;
                            arr[18] = 1;
                            b18.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;
                        }
                    } else if (jog1 == 3) {
                        if (arr[lm1] == 0) {
                            arrgr[24] = 0;
                            arr[24] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b23.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            thregr = 1;

                            return;

                        }
                    }
                }
            }
        }
    }

    void fargr() {

        int pos;

        for (pos = 1; pos <= 24; pos++) {

            int rp1 = pos + 1;
            int rp2 = pos + 2;

            int dm3 = pos - 3;
            int dm6 = pos - 6;

            int dp3 = pos + 3;
            int dp6 = pos + 6;

            int up = pos - 1;
            int dw = pos + 1;

            int lm3 = pos - 3;
            int rp3 = pos + 3;

            int lm1 = pos - 1;
            int lm2 = pos - 2;

            if (arr[pos] == 0) {

// Computer  turn Because  Green side by side check and include Green side by side ..... ..Down...  
                if (pos == 1) {
                    int jog = 0;

                    jog += arrgr[1];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[dp3];
                    jog += arrgr[dp6];

                    jog += arrgr[19];
                    jog += arrgr[16];

                    if (jog >= 2) {

                        if (arr[dp3] == 0 && arrgr[dp6] == 1) {

                            arr[dp3] = 1;
                            arrgr[dp3] = 1;
                            arr[dp6] = 0;
                            arrgr[dp6] = 0;

                            b4.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arr[19] == 0 && arrgr[16] == 1) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[19] = 1;
                            arr[19] = 1;
                            b19.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arr[rp1] == 0 && arrgr[3] == 1) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b2.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[19] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b1.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[dp3] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b1.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[rp1] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b1.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        }
                    }
                } else if (pos == 2) {
                    int jog = 0;

                    jog += arrgr[2];
                    jog += arrgr[up];
                    jog += arrgr[dw];
                    jog += arrgr[dp3];
                    jog += arrgr[dp6];

                    if (jog >= 2) {
                        if (arr[dp3] == 0 && arrgr[dp6] == 1) {
                            arrgr[8] = 0;
                            arr[8] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b5.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b2.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b2.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 3) {
                    int jog = 0;

                    jog += arrgr[3];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[dp3];
                    jog += arrgr[dp6];

                    jog += arrgr[18];
                    jog += arrgr[24];

                    if (jog >= 2) {
                        if (arr[dp3] == 0 && arrgr[9] == 1) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b6.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arr[24] == 0 && arrgr[18] == 1) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[24] = 1;
                            arr[24] = 1;
                            b24.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arr[lm1] == 0 && arrgr[1] == 1) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b2.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[24] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b3.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b3.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[dp3] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b3.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        }
                    }
                } else if (pos == 4) {
                    int jog = 0;

                    jog += arrgr[4];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[13];
                    jog += arrgr[20];

                    if (jog >= 2) {
                        if (arr[rp1] == 0 && arrgr[6] == 1) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b5.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arr[20] == 0 && arrgr[13] == 1) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[20] = 1;
                            arr[20] = 1;
                            b20.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[lm3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b4.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[20] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b4.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[rp3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b4.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        }
                        if (arrgr[rp1] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b4.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        }
                    }
                } //                } else if (pos == 5) {
                //                    int jog = 0;
                //
                //                    jog += arrgr[5];
                //                    jog += arrgr[up];
                //                    jog += arrgr[dw];
                //
                //                    jog1 += arrgr[5];
                //                    jog1 += arrgr[lm3];
                //                    jog1 += arrgr[rp3];
                //
                //                    if (jog == chk && jog == 2) {
                //                        if (arrgr[lm3] == 1) {
                //                            arrgr[5] = 1;
                //                            arr[5] = 1;
                //                            arrgr[lm3] = 0;
                //                            arr[lm3] = 0;
                //                            b5.setBackground(Color.green);
                //                            b2.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        } else if (arrgr[rp3] == 1) {
                //                            arrgr[5] = 1;
                //                            arr[5] = 1;
                //                            arrgr[rp3] = 0;
                //                            arr[rp3] = 0;
                //                            b5.setBackground(Color.green);
                //                            b8.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        }
                //                    } else if (jog1 == chk1 && jog1 == 2) {
                //                        if (arrgr[up] == 1) {
                //                            arrgr[5] = 1;
                //                            arr[5] = 1;
                //                            arrgr[up] = 0;
                //                            arr[up] = 0;
                //                            b5.setBackground(Color.green);
                //                            b4.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        } else if (arrgr[dw] == 1) {
                //                            arrgr[5] = 1;
                //                            arr[5] = 1;
                //                            arrgr[dw] = 0;
                //                            arr[dw] = 0;
                //                            b5.setBackground(Color.green);
                //                            b6.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        }
                //                    }
                else if (pos == 6) {
                    int jog = 0;

                    jog += arrgr[6];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog += arrgr[23];
                    jog += arrgr[15];

                    if (jog >= 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b6.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b6.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[23] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b6.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b6.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[23] == 0 && arrgr[15] == 1) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[23] = 1;
                            arr[23] = 1;
                            b23.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[lm1] == 0 && arrgr[4] == 1) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b5.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 7) {
                    int jog = 0;

                    jog += arrgr[7];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[dm3];
                    jog += arrgr[dm6];

                    jog += arrgr[21];
                    jog += arrgr[10];

                    if (jog >= 2) {
                        if (arr[dm3] == 0 && arrgr[1] == 1) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b4.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[21] == 0 && arrgr[10] == 1) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[21] = 1;
                            arr[21] = 1;
                            b21.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[rp1] == 0 && arrgr[9] == 1) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b8.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[21] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b7.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[rp1] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b7.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dm3] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b7.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 8) {
                    int jog = 0;

                    jog += arrgr[8];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog += arrgr[dm3];
                    jog += arrgr[dm6];

                    if (jog >= 2) {
                        if (arr[dm3] == 0 && arrgr[2] == 1) {
                            arrgr[2] = 0;
                            arr[2] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b5.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[up] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b8.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dw] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b8.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 9) {
                    int jog = 0;

                    jog += arrgr[9];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[dm3];
                    jog += arrgr[dm6];

                    jog += arrgr[12];
                    jog += arrgr[22];

                    if (jog >= 2) {
                        if (arr[dm3] == 0 && arrgr[3] == 1) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b6.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[22] == 0 && arrgr[12] == 1) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[22] = 1;
                            arr[22] = 1;
                            b22.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[lm1] == 0 && arrgr[7] == 1) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b8.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[22] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b9.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[lm1] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b9.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dm3] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b9.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 10) {
                    int jog = 0;

                    jog += arrgr[10];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[dp3];
                    jog += arrgr[dp6];

                    jog += arrgr[21];
                    jog += arrgr[7];

                    if (jog >= 2) {
                        if (arr[dp3] == 0 && arrgr[16] == 1) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b13.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[21] == 0 && arrgr[7] == 1) {
                            arrgr[7] = 0;
                            arr[7] = 0;
                            arrgr[21] = 1;
                            arr[21] = 1;
                            b21.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[rp1] == 0 && arrgr[12] == 1) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b11.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[21] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b10.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[rp1] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b10.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dp3] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b10.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 11) {
                    int jog = 0;

                    jog += arrgr[11];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog += arrgr[dp3];
                    jog += arrgr[dp6];

                    if (jog >= 2) {
                        if (arr[dp3] == 0 && arrgr[17] == 1) {
                            arrgr[17] = 0;
                            arr[17] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b14.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[up] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b11.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dw] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b11.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 12) {
                    int jog = 0;

                    jog += arrgr[12];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[dp3];
                    jog += arrgr[dp6];

                    jog += arrgr[9];
                    jog += arrgr[22];

                    if (jog >= 2) {
                        if (arr[dp3] == 0 && arrgr[18] == 1) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[dp3] = 1;
                            arr[dp3] = 1;
                            b15.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[22] == 0 && arrgr[9] == 1) {
                            arrgr[9] = 0;
                            arr[9] = 0;
                            arrgr[22] = 1;
                            arr[22] = 1;
                            b22.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[lm1] == 0 && arrgr[10] == 1) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b11.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[22] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b12.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[lm1] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b12.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dp3] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b12.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 13) {
                    int jog = 0;

                    jog += arrgr[13];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[4];
                    jog += arrgr[20];

                    if (jog >= 2) {
                        if (arr[rp1] == 0 && arrgr[15] == 1) {
                            arrgr[15] = 0;
                            arr[15] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b14.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[20] == 0 && arrgr[4] == 1) {
                            arrgr[4] = 0;
                            arr[4] = 0;
                            arrgr[20] = 1;
                            arr[20] = 1;
                            b20.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[lm3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b13.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[20] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b13.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[rp3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b13.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[rp1] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b13.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } //                else if (pos == 14) {
                //                    int jog = 0;
                //
                //                    jog += arrgr[14];
                //                    jog += arrgr[up];
                //                    jog += arrgr[dw];
                //
                //                    jog += arrgr[lm3];
                //                    jog += arrgr[rp3];
                //
                //
                //                    if (jog >= 2) {
                //                        if (arrgr[lm3] == 1) {
                //                            arrgr[14] = 1;
                //                            arr[14] = 1;
                //                            arrgr[lm3] = 0;
                //                            arr[lm3] = 0;
                //                            b14.setBackground(Color.green);
                //                            b11.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        } else if (arrgr[rp3] == 1) {
                //                            arrgr[14] = 1;
                //                            arr[14] = 1;
                //                            arrgr[rp3] = 0;
                //                            arr[rp3] = 0;
                //                            b14.setBackground(Color.green);
                //                            b17.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        }
                //                     else
                //                        if (arrgr[up] == 1) {
                //                            arrgr[14] = 1;
                //                            arr[14] = 1;
                //                            arrgr[up] = 0;
                //                            arr[up] = 0;
                //                            b14.setBackground(Color.green);
                //                            b13.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        } else if (arrgr[dw] == 1) {
                //                            arrgr[14] = 1;
                //                            arr[14] = 1;
                //                            arrgr[dw] = 0;
                //                            arr[dw] = 0;
                //                            b14.setBackground(Color.green);
                //                            b15.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        }
                //                    }
                //                } 
                else if (pos == 15) {
                    int jog = 0;

                    jog += arrgr[15];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    jog += arrgr[23];
                    jog += arrgr[6];

                    if (jog >= 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b15.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[rp3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b15.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[23] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b15.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[lm1] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b15.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[23] == 0 && arrgr[6] == 1) {
                            arrgr[6] = 0;
                            arr[6] = 0;
                            arrgr[23] = 1;
                            arr[23] = 1;
                            b23.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[lm1] == 0 && arrgr[13] == 1) {
                            arrgr[13] = 0;
                            arr[13] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b14.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 16) {
                    int jog = 0;

                    jog += arrgr[16];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[dm3];
                    jog += arrgr[dm6];

                    jog += arrgr[1];
                    jog += arrgr[19];

                    if (jog >= 2) {
                        if (arr[dm3] == 0 && arrgr[10] == 1) {
                            arrgr[10] = 0;
                            arr[10] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b13.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[19] == 0 && arrgr[1] == 1) {
                            arrgr[1] = 0;
                            arr[1] = 0;
                            arrgr[19] = 1;
                            arr[19] = 1;
                            b19.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[rp1] == 0 && arrgr[18] == 1) {
                            arrgr[18] = 0;
                            arr[18] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b17.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[19] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b16.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[rp1] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b16.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dm3] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b16.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 17) {
                    int jog = 0;

                    jog += arrgr[17];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog += arrgr[dm3];
                    jog += arrgr[dm6];

                    if (jog >= 2) {
                        if (arr[dm3] == 0 && arrgr[11] == 1) {
                            arrgr[11] = 0;
                            arr[11] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b14.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[up] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b17.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dw] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b17.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 18) {
                    int jog = 0;

                    jog += arrgr[18];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[dm3];
                    jog += arrgr[dm6];

                    jog += arrgr[3];
                    jog += arrgr[24];

                    if (jog >= 2) {
                        if (arr[dm3] == 0 && arrgr[12] == 1) {
                            arrgr[12] = 0;
                            arr[12] = 0;
                            arrgr[dm3] = 1;
                            arr[dm3] = 1;
                            b15.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[24] == 0 && arrgr[3] == 1) {
                            arrgr[3] = 0;
                            arr[3] = 0;
                            arrgr[24] = 1;
                            arr[24] = 1;
                            b24.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[lm1] == 0 && arrgr[16] == 1) {
                            arrgr[16] = 0;
                            arr[16] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b17.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[24] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b18.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[lm1] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b18.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[dm3] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b18.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 19) {
                    int jog = 0;

                    jog += arrgr[19];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[1];
                    jog += arrgr[16];

                    if (jog >= 2) {
                        if (arrgr[1] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[1] = 0;
                            arr[1] = 0;
                            b19.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[16] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[16] = 0;
                            arr[16] = 0;
                            b19.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;

                        } else if (arr[rp1] == 0 && arrgr[21] == 1) {
                            arrgr[21] = 0;
                            arr[21] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b20.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } //                } else if (pos == 20) {
                //                    int jog = 0, jog1 = 0, chk = 0, chk1 = 0;
                //
                //                    jog += arrgr[20];
                //                    jog += arrgr[up];
                //                    jog += arrgr[dw];
                //
                //                    jog1 += arrgr[20];
                //                    jog1 += arrgr[4];
                //                    jog1 += arrgr[13];
                //
                //                    chk += arr[20];
                //                    chk += arr[up];
                //                    chk += arr[dw];
                //
                //                    chk1 += arr[20];
                //                    chk1 += arr[4];
                //                    chk1 += arr[13];
                //
                //                    if (jog == chk && jog == 2) {
                //                        if (arrgr[4] == 1) {
                //                            arrgr[20] = 1;
                //                            arr[20] = 1;
                //                            arrgr[4] = 0;
                //                            arr[4] = 0;
                //                            b20.setBackground(Color.green);
                //                            b4.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        } else if (arrgr[13] == 1) {
                //                            arrgr[20] = 1;
                //                            arr[20] = 1;
                //                            arrgr[13] = 0;
                //                            arr[13] = 0;
                //                            b20.setBackground(Color.green);
                //                            b13.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        }
                //                    } else if (jog1 == chk1 && jog1 == 2) {
                //                        if (arrgr[up] == 1) {
                //                            arrgr[20] = 1;
                //                            arr[20] = 1;
                //                            arrgr[up] = 0;
                //                            arr[up] = 0;
                //                            b20.setBackground(Color.green);
                //                            b19.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        } else if (arrgr[dw] == 1) {
                //                            arrgr[20] = 1;
                //                            arr[20] = 1;
                //                            arrgr[dw] = 0;
                //                            arr[dw] = 0;
                //                            b20.setBackground(Color.green);
                //                            b21.setBackground(null);
                //                            eatred();
                //
                //                            return;
                //
                //                        }
                //                    }
                //                } 
                else if (pos == 21) {
                    int jog = 0;

                    jog += arrgr[21];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[7];
                    jog += arrgr[10];

                    if (jog >= 2) {
                        if (arrgr[7] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[7] = 0;
                            arr[7] = 0;
                            b21.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[10] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[10] = 0;
                            arr[10] = 0;
                            b21.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[lm1] == 0 && arrgr[19] == 1) {
                            arrgr[19] = 0;
                            arr[19] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b20.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } else if (pos == 22) {
                    int jog = 0;

                    jog += arrgr[22];
                    jog += arrgr[rp1];
                    jog += arrgr[rp2];

                    jog += arrgr[9];
                    jog += arrgr[12];

                    if (jog >= 2) {
                        if (arrgr[9] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[9] = 0;
                            arr[9] = 0;
                            b22.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[12] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[12] = 0;
                            arr[12] = 0;
                            b22.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[rp1] == 0 && arrgr[24] == 1) {
                            arrgr[24] = 0;
                            arr[24] = 0;
                            arrgr[rp1] = 1;
                            arr[rp1] = 1;
                            b23.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                } 
                else if (pos == 24) {
                    int jog = 0;

                    jog += arrgr[24];
                    jog += arrgr[lm1];
                    jog += arrgr[lm2];

                    jog += arrgr[3];
                    jog += arrgr[18];

                    if (jog >= 2) {
                        if (arrgr[3] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[3] = 0;
                            arr[3] = 0;
                            b24.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arrgr[18] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[18] = 0;
                            arr[18] = 0;
                            b24.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        } else if (arr[lm1] == 0 && arrgr[22] == 1) {
                            arrgr[22] = 0;
                            arr[22] = 0;
                            arrgr[lm1] = 1;
                            arr[lm1] = 1;
                            b23.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            fargr = 1;

                            return;
                        }
                    }
                }
            }
        }
    }

    void onestep() {

        int pos;

        for (pos = 1; pos <= 24; pos++) {

            if (arrgr[pos] == 1 && arr[pos] == 1) {

// Computer turn for one step moving 
                if (pos == 1) {
                    if (arr[2] == 0) {
                        arr[2] = 1;
                        arrgr[2] = 1;
                        arr[1] = 0;
                        arrgr[1] = 0;
                        b2.setBackground(Color.green);
                        b1.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[4] == 0) {
                        arr[4] = 1;
                        arrgr[4] = 1;
                        arr[1] = 0;
                        arrgr[1] = 0;
                        b4.setBackground(Color.green);
                        b1.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[19] == 0) {
                        arr[19] = 1;
                        arrgr[19] = 1;
                        arr[1] = 0;
                        arrgr[1] = 0;
                        b19.setBackground(Color.green);
                        b1.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 2) {
                    if (arr[1] == 0) {
                        arr[1] = 1;
                        arrgr[1] = 1;
                        arr[2] = 0;
                        arrgr[2] = 0;
                        b1.setBackground(Color.green);
                        b2.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[5] == 0) {
                        arr[5] = 1;
                        arrgr[5] = 1;
                        arr[2] = 0;
                        arrgr[2] = 0;
                        b5.setBackground(Color.green);
                        b2.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[3] == 0) {
                        arr[3] = 1;
                        arrgr[3] = 1;
                        arr[2] = 0;
                        arrgr[2] = 0;
                        b3.setBackground(Color.green);
                        b2.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 3) {
                    if (arr[6] == 0) {
                        arr[6] = 1;
                        arrgr[6] = 1;
                        arr[3] = 0;
                        arrgr[3] = 0;
                        b6.setBackground(Color.green);
                        b3.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[24] == 0) {
                        arr[24] = 1;
                        arrgr[24] = 1;
                        arr[3] = 0;
                        arrgr[3] = 0;
                        b24.setBackground(Color.green);
                        b3.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[2] == 0) {
                        arr[2] = 1;
                        arrgr[2] = 1;
                        arr[3] = 0;
                        arrgr[3] = 0;
                        b2.setBackground(Color.green);
                        b3.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 4) {
                    if (arr[1] == 0) {
                        arr[1] = 1;
                        arrgr[1] = 1;
                        arr[4] = 0;
                        arrgr[4] = 0;
                        b1.setBackground(Color.green);
                        b4.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[5] == 0) {
                        arr[5] = 1;
                        arrgr[5] = 1;
                        arr[4] = 0;
                        arrgr[4] = 0;
                        b5.setBackground(Color.green);
                        b4.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[7] == 0) {
                        arr[7] = 1;
                        arrgr[7] = 1;
                        arr[4] = 0;
                        arrgr[4] = 0;
                        b7.setBackground(Color.green);
                        b4.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[20] == 0) {
                        arr[20] = 1;
                        arrgr[20] = 1;
                        arr[4] = 0;
                        arrgr[4] = 0;
                        b20.setBackground(Color.green);
                        b4.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 5) {
                    if (arr[2] == 0) {
                        arr[2] = 1;
                        arrgr[2] = 1;
                        arr[5] = 0;
                        arrgr[5] = 0;
                        b2.setBackground(Color.green);
                        b5.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[6] == 0) {
                        arr[6] = 1;
                        arrgr[6] = 1;
                        arr[5] = 0;
                        arrgr[5] = 0;
                        b6.setBackground(Color.green);
                        b5.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[4] == 0) {
                        arr[4] = 1;
                        arrgr[4] = 1;
                        arr[5] = 0;
                        arrgr[5] = 0;
                        b4.setBackground(Color.green);
                        b5.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[8] == 0) {
                        arr[8] = 1;
                        arrgr[8] = 1;
                        arr[5] = 0;
                        arrgr[5] = 0;
                        b8.setBackground(Color.green);
                        b5.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 6) {
                    if (arr[5] == 0) {
                        arr[5] = 1;
                        arrgr[5] = 1;
                        arr[6] = 0;
                        arrgr[6] = 0;
                        b5.setBackground(Color.green);
                        b6.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[9] == 0) {
                        arr[9] = 1;
                        arrgr[9] = 1;
                        arr[6] = 0;
                        arrgr[6] = 0;
                        b9.setBackground(Color.green);
                        b6.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[3] == 0) {
                        arr[3] = 1;
                        arrgr[3] = 1;
                        arr[6] = 0;
                        arrgr[6] = 0;
                        b3.setBackground(Color.green);
                        b6.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[23] == 0) {
                        arr[23] = 1;
                        arrgr[23] = 1;
                        arr[6] = 0;
                        arrgr[6] = 0;
                        b23.setBackground(Color.green);
                        b6.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 7) {
                    if (arr[4] == 0) {
                        arr[4] = 1;
                        arrgr[4] = 1;
                        arr[7] = 0;
                        arrgr[7] = 0;
                        b4.setBackground(Color.green);
                        b7.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[8] == 0) {
                        arr[8] = 1;
                        arrgr[8] = 1;
                        arr[7] = 0;
                        arrgr[7] = 0;
                        b8.setBackground(Color.green);
                        b7.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[21] == 0) {
                        arr[21] = 1;
                        arrgr[21] = 1;
                        arr[7] = 0;
                        arrgr[7] = 0;
                        b21.setBackground(Color.green);
                        b7.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 8) {
                    if (arr[7] == 0) {
                        arr[7] = 1;
                        arrgr[7] = 1;
                        arr[8] = 0;
                        arrgr[8] = 0;
                        b7.setBackground(Color.green);
                        b8.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[5] == 0) {
                        arr[5] = 1;
                        arrgr[5] = 1;
                        arr[8] = 0;
                        arrgr[8] = 0;
                        b5.setBackground(Color.green);
                        b8.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[9] == 0) {
                        arr[9] = 1;
                        arrgr[9] = 1;
                        arr[8] = 0;
                        arrgr[8] = 0;
                        b9.setBackground(Color.green);
                        b8.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 9) {
                    if (arr[6] == 0) {
                        arr[6] = 1;
                        arrgr[6] = 1;
                        arr[9] = 0;
                        arrgr[9] = 0;
                        b6.setBackground(Color.green);
                        b9.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[22] == 0) {
                        arr[22] = 1;
                        arrgr[22] = 1;
                        arr[9] = 0;
                        arrgr[9] = 0;
                        b22.setBackground(Color.green);
                        b9.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[8] == 0) {
                        arr[8] = 1;
                        arrgr[8] = 1;
                        arr[9] = 0;
                        arrgr[9] = 0;
                        b8.setBackground(Color.green);
                        b9.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }

                } else if (pos == 10) {
                    if (arr[11] == 0) {
                        arr[11] = 1;
                        arrgr[11] = 1;
                        arr[10] = 0;
                        arrgr[10] = 0;
                        b11.setBackground(Color.green);
                        b10.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[21] == 0) {
                        arr[21] = 1;
                        arrgr[21] = 1;
                        arr[10] = 0;
                        arrgr[10] = 0;
                        b21.setBackground(Color.green);
                        b10.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[13] == 0) {
                        arr[13] = 1;
                        arrgr[13] = 1;
                        arr[10] = 0;
                        arrgr[10] = 0;
                        b13.setBackground(Color.green);
                        b10.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 11) {
                    if (arr[10] == 0) {
                        arr[10] = 1;
                        arrgr[10] = 1;
                        arr[11] = 0;
                        arrgr[11] = 0;
                        b10.setBackground(Color.green);
                        b11.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[12] == 0) {
                        arr[12] = 1;
                        arrgr[12] = 1;
                        arr[11] = 0;
                        arrgr[11] = 0;
                        b12.setBackground(Color.green);
                        b11.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[14] == 0) {
                        arr[14] = 1;
                        arrgr[14] = 1;
                        arr[11] = 0;
                        arrgr[11] = 0;
                        b14.setBackground(Color.green);
                        b11.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 12) {
                    if (arr[11] == 0) {
                        arr[11] = 1;
                        arrgr[11] = 1;
                        arr[12] = 0;
                        arrgr[12] = 0;
                        b11.setBackground(Color.green);
                        b12.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[22] == 0) {
                        arr[22] = 1;
                        arrgr[22] = 1;
                        arr[12] = 0;
                        arrgr[12] = 0;
                        b22.setBackground(Color.green);
                        b12.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[15] == 0) {
                        arr[15] = 1;
                        arrgr[15] = 1;
                        arr[12] = 0;
                        arrgr[12] = 0;
                        b15.setBackground(Color.green);
                        b12.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 13) {
                    if (arr[10] == 0) {
                        arr[10] = 1;
                        arrgr[10] = 1;
                        arr[13] = 0;
                        arrgr[13] = 0;
                        b10.setBackground(Color.green);
                        b13.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[14] == 0) {
                        arr[14] = 1;
                        arrgr[14] = 1;
                        arr[13] = 0;
                        arrgr[13] = 0;
                        b14.setBackground(Color.green);
                        b13.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[16] == 0) {
                        arr[16] = 1;
                        arrgr[16] = 1;
                        arr[13] = 0;
                        arrgr[13] = 0;
                        b16.setBackground(Color.green);
                        b13.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[20] == 0) {
                        arr[20] = 1;
                        arrgr[20] = 1;
                        arr[13] = 0;
                        arrgr[13] = 0;
                        b20.setBackground(Color.green);
                        b13.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 14) {
                    if (arr[11] == 0) {
                        arr[11] = 1;
                        arrgr[11] = 1;
                        arr[14] = 0;
                        arrgr[14] = 0;
                        b11.setBackground(Color.green);
                        b14.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[13] == 0) {
                        arr[13] = 1;
                        arrgr[13] = 1;
                        arr[14] = 0;
                        arrgr[14] = 0;
                        b13.setBackground(Color.green);
                        b14.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[15] == 0) {
                        arr[15] = 1;
                        arrgr[15] = 1;
                        arr[14] = 0;
                        arrgr[14] = 0;
                        b15.setBackground(Color.green);
                        b14.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[17] == 0) {
                        arr[17] = 1;
                        arrgr[17] = 1;
                        arr[14] = 0;
                        arrgr[14] = 0;
                        b17.setBackground(Color.green);
                        b14.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 15) {
                    if (arr[12] == 0) {
                        arr[12] = 1;
                        arrgr[12] = 1;
                        arr[15] = 0;
                        arrgr[15] = 0;
                        b12.setBackground(Color.green);
                        b15.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[14] == 0) {
                        arr[14] = 1;
                        arrgr[14] = 1;
                        arr[15] = 0;
                        arrgr[15] = 0;
                        b14.setBackground(Color.green);
                        b15.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[18] == 0) {
                        arr[18] = 1;
                        arrgr[18] = 1;
                        arr[15] = 0;
                        arrgr[15] = 0;
                        b18.setBackground(Color.green);
                        b15.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[23] == 0) {
                        arr[23] = 1;
                        arrgr[23] = 1;
                        arr[15] = 0;
                        arrgr[15] = 0;
                        b23.setBackground(Color.green);
                        b15.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 16) {
                    if (arr[13] == 0) {
                        arr[13] = 1;
                        arrgr[13] = 1;
                        arr[16] = 0;
                        arrgr[16] = 0;
                        b13.setBackground(Color.green);
                        b16.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[17] == 0) {
                        arr[17] = 1;
                        arrgr[17] = 1;
                        arr[16] = 0;
                        arrgr[16] = 0;
                        b17.setBackground(Color.green);
                        b16.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[19] == 0) {
                        arr[19] = 1;
                        arrgr[19] = 1;
                        arr[16] = 0;
                        arrgr[16] = 0;
                        b19.setBackground(Color.green);
                        b16.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 17) {
                    if (arr[16] == 0) {
                        arr[16] = 1;
                        arrgr[16] = 1;
                        arr[17] = 0;
                        arrgr[17] = 0;
                        b16.setBackground(Color.green);
                        b17.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[14] == 0) {
                        arr[14] = 1;
                        arrgr[14] = 1;
                        arr[17] = 0;
                        arrgr[17] = 0;
                        b14.setBackground(Color.green);
                        b17.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[18] == 0) {
                        arr[18] = 1;
                        arrgr[18] = 1;
                        arr[17] = 0;
                        arrgr[17] = 0;
                        b18.setBackground(Color.green);
                        b17.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 18) {
                    if (arr[17] == 0) {
                        arr[17] = 1;
                        arrgr[17] = 1;
                        arr[18] = 0;
                        arrgr[18] = 0;
                        b17.setBackground(Color.green);
                        b18.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[15] == 0) {
                        arr[15] = 1;
                        arrgr[15] = 1;
                        arr[18] = 0;
                        arrgr[18] = 0;
                        b15.setBackground(Color.green);
                        b18.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[24] == 0) {
                        arr[24] = 1;
                        arrgr[24] = 1;
                        arr[18] = 0;
                        arrgr[18] = 0;
                        b24.setBackground(Color.green);
                        b18.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 19) {
                    if (arr[1] == 0) {
                        arr[1] = 1;
                        arrgr[1] = 1;
                        arr[19] = 0;
                        arrgr[19] = 0;
                        b1.setBackground(Color.green);
                        b19.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[16] == 0) {
                        arr[16] = 1;
                        arrgr[16] = 1;
                        arr[19] = 0;
                        arrgr[19] = 0;
                        b16.setBackground(Color.green);
                        b19.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[20] == 0) {
                        arr[20] = 1;
                        arrgr[20] = 1;
                        arr[19] = 0;
                        arrgr[19] = 0;
                        b20.setBackground(Color.green);
                        b19.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 20) {
                    if (arr[13] == 0) {
                        arr[13] = 1;
                        arrgr[13] = 1;
                        arr[20] = 0;
                        arrgr[20] = 0;
                        b13.setBackground(Color.green);
                        b20.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[4] == 0) {
                        arr[4] = 1;
                        arrgr[4] = 1;
                        arr[20] = 0;
                        arrgr[20] = 0;
                        b4.setBackground(Color.green);
                        b20.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[19] == 0) {
                        arr[19] = 1;
                        arrgr[19] = 1;
                        arr[20] = 0;
                        arrgr[20] = 0;
                        b19.setBackground(Color.green);
                        b20.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[21] == 0) {
                        arr[21] = 1;
                        arrgr[21] = 1;
                        arr[20] = 0;
                        arrgr[20] = 0;
                        b21.setBackground(Color.green);
                        b20.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 21) {
                    if (arr[10] == 0) {
                        arr[10] = 1;
                        arrgr[10] = 1;
                        arr[21] = 0;
                        arrgr[21] = 0;
                        b10.setBackground(Color.green);
                        b21.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[7] == 0) {
                        arr[7] = 1;
                        arrgr[7] = 1;
                        arr[21] = 0;
                        arrgr[21] = 0;
                        b7.setBackground(Color.green);
                        b21.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[20] == 0) {
                        arr[20] = 1;
                        arrgr[20] = 1;
                        arr[21] = 0;
                        arrgr[21] = 0;
                        b20.setBackground(Color.green);
                        b21.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 22) {
                    if (arr[9] == 0) {
                        arr[9] = 1;
                        arrgr[9] = 1;
                        arr[22] = 0;
                        arrgr[22] = 0;
                        b9.setBackground(Color.green);
                        b22.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[12] == 0) {
                        arr[12] = 1;
                        arrgr[12] = 1;
                        arr[22] = 0;
                        arrgr[22] = 0;
                        b12.setBackground(Color.green);
                        b22.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[23] == 0) {
                        arr[23] = 1;
                        arrgr[23] = 1;
                        arr[22] = 0;
                        arrgr[22] = 0;
                        b23.setBackground(Color.green);
                        b22.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 23) {
                    if (arr[15] == 0) {
                        arr[15] = 1;
                        arrgr[15] = 1;
                        arr[23] = 0;
                        arrgr[23] = 0;
                        b15.setBackground(Color.green);
                        b23.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[6] == 0) {
                        arr[6] = 1;
                        arrgr[6] = 1;
                        arr[23] = 0;
                        arrgr[23] = 0;
                        b6.setBackground(Color.green);
                        b23.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[24] == 0) {
                        arr[24] = 1;
                        arrgr[24] = 1;
                        arr[23] = 0;
                        arrgr[23] = 0;
                        b24.setBackground(Color.green);
                        b23.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[22] == 0) {
                        arr[22] = 1;
                        arrgr[22] = 1;
                        arr[23] = 0;
                        arrgr[23] = 0;
                        b22.setBackground(Color.green);
                        b23.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                } else if (pos == 24) {
                    if (arr[18] == 0) {
                        arr[18] = 1;
                        arrgr[18] = 1;
                        arr[24] = 0;
                        arrgr[24] = 0;
                        b18.setBackground(Color.green);
                        b24.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[3] == 0) {
                        arr[3] = 1;
                        arrgr[3] = 1;
                        arr[24] = 0;
                        arrgr[24] = 0;
                        b3.setBackground(Color.green);
                        b24.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    } else if (arr[23] == 0) {
                        arr[23] = 1;
                        arrgr[23] = 1;
                        arr[24] = 0;
                        arrgr[24] = 0;
                        b23.setBackground(Color.green);
                        b24.setBackground(new Color(240, 240, 240));
                        chkone = 1;
                        return;
                    }
                }

            }
        }
    }
// twogr() method check 1 Green side by side check and include 2 Green side by side ..... ..Down...  

    void twogr() {

        int pos;

        for (pos = 1; pos <= 24; pos++) {

            int rp1 = pos + 1;
            int rp2 = pos + 2;

            int dm3 = pos - 3;
            int dm6 = pos - 6;

            int dp3 = pos + 3;
            int dp6 = pos + 6;

            int up = pos - 1;
            int dw = pos + 1;

            int lm3 = pos - 3;
            int rp3 = pos + 3;

            int lm1 = pos - 1;
            int lm2 = pos - 2;

            if (arr[pos] == 0) {

// Computer  turn Because 1 Green side by side check and include 2 Green side by side ..... ..Down...  
                if (pos == 1) {
                    int jog = 0;

                    jog += arrgr[1];
                    jog += arrgr[rp1];
                    jog += arrgr[dp3];
                    jog += arrgr[19];

                    if (jog >= 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b1.setBackground(Color.green);
                            b4.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[19] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b1.setBackground(Color.green);
                            b19.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp1] == 1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b1.setBackground(Color.green);
                            b2.setBackground(null);
                            tgr = 1;
                            return;
                        }

                    }
                } else if (pos == 2) {
                    int jog = 0;

                    jog += arrgr[2];
                    jog += arrgr[up];
                    jog += arrgr[dw];
                    jog += arrgr[dp3];

                    if (jog >= 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b2.setBackground(Color.green);
                            b5.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b2.setBackground(Color.green);
                            b1.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b2.setBackground(Color.green);
                            b3.setBackground(null);
                            tgr = 1;
                            return;

                        }
                    }
                } else if (pos == 3) {
                    int jog = 0;

                    jog += arrgr[3];
                    jog += arrgr[lm1];

                    jog += arrgr[dp3];

                    jog += arrgr[24];

                    if (jog >= 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b3.setBackground(Color.green);
                            b6.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[24] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b3.setBackground(Color.green);
                            b24.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b3.setBackground(Color.green);
                            b2.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 4) {
                    int jog = 0;

                    jog += arrgr[4];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];
                    jog += arrgr[rp1];
                    jog += arrgr[20];

                    if (jog >= 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b4.setBackground(Color.green);
                            b5.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[20] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b4.setBackground(Color.green);
                            b20.setBackground(null);
                            tgr = 1;
                            return;
                        } else if (arrgr[lm3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b4.setBackground(Color.green);
                            b1.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b4.setBackground(Color.green);
                            b7.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 5) {
                    int jog = 0;

                    jog += arrgr[5];
                    jog += arrgr[up];
                    jog += arrgr[dw];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    if (jog >= 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b5.setBackground(Color.green);
                            b2.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b5.setBackground(Color.green);
                            b8.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b5.setBackground(Color.green);
                            b4.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b5.setBackground(Color.green);
                            b6.setBackground(null);
                            tgr = 1;
                            return;

                        }
                    }
                } else if (pos == 6) {
                    int jog = 0;

                    jog += arrgr[6];
                    jog += arrgr[lm1];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];
                    jog += arrgr[23];

                    if (jog >= 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b6.setBackground(Color.green);
                            b3.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b6.setBackground(Color.green);
                            b9.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[23] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b6.setBackground(Color.green);
                            b23.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b6.setBackground(Color.green);
                            b5.setBackground(null);

                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 7) {
                    int jog = 0;
                    jog += arrgr[7];
                    jog += arrgr[rp1];
                    jog += arrgr[dm3];
                    jog += arrgr[21];

                    if (jog >= 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b7.setBackground(Color.green);
                            b4.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[21] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b7.setBackground(Color.green);
                            b21.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp1] == 1) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b7.setBackground(Color.green);
                            b8.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 8) {
                    int jog = 0;

                    jog += arrgr[8];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog += arrgr[dm3];

                    if (jog >= 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b8.setBackground(Color.green);
                            b5.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b8.setBackground(Color.green);
                            b7.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b8.setBackground(Color.green);
                            b9.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 9) {
                    int jog = 0;

                    jog += arrgr[9];
                    jog += arrgr[lm1];
                    jog += arrgr[dm3];

                    jog += arrgr[22];

                    if (jog >= 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b9.setBackground(Color.green);
                            b6.setBackground(null);
                            tgr = 1;
                            return;
                        } else if (arrgr[22] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b9.setBackground(Color.green);
                            b22.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b9.setBackground(Color.green);
                            b8.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 10) {
                    int jog = 0;

                    jog += arrgr[10];
                    jog += arrgr[rp1];
                    jog += arrgr[dp3];
                    jog += arrgr[21];

                    if (jog >= 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b10.setBackground(Color.green);
                            b13.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[21] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b10.setBackground(Color.green);
                            b21.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp1] == 1) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b10.setBackground(Color.green);
                            b11.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 11) {
                    int jog = 0;

                    jog += arrgr[11];
                    jog += arrgr[up];
                    jog += arrgr[dw];

                    jog += arrgr[dp3];

                    if (jog >= 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b11.setBackground(Color.green);
                            b14.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b11.setBackground(Color.green);
                            b10.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b11.setBackground(Color.green);
                            b12.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 12) {
                    int jog = 0;

                    jog += arrgr[12];
                    jog += arrgr[lm1];
                    jog += arrgr[dp3];
                    jog += arrgr[22];

                    if (jog >= 2) {
                        if (arrgr[dp3] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b12.setBackground(Color.green);
                            b15.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[22] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b12.setBackground(Color.green);
                            b22.setBackground(null);
                            tgr = 1;
                            return;
                        } else if (arrgr[lm1] == 1) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b12.setBackground(Color.green);
                            b11.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 13) {
                    int jog = 0;

                    jog += arrgr[13];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];
                    jog += arrgr[rp1];
                    jog += arrgr[20];

                    if (jog >= 2) {
                        if (arrgr[rp1] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b13.setBackground(Color.green);
                            b14.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[20] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b13.setBackground(Color.green);
                            b20.setBackground(null);
                            tgr = 1;
                            return;
                        } else if (arrgr[lm3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b13.setBackground(Color.green);
                            b10.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b13.setBackground(Color.green);
                            b16.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 14) {
                    int jog = 0;

                    jog += arrgr[14];
                    jog += arrgr[up];
                    jog += arrgr[dw];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];

                    if (jog >= 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b14.setBackground(Color.green);
                            b11.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b14.setBackground(Color.green);
                            b17.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b14.setBackground(Color.green);
                            b13.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b14.setBackground(Color.green);
                            b15.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 15) {
                    int jog = 0;

                    jog += arrgr[15];
                    jog += arrgr[lm1];
                    jog += arrgr[lm3];
                    jog += arrgr[rp3];
                    jog += arrgr[23];

                    if (jog >= 2) {
                        if (arrgr[lm3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b15.setBackground(Color.green);
                            b12.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp3] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b15.setBackground(Color.green);
                            b18.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[23] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b15.setBackground(Color.green);
                            b23.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b15.setBackground(Color.green);
                            b14.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 16) {
                    int jog = 0;

                    jog += arrgr[16];
                    jog += arrgr[rp1];
                    jog += arrgr[dm3];
                    jog += arrgr[19];

                    if (jog >= 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b16.setBackground(Color.green);
                            b13.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[19] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b16.setBackground(Color.green);
                            b19.setBackground(null);
                            tgr = 1;
                            return;
                        } else if (arrgr[rp1] == 1) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b16.setBackground(Color.green);
                            b17.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 17) {
                    int jog = 0;

                    jog += arrgr[17];
                    jog += arrgr[up];
                    jog += arrgr[dw];
                    jog += arrgr[dm3];

                    if (jog >= 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b17.setBackground(Color.green);
                            b14.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b17.setBackground(Color.green);
                            b16.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b17.setBackground(Color.green);
                            b18.setBackground(null);

                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 18) {
                    int jog = 0;

                    jog += arrgr[18];
                    jog += arrgr[lm1];
                    jog += arrgr[dm3];
                    jog += arrgr[24];

                    if (jog >= 2) {
                        if (arrgr[dm3] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b18.setBackground(Color.green);
                            b15.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[24] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b18.setBackground(Color.green);
                            b24.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b18.setBackground(Color.green);
                            b17.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 19) {
                    int jog = 0;

                    jog += arrgr[19];
                    jog += arrgr[rp1];
                    jog += arrgr[1];
                    jog += arrgr[16];

                    if (jog >= 2) {
                        if (arrgr[1] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[1] = 0;
                            arr[1] = 0;
                            b19.setBackground(Color.green);
                            b1.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[16] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[16] = 0;
                            arr[16] = 0;
                            b19.setBackground(Color.green);
                            b16.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp1] == 1) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b19.setBackground(Color.green);
                            b20.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 20) {
                    int jog = 0;

                    jog += arrgr[20];
                    jog += arrgr[up];
                    jog += arrgr[dw];
                    jog += arrgr[4];
                    jog += arrgr[13];

                    if (jog >= 2) {
                        if (arrgr[4] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[4] = 0;
                            arr[4] = 0;
                            b20.setBackground(Color.green);
                            b4.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[13] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[13] = 0;
                            arr[13] = 0;
                            b20.setBackground(Color.green);
                            b13.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b20.setBackground(Color.green);
                            b19.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b20.setBackground(Color.green);
                            b21.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 21) {
                    int jog = 0;

                    jog += arrgr[21];
                    jog += arrgr[lm1];
                    jog += arrgr[7];
                    jog += arrgr[10];

                    if (jog >= 2) {
                        if (arrgr[7] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[7] = 0;
                            arr[7] = 0;
                            b21.setBackground(Color.green);
                            b7.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[10] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[10] = 0;
                            arr[10] = 0;
                            b21.setBackground(Color.green);
                            b10.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b21.setBackground(Color.green);
                            b20.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 22) {
                    int jog = 0;

                    jog += arrgr[22];
                    jog += arrgr[rp1];

                    jog += arrgr[9];
                    jog += arrgr[12];

                    if (jog >= 2) {
                        if (arrgr[9] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[9] = 0;
                            arr[9] = 0;
                            b22.setBackground(Color.green);
                            b9.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[12] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[12] = 0;
                            arr[12] = 0;
                            b22.setBackground(Color.green);
                            b12.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[rp1] == 1) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b22.setBackground(Color.green);
                            b23.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 23) {
                    int jog = 0;

                    jog += arrgr[23];
                    jog += arrgr[up];
                    jog += arrgr[dw];
                    jog += arrgr[6];
                    jog += arrgr[15];

                    if (jog >= 2) {
                        if (arrgr[6] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[6] = 0;
                            arr[6] = 0;
                            b23.setBackground(Color.green);
                            b6.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[15] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[15] = 0;
                            arr[15] = 0;
                            b23.setBackground(Color.green);
                            b15.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[up] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b23.setBackground(Color.green);
                            b22.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[dw] == 1) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b23.setBackground(Color.green);
                            b24.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                } else if (pos == 24) {
                    int jog = 0;

                    jog += arrgr[24];
                    jog += arrgr[lm1];
                    jog += arrgr[3];
                    jog += arrgr[18];

                    if (jog >= 2) {
                        if (arrgr[3] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[3] = 0;
                            arr[3] = 0;
                            b24.setBackground(Color.green);
                            b3.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[18] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[18] = 0;
                            arr[18] = 0;
                            b24.setBackground(Color.green);
                            b18.setBackground(null);
                            tgr = 1;
                            return;

                        } else if (arrgr[lm1] == 1) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b24.setBackground(Color.green);
                            b23.setBackground(null);
                            tgr = 1;
                            return;
                        }
                    }
                }
            }
        }
    }

    // Computer  turn Because 2 Red side by side check and include 1 Green 
//because 2 red and 1 green side by side ..... ..Down...  
    void setgr() {

        int pos;

        for (pos = 1; pos <= 24; pos++) {

            int rp1 = pos + 1;
            int rp2 = pos + 2;

            int dm3 = pos - 3;
            int dm6 = pos - 6;

            int dp3 = pos + 3;
            int dp6 = pos + 6;

            int up = pos - 1;
            int dw = pos + 1;

            int lm3 = pos - 3;
            int rp3 = pos + 3;

            int lm1 = pos - 1;
            int lm2 = pos - 2;

            if (arr[pos] == 0) {

// Computer  turn Because 2 Red side by side check and include 1 Green 
                //because 2 red and 1 green side by side ..... ..Down...  
                if (pos == 1) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[1];
                    jog += ared[rp1];
                    jog += ared[rp2];

                    jog1 += arrgr[1];
                    jog1 += ared[dp3];
                    jog1 += ared[dp6];

                    jog2 += arrgr[1];
                    jog2 += ared[19];
                    jog2 += ared[16];

                    if (jog == 2) {
                        if (arrgr[dp3] == 1 && ared[19]==1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b1.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        } else if (arrgr[19] == 1  && ared[4]==1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b1.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[rp1] == 1 && ared[19]==1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b1.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        } else if (arrgr[19] == 1 && ared[2]==1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b1.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[dp3] == 1 && ared[2]==1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b1.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;
                        } else if (arrgr[rp1] == 1 && ared[4]==1) {
                            arrgr[1] = 1;
                            arr[1] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b1.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;
                        }
                    }
                } else if (pos == 2) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[2];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[2];
                    jog1 += ared[dp3];
                    jog1 += ared[dp6];

                     if (jog1 == 2) {
                        if (arrgr[up] == 1 && ared[3]==1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b2.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        } else if (arrgr[dw] == 1 && ared[1]==1) {
                            arrgr[2] = 1;
                            arr[2] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b2.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        }
                    }
                } else if (pos == 3) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[3];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[3];
                    jog1 += ared[dp3];
                    jog1 += ared[dp6];

                    jog2 += arrgr[3];
                    jog2 += ared[18];
                    jog2 += ared[24];

                    if (jog == 2) {
                        if (arrgr[dp3] == 1 && ared[24]==1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b3.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[24] == 1 && ared[6]==1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b3.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm1] == 1 && ared[24]==1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b3.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[24] == 1 && ared[2]==1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b3.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[lm1] == 1 && ared[6]==1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b3.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dp3] == 1 && ared[2]==1) {
                            arrgr[3] = 1;
                            arr[3] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b3.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 4) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[4];
                    jog += ared[lm3];
                    jog += ared[rp3];

                    jog1 += arrgr[4];
                    jog1 += ared[rp1];
                    jog1 += ared[rp2];

                    jog2 += arrgr[4];
                    jog2 += ared[13];
                    jog2 += ared[20];

                    if (jog == 2) {
                        if (arrgr[rp1] == 1 && ared[20]==1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b4.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[20] == 1 && ared[5]==1) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b4.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;
                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm3] == 1 && (ared[7]==1 || ared[20]==1)) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b4.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[20] == 1 && (ared[7]==1 || ared[1]==1)) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b4.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;
                        } else if (arrgr[rp3] == 1 && (ared[1]==1 || ared[20]==1)) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b4.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[rp1] == 1 && (ared[7]==1 || ared[1]==1)) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b4.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[lm3] == 1 && (ared[7]==1 || ared[5]==1)) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b4.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[rp3] == 1 && (ared[1]==1 || ared[5]==1)) {
                            arrgr[4] = 1;
                            arr[4] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b4.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 5) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[5];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[5];
                    jog1 += ared[lm3];
                    jog1 += ared[rp3];

                    if (jog == 2) {
                        if (arrgr[lm3] == 1 && (ared[8]==1)) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b5.setBackground(Color.green);
                            b2.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[rp3] == 1 && (ared[2]==1)) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b5.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[up] == 1 && (ared[6]==1)) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b5.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dw] == 1 && (ared[4]==1)) {
                            arrgr[5] = 1;
                            arr[5] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b5.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 6) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[6];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[6];
                    jog1 += ared[lm3];
                    jog1 += ared[rp3];

                    jog2 += arrgr[6];
                    jog2 += ared[23];
                    jog2 += ared[15];

                    if (jog == 2) {
                        if (arrgr[lm3] == 1 && (ared[9]==1 || ared[23]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b6.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[rp3] == 1 && (ared[23]==1 || ared[3]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b6.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[23] == 1 && (ared[3]==1 || ared[9]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b6.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm1] == 1 && (ared[23]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b6.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[23] == 1 && (ared[5]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b6.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[lm1] == 1 && (ared[3]==1 || ared[9]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b6.setBackground(Color.green);
                            b5.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[rp3] == 1 && (ared[3]==1 || ared[5]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b6.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[lm3] == 1 && (ared[9]==1 || ared[5]==1)) {
                            arrgr[6] = 1;
                            arr[6] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b6.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 7) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[7];
                    jog += ared[rp1];
                    jog += ared[rp2];

                    jog1 += arrgr[7];
                    jog1 += ared[dm3];
                    jog1 += ared[dm6];

                    jog2 += arrgr[7];
                    jog2 += ared[21];
                    jog2 += ared[10];

                    if (jog == 2) {
                        if (arrgr[dm3] == 1 && (ared[21]==1))  {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b7.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[21] == 1 && (ared[4]==1)) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b7.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[rp1] == 1 && (ared[21]==1)) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b7.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        } else if (arrgr[21] == 1 && (ared[8]==1)) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b7.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[rp1] == 1 && (ared[4]==1)) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b7.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dm3] == 1 && (ared[8]==1)) {
                            arrgr[7] = 1;
                            arr[7] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b7.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 8) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[8];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[8];
                    jog1 += ared[dm3];
                    jog1 += ared[dm6];

//                    if (jog == 2) {
//                        if (arrgr[dm3] == 1) {
//                            arrgr[8] = 1;
//                            arr[8] = 1;
//                            arrgr[dm3] = 0;
//                            arr[dm3] = 0;
//                            b8.setBackground(Color.green);
//                            b5.setBackground(new Color(240, 240, 240));
//                            grset = 1;
//
//                            return;
//
//                        }
//
//                    } 
                    if (jog1 == 2) {
                        if (arrgr[up] == 1 && (ared[9]==1)) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b8.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dw] == 1 && (ared[7]==1)) {
                            arrgr[8] = 1;
                            arr[8] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b8.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 9) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[9];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[9];
                    jog1 += ared[dm3];
                    jog1 += ared[dm6];

                    jog2 += arrgr[9];
                    jog2 += ared[12];
                    jog2 += ared[22];

                    if (jog == 2) {
                        if (arrgr[dm3] == 1 && (ared[22]==1)) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b9.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[22] == 1 && (ared[6]==1)) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b9.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm1] == 1 && (ared[22]==1)) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b9.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[22] == 1 && (ared[8]==1)) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b9.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[lm1] == 1 && (ared[6]==1)) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b9.setBackground(Color.green);
                            b8.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dm3] == 1 && (ared[8]==1)) {
                            arrgr[9] = 1;
                            arr[9] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b9.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 10) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[10];
                    jog += ared[rp1];
                    jog += ared[rp2];

                    jog1 += arrgr[10];
                    jog1 += ared[dp3];
                    jog1 += ared[dp6];

                    jog2 += arrgr[10];
                    jog2 += ared[21];
                    jog2 += ared[7];

                    if (jog == 2) {
                        if (arrgr[dp3] == 1 && (ared[21]==1)) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b10.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[21] == 1 && (ared[13]==1)) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b10.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[rp1] == 1 && (ared[21]==1)) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b10.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[21] == 1 && (ared[11]==1)) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[21] = 0;
                            arr[21] = 0;
                            b10.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[rp1] == 1 && (ared[13]==1)) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b10.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dp3] == 1 && (ared[11]==1)) {
                            arrgr[10] = 1;
                            arr[10] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b10.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 11) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[11];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[11];
                    jog1 += ared[dp3];
                    jog1 += ared[dp6];

//                    if (jog == 2) {
//                        if (arrgr[dp3] == 1) {
//                            arrgr[11] = 1;
//                            arr[11] = 1;
//                            arrgr[dp3] = 0;
//                            arr[dp3] = 0;
//                            b11.setBackground(Color.green);
//                            b14.setBackground(new Color(240, 240, 240));
//                            grset = 1;
//
//                            return;
//
//                        }
//
//                    } 
                    if (jog1 == 2) {
                        if (arrgr[up] == 1 && (ared[12]==1)) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b11.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dw] == 1 && (ared[10]==1)) {
                            arrgr[11] = 1;
                            arr[11] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b11.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 12) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[12];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[12];
                    jog1 += ared[dp3];
                    jog1 += ared[dp6];

                    jog2 += arrgr[12];
                    jog2 += ared[9];
                    jog2 += ared[22];

                    if (jog == 2) {
                        if (arrgr[dp3] == 1 && (ared[22]==1)) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b12.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[22] == 1 && (ared[15]==1)) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b12.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm1] == 1 && (ared[22]==1)) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b12.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[22] == 1 && (ared[11]==1)) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[22] = 0;
                            arr[22] = 0;
                            b12.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[lm1] == 1 && (ared[15]==1)) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b12.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dp3] == 1 && (ared[11]==1)) {
                            arrgr[12] = 1;
                            arr[12] = 1;
                            arrgr[dp3] = 0;
                            arr[dp3] = 0;
                            b12.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 13) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[13];
                    jog += ared[lm3];
                    jog += ared[rp3];

                    jog1 += arrgr[13];
                    jog1 += ared[rp1];
                    jog1 += ared[rp2];

                    jog2 += arrgr[13];
                    jog2 += ared[4];
                    jog2 += ared[20];

                    if (jog == 2) {
                        if (arrgr[rp1] == 1 && (ared[20]==1)) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b13.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        } else if (arrgr[20] == 1 && (ared[14]==1)) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b13.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;
                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm3] == 1 && ((ared[16]==1)||(ared[20]==1))) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b13.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[20] == 1 && ((ared[16]==1)||(ared[10]==1))) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[20] = 0;
                            arr[20] = 0;
                            b13.setBackground(Color.green);
                            b20.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;
                        } else if (arrgr[rp3] == 1 && ((ared[10]==1)||(ared[20]==1))) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b13.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[rp1] == 1 && ((ared[16]==1)||(ared[10]==1))) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b13.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[lm3] == 1 && ((ared[16]==1)||(ared[14]==1))) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b13.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[rp3] == 1 && ((ared[14]==1)||(ared[10]==1))) {
                            arrgr[13] = 1;
                            arr[13] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b13.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 14) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[14];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[14];
                    jog1 += ared[lm3];
                    jog1 += ared[rp3];

                    if (jog == 2) {
                        if (arrgr[lm3] == 1 && (ared[17]==1)) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b14.setBackground(Color.green);
                            b11.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } 
                        else if (arrgr[rp3] == 1 && (ared[11]==1)) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b14.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }}
                     else if (jog1 == 2) {
                        if (arrgr[up] == 1 && (ared[15]==1)) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b14.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dw] == 1 && (ared[13]==1)) {
                            arrgr[14] = 1;
                            arr[14] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b14.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 15) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[15];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[15];
                    jog1 += ared[lm3];
                    jog1 += ared[rp3];

                    jog2 += arrgr[15];
                    jog2 += ared[23];
                    jog2 += ared[6];

                    if (jog == 2) {
                        if (arrgr[lm3] == 1 && ((ared[18]==1)||(ared[23]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b15.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[rp3] == 1 && ((ared[12]==1)||(ared[23]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b15.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[23] == 1 && ((ared[18]==1)||(ared[12]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b15.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm1] == 1 && ((ared[23]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b15.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        } else if (arrgr[23] == 1 && ((ared[14]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[23] = 0;
                            arr[23] = 0;
                            b15.setBackground(Color.green);
                            b23.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[lm1] == 1 && ((ared[18]==1)||(ared[12]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b15.setBackground(Color.green);
                            b14.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[lm3] == 1 && ((ared[18]==1)||(ared[14]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[lm3] = 0;
                            arr[lm3] = 0;
                            b15.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[rp3] == 1 && ((ared[14]==1)||(ared[12]==1))) {
                            arrgr[15] = 1;
                            arr[15] = 1;
                            arrgr[rp3] = 0;
                            arr[rp3] = 0;
                            b15.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 16) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[16];
                    jog += ared[rp1];
                    jog += ared[rp2];

                    jog1 += arrgr[16];
                    jog1 += ared[dm3];
                    jog1 += ared[dm6];

                    jog2 += arrgr[16];
                    jog2 += ared[1];
                    jog2 += ared[19];

                    if (jog == 2) {
                        if (arrgr[dm3] == 1 && (ared[19]==1)) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b16.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[19] == 1 &&  (ared[13]==1)) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b16.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[rp1] == 1 && (ared[19]==1)) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b16.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[19] == 1 && (ared[17]==1)) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[19] = 0;
                            arr[19] = 0;
                            b16.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[rp1] == 1 && (ared[13]==1)) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[rp1] = 0;
                            arr[rp1] = 0;
                            b16.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dm3] == 1 && (ared[17]==1)) {
                            arrgr[16] = 1;
                            arr[16] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b16.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 17) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[17];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[17];
                    jog1 += ared[dm3];
                    jog1 += ared[dm6];

//                    if (jog == 2) {
//                        if (arrgr[dm3] == 1) {
//                            arrgr[17] = 1;
//                            arr[17] = 1;
//                            arrgr[dm3] = 0;
//                            arr[dm3] = 0;
//                            b17.setBackground(Color.green);
//                            b14.setBackground(new Color(240, 240, 240));
//                            grset = 1;
//
//                            return;
//
//                        }
//
//                    } else
                    if (jog1 == 2) {
                        if (arrgr[up] == 1 && (ared[18]==1)) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b17.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dw] == 1 && (ared[16]==1)) {
                            arrgr[17] = 1;
                            arr[17] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b17.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 18) {
                    int jog = 0, jog1 = 0, jog2 = 0;

                    jog += arrgr[18];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[18];
                    jog1 += ared[dm3];
                    jog1 += ared[dm6];

                    jog2 += arrgr[18];
                    jog2 += ared[3];
                    jog2 += ared[24];

                    if (jog == 2) {
                        if (arrgr[dm3] == 1 && (ared[24]==1)) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b18.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[24] == 1 && (ared[15]==1)) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b18.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[lm1] == 1 && (ared[24]==1)) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b18.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[24] == 1&& (ared[17]==1)) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[24] = 0;
                            arr[24] = 0;
                            b18.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog2 == 2) {
                        if (arrgr[lm1] == 1 && (ared[15]==1)) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[lm1] = 0;
                            arr[lm1] = 0;
                            b18.setBackground(Color.green);
                            b17.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dm3] == 1&& (ared[17]==1)) {
                            arrgr[18] = 1;
                            arr[18] = 1;
                            arrgr[dm3] = 0;
                            arr[dm3] = 0;
                            b18.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 19) {
                    int jog = 0, jog1 = 0;
                    jog += arrgr[19];
                    jog += ared[rp1];
                    jog += ared[rp2];

                    jog1 += arrgr[19];
                    jog1 += ared[1];
                    jog1 += ared[16];

                    if (jog == 2) {
                        if (arrgr[1] == 1 && (ared[16]==1)) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[1] = 0;
                            arr[1] = 0;
                            b19.setBackground(Color.green);
                            b1.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[16] == 1 && (ared[1]==1)) {
                            arrgr[19] = 1;
                            arr[19] = 1;
                            arrgr[16] = 0;
                            arr[16] = 0;
                            b19.setBackground(Color.green);
                            b16.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } 
//                    else if (jog1 == 2) {
//                        if (arrgr[rp1] == 1) {
//                            arrgr[19] = 1;
//                            arr[19] = 1;
//                            arrgr[rp1] = 0;
//                            arr[rp1] = 0;
//                            b19.setBackground(Color.green);
//                            b20.setBackground(new Color(240, 240, 240));
//                            grset = 1;
//
//                            return;
//
//                        }
//                    }
                } else if (pos == 20) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[20];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[20];
                    jog1 += ared[4];
                    jog1 += ared[13];

                    if (jog == 2) {
                        if (arrgr[4] == 1 && (ared[13]==1)) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[4] = 0;
                            arr[4] = 0;
                            b20.setBackground(Color.green);
                            b4.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[13] == 1 && (ared[4]==1)) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[13] = 0;
                            arr[13] = 0;
                            b20.setBackground(Color.green);
                            b13.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[up] == 1 && (ared[21]==1)) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b20.setBackground(Color.green);
                            b19.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dw] == 1 && (ared[19]==1)) {
                            arrgr[20] = 1;
                            arr[20] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b20.setBackground(Color.green);
                            b21.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    }
                } else if (pos == 21) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[21];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[21];
                    jog1 += ared[7];
                    jog1 += ared[10];

                    if (jog == 2) {
                        if (arrgr[7] == 1 && (ared[10]==1))  {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[7] = 0;
                            arr[7] = 0;
                            b21.setBackground(Color.green);
                            b7.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[10] == 1 && (ared[7]==1)) {
                            arrgr[21] = 1;
                            arr[21] = 1;
                            arrgr[10] = 0;
                            arr[10] = 0;
                            b21.setBackground(Color.green);
                            b10.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } 
//                    else if (jog1 == 2) {
//                        if (arrgr[lm1] == 1) {
//                            arrgr[21] = 1;
//                            arr[21] = 1;
//                            arrgr[lm1] = 0;
//                            arr[lm1] = 0;
//                            b21.setBackground(Color.green);
//                            b20.setBackground(new Color(240, 240, 240));
//                            grset = 1;
//
//                            return;
//
//                        }
                    }
                 else if (pos == 22) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[22];
                    jog += ared[rp1];
                    jog += ared[rp2];

                    jog1 += arrgr[22];
                    jog1 += ared[9];
                    jog1 += ared[12];

                    if (jog == 2) {
                        if (arrgr[9] == 1 && (ared[12]==1)) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[9] = 0;
                            arr[9] = 0;
                            b22.setBackground(Color.green);
                            b9.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[12] == 1 && (ared[9]==1)) {
                            arrgr[22] = 1;
                            arr[22] = 1;
                            arrgr[12] = 0;
                            arr[12] = 0;
                            b22.setBackground(Color.green);
                            b12.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } 
//                    else if (jog1 == 2) {
//                        if (arrgr[rp1] == 1) {
//                            arrgr[22] = 1;
//                            arr[22] = 1;
//                            arrgr[rp1] = 0;
//                            arr[rp1] = 0;
//                            b22.setBackground(Color.green);
//                            b23.setBackground(new Color(240, 240, 240));
//                            grset = 1;
//
//                            return;
//
//                        }
                    }
                 else if (pos == 23) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[23];
                    jog += ared[up];
                    jog += ared[dw];

                    jog1 += arrgr[23];
                    jog1 += ared[6];
                    jog1 += ared[15];

                    if (jog == 2) {
                        if (arrgr[6] == 1 && (ared[15]==1)) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[6] = 0;
                            arr[6] = 0;
                            b23.setBackground(Color.green);
                            b6.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[15] == 1 && (ared[6]==1)) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[15] = 0;
                            arr[15] = 0;
                            b23.setBackground(Color.green);
                            b15.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } else if (jog1 == 2) {
                        if (arrgr[up] == 1 && (ared[24]==1)) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[up] = 0;
                            arr[up] = 0;
                            b23.setBackground(Color.green);
                            b22.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[dw] == 1 && (ared[22]==1)) {
                            arrgr[23] = 1;
                            arr[23] = 1;
                            arrgr[dw] = 0;
                            arr[dw] = 0;
                            b23.setBackground(Color.green);
                            b24.setBackground(new Color(240, 240, 240));
                            grset = 1;
                            return;

                        }
                    }
                } else if (pos == 24) {
                    int jog = 0, jog1 = 0;

                    jog += arrgr[24];
                    jog += ared[lm1];
                    jog += ared[lm2];

                    jog1 += arrgr[24];
                    jog1 += ared[3];
                    jog1 += ared[18];

                    if (jog == 2) {
                        if (arrgr[3] == 1 && (ared[18]==1))  {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[3] = 0;
                            arr[3] = 0;
                            b24.setBackground(Color.green);
                            b3.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        } else if (arrgr[18] == 1 && (ared[3]==1)) {
                            arrgr[24] = 1;
                            arr[24] = 1;
                            arrgr[18] = 0;
                            arr[18] = 0;
                            b24.setBackground(Color.green);
                            b18.setBackground(new Color(240, 240, 240));
                            grset = 1;

                            return;

                        }
                    } 

                }
            }
        }
    }
// Computer turn method ..... .....UP   

    // red random no.... Down....
    void fun1(int n) {

        //  System.out.println("" + n);
        int rp1 = n + 1;
        int rp2 = n + 2;

        int dm3 = n - 3;
        int dm6 = n - 6;

        int dp3 = n + 3;
        int dp6 = n + 6;

        int up = n - 1;
        int dw = n + 1;

        int lm3 = n - 3;
        int rp3 = n + 3;

        int lm1 = n - 1;
        int lm2 = n - 2;

        if (n == 1) {
            int jog = 0, jog1 = 0, jog2 = 0;
            if (rp1 == 2 && rp2 == 3) {
                jog += ared[rp1];
                jog += ared[rp2];
            }
            if (dp3 == 4 && dp6 == 7) {
                jog1 += ared[dp3];
                jog1 += ared[dp6];
            }

            jog2 += ared[19];
            jog2 += ared[16];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[1] = 1;
                ared[1] = 1;
                // b1.setIcon(himage);
                b1.setBackground(Color.RED);
            }
        }

        if (n == 2) {

            int jog = 0, jog1 = 0;

            if (up == 1 && dw == 3) {
                jog += ared[up];
                jog += ared[dw];
            }

            if (dp3 == 5 && dp6 == 8) {
                jog1 += ared[dp3];
                jog1 += ared[dp6];
            }

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[2] = 1;
                ared[2] = 1;
                b2.setBackground(Color.RED);
            }
        }

        if (n == 3) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 == 2 && lm2 == 1) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            if (dp3 == 6 && dp6 == 9) {
                jog1 += ared[dp3];
                jog1 += ared[dp6];
            }

            jog2 += ared[24];
            jog2 += ared[18];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[3] = 1;
                ared[3] = 1;
                b3.setBackground(Color.RED);
            }
        }

        if (n == 4) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm3 == 1 && rp3 == 7) {
                jog += ared[lm3];
                jog += ared[rp3];
            }

            if (rp1 == 5 && rp2 == 6) {
                jog1 += ared[rp1];
                jog1 += ared[rp2];
            }

            jog2 += ared[20];
            jog2 += ared[13];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[4] = 1;
                ared[4] = 1;
                b4.setBackground(Color.RED);
            }
        }

        if (n == 5) {

            int jog = 0, jog1 = 0;

            if (up == 4 && dw == 6) {
                jog += ared[up];
                jog += ared[dw];
            }

            if (lm3 == 2 && rp3 == 8) {
                jog1 += ared[lm3];
                jog1 += ared[rp3];
            }

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[5] = 1;
                ared[5] = 1;
                b5.setBackground(Color.RED);
            }
        }

        if (n == 6) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 == 5 && lm2 == 4) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            if (lm3 == 3 && rp3 == 9) {
                jog1 += ared[lm3];
                jog1 += ared[rp3];
            }

            jog2 += ared[23];
            jog2 += ared[15];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[6] = 1;
                ared[6] = 1;
                b6.setBackground(Color.RED);
            }
        }

        if (n == 7) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (dm3 == 4 && dm6 == 1) {
                jog += ared[dm3];
                jog += ared[dm6];
            }

            if (rp1 == 8 && rp2 == 9) {
                jog1 += ared[rp1];
                jog1 += ared[rp2];
            }

            jog2 += ared[10];
            jog2 += ared[21];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[7] = 1;
                ared[7] = 1;
                b7.setBackground(Color.RED);
            }
        }

        if (n == 8) {

            int jog = 0, jog1 = 0;

            if (up == 7 && dw == 9) {
                jog += ared[up];
                jog += ared[dw];
            }

            if (dm3 == 5 && dm6 == 2) {
                jog1 += ared[dm3];
                jog1 += ared[dm6];
            }

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[8] = 1;
                ared[8] = 1;
                b8.setBackground(Color.RED);
            }
        }

        if (n == 9) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 8 && lm2 >= 7) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            if (dm3 >= 6 && dm6 >= 3) {
                jog1 += ared[dm3];
                jog1 += ared[dm6];
            }

            jog2 += ared[22];
            jog2 += ared[12];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[9] = 1;
                ared[9] = 1;
                b9.setBackground(Color.RED);
            }
        }

        //  green wait 
        if (n == 19) {

            int jog = 0, jog1 = 0;

            if (rp1 <= 20 && rp2 <= 21) {
                jog += ared[rp1];
                jog += ared[rp2];
            }

            jog1 += ared[1];
            jog1 += ared[16];

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[19] = 1;
                ared[19] = 1;
                b19.setBackground(Color.RED);
            }
        }

        if (n == 20) {

            int jog = 0, jog1 = 0;

            if (up >= 19 && dw <= 21) {
                jog += ared[up];
                jog += ared[dw];
            }

            jog1 += ared[4];
            jog1 += ared[13];

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[20] = 1;
                ared[20] = 1;
                b20.setBackground(Color.RED);
            }
        }

        if (n == 21) {

            int jog = 0, jog1 = 0;

            if (lm1 >= 20 && lm2 >= 19) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            jog1 += ared[7];
            jog1 += ared[10];

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[21] = 1;
                ared[21] = 1;
                b21.setBackground(Color.RED);
            }
        }
        if (n == 22) {

            int jog = 0, jog1 = 0;

            if (rp1 <= 23 && rp2 <= 24) {
                jog += ared[rp1];
                jog += ared[rp2];
            }

            jog1 += ared[9];
            jog1 += ared[12];

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[22] = 1;
                ared[22] = 1;
                b22.setBackground(Color.RED);
            }
        }

        if (n == 23) {

            int jog = 0, jog1 = 0;

            if (up >= 22 && dw <= 24) {
                jog += ared[up];
                jog += ared[dw];
            }

            jog1 += ared[6];
            jog1 += ared[15];

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[23] = 1;
                ared[23] = 1;
                b23.setBackground(Color.RED);
            }
        }

        if (n == 24) {

            int jog = 0, jog1 = 0;

            if (lm1 >= 23 && lm2 >= 22) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            jog1 += ared[3];
            jog1 += ared[18];

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[24] = 1;
                ared[24] = 1;
                b24.setBackground(Color.RED);
            }
        }

        if (n == 10) {
            int jog = 0, jog1 = 0, jog2 = 0;
            if (rp1 <= 11 && rp2 <= 12) {
                jog += ared[rp1];
                jog += ared[rp2];
            }
            if (dp3 <= 13 && dp6 <= 16) {
                jog1 += ared[dp3];
                jog1 += ared[dp6];
            }

            jog2 += ared[7];
            jog2 += ared[21];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[10] = 1;
                ared[10] = 1;
                b10.setBackground(Color.RED);
            }
        }

        if (n == 11) {

            int jog = 0, jog1 = 0;

            if (up >= 10 && dw <= 12) {
                jog += ared[up];
                jog += ared[dw];
            }

            if (dp3 <= 14 && dp6 <= 17) {
                jog1 += ared[dp3];
                jog1 += ared[dp6];
            }

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[11] = 1;
                ared[11] = 1;
                b11.setBackground(Color.RED);
            }
        }

        if (n == 12) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 11 && lm2 >= 10) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            if (dp3 <= 15 && dp6 <= 18) {
                jog1 += ared[dp3];
                jog1 += ared[dp6];
            }

            jog2 += ared[22];
            jog2 += ared[9];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[12] = 1;
                ared[12] = 1;
                b12.setBackground(Color.RED);
            }
        }

        if (n == 13) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm3 >= 10 && rp3 <= 16) {
                jog += ared[lm3];
                jog += ared[rp3];
            }

            if (rp1 <= 14 && rp2 <= 15) {
                jog1 += ared[rp1];
                jog1 += ared[rp2];
            }

            jog2 += ared[20];
            jog2 += ared[4];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[13] = 1;
                ared[13] = 1;
                b13.setBackground(Color.RED);
            }
        }

        if (n == 14) {

            int jog = 0, jog1 = 0;

            if (up >= 13 && dw <= 15) {
                jog += ared[up];
                jog += ared[dw];
            }

            if (lm3 >= 11 && rp3 <= 17) {
                jog1 += ared[lm3];
                jog1 += ared[rp3];
            }

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[14] = 1;
                ared[14] = 1;
                b14.setBackground(Color.RED);
            }
        }

        if (n == 15) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 14 && lm2 >= 13) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            if (lm3 >= 12 && rp3 <= 18) {
                jog1 += ared[lm3];
                jog1 += ared[rp3];
            }

            jog2 += ared[23];
            jog2 += ared[6];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[15] = 1;
                ared[15] = 1;
                b15.setBackground(Color.RED);
            }
        }

        if (n == 16) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (dm3 >= 13 && dm6 >= 10) {
                jog += ared[dm3];
                jog += ared[dm6];
            }

            if (rp1 <= 17 && rp2 <= 18) {
                jog1 += ared[rp1];
                jog1 += ared[rp2];
            }

            jog2 += ared[19];
            jog2 += ared[1];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[16] = 1;
                ared[16] = 1;
                b16.setBackground(Color.RED);
            }
        }

        if (n == 17) {

            int jog = 0, jog1 = 0;

            if (up >= 16 && dw <= 18) {
                jog += ared[up];
                jog += ared[dw];
            }

            if (dm3 >= 14 && dm6 >= 11) {
                jog1 += ared[dm3];
                jog1 += ared[dm6];
            }

            if (jog <= 1 && jog1 <= 1) {
                red -= 1;
                arr[17] = 1;
                ared[17] = 1;
                b17.setBackground(Color.RED);
            }
        }

        if (n == 18) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 17 && lm2 >= 16) {
                jog += ared[lm1];
                jog += ared[lm2];
            }

            if (dm3 >= 15 && dm6 >= 12) {
                jog1 += ared[dm3];
                jog1 += ared[dm6];
            }

            jog2 += ared[24];
            jog2 += ared[3];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                red -= 1;
                arr[18] = 1;
                ared[18] = 1;
                b18.setBackground(Color.RED);
            }
        }
    }

    void fun2(int n) {

        // System.out.println("" + n);
        int rp1 = n + 1;
        int rp2 = n + 2;

        int dm3 = n - 3;
        int dm6 = n - 6;

        int dp3 = n + 3;
        int dp6 = n + 6;

        int up = n - 1;
        int dw = n + 1;

        int lm3 = n - 3;
        int rp3 = n + 3;

        int lm1 = n - 1;
        int lm2 = n - 2;

        if (n == 1) {
            int jog = 0, jog1 = 0, jog2 = 0;
            if (rp1 <= 2 && rp2 <= 3) {
                jog += arrgr[rp1];
                jog += arrgr[rp2];
            }
            if (dp3 <= 4 && dp6 <= 7) {
                jog1 += arrgr[dp3];
                jog1 += arrgr[dp6];
            }

            jog2 += arrgr[19];
            jog2 += arrgr[16];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arr[1] = 1;
                arrgr[1] = 1;
                b1.setBackground(Color.GREEN);
            }
        }

        if (n == 2) {

            int jog = 0, jog1 = 0;

            if (up >= 1 && dw <= 3) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            if (dp3 <= 5 && dp6 <= 8) {
                jog1 += arrgr[dp3];
                jog1 += arrgr[dp6];
            }

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[2] = 1;
                arr[2] = 1;
                b2.setBackground(Color.GREEN);
            }
        }

        if (n == 3) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 2 && lm2 >= 1) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            if (dp3 <= 6 && dp6 <= 9) {
                jog1 += arrgr[dp3];
                jog1 += arrgr[dp6];
            }

            jog2 += arrgr[24];
            jog2 += arrgr[18];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[3] = 1;
                arr[3] = 1;
                b3.setBackground(Color.GREEN);
            }
        }

        if (n == 4) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm3 >= 1 && rp3 <= 7) {
                jog += arrgr[lm3];
                jog += arrgr[rp3];
            }

            if (rp1 <= 5 && rp2 <= 6) {
                jog1 += arrgr[rp1];
                jog1 += arrgr[rp2];
            }

            jog2 += arrgr[20];
            jog2 += arrgr[13];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[4] = 1;
                arr[4] = 1;
                b4.setBackground(Color.GREEN);
            }
        }

        if (n == 5) {

            int jog = 0, jog1 = 0;

            if (up >= 4 && dw <= 6) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            if (lm3 >= 2 && rp3 <= 8) {
                jog1 += arrgr[lm3];
                jog1 += arrgr[rp3];
            }

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[5] = 1;
                arr[5] = 1;
                b5.setBackground(Color.GREEN);
            }
        }

        if (n == 6) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 5 && lm2 >= 4) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            if (lm3 >= 3 && rp3 <= 9) {
                jog1 += arrgr[lm3];
                jog1 += arrgr[rp3];
            }

            jog2 += arrgr[23];
            jog2 += arrgr[15];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[6] = 1;
                arr[6] = 1;
                b6.setBackground(Color.GREEN);
            }
        }

        if (n == 7) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (dm3 >= 4 && dm6 >= 1) {
                jog += arrgr[dm3];
                jog += arrgr[dm6];
            }

            if (rp1 <= 8 && rp2 <= 9) {
                jog1 += arrgr[rp1];
                jog1 += arrgr[rp2];
            }

            jog2 += arrgr[10];
            jog2 += arrgr[21];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[7] = 1;
                arr[7] = 1;
                b7.setBackground(Color.GREEN);
            }
        }

        if (n == 8) {

            int jog = 0, jog1 = 0;

            if (up >= 7 && dw <= 9) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            if (dm3 == 5 && dm6 == 2) {
                jog1 += arrgr[dm3];
                jog1 += arrgr[dm6];
            }

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[8] = 1;
                arr[8] = 1;
                b8.setBackground(Color.GREEN);
            }
        }

        if (n == 9) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 8 && lm2 >= 7) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            if (dm3 >= 6 && dm6 >= 3) {
                jog1 += arrgr[dm3];
                jog1 += arrgr[dm6];
            }

            jog2 += arrgr[22];
            jog2 += arrgr[12];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[9] = 1;
                arr[9] = 1;
                b9.setBackground(Color.GREEN);
            }
        }

        //  green wait 
        if (n == 19) {

            int jog = 0, jog1 = 0;

            if (rp1 <= 20 && rp2 <= 21) {
                jog += arrgr[rp1];
                jog += arrgr[rp2];
            }

            jog1 += arrgr[1];
            jog1 += arrgr[16];

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[19] = 1;
                arr[19] = 1;
                b19.setBackground(Color.GREEN);
            }
        }

        if (n == 20) {

            int jog = 0, jog1 = 0;

            if (up >= 19 && dw <= 21) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            jog1 += arrgr[4];
            jog1 += arrgr[13];

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[20] = 1;
                arr[20] = 1;
                b20.setBackground(Color.GREEN);
            }
        }

        if (n == 21) {

            int jog = 0, jog1 = 0;

            if (lm1 >= 20 && lm2 >= 19) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            jog1 += arrgr[7];
            jog1 += arrgr[10];

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[21] = 1;
                arr[21] = 1;
                b21.setBackground(Color.GREEN);
            }
        }
        if (n == 22) {

            int jog = 0, jog1 = 0;

            if (rp1 <= 23 && rp2 <= 24) {
                jog += arrgr[rp1];
                jog += arrgr[rp2];
            }

            jog1 += arrgr[9];
            jog1 += arrgr[12];

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[22] = 1;
                arr[22] = 1;
                b22.setBackground(Color.GREEN);
            }
        }

        if (n == 23) {

            int jog = 0, jog1 = 0;

            if (up >= 22 && dw <= 24) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            jog1 += arrgr[6];
            jog1 += arrgr[15];

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[23] = 1;
                arr[23] = 1;
                b23.setBackground(Color.GREEN);
            }
        }

        if (n == 24) {

            int jog = 0, jog1 = 0;

            if (lm1 >= 23 && lm2 >= 22) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            jog1 += arrgr[3];
            jog1 += arrgr[18];

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[24] = 1;
                arr[24] = 1;
                b24.setBackground(Color.GREEN);
            }
        }

        if (n == 10) {
            int jog = 0, jog1 = 0, jog2 = 0;
            if (rp1 <= 11 && rp2 <= 12) {
                jog += arrgr[rp1];
                jog += arrgr[rp2];
            }
            if (dp3 <= 13 && dp6 <= 16) {
                jog1 += arrgr[dp3];
                jog1 += arrgr[dp6];
            }

            jog2 += arrgr[7];
            jog2 += arrgr[21];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[10] = 1;
                arr[10] = 1;
                b10.setBackground(Color.GREEN);
            }
        }

        if (n == 11) {

            int jog = 0, jog1 = 0;

            if (up >= 10 && dw <= 12) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            if (dp3 <= 14 && dp6 <= 17) {
                jog1 += arrgr[dp3];
                jog1 += arrgr[dp6];
            }

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[11] = 1;
                arr[11] = 1;
                b11.setBackground(Color.GREEN);
            }
        }

        if (n == 12) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 11 && lm2 >= 10) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            if (dp3 <= 15 && dp6 <= 18) {
                jog1 += arrgr[dp3];
                jog1 += arrgr[dp6];
            }

            jog2 += arrgr[22];
            jog2 += arrgr[9];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[12] = 1;
                arr[12] = 1;
                b12.setBackground(Color.GREEN);
            }
        }

        if (n == 13) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm3 >= 10 && rp3 <= 16) {
                jog += arrgr[lm3];
                jog += arrgr[rp3];
            }

            if (rp1 <= 14 && rp2 <= 15) {
                jog1 += arrgr[rp1];
                jog1 += arrgr[rp2];
            }

            jog2 += arrgr[20];
            jog2 += arrgr[4];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[13] = 1;
                arr[13] = 1;
                b13.setBackground(Color.GREEN);
            }
        }

        if (n == 14) {

            int jog = 0, jog1 = 0;

            if (up >= 13 && dw <= 15) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            if (lm3 >= 11 && rp3 <= 17) {
                jog1 += arrgr[lm3];
                jog1 += arrgr[rp3];
            }

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[14] = 1;
                arr[14] = 1;
                b14.setBackground(Color.GREEN);
            }
        }

        if (n == 15) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 14 && lm2 >= 13) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            if (lm3 >= 12 && rp3 <= 18) {
                jog1 += arrgr[lm3];
                jog1 += arrgr[rp3];
            }

            jog2 += arrgr[23];
            jog2 += arrgr[6];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[15] = 1;
                arr[15] = 1;
                b15.setBackground(Color.GREEN);
            }
        }

        if (n == 16) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (dm3 >= 13 && dm6 >= 10) {
                jog += arrgr[dm3];
                jog += arrgr[dm6];
            }

            if (rp1 <= 17 && rp2 <= 18) {
                jog1 += arrgr[rp1];
                jog1 += arrgr[rp2];
            }

            jog2 += arrgr[19];
            jog2 += arrgr[1];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[16] = 1;
                arr[16] = 1;
                b16.setBackground(Color.GREEN);
            }
        }

        if (n == 17) {

            int jog = 0, jog1 = 0;

            if (up >= 16 && dw <= 18) {
                jog += arrgr[up];
                jog += arrgr[dw];
            }

            if (dm3 >= 14 && dm6 >= 11) {
                jog1 += arrgr[dm3];
                jog1 += arrgr[dm6];
            }

            if (jog <= 1 && jog1 <= 1) {
                gre -= 1;
                arrgr[17] = 1;
                arr[17] = 1;
                b17.setBackground(Color.GREEN);
            }
        }

        if (n == 18) {

            int jog = 0, jog1 = 0, jog2 = 0;

            if (lm1 >= 17 && lm2 >= 16) {
                jog += arrgr[lm1];
                jog += arrgr[lm2];
            }

            if (dm3 >= 15 && dm6 >= 12) {
                jog1 += arrgr[dm3];
                jog1 += arrgr[dm6];
            }

            jog2 += arrgr[24];
            jog2 += arrgr[3];

            if (jog <= 1 && jog1 <= 1 && jog2 <= 1) {
                gre -= 1;
                arrgr[18] = 1;
                arr[18] = 1;
                b18.setBackground(Color.GREEN);
            }
        }
    }
    public static void main(String[] args) {

        Design frame1 = new Design();
    }

}
