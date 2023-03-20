package j24_User.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBConnectionMgr;

public class UserRepository {
	private DBConnectionMgr pool;
	
	public UserRepository() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public User findUserByUsername(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst where username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = User.builder()
						.usercode(rs.getInt(1))
						.name(rs.getString(2))
						.email(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))
						.build();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user;
	}
	
	public int save(User user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			String sql = "insert into user_mst values(0, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getUsername());
			pstmt.setString(4, user.getPassword());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
	
	public int remove(int usercode) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			String sql = "delete from user_mst where usercode = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, usercode);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
		
	}
	
	public List<User> getUserList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<User> userList = new ArrayList<User>();
		
		try {
			con = pool.getConnection();
			String sql = "select * from user_mst";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				User user = User.builder()
						.usercode(rs.getInt(1))
						.name(rs.getString(2))
						.email(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))
						.build();
				
				userList.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return userList;
	}
	
	public int updatePassword(int usercode, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			String sql = "update user_mst set password = ? where usercode = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setInt(2, usercode);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
}










