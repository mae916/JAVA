package test;

import java.sql.*;

public class Ex1 {
	public static void main(String[]args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String userPassword = "aA!12345";
		
		String sql = "CALL InsertMember(?, ?, ?, ?)";
		String sql2 = "SELECT * FROM Member";
		try (Connection conn = DriverManager.getConnection(url, user, userPassword);
				CallableStatement cstmt = conn.prepareCall(sql);
				PreparedStatement pstmt = conn.prepareStatement(sql2)){
				cstmt.setInt(1, Integer.parseInt(args[0]));
				cstmt.setString(2, args[1]);
				cstmt.setString(3, args[2]);
				cstmt.setString(4, args[3]);
				int rs = cstmt.executeUpdate();
				System.out.println("affect rows : " + rs);
				
				ResultSet rs2 = pstmt.executeQuery();
				
				if(rs2.next()) {
					String memPassword = rs2.getString("password");
					
					if(memPassword.equals(memPassword)) {
						
						System.out.println("로그인 되었습니다.");
						
					} else {
						
						System.out.println("회원정보가 일치하지 않습니다.");
						
					}
				}
				
				rs2.close();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}