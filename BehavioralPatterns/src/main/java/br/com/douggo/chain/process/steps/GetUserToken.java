package br.com.douggo.chain.process.steps;

import br.com.douggo.chain.process.service.ProcessContext;

public class GetUserToken extends ProcessStep {

	public GetUserToken(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		String emailDb = (String) context.get("user.email");
		context.put("token", emailDb.toUpperCase());
		return next(context, emailDb.toUpperCase());
	}

}
