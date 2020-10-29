package com.demis.springsql.demo.repository;

import com.demis.springsql.demo.model.Product;
import com.demis.springsql.demo.model.Rec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecRepo extends JpaRepository<Rec, Integer> {

        @Query("select p from Rec p")
//    @Query(value = "SELECT        dbo.Product.*, dbo.Supplier.*\n" +
//            "FROM            dbo.Product INNER JOIN\n" +
//            "                         dbo.Supplier ON dbo.Product.SupplierId = dbo.Supplier.Id WHERE (dbo.Product.IsDiscontinued = 1)", nativeQuery = true)
//    @Query(value = "dbo.selectRec", nativeQuery = true) //stor procture
    List<Rec> findBykol();
}
