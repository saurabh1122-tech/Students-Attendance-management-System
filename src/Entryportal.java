
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.io.*;
import java.util.*;
import javax.swing.JLabel;


@SuppressWarnings("unused")
public class Entryportal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7522526792628754248L;
	public Entryportal() {
        initComponents();
    }
    
	private void initComponents() {
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        loginb = new javax.swing.JButton();
        cancelb = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Information");
        setName("Entryportal");

        jLabel3.setText("User Type:");

        loginb.setText("Login");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelb.setText("Cancel");
        cancelb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ATTENDANCE MANAGEMENT SYSTEM");
        
        lblNewLabel = new JLabel("Teacher");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(87)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(91, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(80)
        					.addComponent(loginb, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(121, Short.MAX_VALUE)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
        					.addComponent(cancelb, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(48)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        			.addGap(89)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(51)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(loginb, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        				.addComponent(cancelb))
        			.addGap(121))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       if( evt.getSource() == loginb)
        {
        Teacher1 f2 = new Teacher1("");
        f2.setVisible(true);
        dispose();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }

    public static void main(String args[]) {
        
    	new Entryportal().setVisible(true);
    	
    }
    private javax.swing.JButton loginb;
    private javax.swing.JButton cancelb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private JLabel lblNewLabel;
}
