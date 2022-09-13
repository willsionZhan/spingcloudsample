package org.gene.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.gene.pojo.Dept;

@Repository
@Mapper
public interface DeptMapper {
    /**
     * 添加部门
     * @return bloolean
     */
    boolean addDept(Dept dept);

    /**
     *  查询部门
     * @return Dept
     */
    Dept slel(int id);
}
