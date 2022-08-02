
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class Report extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3502024109032056383L;
	public Report(String k) {
        initComponents(k);
    }

	
    private void initComponents(String sub) {
    	String S = sub;
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GENERATE REPORT");
                                        
        
        
        
        
        JButton DailyS = new JButton("Daily attendance of student");
        DailyS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	DS f3 = new DS(S);
                f3.setVisible(true);
                dispose();
                
            }
        });

        
        JButton DateS = new JButton("Attendance of student in selected period");
        DateS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	Date f3 = new Date(S);
                f3.setVisible(true);
                dispose();
                
            }
        });
        
        JButton SearchS = new JButton("Attendance of a student");
        SearchS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        		SearchS f3 = new SearchS(S);
                f3.setVisible(true);
                dispose();
        		
            }
        });
        
        JButton TotalClass = new JButton("Total Number classes in a Period");
        TotalClass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            		Search f3 = new Search(S);
	                f3.setVisible(true);
	                dispose();
            }
        });
        
        
        JButton Back = new JButton("Back");
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Teacher1 f3 = new Teacher1("");
                f3.setVisible(true);
                dispose();
            }
        });
        
        JButton cancel = new JButton("Cancel");

        JButton Cancel = new JButton("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }

			private void CancelActionPerformed(ActionEvent evt) {
				System.exit(1);
				
			}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(68)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(TotalClass, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        				.addComponent(SearchS, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        				.addComponent(DateS, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        				.addComponent(DailyS, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
        			.addGap(71))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(35, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
        			.addGap(30))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(85)
        			.addComponent(Back, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
        			.addComponent(cancel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        			.addGap(84))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(jLabel1)
        			.addGap(37)
        			.addComponent(DailyS)
        			.addGap(35)
        			.addComponent(DateS)
        			.addGap(28)
        			.addComponent(SearchS)
        			.addGap(39)
        			.addComponent(TotalClass)
        			.addGap(55)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(Back, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cancel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(74, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private javax.swing.JLabel jLabel1;
}
