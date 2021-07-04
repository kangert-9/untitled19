package lesson14;

public class CheckingArr {

    public CheckingArr() {
    }

    public static int[] lastfour(int[] myArr) {
        int fur = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 4) {
                fur = i;
            }
        }
        //System.out.println(fur);
        int[] arrNew = new int[myArr.length - fur - 1];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = myArr[fur + 1 + i];
        }
        //System.out.println(Arrays.toString(arrNew));
        return arrNew;
    }

    public static boolean chechfour(int[] myArr) {
        int fur = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 4) {
                fur++;
            }
        }
        //System.out.println(fur);
        if (fur == 0) {
            return false;
        } else {
            return true;
        }
    }
}
