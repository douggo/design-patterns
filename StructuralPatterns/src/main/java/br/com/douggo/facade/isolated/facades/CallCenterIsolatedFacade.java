package br.com.douggo.facade.isolated.facades;

import br.com.douggo.facade.after.model.Card;
import br.com.douggo.facade.after.model.Register;
import br.com.douggo.facade.after.services.*;

import java.util.List;

public class CallCenterIsolatedFacade {

    private final CardService cardService;
    private final PaymentService paymentService;
    private final RegisterService registerService;
    private final ReportService reportService;
    private final SecurityService securityService;

    public CallCenterIsolatedFacade() {
        this.cardService = new CardService();
        this.registerService = new RegisterService();
        this.paymentService = new PaymentService(this.registerService);
        this.reportService = new ReportService(this.registerService);
        this.securityService = new SecurityService(this.cardService, this.registerService);
    }

    public Card getCardByUser(Long user) {
        return this.cardService.getCardByUser(user);
    }

    public void getSummary(Long userId) {
        Card card = this.getCardByUser(userId);
        this.reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Long userId) {
        Card card = this.getCardByUser(userId);
        this.paymentService.getPaymentInfoByCard(card);
    }

    public void orderNewCard(Long userId) {
        Card card = this.getCardByUser(userId);

        //Remove last register, block the card e order a new one
        List<Register> registers = this.registerService.getRegistersByCard(card);
        this.registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = this.securityService.blockCard(card);

        Card newCard = this.cardService.createNewCard(123456L, 33445566L);
        this.registerService.addCardRegisters(newCard, pendingRegisters);
        this.reportService.getSumary(newCard);
    }


}
