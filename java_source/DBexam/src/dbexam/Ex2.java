package dbexam;

import java.sql.*;
import java.util.Properties;

public class Ex2 {
	public static void main(String[]args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "1234");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		
		try(Connection conn = DriverManager.getConnection(url, props);
			Statement stmt = conn.createStatement()) { // Statement 리소스, 닫아줘야함. AutoCloseable라서 이렇게 써줘도 됨.
			System.out.println("연결 성공!!");
			
			
			String sql = "SELECT * FROM Book";
			ResultSet rs = stmt.executeQuery(sql); // ResultSet 리소스, 닫아줘야함.
			while(rs.next()) { // 다음 투플이 있으면 true, 없으면 false
				int bookid = rs.getInt("bookid");
				String bookname = rs.getString("bookname");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				System.out.println("bookid = " + bookid + ", bookname = " + bookname + ", publisher = " + publisher + ", price = " + +price);
			}
			
			rs.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
