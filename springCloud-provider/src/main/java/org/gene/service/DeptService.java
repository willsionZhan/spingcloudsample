package org.gene.service;

import org.gene.pojo.Dept;
import org.springframework.stereotype.Service;

@Service
public interface DeptService {
    /**
     * 添加部门
     * @return bloolean
     */
    boolean addDept(Dept dept);

    /**
     *  查询部门
     * @return Dept
     */
    Dept selectDeptById(int id);
}
