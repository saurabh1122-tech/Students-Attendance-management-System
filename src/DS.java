import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
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
import javax.swing.JComboBox;
import javax.swing.JTextField;


@SuppressWarnings("unused")
public class DS extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9045446600138314933L;
	public DS(String S) {
        initComponents(S);
    }
	private void initComponents(String S) {
		
		String Sub = S;

        jLabel1 = new javax.swing.JLabel();
        	
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BackButton = new JButton("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        

        jLabel1.setText("Today's Date");
        
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

        
        stucb = new JTextField();
        stucb.setColumns(10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ATTENDANCE REPORT FOR STUDENTS STUDYING");
        
        jbutton1 = new JButton("Submit");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton1ActionPerformed(evt);
            }

			private void jButton1ActionPerformed(ActionEvent evt) {
				if( evt.getSource() == jbutton1)
		        {
					
					String B = stucb.getText();
					DateSearch t = new DateSearch(B ,Sub);
	        		
	        		dispose();
		        }
			}
        });
        
      
       
        
       
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        			.addGap(77)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(57)
        							.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(BackButton)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(jbutton1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        							.addGap(337))
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addComponent(jButton2)
        							.addGap(46))
        						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        							.addComponent(stucb, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
        							.addGap(69))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 549, Short.MAX_VALUE)
        					.addGap(107))))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jLabel4)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(stucb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jbutton1, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        			.addGap(16)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        				.addComponent(BackButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }
    public static void main(String args[], String S) {
    	new DS(S).setVisible(true);    
    }
    private javax.swing.JButton jButton2;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private JButton jbutton1;
    private JTextField stucb;
}
