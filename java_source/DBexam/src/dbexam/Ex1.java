package dbexam;

import java.sql.*;

public class Ex1 {
	public static void main(String[]args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "root";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/madang"; // 암기
		
		
		try (Connection conn = DriverManager.getConnection(url, user, password); ) {  // 리소스 오픈 -> 꼭 닫아 줘야하지만 AutoCloseable이 되기 때문에 이렇게 넣어줌.
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		//DriverManager.getConnection 
	}
}
