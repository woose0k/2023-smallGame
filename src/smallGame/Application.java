package smallGame

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Munchlax munchlax = new Munchlax();
        Scanner sc = new Scanner(System.in);
        System.out.println("===========잠만보로 진화 시키기=========");
        System.out.println("먹고자의 상태: " + munchlax.getStatus());

        label:
        while (true) {

            if (munchlax.getHungry() == 0 || munchlax.getSleepy() >= 100) {

                munchlax.runAway();
                System.out.println("먹고자가 도망쳐서 게임이 종료되었습니다.");
                break;
            }
            System.out.println("어떤 행동을 하시겠습니까?");
            System.out.println("1. 밥 주기");
            System.out.println("2. 놀아주기");
            System.out.println("3. 잠 자기");
            System.out.println("4. 현재 상태창");
            System.out.println("5. 게임 종료");

            int selectNum = sc.nextInt();

            switch (selectNum) {
                case 1:
                    munchlax.feed();
                    break;
                case 2:
                    munchlax.play();
                    break;
                case 3:
                    munchlax.asleep();
                    break;
                case 4:
                    System.out.println("먹고자의 상태: " + munchlax.getStatus());
                    break;
                case 5:
                    System.out.println("게임을 종료합니다.");
                    break label;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }

            munchlax.decreaseStats();


            if (munchlax.evolve()) {
                System.out.println("게임이 종료되었습니다. 잠만보로 진화했습니다!!!");
                break;
            }

        }
    }
}


