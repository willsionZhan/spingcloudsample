package org.gene.service.impl;

import org.gene.mapper.DeptMapper;
import org.gene.pojo.Dept;
import org.gene.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public Dept selectDeptById(int id) {
        return deptMapper.slel(id);
    }
}
