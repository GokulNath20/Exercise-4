
 public class Exercise_4_Programming_Question1 {
            public static void main (String []arg) {
                QuestionOne q1;
                q1 = new QuestionOne();
                //q1.init(); remove the invoke of method since method has been changed as constructor
                q1.increment();
                q1.increment();
                System.out.println(q1.getCount());
            }
        }
