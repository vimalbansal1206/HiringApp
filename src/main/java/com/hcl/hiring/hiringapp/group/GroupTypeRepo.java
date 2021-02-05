package com.hcl.hiring.hiringapp.group;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface GroupTypeRepo extends JpaRepository<GroupType, Long> {

}
