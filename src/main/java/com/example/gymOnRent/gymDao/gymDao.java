package com.example.gymOnRent.gymDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gymOnRent.gymBo.UserSignUpBo;

@Repository
public class gymDao implements gymDaoInt {

	@PersistenceContext
	private EntityManager entity;
	
	@Autowired
	public gymDao(EntityManager em) {
		entity=em;
	}
	
	@Override
	public List<UserSignUpBo> getList() {
		Query query=entity.createQuery("From UserSignUpBo", UserSignUpBo.class);
		List<UserSignUpBo> list = query.getResultList();
		return list;
	}
	public List<Object[]> getNameAndPassword()
	{
		List<Object[]> a1 ;
		String str = " Select name,password from signup";
		a1 = entity.createNativeQuery(str).getResultList();
		return a1;
	     
	}

	@Override
	public UserSignUpBo find(int id) {
		Session ses = entity.unwrap(Session.class);
		UserSignUpBo user = ses.get(UserSignUpBo.class, id);
		return user;
	}

	@Override
	public UserSignUpBo saveDetail(UserSignUpBo user) {
		Session ses = entity.unwrap(Session.class);
		ses.saveOrUpdate(user);
	    ses.persist(user);
	    ses.flush();
	    return user;
		
	}

	@Override
	public void deleteDetail(int userid) {
		Query query = entity.createQuery("delete From UserSignUpBo where userid =: userid");
		query.setParameter("userid", userid);
		query.executeUpdate();
		
	}

}

