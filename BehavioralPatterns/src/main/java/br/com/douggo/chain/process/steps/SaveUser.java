package br.com.douggo.chain.process.steps;

import br.com.douggo.chain.process.repository.UserRepository;
import br.com.douggo.chain.process.service.ProcessContext;

import java.util.LinkedHashMap;
import java.util.Map;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	@Override
	@SuppressWarnings("unchecked")
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = new LinkedHashMap<>();

		userInput.put("email", context.get("email"));
		userInput.put("password", context.get("password"));
		userInput.put("name", context.get("name"));

		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
