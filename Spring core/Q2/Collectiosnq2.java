package springcore_example;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collectiosnq2 {
	int quid;
	String que;
	
	public List<String> answers;
    public Set<String>  answersSet;
    public Map<Integer,String> answersMap;
	public int getQuid() {
		return quid;
	}
	public void setQuid(int quid) {
		this.quid = quid;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set<String> getAnswersSet() {
		return answersSet;
	}
	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}
	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}
	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}
    public void displaylist() {
    	System.out.println(quid+"-> "+que);
        for(String ans:answers){
            System.out.println(ans);
      }
    }
    public void displaySet(){
        System.out.println(quid+"-> "+que);
        for(String ans:answersSet){
            System.out.println(ans);
        }
    }
    public void displayMap(){
        System.out.println(quid+"-> "+que);
        Set set = answersMap.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry m1 =(Map.Entry)itr.next();
            System.out.println(m1.getKey()+". "+m1.getValue());
        }
    }
}
