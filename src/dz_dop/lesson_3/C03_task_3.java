package dz_dop;

public class C03_task_3 {
    public static void main(String[] args) {
        int a = 2;
        boolean b = 1 > --a;
        boolean x = 1 > -1 * a;
        boolean z = 1 > (a-1);
        int c = (-5*-10+20+30-(a++)/12+ ++a)*0;
        boolean v = 1 > c;
        System.out.println(b + "\n" + x + "\n" + z + "\n" + v);

    }
}
