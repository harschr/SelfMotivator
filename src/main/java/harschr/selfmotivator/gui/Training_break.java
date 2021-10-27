package harschr.selfmotivator.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.TimerTask;
import java.awt.event.*;
import javax.swing.Timer;
import java.text.*;
import harschr.selfmotivator.model.Training;
import java.awt.TrayIcon;
import javax.swing.JOptionPane;

public class Training_break extends javax.swing.JFrame {

    private static int activity_number = 0;
    private static int round = 0;
    private static String activity1;
    private static String activity2;
    private static String activity3;
    private static String activity4;
    private static String activity5;
    private static int length_training1;
    private static int length_training2;
    private static int length_training3;
    private static int length_training4;
    private static int length_training5;
    private static int length_break;
    private static int recurrence;
    private int secondsBeforeStart = 3;
    private static Timer trainingTimer;
    private static Timer breakTimer;
    private static Timer startTimer;
    private DecimalFormat dFormat = new DecimalFormat("00");
    private int minute;
    private int startMinute;
    private int second;
    private int startSecond;
    private String ddMinute;
    private String ddSecond;
    private int minuteBreak;
    private int secondBreak;
    private String ddMinuteBreak;
    private String ddSecondBreak;

    public Training_break(Training tr) {
        this.activity1 = tr.getActivity1();
        this.activity2 = tr.getActivity2();
        this.activity3 = tr.getActivity3();
        this.activity4 = tr.getActivity4();
        this.activity5 = tr.getActivity5();
        this.length_training1 = tr.getLength_training1();
        this.length_training2 = tr.getLength_training2();
        this.length_training3 = tr.getLength_training3();
        this.length_training4 = tr.getLength_training4();
        this.length_training5 = tr.getLength_training5();
        this.length_break = tr.getLength_break();
        this.recurrence = tr.getRecurrence();
        initComponents();
        setLocationRelativeTo(null);
        countdownBefore();
        startTimer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_countdown = new java.awt.Panel();
        pn_start = new java.awt.Panel();
        lb_uwaga = new javax.swing.JLabel();
        lb_sec = new javax.swing.JLabel();
        lb_seconds = new javax.swing.JLabel();
        pn_break = new java.awt.Panel();
        lb_text_break = new javax.swing.JLabel();
        lb_time_break = new javax.swing.JLabel();
        pn_training = new java.awt.Panel();
        lb_text = new javax.swing.JLabel();
        lb_time = new javax.swing.JLabel();
        lb_activity_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SELFMOTIVATOR");
        getContentPane().setLayout(new java.awt.CardLayout());

        pn_countdown.setLayout(new java.awt.CardLayout());

        lb_uwaga.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_uwaga.setText("UWAGA! Start za");

        lb_sec.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_sec.setText("sek");

        lb_seconds.setFont(new java.awt.Font("Tahoma", 1, 120)); // NOI18N
        lb_seconds.setToolTipText("");

        javax.swing.GroupLayout pn_startLayout = new javax.swing.GroupLayout(pn_start);
        pn_start.setLayout(pn_startLayout);
        pn_startLayout.setHorizontalGroup(
            pn_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_startLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(lb_seconds, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_sec)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_startLayout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(lb_uwaga, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        pn_startLayout.setVerticalGroup(
            pn_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_startLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lb_uwaga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_seconds, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_startLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lb_sec)))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pn_countdown.add(pn_start, "pn_start");

        pn_break.setPreferredSize(new java.awt.Dimension(384, 327));

        lb_text_break.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_text_break.setText("Przerwa");

        lb_time_break.setFont(new java.awt.Font("Tahoma", 1, 120)); // NOI18N
        lb_time_break.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout pn_breakLayout = new javax.swing.GroupLayout(pn_break);
        pn_break.setLayout(pn_breakLayout);
        pn_breakLayout.setHorizontalGroup(
            pn_breakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_breakLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(lb_text_break)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_breakLayout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(lb_time_break, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        pn_breakLayout.setVerticalGroup(
            pn_breakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_breakLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lb_text_break)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_time_break, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pn_countdown.add(pn_break, "pn_break");

        pn_training.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pn_trainingKeyPressed(evt);
            }
        });

        lb_text.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lb_text.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_text.setText("Trening");

