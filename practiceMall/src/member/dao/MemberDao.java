package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.JdbcUtil;

public class MemberDao {
	
	private static MemberDao memberDao = new MemberDao();
	
	private MemberDao() {}
	
	public static MemberDao getInstance() {
		return memberDao;
	}
	
	public MemberDto select(Connection conn, String member_id) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto memberDto = null;
		
		try {
			pstmt = conn.prepareStatement("select * from mall_member where member_id=?");
			pstmt.setString(1, member_id);
			rs = pstmt.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					memberDto = toMemberDto(rs);
				}
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return memberDto;
		
	}
	
	public void insert(Connection conn, MemberDto memberDto) throws SQLException {
		try(PreparedStatement pstmt = conn.prepareStatement("insert into mall_member "
				+ "values((select nvl(max(member_number), 0)+1 from mall_member), ?, ?, ?, ?, 0, sysdate)")){
			pstmt.setString(1, memberDto.getMember_id());
			pstmt.setString(2, memberDto.getMember_password());
			pstmt.setString(3, memberDto.getMember_name());
			pstmt.setString(4, memberDto.getMember_type());
			pstmt.executeUpdate();
		}
	}
	
	public MemberDto toMemberDto(ResultSet rs) throws SQLException {
		MemberDto memberDto = new MemberDto();
		memberDto.setMember_number(rs.getString("member_number"));
		memberDto.setMember_id(rs.getString("member_id"));
		memberDto.setMember_password(rs.getString("member_passwd"));
		memberDto.setMember_name(rs.getString("member_name"));
		memberDto.setMember_type(rs.getString("member_type"));
		memberDto.setMember_point(rs.getInt("member_point"));
		memberDto.setMember_reg_date(rs.getDate("member_reg_date"));
		return memberDto;
	}
	
}
