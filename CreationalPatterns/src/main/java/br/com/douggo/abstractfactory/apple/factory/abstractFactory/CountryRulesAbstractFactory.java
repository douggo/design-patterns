package br.com.douggo.abstractfactory.apple.factory.abstractFactory;

import br.com.douggo.abstractfactory.apple.model.certificate.Certificate;
import br.com.douggo.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
