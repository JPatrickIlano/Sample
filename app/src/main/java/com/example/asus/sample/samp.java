package com.example.asus.sample;

public class samp {
    private Integer yearlevel;
    private Double units;
    private String name;
    private String yearname;

    public Double tuitionfee, rate, balance, dpayment;

    public Integer getYearlevel() {
        return yearlevel;
    }

    public void setYearlevel(Integer yearlevel) {
        this.yearlevel = yearlevel;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double Tuition()
    {

        if (units >= 1 && units <= 7) {
            dpayment = 800.00;
            tuitionfee = rate * units;
        } else if (units >= 8 && units <= 15) {
            dpayment = 1200.00;
            tuitionfee = rate * units;
        } else if (units >15){
            dpayment = 1800.00;
            tuitionfee = rate * units;
        }
        else {
            tuitionfee = 0.00;
        }
        return tuitionfee;
    }


    public String YearName() {
        if (yearlevel == 1) {
            rate = 350.00;
            yearname = "Freshman";
        } else if (yearlevel == 2) {
            rate = 335.00;
            yearname = "Sophomore";
        } else if (yearlevel == 3) {
            rate = 315.00;
            yearname = "Junior";
        } else if (yearlevel == 4) {
            rate = 300.00;
            yearname = "Senior";
        } else if (yearlevel == 5) {
            rate = 300.00;
            yearname = "Senior";
        } else {
            rate = 0.00;
            yearname = "Error";
        }
        return yearname;
    }

    public double Balance()
    {

        balance = Tuition() - dpayment;
        if(balance < 1){
            balance = 0.00;
        }
        return balance;


    }

}
