package br.com.douggo.chain.process.service;

import br.com.douggo.chain.process.steps.ProcessStep;

public class GenericService {
	
	public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
		try {
			ProcessContext result = startProcess.execute(initialContext);
			return result.getProcessResult();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
