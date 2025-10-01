package vn.com.payment.gateway.database.home;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.annotation.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;

public abstract  class BaseHome<T> {
//	public abstract class BaseHome<T, ID> {

	// Giả sử bạn có EntityManager để thao tác

//	private static final Logger log = LogManager.getLogger(TBLGATEWAYTRANSSEQHome.class);
//	Gson gson = new Gson();
	@PersistenceContext
	protected EntityManager entityManager;

	private final Class<T> entityClass;

	// Constructor để truyền class của entity (vì generic bị xóa tại runtime)
	public BaseHome(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	@Transactional
	public T save(T entity) {

		entityManager.persist(entity);
		return entity;
	}
	@Transactional
	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public T findById(Object id) {

		return entityManager.find(entityClass, id);
	}

	public List<T> findAll() {
		String ql = "SELECT e FROM " + entityClass.getSimpleName() + " e";
		return entityManager.createQuery(ql, entityClass).getResultList();
	}
	@Transactional
	public void delete(T entity) {
		entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
	}

	public List<T> findByExample(T example) {
		StringBuilder jpql = new StringBuilder("SELECT e FROM " + entityClass.getSimpleName() + " e WHERE 1=1");
		Map<String, Object> params = new HashMap<>();

		Field[] fields = entityClass.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			 if (Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.getName().equals("serialVersionUID")) {
		            continue;
		        }
//			if (field.is)
			try {
				Object value = field.get(example);
				if (value != null) {
					jpql.append(" AND e.").append(field.getName()).append(" = :").append(field.getName());
					params.put(field.getName(), value);
				}
			} catch (IllegalAccessException e) {
				throw new RuntimeException("Error accessing field: " + field.getName(), e);
			}
		}

		TypedQuery<T> query = entityManager.createQuery(jpql.toString(), entityClass);
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue());
		}

		return query.getResultList();
	}

	public Boolean checkExist(T example) {
		try {
			List<T> t = findByExample(example);
			if (t.size() > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}
}