        lb_time.setFont(new java.awt.Font("Tahoma", 1, 120)); // NOI18N
        lb_time.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        lb_activity_name.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        lb_activity_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pn_trainingLayout = new javax.swing.GroupLayout(pn_training);
        pn_training.setLayout(pn_trainingLayout);
        pn_trainingLayout.setHorizontalGroup(
            pn_trainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_trainingLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(lb_activity_name, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(pn_trainingLayout.createSequentialGroup()
                .addGroup(pn_trainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_trainingLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(lb_text))
                    .addGroup(pn_trainingLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_trainingLayout.setVerticalGroup(
            pn_trainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_trainingLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lb_activity_name)
                .addGap(47, 47, 47)
                .addComponent(lb_text)
                .addGap(47, 47, 47)
                .addComponent(lb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pn_countdown.add(pn_training, "pn_training");

        getContentPane().add(pn_countdown, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pn_trainingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pn_trainingKeyPressed

    }//GEN-LAST:event_pn_trainingKeyPressed

    private void countdownBefore() {
        CardLayout card = (CardLayout) pn_countdown.getLayout();
        card.show(pn_countdown, "pn_start");

        lb_seconds.setText("" + 3);
        pn_start.setBackground(Color.PINK);
        startTimer = new Timer(1000, new ActionListener() {  //updates timer every one second
            @Override
            public void actionPerformed(ActionEvent e) { //mi történjen update-elés után
                secondsBeforeStart--;
                lb_seconds.setText("" + secondsBeforeStart);
                if (secondsBeforeStart == -1) {
                    startTimer.stop();
                    countdownTraining();
                    trainingTimer.start();
                }
            }
        ;
    }

    );
    }

    private void countdownTraining() {

        activity_number++;

        CardLayout card = (CardLayout) pn_countdown.getLayout();
        card.show(pn_countdown, "pn_training");
        pn_training.setBackground(Color.GREEN);

        switch (activity_number) {
            case 1:
                if (!activity1.isEmpty() && length_training1 != 0) {
                    round++;
                    lb_activity_name.setText(round + "/" + activity_number +". " + activity1);
                    minute = length_training1 / 60;
                    second = length_training1 % 60;
                    ddMinute = dFormat.format(minute);
                    ddSecond = dFormat.format(second);                   
                    lb_time.setText(ddMinute + ":" + ddSecond);
                    trainingTimer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            second--;
                            ddSecond = dFormat.format(second);
                            ddMinute = dFormat.format(minute);
                            if (second > 0 || second == 0) {
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if ((minute > 0 || minute == 0) && second == -1) {
                                second = 59;
                                minute--;
                                ddSecond = dFormat.format(second);
                                ddMinute = dFormat.format(minute);
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if (minute == -1 && second == 59) {
                                trainingTimer.stop();
                                if (!activity2.isEmpty() && length_training2 != 0) {
                                    countdownBreak();
                                    breakTimer.start();
                                } else {
                                    recurrence--;
                                    if (recurrence > 0) {
                                        activity_number = 0;
                                        countdownBreak();
                                        breakTimer.start();
                                    } else {
                                        showCompleteMessage();
                                    }
                                }
                            }
                        }
                    });
                } else {
                    dispose();
                    new Start().setVisible(true);
                }
                break;

            case 2:
                if (!activity2.isEmpty() && length_training2 != 0) {
                    lb_activity_name.setText(round + "/" + activity_number +". " + activity2);
                    minute = length_training2 / 60;
                    second = length_training2 % 60;
                    ddMinute = dFormat.format(minute);
                    ddSecond = dFormat.format(second);
               //     pn_training.setBackground(Color.RED);
                    lb_time.setText(ddMinute + ":" + ddSecond);
                    trainingTimer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            second--;
                            ddSecond = dFormat.format(second);
                            ddMinute = dFormat.format(minute);
                            if (second > 0 || second == 0) {
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if ((minute > 0 || minute == 0) && second == -1) {
                                second = 59;
                                minute--;
                                ddSecond = dFormat.format(second);
                                ddMinute = dFormat.format(minute);
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if (minute == -1 && second == 59) {
                                trainingTimer.stop();
                                if (!activity3.isEmpty() && length_training3 != 0) {
                                    countdownBreak();
                                    breakTimer.start();
                                } else {
                                    recurrence--;
                                    if (recurrence > 0) {
                                        activity_number = 0;
                                        countdownBreak();
                                        breakTimer.start();
                                    } else {
                                        showCompleteMessage();                                
                                    }
                                }
                            }
                        }
                    });
                } else {
                    dispose();
                    new Start().setVisible(true);
                }
                break;

            case 3:
                if (!activity3.isEmpty() && length_training3 != 0) {
                    lb_activity_name.setText(round + "/" + activity_number +". " + activity3);
                    minute = length_training3 / 60;
                    second = length_training3 % 60;
                    ddMinute = dFormat.format(minute);
                    ddSecond = dFormat.format(second);
              //      pn_training.setBackground(Color.RED);
                    lb_time.setText(ddMinute + ":" + ddSecond);
                    trainingTimer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            second--;
                            ddSecond = dFormat.format(second);
                            ddMinute = dFormat.format(minute);
                            if (second > 0 || second == 0) {
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if ((minute > 0 || minute == 0) && second == -1) {
                                second = 59;
                                minute--;
                                ddSecond = dFormat.format(second);
                                ddMinute = dFormat.format(minute);
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if (minute == -1 && second == 59) {
                                trainingTimer.stop();
                                if (!activity4.isEmpty() && length_training4 != 0) {
                                    countdownBreak();
                                    breakTimer.start();
                                } else {
                                    recurrence--;
                                    if (recurrence > 0) {
                                        activity_number = 0;
                                        countdownBreak();
                                        breakTimer.start();
                                    } else {
                                         showCompleteMessage();
                                    }
                                }
                            }
                        }
                    });
                } else {
                    dispose();
                    new Start().setVisible(true);
                }
                break;

            case 4:
                if (!activity4.isEmpty() && length_training4 != 0) {
                    lb_activity_name.setText(round + "/" + activity_number +". " + activity4);
                    minute = length_training4 / 60;
                    second = length_training4 % 60;
                    ddMinute = dFormat.format(minute);
                    ddSecond = dFormat.format(second);
             //       pn_training.setBackground(Color.RED);
                    lb_time.setText(ddMinute + ":" + ddSecond);
                    trainingTimer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            second--;
                            ddSecond = dFormat.format(second);
                            ddMinute = dFormat.format(minute);
                            if (second > 0 || second == 0) {
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if ((minute > 0 || minute == 0) && second == -1) {
                                second = 59;
                                minute--;
                                ddSecond = dFormat.format(second);
                                ddMinute = dFormat.format(minute);
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if (minute == -1 && second == 59) {
                                trainingTimer.stop();
                                if (!activity5.isEmpty() && length_training5 != 0) {
                                    countdownBreak();
                                    breakTimer.start();
                                } else {
                                    recurrence--;
                                    if (recurrence > 0) {
                                        activity_number = 0;
                                        countdownBreak();
                                        breakTimer.start();
                                    } else {
                                          showCompleteMessage();
                                    }
                                }
                            }
                        }
                    });
                } else {
                    dispose();
                    new Start().setVisible(true);
                }
                break;

            case 5:
                if (!activity5.isEmpty() && length_training5 != 0) {
                     lb_activity_name.setText(round + "/" + activity_number +". " + activity5);
                    minute = length_training5 / 60;
                    second = length_training5 % 60;
                    ddMinute = dFormat.format(minute);
                    ddSecond = dFormat.format(second);
             //       pn_training.setBackground(Color.RED);
                    lb_time.setText(ddMinute + ":" + ddSecond);
                    trainingTimer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            second--;
                            ddSecond = dFormat.format(second);
                            ddMinute = dFormat.format(minute);
                            if (second > 0 || second == 0) {
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if ((minute > 0 || minute == 0) && second == -1) {
                                second = 59;
                                minute--;
                                ddSecond = dFormat.format(second);
                                ddMinute = dFormat.format(minute);
                                lb_time.setText(ddMinute + ":" + ddSecond);
                            }
                            if (minute == -1 && second == 59) {
                                trainingTimer.stop();
                                recurrence--;
                                if (recurrence > 0) {
                                    activity_number = 0;
                                    countdownBreak();
                                    breakTimer.start();
                                } else {
                                   showCompleteMessage();
                                }
                            }
                        }
                    });
                } else {
                    dispose();
                    new Start().setVisible(true);
                }
                break;
        }
    }

    private void countdownBreak() {
        CardLayout card = (CardLayout) pn_countdown.getLayout();
        card.show(pn_countdown, "pn_break");

        minuteBreak = length_break / 60;
        secondBreak = length_break % 60;
        ddMinuteBreak = dFormat.format(minuteBreak);
        ddSecondBreak = dFormat.format(secondBreak);
        pn_training.setBackground(Color.GREEN);
        lb_time_break.setText(ddMinuteBreak + ":" + ddSecondBreak);

        breakTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondBreak--;
                ddSecondBreak = dFormat.format(secondBreak);
                ddMinuteBreak = dFormat.format(minuteBreak);
                if (secondBreak > 0 || secondBreak == 0) {
                    lb_time_break.setText(ddMinuteBreak + ":" + ddSecondBreak);
                }
                if (secondBreak == -1) {
                    secondBreak = 59;
                    minuteBreak--;
                    ddSecondBreak = dFormat.format(secondBreak);
                    ddMinuteBreak = dFormat.format(minuteBreak);
                    lb_time_break.setText(ddMinuteBreak + ":" + ddSecondBreak);
                }
                if (minuteBreak == -1 && secondBreak == 59) {
                    breakTimer.stop();
                    countdownTraining();
                    trainingTimer.start();
                }
            }
        });

    }

    private void showCompleteMessage() {
        int n = JOptionPane.showOptionDialog(this, "Gratulacje - ćwiczenie został pomyślnie zakończone!", "Sukces", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"OK"}, null);
        if (n == JOptionPane.OK_OPTION) {
            dispose();
            new Start().setVisible(true);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Training_break.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Training_break.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Training_break.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Training_break.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Training_break(new Training()).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_activity_name;
    private javax.swing.JLabel lb_sec;
    private javax.swing.JLabel lb_seconds;
    private javax.swing.JLabel lb_text;
    private javax.swing.JLabel lb_text_break;
    private javax.swing.JLabel lb_time;
    private javax.swing.JLabel lb_time_break;
    private javax.swing.JLabel lb_uwaga;
    private java.awt.Panel pn_break;
    private java.awt.Panel pn_countdown;
    private java.awt.Panel pn_start;
    private java.awt.Panel pn_training;
    // End of variables declaration//GEN-END:variables
}
