package dao;

import model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setEmail(rs.getString("user_mail"));
		user.setPassword(rs.getString("password"));
		user.setRole(rs.getInt("account_role"));
		user.setName(rs.getString("user_name"));
		user.setAddress(rs.getString("user_address"));
		user.setPhone(rs.getString("user_phone"));
		return user;
	}
}
