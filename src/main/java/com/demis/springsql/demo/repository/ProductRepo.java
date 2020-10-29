package com.demis.springsql.demo.repository;

import com.demis.springsql.demo.model.Product;
import com.demis.springsql.demo.model.ProductResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


    public List<Product> getProductBySupplier(Integer id);
    public List<Product> findBySupplierId(Integer id);

    @Query("select p from Product p")
    List<Product> findAllPro();


    @Query("select NEW com.demis.springsql.demo.model.ProductResult( o.productName) from Product o")
    List<ProductResult> findAllProduct();

    @Query(value = "SELECT * FROM dbo.Product WHERE (IsDiscontinued = ?1)",nativeQuery = true)
    List<Product> findByIsDiscontinued(int id);

//    @Query("select p from Product p join p.supplier s ")
//    @Query(value = "SELECT        dbo.Product.*, dbo.Supplier.*\n" +
//            "FROM            dbo.Product INNER JOIN\n" +
//            "                         dbo.Supplier ON dbo.Product.SupplierId = dbo.Supplier.Id WHERE (dbo.Product.IsDiscontinued = 1)", nativeQuery = true)
//    @Query(value = "dbo.ProductSelect", nativeQuery = true) //stor procture
    @Query(value = "SELECT * FROM dbo.viewpro", nativeQuery = true) // view in sql server
    List<Product> findBysupplier();
}
