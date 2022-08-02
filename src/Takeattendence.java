
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;


public class Takeattendence extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3502024109032056383L;
	public Takeattendence(String k) {
        initComponents(k);
    }

	public void UpdateJTable(){
		
	}
    @SuppressWarnings("unchecked")
	private void initComponents(String s) {
    	String sub=s;
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATTENDANCE REPORT FOR STUDENTS STUDYING");
        
        @SuppressWarnings("rawtypes")
		JComboBox stucb = new JComboBox();
        stucb.setFont(new Font("Tahoma", Font.PLAIN, 17));
        try {
        	String file = "/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/students.txt";
            @SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(new FileReader(file));
        	String line, stu0, stu1, stu;
            while ((line = br.readLine()) != null) {
                stu0 = line.split(",")[0];
                stu1 = line.split(",")[1];
                
                stu = stu0+" "+stu1;
                stucb.addItem(stu);
            }
            
        } catch (Exception e) {
           

        } 
        
        JLabel lblStudent = new JLabel("Student");
        lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
        lblStudent.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        txtDate = new JTextField();
        txtDate.setToolTipText("DD/MM/YYYY");
        txtDate.setHorizontalAlignment(SwingConstants.CENTER);
        txtDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtDate.setColumns(10);
        
        JButton btnAbsent = new JButton("Absent");
        btnAbsent.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String stu = (String) stucb.getSelectedItem();
        		try{    
      	           String f ="/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/"+sub+".txt";;
      	           BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
      	           output.append(stu+",Absent"+","+txtDate.getText());
        	       output.newLine();
      	           output.close();
      	           }
        		catch(Exception e1){
        			System.out.println(e1);
        		} 
        	}
        });
        
        JButton btnPresent = new JButton("Present");
        btnPresent.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String stu = (String) stucb.getSelectedItem();
        		try{    
      	           String f ="/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/"+sub+".txt";
      	           BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
      	           output.append(stu+",Present"+","+txtDate.getText());
        	       output.newLine();
      	           output.close();
      	           }
        		catch(Exception e1){
        			System.out.println(e1);
        		}
        	}
        });
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try{    
     	           String f ="/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/"+sub+"Total.txt";
     	           BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
     	           output.append(txtDate.getText());
     	           output.newLine();
     	           output.close();
     	           
     	          JOptionPane.showMessageDialog(null, "You have successfully submitted", "Submitted", JOptionPane.PLAIN_MESSAGE);
     	           }
      		catch(Exception e1){
      			System.out.println(e1);
      		}
        	}
        });
        
        
        
       
        
        
   
        JButton btnNewButton = new JButton("Back");
         
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnNewButtonActionPerformed(evt);
            }
        });
        
        JLabel lblNewLabel = new JLabel("Today's Date");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JLabel lblNewLabel_1 = new JLabel("(After taking all of the attendance please click \"Submit\")");
        lblNewLabel_1.setForeground(Color.GRAY);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton jButton2 = new JButton("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        	
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        			.addGap(60))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(104)
        			.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(65)
        			.addComponent(jButton2)
        			.addGap(44))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(68)
        					.addComponent(btnAbsent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(66)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblStudent, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(118)
        					.addComponent(btnPresent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGap(135))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(60)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(txtDate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        						.addComponent(stucb, 0, 172, Short.MAX_VALUE))
        					.addGap(111))))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        			.addContainerGap())
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(stucb, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblStudent, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
        			.addGap(10)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(12)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnAbsent)
        						.addComponent(btnPresent))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnNewButton)
        						.addComponent(jButton2))
        					.addContainerGap(12, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSubmit)
        					.addGap(29))))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(115)
        			.addComponent(lblNewLabel_1)
        			.addContainerGap(96, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }
    protected void jButton2ActionPerformed(ActionEvent evt) {
    	 System.exit(1);
		
	}

	private void btnNewButtonActionPerformed(ActionEvent evt) {
    	this.toBack();
    	Teacher1 f2 = new Teacher1("");
        f2.setVisible(true);
        f2.toFront();
        dispose();
        
            
    }
    
    public static void main(String args[]) {
        new Takeattendence("Maths").setVisible(true);
    }
    private javax.swing.JLabel jLabel1;
    private JTextField txtDate;
}
