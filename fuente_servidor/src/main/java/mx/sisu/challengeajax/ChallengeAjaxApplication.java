package mx.sisu.challengeajax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangofactory.swagger.plugin.EnableSwagger;

@SpringBootApplication
@EnableSwagger
public class ChallengeAjaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeAjaxApplication.class, args);
	}
}
