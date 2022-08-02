import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TotalSearch {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	private final JButton Cancel = new JButton("Cancel");
	private final JButton Back = new JButton("Back");
	
	TotalSearch(String B, String Sub,String C){
		
		String S_date = B;
		
		String Subject = Sub;
		
		String S_end = C;
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		welcomeLabel.setBounds(6,6,490,17);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		welcomeLabel.setText("ATTENDANCE FOR STUDENTS STUDYING");
		
		frame.getContentPane().add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(533, 273);
		frame.getContentPane().setLayout(null);
		
		
        
        String filePath = "/Users/saurabhbharali/Documents/Summer-project/Students-Attendance-management-System/src/"+Subject+"Total.txt";
        File file = new File(filePath);
            
            

       
        String s;
        
        int LowCount = 0;
        int Upcount = 0;

        int a = 0;
        
        String word1 = S_date.toString();
        String word2 = S_end.toString();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
        
        
		while((s=br.readLine()) != null)
	        {
	        	
				
	            
	        	if(s.contains(word1))
	        	{
	                break;
	            }
	
	            LowCount++;
	        		
	        	}
            }  
             catch (Exception ex) {
                
            }

            try (BufferedReader br = new BufferedReader(new FileReader(file))){
                
                
                while((s=br.readLine()) != null)
                {
                	if(s.contains(word2))
                	{
                        a = Upcount;
                        a++;
                       
                    }
                	Upcount++;
    	        		
                }       
            }  
            catch (Exception ex) {
               
           }
           
            int Total = 0;
            int i = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(file))){

                Object[] tableLines = br.lines().toArray();
        				
        				
        	            
                for(i = LowCount; i < a; i++)
                {
                    @SuppressWarnings("unused")
					String line = tableLines[i].toString().trim();
                    
                }
            }
            catch (Exception ex) {
               
            }
            
            Total = i;
            
            JLabel lblNewLabel = new JLabel("Total Number of classes in '"+S_date+"' to '"+S_end+"' is: '"+Total);
            lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(6, 94, 490, 16);
			frame.getContentPane().add(lblNewLabel);
			Cancel.setBounds(392, 187, 117, 29);
			
			frame.getContentPane().add(Cancel);

	        JButton Cancel = new JButton("Cancel");
	        Cancel.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                CancelActionPerformed(evt);
	            }

				private void CancelActionPerformed(ActionEvent evt) {
					System.exit(1);
					
				}
	        });
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
			
			Back.setBounds(24, 187, 117, 29);
			
			frame.getContentPane().add(Back);
			frame.setVisible(true);
	}
}