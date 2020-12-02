package wicketdetails;

public class Wicket {
	private Long over;
	private Long ball;
	private String wicketType;
	private String playerName;
	private String bowler;
	public Wicket() {
		// TODO Auto-generated constructor stub
	}
	public Wicket(Long over, Long ball, String wicketType, String playerName, String bowler) {
		super();
		this.over = over;
		this.ball = ball;
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowler = bowler;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public String getWicketType() {
		return wicketType;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	
}
