public class Player {

    private String name;
    private Score score;

    public Player(String name) {
    	this.name = name;
    }

    public String getName() {
        return name;
    }

    public void winPoints() {
        this.score.addPoint();
    }

    public Score getScore() {
        return this.score;
    }

}
