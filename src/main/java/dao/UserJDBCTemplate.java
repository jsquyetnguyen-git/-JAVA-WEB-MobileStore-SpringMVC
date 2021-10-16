package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import model.User;

public class UserJDBCTemplate {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public User getAdmin(String username, String password) {
		try {
		String SQL = "select * from account where account_role = 1 and user_mail = ? and password = ?";
		User user = jdbcTemplate.queryForObject(SQL, new Object[] { username, password },
				new UserMapper());
		return user;
		}catch (Exception e) {
			return null;
		}
	}
}
