package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukDAO {

	private Connection conn;
	private PreparedStatement pstmt; // 가이드 역할
	private ResultSet rs;

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "bit";

	public SungJukDAO() {
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}// 생성자

	// 접속
	public void getConnection() {
		try {

			conn = DriverManager.getConnection(url, username, password); // 오라클 드라이버 3개중 많이쓰는게 thin
			// (URL,USERNAME,PASSWORD)
			System.out.println("접속성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 생성
	public void insertArticle(SungJukDTO sjd) {
		int sn = sjd.getSn();
		String name = sjd.getName();
		int kor = sjd.getKor();
		int eng = sjd.getEng();
		int math = sjd.getMath();
		int tot = sjd.getTot();
		double avg = sjd.getAvg();

		this.getConnection();

		String sql = "insert into sungjuk values(?,?,?,?,?,?,?)";

		try {
			// 접속

			// 생성
			pstmt = conn.prepareStatement(sql);

			// ?에 데이터 매핑
			pstmt.setInt(1, sn);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			pstmt.setInt(6, tot);
			pstmt.setDouble(7, avg);

			// 실행
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// insertArticle()

	
	
	public List<SungJukDTO> printArticle() {
		List<SungJukDTO> list = new ArrayList<SungJukDTO>();
		String sql = "select * from sungjuk";

		getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			// 실행
			rs = pstmt.executeQuery();

			while (rs.next()) {
				SungJukDTO sjd = new SungJukDTO();
				sjd.setSn(rs.getInt("sn"));
				sjd.setName(rs.getString("name"));
				sjd.setKor(rs.getInt("kor"));
				sjd.setEng(rs.getInt("eng"));
				sjd.setMath(rs.getInt("math"));
				sjd.setTot(rs.getInt("tot"));
				sjd.setAvg(rs.getDouble("avg"));

				list.add(sjd);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			list = null;
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}// printArticle()

	public SungJukDTO searchArticle(int sn) {

		SungJukDTO sjd = null;
		String sql = "select * from sungjuk where sn = ?";

		getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sn);

			// 실행
			rs = pstmt.executeQuery();

			if (rs.next()) {
				sjd = new SungJukDTO();
				sjd.setSn(rs.getInt("sn"));
				sjd.setName(rs.getString("name"));
				sjd.setKor(rs.getInt("kor"));
				sjd.setEng(rs.getInt("eng"));
				sjd.setMath(rs.getInt("math"));
				sjd.setTot(rs.getInt("tot"));
				sjd.setAvg(rs.getDouble("avg"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			sjd = null;
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return sjd;
	}// searchArticle

	public int deleteArticle(String name) {
		int su=0;
		String sql = "delete sungjuk where name = ?";
		
		getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			su = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return su;
	}//deleteArticle

	public List<SungJukDTO> sortArticle(int num) {
		
		List<SungJukDTO> list = new ArrayList<SungJukDTO>();
		String sql = null;
		if(num==1)
			sql = "select * from sungjuk order by name asc";
		else
			sql = "select * from sungJuk order by tot desc";
		
		getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SungJukDTO sjd = new SungJukDTO();
				sjd.setSn(rs.getInt("sn"));
				sjd.setName(rs.getString("name"));
				sjd.setKor(rs.getInt("kor"));
				sjd.setEng(rs.getInt("eng"));
				sjd.setMath(rs.getInt("math"));
				sjd.setTot(rs.getInt("tot"));
				sjd.setAvg(rs.getDouble("avg"));
				
				list.add(sjd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			list=null;
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return list;
	}

	
	
	
	
	
	
	

}
