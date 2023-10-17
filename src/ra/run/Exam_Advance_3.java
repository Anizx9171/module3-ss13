package ra.run;

import ra.config.Config;

import java.util.LinkedList;
import java.util.Queue;

public class Exam_Advance_3 {
    static Queue<String> phuHuynh = new LinkedList<>();
    public static void main(String[] args) {
        int choice;
        while (true){
            System.out.println("""
                    ****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************
                    1. Nhập tên phụ huynh nộp hồ sơ
                    2. Phụ huynh tiếp theo
                    3. Thoát
                    """);
            choice = Integer.parseInt(Config.scanner().nextLine());
            switch (choice){
                case 1:
                    importString();
                    break;
                case 2:
                    importNextString();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void importString() {
        System.out.println("Nhập tên phụ huynh");
        String name = Config.scanner().nextLine();
        phuHuynh.offer(name);
    }

    private static void importNextString() {
        System.out.println("Đã duyệt phụ huynh: " + phuHuynh.poll());
        System.out.println("Nhập tên phụ huynh kế tiếp");
        String name = Config.scanner().nextLine();
        phuHuynh.offer(name);
    }

}
