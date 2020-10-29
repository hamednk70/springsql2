package com.demis.springsql.demo.repository;
import com.demis.springsql.demo.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Integer> {
    @Query("select t,d,c from Organization t" +
            " join t.departmentByDepartmentId d" +
            " join d.customerByCustomeerId c" +
            " where c.city = :code ")
    Organization findByCode(@Param("code") String code);

//    @Query("from Organization t" +
//            " join Department d on t.departmentByDepartmentId.id = d.id" +
//            " join Customer c" +
//            "  where c.city = :code ")
//    Organization findByAll(@Param("code") String code);
}
