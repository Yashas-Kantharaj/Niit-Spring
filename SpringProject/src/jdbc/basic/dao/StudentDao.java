package jdbc.basic.dao;

import jdbc.basic.model.Student;

public interface StudentDao {
	public void insert(Student s) ;
	public void delRecordById(int id);

}
