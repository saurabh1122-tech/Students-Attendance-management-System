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


@SuppressWarnings("unused")
public class SearchS extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9045446600138314933L;
	public SearchS(String S) {
        initComponents(S);
    }
	@SuppressWarnings("unchecked")
	private void initComponents(String S) {
		
		String Sub = S;

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        	
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BackButton = new JButton("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        

        jLabel1.setText("Student Name");
        
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
        
        
        @SuppressWarnings("rawtypes")
      	JComboBox stucb = new JComboBox();
        
        
        
        jbutton1 = new JButton("Submit");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton1ActionPerformed(evt);
            }

			private void jButton1ActionPerformed(ActionEvent evt) {
				if( evt.getSource() == jbutton1)
		        {
					String B = (String) stucb.getSelectedItem();
					DateSearch t = new DateSearch(B,Sub);
	        		
	        		dispose();
		        }
			}
        });
        
      
        try {
        	String file = "/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/students.txt";
            @SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(new FileReader(file));
        	String line, stu0, stu1, stu;
            while ((line = br.readLine()) != null) {
                stu0 = line.split(",")[0];
                stu1 = line.split(",")[1];
                
                stu = stu0+" "+stu1;
                stucb.addItem(stu);}
            
        } catch (Exception e) {
            

        } 
       
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(33)
        					.addComponent(BackButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGap(307))
        				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
        					.addGap(102)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        					.addGap(55))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(stucb, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
        					.addGap(136))))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(82)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
        			.addGap(124))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(350)
        			.addComponent(jbutton1, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        			.addGap(330))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jLabel4)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(stucb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addGap(18)
        			.addComponent(jbutton1, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        			.addGap(16)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    	new SearchS(S).setVisible(true);    
    }
    private javax.swing.JButton jButton2;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private JButton jbutton1;
}
