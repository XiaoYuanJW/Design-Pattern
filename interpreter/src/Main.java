import expression.AndExpression;
import expression.OrExpression;
import expression.TermineExpression;

public class Main {
    public static void main(String[] args) {

        TermineExpression termineExpression1 = new TermineExpression("Robert");
        TermineExpression termineExpression2 = new TermineExpression("John");

        AndExpression andExpression = new AndExpression(termineExpression1, termineExpression2);
        OrExpression orExpression = new OrExpression(termineExpression1, termineExpression2);

        System.out.println(andExpression.interpret("John"));
        System.out.println(orExpression.interpret("John"));
    }
}