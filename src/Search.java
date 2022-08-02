import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.Writer;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("unused")
public class Search extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9045446600138314933L;
	public Search(String S) {
        initComponents(S);
    }
	private void initComponents(String S) {
		
		String Sub = S;
		
		
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        
        
        jtextField2 = new JTextField();
        jtextField2.setColumns(10);	
        
        
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BackButton = new JButton("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        

        jLabel1.setText("Starting Date");
        
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	BackButtonActionPerformed(evt);
            }

			private void BackButtonActionPerformed(ActionEvent evt) {
				if( evt.getSource() == BackButton)
		        {
					Report f2 = new Report(Sub);
			        f2.setVisible(true);
			        dispose();
		        }
			}
        });

        

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ATTENDANCE REPORT FOR STUDENTS STUDYING");
        
        
        String B = jTextField1.getText();
        String C = jtextField2.getText();
        
        jbutton1 = new JButton("Submit");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton1ActionPerformed(evt);
            }

			private void jButton1ActionPerformed(ActionEvent evt) {
				if( evt.getSource() == jbutton1)
		        {
					String B = jTextField1.getText();
			        String C = jtextField2.getText();
					TotalSearch t = new TotalSearch(B,Sub,C);
	        		
	        		dispose();
		        }
			}
        });
        
        JLabel lblNewLabel = new JLabel("Ending Date");
        
       
        
       
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(77)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 494, Short.MAX_VALUE)
        			.addGap(107))
        		.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        			.addGap(13)
        			.addComponent(BackButton)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblNewLabel)
        					.addContainerGap())
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(jbutton1)
        							.addGap(159)
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        							.addGap(81)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jtextField2, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        								.addComponent(jTextField1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))))
        					.addGap(79))))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(6)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel)
        				.addComponent(jtextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        					.addComponent(jbutton1)
        					.addGap(23))
        				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(BackButton)
        						.addComponent(jButton2))
        					.addContainerGap())))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }
    public static void main(String args[], String S) {
    	new Search(S).setVisible(true);    
    }
    private javax.swing.JButton jButton2;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private JButton jbutton1;
    private JTextField jtextField2;
}
