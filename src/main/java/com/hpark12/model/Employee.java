package com.hpark12.model;

import java.util.Date;

public class Employee {

    private int eid;
    private String ename;
    private String etitle;
    private Date createdDate;
    private String createdBy;

    public Employee(){
        super();
    }

    public Employee(int eid, String ename, String etitle, Date createdDate, String createdBy) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.etitle = etitle;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEtitle() {
        return etitle;
    }

    public void setEtitle(String etitle) {
        this.etitle = etitle;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (eid != employee.eid) return false;
        if (ename != null ? !ename.equals(employee.ename) : employee.ename != null) return false;
        if (etitle != null ? !etitle.equals(employee.etitle) : employee.etitle != null) return false;
        if (createdDate != null ? !createdDate.equals(employee.createdDate) : employee.createdDate != null)
            return false;
        return createdBy != null ? createdBy.equals(employee.createdBy) : employee.createdBy == null;
    }

    @Override
    public int hashCode() {
        int result = eid;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (etitle != null ? etitle.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        return result;
    }
}
