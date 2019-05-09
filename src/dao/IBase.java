package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface IBase {
	public void save(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public void merge(Object obj);
	public void saveOrUpdate(Object obj);

	public Object findById(Class clz,Serializable id);
	public List findByHQL(String hql);
	public List findByDetached(DetachedCriteria dc);
}
