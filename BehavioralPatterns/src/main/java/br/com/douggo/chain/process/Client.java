package br.com.douggo.chain.process;

import br.com.douggo.chain.process.service.GenericService;
import br.com.douggo.chain.process.service.ProcessContext;
import br.com.douggo.chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {
		ProcessContext context = new ProcessContext();
		context.put("email", "douglas.silva@gmail.com");
		context.put("password", "1234");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, context);
		System.out.println(response);

		context.reset();

		context.put("email", "douglas.silva@gmail.com");
		context.put("password", "1234");
		context.put("name", "Douglas da Silva");

		response = GenericService.run(ServicesCatalog.saveUserProcess, context);
		System.out.println(response);
	}
}
