package dbexam;

import java.sql.*;

public class Ex1 {
	public static void main(String[]args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "root";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/madang"; // �ϱ�
		
		
		try (Connection conn = DriverManager.getConnection(url, user, password); ) {  // ���ҽ� ���� -> �� �ݾ� ��������� AutoCloseable�� �Ǳ� ������ �̷��� �־���.
			System.out.println("���� ����!");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		//DriverManager.getConnection 
	}
}
