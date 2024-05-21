import java.util.ArrayList;

public class WordCracker{
  private ArrayList<String> wordList;

  public WordCracker(ArrayList<String> wordList){
    this.wordList = wordList;
  }

  public boolean isWordChain(){
    boolean itIs = true;
    for(int i = 1; i < wordList.size(); i++){
      if(wordList.get(i).indexOf(i-1) == -1){
        itIs = false;
      }
    }
    return itIs;
  }

  public ArrayList<String> createList(String target){
    ArrayList<String> newArr = new ArrayList<String>();
    for(int i = 0; i < wordList.size(); i++){
      if(wordList.get(i).indexOf(target) >= 0){
        newArr.add(wordList.get(i).substring(target.length() + wordList.get(i).indexOf(target), wordList.get(i).length()));
      }   
    }
    return newArr;
  }

  
}
