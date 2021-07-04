package lesson14;


import org.junit.jupiter.api.Test;

import static lesson14.CheckingArr.chechfour;
import static lesson14.CheckingArr.lastfour;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        lastfour(arr);
        chechfour(arr);
    }
}

