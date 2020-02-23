package repl_it_Assignments.P226_Carpet;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public Carpet() {
        length = 300;
        width = 300;
        totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

       totalPrice = (width + length) * unitPrice;
        if (isPersian == true) {
            this.totalPrice += 200;
    }


    }




}