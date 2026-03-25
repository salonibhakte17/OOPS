class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float calculate() {
        return basic + hra + da;
    }

    void havedata(int empno, String ename, float basic, float hra, float da) {
        this.empno = empno;
        this.ename = ename;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.netpay = calculate();
    }

    void dispdata() {
        System.out.println("Emp No: " + empno);
        System.out.println("Name: " + ename);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(1, "Saloni", 20000, 3000, 2000);
        e.dispdata();
    }
}