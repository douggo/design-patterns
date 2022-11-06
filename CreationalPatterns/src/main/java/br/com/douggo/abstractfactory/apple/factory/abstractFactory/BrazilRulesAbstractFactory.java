package br.com.douggo.abstractfactory.apple.factory.abstractFactory;

import br.com.douggo.abstractfactory.apple.model.certificate.BrazilianCertificate;
import br.com.douggo.abstractfactory.apple.model.certificate.Certificate;
import br.com.douggo.abstractfactory.apple.model.packing.BrazilianPacking;
import br.com.douggo.abstractfactory.apple.model.packing.Packing;

public class BrazilRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }

}
