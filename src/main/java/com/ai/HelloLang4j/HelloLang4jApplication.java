package com.ai.HelloLang4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.data.message.UserMessage;

import java.util.Scanner;

@SpringBootApplication
public class HelloLang4jApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloLang4jApplication.class, args);

		// Create AI model (demo mode)
		OpenAiChatModel model = OpenAiChatModel.builder()
				.apiKey("demo")
				.baseUrl("http://langchain4j.dev/demo/openai/v1")
				.modelName("gpt-4o-mini")
				.build();

		Scanner scanner = new Scanner(System.in);

		System.out.println("AI Chat started. Type 'exit' to quit.");

		while (true) {
			System.out.print("prompt> ");
			String input = scanner.nextLine();

			if (input.isBlank()) {
				continue;
			}

			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Bye 👋");
				break;
			}

			// ✅ Correct API usage
			String answer = model.generate(
					UserMessage.from(input)
			).content().text();

			System.out.println("AI> " + answer);
		}

		scanner.close();
	}
}
