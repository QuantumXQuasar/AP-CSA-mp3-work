public class Scoreboard {
  private String team1;
  private String team2;
  private int score1;
  private int score2;
  private boolean turn;

  public Scoreboard(String team1, String team2){
    this.team1 = team1;
    this.team2 = team2;
    score1 = 0;
    score2 = 0;
    turn = true;
  }

  public void recordPlay(int num){
    if(turn == true){
      score1 += num;
      if(num == 0){
        turn = false;
      }
    }
    else{
      score2+= num;
      if(num == 0){
        turn = true;
      }
    }
  }

  public String getScore(){
    if(turn == true){
      return score1 + "-" + score2 + "-team1";  
    }
    return score1 + "-" + score2 + "-team2";
  }
