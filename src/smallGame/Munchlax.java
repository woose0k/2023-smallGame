package smallGame;

public class Munchlax extends Pokemon {



    public Munchlax() {

        super();

    }

    @Override
    public int getHungry() {
        return super.getHungry();
    }

    @Override
    public int getSleepy() {
        return super.getSleepy();
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println("먹고자에게 밥을 주었습니다.");

    }

    @Override
    public void play() {
        super.play();
        System.out.println("먹고자와 놀아줬습니다.");
    }

    @Override
    public void asleep() {
        super.asleep();
        System.out.println("먹고자가 잠을 잤습니다.");
    }



    @Override
    public String getStatus() {
        return super.getStatus();
    }


    @Override
    public void runAway() {
        System.out.println("먹고자가 도망쳤습니다.");
    }
    public boolean evolve() {
        if (super.friendship >= 100) {
            System.out.println("먹고자가 진화했습니다!");
            return true;
        }
        return false;
    }



    public void decreaseStats() {
        int hungryDecrease = (int) (Math.random() * 10) + 1;
        int sleepyIncrease = (int) (Math.random() * 10) + 1;

        super.hungry = Math.max(super.hungry - hungryDecrease, 0);
        super.sleepy = Math.max(super.sleepy + sleepyIncrease, 0);
    }
}

