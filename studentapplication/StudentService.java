package com.evergent.corejava.studentapplication;
public class StudentService {
	                           //100      corejava    250
	public int addStudentService(int sId,String sName,float sMarks)
	{  String grade="";
	
	   if(sMarks>=30 && sMarks<=55)
	   {
		   grade = "C";
	   }
	   else if(sMarks>=60 && sMarks<=75)
	   {
		   grade = "B";
		   
	   }
	   else
	   {
		   grade = "A";
	   }	
		
		StudentDAO StudentDAO = new StudentDAO();
		studentBean studentBean=new studentBean();
	       studentBean.setsId(sId);	
	       studentBean.setsName(sName);
	       studentBean.setsMarks(sMarks);
	       studentBean.setGrade(grade);
	
		   
		int updateResult= StudentDAO.addStudent(studentBean);
		
		return 1;
	} 
}
