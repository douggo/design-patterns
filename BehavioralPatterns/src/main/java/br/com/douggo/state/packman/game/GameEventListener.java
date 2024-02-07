package br.com.douggo.state.packman.game;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}
