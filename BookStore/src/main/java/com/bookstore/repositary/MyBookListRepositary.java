package com.bookstore.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookstore.entity.MyBookList;

@Repository
public interface MyBookListRepositary  extends JpaRepository<MyBookList, Integer>{

}
