
package university.management.system;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;



public class Project extends JFrame implements ActionListener{
    Project(){
       setSize(1540,850);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
         JMenu newInformation = new JMenu("New Information");
         newInformation.setForeground(Color.BLUE);
         mb.add(newInformation);
         
         JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
         facultyInfo.setBackground(Color.WHITE);
         facultyInfo.addActionListener(this);
         newInformation.add(facultyInfo);
         
         JMenuItem studentInfo = new JMenuItem("New  student Information");
         studentInfo.addActionListener(this);
          studentInfo.setBackground(Color.WHITE);
         newInformation.add( studentInfo);
         
         
         
         //details
         JMenu details= new JMenu("View Details");
         details.setForeground(Color.RED );
         mb.add(details);
         
         JMenuItem facultydetails = new JMenuItem("view Faculty Details");
          facultydetails.addActionListener(this);
         facultydetails.setBackground(Color.WHITE);
        details.add(facultydetails);
         
         JMenuItem studentdetails = new JMenuItem("view  student Details");
           studentdetails.addActionListener(this);
          studentdetails.setBackground(Color.WHITE);
        details.add( studentdetails);
         
        //Leave
         JMenu leave= new JMenu("Apply Leave");
         leave.setForeground(Color.BLUE);
         mb.add(leave);
         
         JMenuItem facultyleave = new JMenuItem("Faculty leave");
         facultyleave.setBackground(Color.WHITE);
          facultyleave.addActionListener(this);
        leave.add(facultyleave);
         
         JMenuItem studentleave= new JMenuItem("student leave");
         studentleave.setBackground(Color.WHITE);
         studentleave.addActionListener(this);
         leave.add( studentleave);
       
         //Leave details
         JMenu leaveDetails= new JMenu(" Leave Details");
         leaveDetails.setForeground(Color.RED);
         mb.add(leaveDetails);
         
         JMenuItem facultyleavedetails= new JMenuItem("Faculty leaveDetails");
         facultyleavedetails.setBackground(Color.WHITE);
          facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
         
         JMenuItem studentleavedetails= new JMenuItem("student leaveDetails");
         studentleavedetails.setBackground(Color.WHITE);
          studentleavedetails.addActionListener(this);
         leaveDetails.add( studentleavedetails);
         
         //Exams
         
          JMenu exam= new JMenu("Examination");
          exam.setForeground(Color.BLUE);
          mb.add(exam);
         
          JMenuItem examinationdetails= new JMenuItem("Examination Result");
          examinationdetails.setBackground(Color.WHITE);
          examinationdetails.addActionListener(this);
          exam.add(examinationdetails);
         
         JMenuItem entermarks= new JMenuItem("Enter Marks");
          entermarks.addActionListener(this);
         entermarks.setBackground(Color.WHITE);
         exam.add( entermarks);
         
         //UpdateInfo
         JMenu updateinfo= new JMenu("Update Details");
          updateinfo.setForeground(Color.RED);
          mb.add(updateinfo);
         
          JMenuItem updatefacultyinfo= new JMenuItem("Update Faculty details");
          updatefacultyinfo.setBackground(Color.WHITE);
          updatefacultyinfo.addActionListener(this);
          updateinfo.add(updatefacultyinfo);
         
         JMenuItem updatestudentinfo= new JMenuItem("Update Student Details");
         updatestudentinfo.addActionListener(this);
        updatestudentinfo.setBackground(Color.WHITE);
         updateinfo.add(updatestudentinfo);
         
         //fees
         
          JMenu fee= new JMenu("Fee Details");
          fee.setForeground(Color.BLUE);
          mb.add(fee);
         
          JMenuItem feesstructure= new JMenuItem("Fee Structure");
          feesstructure.setBackground(Color.WHITE);
          fee.add(feesstructure);
         
         JMenuItem feeform= new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
         fee.add(feeform);
         
         //Utility
         JMenu utility= new JMenu("Utility");
          utility.setForeground(Color.RED);
          mb.add(utility);
         
          JMenuItem notepad= new JMenuItem("Notepad");
          notepad.setBackground(Color.WHITE);
          notepad.addActionListener(this);
         utility.add(notepad);
         
         JMenuItem calc= new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
         utility.add(calc);
         
         
         //Exit
         
         JMenu exit= new JMenu("Exit");
          exit.setForeground(Color.BLUE);
          mb.add(exit);
         
          JMenuItem ex= new JMenuItem("Exit");
          ex.setBackground(Color.WHITE);
          ex.addActionListener(this);
         exit.add(ex); 
         
         setJMenuBar(mb);
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
          String msg = ae.getActionCommand();
          if(msg.equals("Exit")){
              setVisible(false);
          } else if(msg.equals("Calculator")){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){
                      
                }
          }
          else if(msg.equals("Notepad")){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){
                     
                }
          }
          else if(msg.equals("New  student Information")){
              new AddStudent();
          }
          else if(msg.equals("New Faculty Information")){
              new AddTeacher();
          }
          
          
           else if(msg.equals("view  student Details")){
              new TeacherDetails();
          }
          else if(msg.equals("view Faculty Details")){
              new StudentDetails();
          }else if (msg.equals("Faculty leave")) {
            new TeacherLeave();
        } else if (msg.equals("student leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty leaveDetails")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("student leaveDetails")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Result")) {
            new ExaminationDetails();
        }
          
          
          
          
        
    }
    
      public static void main (String[] args){
          new Project();
}
}
