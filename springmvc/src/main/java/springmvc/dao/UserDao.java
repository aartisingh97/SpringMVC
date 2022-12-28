package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import springmvc.model.User;

public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int saveUser(User user) {
		Integer id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}

}
