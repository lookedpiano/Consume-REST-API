package com.udacity.joke;

import com.udacity.joke.entity.Cat;
import com.udacity.joke.entity.Dawg;
import com.udacity.joke.entity.Joke;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JokeApplication {

	private static final Logger log = LoggerFactory.getLogger(JokeApplication.class);

	public static void main(String[] args) {SpringApplication.run(JokeApplication.class, args);}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Joke joke = restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke", Joke.class);
			log.info(joke.toString());
			//Cat cat = restTemplate.getForObject("https://api.thecatapi.com/v1/images/search", Cat.class);
			//log.info(cat.toString());
			Dawg dawg = restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", Dawg.class);
			log.info(dawg.toString());
		};
	}

}
