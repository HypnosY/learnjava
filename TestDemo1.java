package com.leon.demo;

public class TestDemo1 {
    public static void main(String[] args) {
        //1.产生各自的独立对象
        Dept dept = new Dept(10,"销售部","南宁");
        Emp ea  = new Emp(1,"肖婷","销售经理",10000.0,2000.0);
        Emp eb  = new Emp(2,"朱嘉宇","销售副经理",8000.0,1000.0);
        Emp ec  = new Emp(3,"张三","销售员工",4000.0,500.0);
        //2.设置雇员和领导关系
        eb.setMgr(ea);
        ec.setMgr(eb);
        //3.设置雇员和部门的关系
        ea.setDept(dept);
        eb.setDept(dept);
        ec.setDept(dept);
        dept.setEmps(new Emp[]{ea,eb,ec});
        //第二步：根据表结构描述取得设置的数据
        System.out.println(ea.getInfo());
        System.out.println(eb.getMgr().getInfo());
        System.out.println(ec.getMgr().getInfo());
        for (int i = 0; i < dept.getEmps().length; i++) {
            System.out.println("\t|-" + dept.getEmps()[i].getInfo());
            if (dept.getEmps()[i].getMgr() != null) {
                System.out.println("\t|-" + dept.getEmps()[i].getMgr().getInfo());
            }
        }
    }

}

class Dept{
    private int deptno;  //部门编号
    private String dname;
    private String loc;
    private Emp emps[];

    public Dept(int deptno,String dname,String loc){
        this.deptno = deptno;
        this.dname  = dname;
        this.loc    = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Emp[] getEmps() {
        return emps;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    public String getInfo(){
        return "部门编号:" + this.deptno + "、部门名称：" + this.dname + "、部门位置：" + this.loc;
    }

}

class Emp{
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;
    private Dept dept;
    private Emp mgr;

    public Emp(int empno,String ename,String job,double sal,double comm){
        this.empno = empno;
        this.ename = ename;
        this.job   = job;
        this.sal   = sal;
        this.comm  = comm;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp getMgr() {
        return mgr;
    }

    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }

    public String getInfo(){
        return "雇员编号" + this.empno + " 姓名：" + this.ename + "、职位：" + this.job + "、工资：" + this.sal + "、佣金：" + this.comm;
    }
}