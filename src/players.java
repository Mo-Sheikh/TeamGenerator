
public class players {
	
	public String player;
	public Integer rating;
	
	
	public players(String player, Integer rating) {
		this.player = player;
		this.rating = rating;
		
	}
	
	public Integer getRating () {
		
		return rating;
	}
	
	
	@Override
	public String toString() {
		return player;
	
	}
	
	@Override
	public int hashCode() {
		return rating;
	
	}
	

}
