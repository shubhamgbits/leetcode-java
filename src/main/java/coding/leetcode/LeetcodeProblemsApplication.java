package coding.leetcode;

import coding.leetcode.blind75.dp.q1ClimbingStairs.ClimbingStairs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeProblemsApplication {

	public static void main(String[] args) {

		ClimbingStairs.solveWithNoExtraMemory(2);
		//SpringApplication.run(LeetcodeProblemsApplication.class, args);
	}

}
