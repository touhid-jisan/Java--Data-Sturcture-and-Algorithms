package project.quizapplication;

public class Result implements Iresult{
	int totalQuestions;
	int correctAnswer;
	int wrongAnswer;
	public Result(int totalQuestions, int correctAnswer, int wrongAnswer) {
		super();
		this.totalQuestions = totalQuestions;
		this.correctAnswer = correctAnswer;
		this.wrongAnswer = wrongAnswer;
	}
	public void showResult() {
		System.out.println("Your result\n" + "Total Question: " + totalQuestions + "\nCorrect Answer: " + correctAnswer+"\nWrong Answer: "+wrongAnswer);
		
	}

	
}
