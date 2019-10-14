package project.quizapplication;
import java.util.*;
public class Quiz {
	public void begin() {
		Question q1 =new Question(" What of the following is the default value of an instance variable?", 
				"null", "0", "Depends upon the type of variable", "abc", new Answer("abc"));
		Question q2 =new Question(" What of the following is the default value of an instance variable?", 
				"null", "0", "Depends upon the type of variable", "Not Assigned", new Answer("0"));
		Question q3 =new Question(" What of the following is the default value of an instance variable?", 
				"null", "0", "Depends upon the type of variable", "Not Assigned", new Answer("null"));
		Question q4 =new Question(" What of the following is the default value of an instance variable?", 
				"null", "0", "Depends upon the type of variable", "Not Assigned", new Answer("Depends upon the type of variable"));
		Question q5 =new Question(" What of the following is the default value of an instance variable?", 
				"null", "0", "Depends upon the type of variable", "Not Assigned", new Answer("null"));
		
		Question questionArr[] = {q1, q2, q3, q4, q5};
		int countTotal = 0;
		int countCorrect = 0;
		int countWrong = 0;
		for(Question q: questionArr) {
			System.out.println(q.question);
			System.out.println("A. " + q.getOption1());
			System.out.println("B. " + q.getOption2());
			System.out.println("C. " + q.getOption3());
			System.out.println("D. " + q.getOption4());
			System.out.println("Enter An Option");
			Scanner sc= new Scanner(System.in);
			char option = sc.next().charAt(0);
			String answer = "";
			switch(option) {
			case 'A' :
				answer = q.getOption1();
				break;
			case 'B':
				answer = q.getOption2();
				break;
			case 'C':
				answer = q.getOption3();
				break;
			case 'D':
				answer = q.getOption4();
				Default:break;
			}
			if(q.answer.getAnswer().equals(answer)) {
				System.out.println("-------------\nCorrect Answer\n-------------");
				countCorrect++;
			} else {
				
				System.out.println("-------------\nWrong Answer\n-------------");
				countWrong++;
			}
			System.out.println("=================================");
			countTotal++;
		}
		Iresult result = new Result(countTotal, countCorrect, countWrong);
		
		result.showResult();
	}
}
