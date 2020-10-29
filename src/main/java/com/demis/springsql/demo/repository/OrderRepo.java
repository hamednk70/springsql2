package com.demis.springsql.demo.repository;

import com.demis.springsql.demo.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {
//    @Query("INSERT INTO Orders (orderdate,customer_id,totalamount,ordernumber)VALUES('Jan 29 2014 12:00:00:000AM',40,649.00,'542982')")

    @Query(value = "  INSERT INTO [Orders]  ([orderdate],[customer_id],[totalamount],[ordernumber])VALUES('Jan 29 2014 12:00:00:000AM',40,649.00,'542983')",nativeQuery = true)
    Orders saveorder();

}
