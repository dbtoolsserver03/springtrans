package spring.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringBean {
	private String text;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void show() {

		List<Map<String, Object>> ret = jdbcTemplate.queryForList("select * from t_item");
		for (Map<String, Object> map : ret) {
			System.out.println(map.get("item_id").toString() + "-" + map.get("item_name").toString());
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
