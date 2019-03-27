package com.hcl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.Book;

@Repository
public class BookDaoImpl implements BookDao {
 
   
    private SessionFactory sessionFactory;
    
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
    public void addBook(Book book) {
        sessionFactory.getCurrentSession().save(book);
    }
 
    @Override
    public void removeBook(Integer id) {
        Book book = (Book)sessionFactory.getCurrentSession()
            .load(Book.class, id);
        if(null != book) {
            sessionFactory.getCurrentSession().delete(book);
        }
    }
 
    @Override
    @SuppressWarnings("unchecked")
    public List<Book> listBooks() {
        return sessionFactory.getCurrentSession()
            .createQuery("from Book").list();
    }
 
    @Override
    public void updateBook(Book book) {
        sessionFactory.getCurrentSession().update(book);
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public Book getBookById(Integer bookId) {
        Session session = sessionFactory.getCurrentSession();
        List<Book> list = session.createQuery("from Book b where b.id = :bkId")
            .setParameter("bkId", bookId).list();
       // return list.size() > 0 ?(Book)list.get(0): null;
        if(list.size()!=0){
        	Book book =(Book)list.get(0);
        	return book;
        }else{
        	return null;
        }
    }
}
