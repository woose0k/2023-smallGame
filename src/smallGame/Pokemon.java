package smallGame;
}
public class Pokemon {

    int hungry;
    int friendship;
    int sleepy;

    public int getHungry() {
        return hungry;
    }

    public int getSleepy() {
        return sleepy;
    }

    public Pokemon() {
        hungry = 30;
        friendship = 0;
        sleepy = 20;
    }

    public void feed() {
        hungry += 20;

    }

    public void play() {
        friendship += 30;

    }

    public void asleep() {
        sleepy -= 30;

    }


    public void runAway() {
        System.out.println("포켓몬이 도망쳤습니다.");

    }
    public String getStatus() {
        return "포만감 : " + hungry + ", 친밀도 : " + friendship +  ", 피곤함 : " + sleepy;
    }
}