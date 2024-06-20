package status;

import java.util.Scanner;

public class Status {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0 for ZERO, 1 for ONE, 2 for TWO, 3 for THREE)");
        int code = in.nextInt();
        statuscode statusCode;

        switch (code) {
            case 0:
                statusCode = statuscode.ZERO;
                break;
            case 1:
                statusCode = statuscode.ONE;
                break;
            case 2:
                statusCode = statuscode.TWO;
                break;
            case 3:
                statusCode = statuscode.THREE;
                break;
            default:
                System.out.println("NOT VALID CODE");
                return;
        }

        StausUser t = new StausUser();
        t.statusDetail(statusCode);
    }
}
