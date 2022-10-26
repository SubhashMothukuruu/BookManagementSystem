package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
//	@Query(value=("select * from book where bookName :bookName"), nativeQuery = true)
//	public String findByName(@Param("bookName") String bookName);

}
