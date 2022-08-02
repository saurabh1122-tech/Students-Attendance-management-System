

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
public class Addstudent extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9045446600138314933L;
	public Addstudent() {
        initComponents();
    }
	private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField1 = new javax.swing.JTextField();
        
        textField = new JTextField();
        textField.setColumns(10);
        
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(UIManager.getColor("Button.background"));
        jButton1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        jButton1.setBorder(UIManager.getBorder("Button.border"));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton1ActionPerformed(evt);
            }

			private void jButton1ActionPerformed(ActionEvent evt) {
				if( evt.getSource() == jButton1)
		        {
					try{
				           String f ="/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/students.txt";
				           BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
				           output.append(jTextField1.getText()+","+textField+","+jTextField3.getText());
				           output.newLine();
				           output.close();
				           JOptionPane.showMessageDialog(null, "You have successfully added", "Add", JOptionPane.PLAIN_MESSAGE);
				       }
					catch(Exception e1){
						System.out.println(e1);
					}        
		        }
			}
        });
        	
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BackButton = new JButton("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        

        jLabel1.setText("First Name");

        jButton1.setText("OK");
        
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
		        Teacher1 f2 = new Teacher1("");
		        f2.setVisible(true);
		        dispose();
		        }
			}
        });

        

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Student Info");

       
        jLabel5.setText("Semester");
        
        JLabel lblLastName = new JLabel();
        lblLastName.setText("Last Name");
        lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
       
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(184)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(30)
        							.addComponent(jLabel1)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
        					.addGap(12)
        					.addComponent(lblLastName)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(13)
        					.addComponent(BackButton)
        					.addGap(55)
        					.addComponent(jLabel5)
        					.addGap(101)
        					.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jLabel4)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1)
        				.addComponent(lblLastName))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(5)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(BackButton)
        				.addComponent(jButton2))
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }
    public static void main(String args[]) {
    	new Addstudent().setVisible(true);    
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private JTextField textField;
}
