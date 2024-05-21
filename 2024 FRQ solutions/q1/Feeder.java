public class Feeder{
  private int currentFood;

  public Feeder(int currentFood){
    this.currentFood = currentFood;
  }

  public void simulateOneDay(int numBirds){
    int normality = (int) (Math.random() * 100 + 1);
    if (normality <= 95){
      int gramsPerBird = (int) (Math.random() * 41 + 10);
      currentFood = currentFood - (gramsPerBird * numBirds);
    }
    else{
      currentFood = 0;
    }
  }

  public int simulateManyDays(int numBirds, int numDays){
    int curDays = 0;
    while(currentFood >= 0 && curDays != numDays){
      curDays++;
      simulateOneDay(numBirds);
    }
    return curDays;
  }
 
}
