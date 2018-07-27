package cn.itcast.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UserDao {

	
	//得到JdbcTemplate对象
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void add() {

		//创建jdbcTemplate对象，设置数据源
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into user values(?,?)";
		jdbcTemplate.update(sql, "李蕾", "5201314");
	}
}
