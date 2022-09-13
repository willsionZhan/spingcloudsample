package org.gene.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    //部门编号
    private int deptNum;

    public Dept(){

    }

    public Dept(int deptNum, String name) {
        this.deptNum = deptNum;
        this.name = name;
    }

    public int getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(int deptNum) {
        this.deptNum = deptNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //部门名称
    private String name;
}
