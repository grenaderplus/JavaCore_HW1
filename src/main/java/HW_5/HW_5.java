package HW_5;

public class HW_5 {
    public static void main(String[] args) {

        Employe[] empArr = new Employe[5];
        empArr[0] = new Employe("Alex Murfie", "Developer", "Murfie@dev.com", "8(999)321-32-21", 150000, 39);
        empArr[1] = new Employe("Elen Donovan", "Developer", "Donovan@dev.com", "8(999)123-23-13", 150000, 29);
        empArr[2] = new Employe("Boris Rutmore", "Marketing Manager", "Rutmore@mark.com", "8(999)890-80-90", 80000, 42);
        empArr[3] = new Employe("Dan Weiss", "Purchasing Manager", "Weiss@purch.com", "8(999)345-45-35", 80000, 54);
        empArr[4] = new Employe("Jim Morriss", "Coordinator", "Morriss@coord.com", "8(999)567-67-57", 80000, 27);

        for (int i = 0; i < empArr.length; i++) {
            int j = empArr[i].getAge();
            if (j > 40) {
                empArr[i].info();
            }
        }
    }
}
