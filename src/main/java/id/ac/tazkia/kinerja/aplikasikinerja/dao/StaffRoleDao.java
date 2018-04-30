package id.ac.tazkia.kinerja.aplikasikinerja.dao;

import id.ac.tazkia.kinerja.aplikasikinerja.entity.StaffRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Set;


public interface StaffRoleDao extends PagingAndSortingRepository <StaffRole, String> {

    Set<StaffRole> findDistinctBySuperiorRoleIn(Set<StaffRole> roles);
    Page<StaffRole> findByStatusAndAndRoleNameContainingIgnoreCaseOrderByRoleName(String s, String role, Pageable page);
    Page<StaffRole> findByStatus(String s,Pageable page);
    List<StaffRole> findByStatus(String s);
}
