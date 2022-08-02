import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DateSearch {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	private final JButton Cancel = new JButton("Cancel");
	private final JButton Back = new JButton("Back");
	
	DateSearch(String B, String Sub){
		
		String S_date = B;
		
		String Subject = Sub;
		
		welcomeLabel.setBounds(23,6,378,17);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		welcomeLabel.setText("ATTENDANCE"+S_date+"FOR STUDENTS STUDYING");
		
		frame.getContentPane().add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.getContentPane().setLayout(null);
		
		JScrollPane jscrollPane2 = new JScrollPane();
		jscrollPane2.setBounds(23, 58, 378, 275);
		frame.getContentPane().add(jscrollPane2);
		frame.setVisible(true);
		
		JTable jTable2 = new javax.swing.JTable();
		jTable2.setAutoCreateRowSorter(true);
        
        jscrollPane2.setViewportView(jTable2);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }

			private void CancelActionPerformed(ActionEvent evt) {
				System.exit(1);
				
			}
        });
        Cancel.setBounds(297, 357, 117, 29);
        
        frame.getContentPane().add(Cancel);
        Back.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Report f3 = new Report(Subject);
                f3.setVisible(true);
                frame.dispose();
            }
        });
        Back.setBounds(6, 357, 117, 29);
        
        frame.getContentPane().add(Back);
        
        String filePath = "/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/"+Subject+".txt";
        File file = new File(filePath);
        
        try {

            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            model.setColumnCount(3);
            

            
            
            String s;
            
            String word = S_date.toString();
            try (BufferedReader br = new BufferedReader(new FileReader(file))){
            
            
			while((s=br.readLine()) != null)
            {
            	
                
            	if(s.contains(word))
            	{
                    String[] datarow = s.split(",");
                    model.addRow(datarow);}
            		
                }
            
            }
        }  
         catch (Exception ex) {
            
        }
	}
}