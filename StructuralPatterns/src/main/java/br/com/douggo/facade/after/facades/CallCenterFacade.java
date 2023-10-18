package br.com.douggo.facade.after.facades;

import br.com.douggo.facade.after.model.Card;
import br.com.douggo.facade.after.model.Register;
import br.com.douggo.facade.after.services.*;

import java.util.List;

public class CallCenterFacade {

    private final CardService cardService;
    private final PaymentService paymentService;
    private final RegisterService registerService;
    private final ReportService reportService;
    private final SecurityService securityService;

    public CallCenterFacade() {
        this.cardService = new CardService();
        this.registerService = new RegisterService();
        this.paymentService = new PaymentService(this.registerService);
        this.reportService = new ReportService(this.registerService);
        this.securityService = new SecurityService(this.cardService, this.registerService);
    }

    public Card getCardByUser(Long user) {
        return this.cardService.getCardByUser(user);
    }

    public void getSummary(Card card) {
        this.reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        this.paymentService.getPaymentInfoByCard(card);
    }

    public void orderNewCard(Card oldCard) {
        //Remove last register, block the card e order a new one
        List<Register> registers = this.registerService.getRegistersByCard(oldCard);
        this.registerService.removeByIndex(oldCard, registers.size() - 1);
        List<Register> pendingRegisters = this.securityService.blockCard(oldCard);
        Card newCard = this.cardService.createNewCard(123456L, 33445566L);
        this.registerService.addCardRegisters(newCard, pendingRegisters);
        this.reportService.getSumary(newCard);
    }
}
