package br.com.douggo.state.packman.states;

import br.com.douggo.state.packman.Ghost;

public class ChasePacmanState implements GhostStates {

    private static final ChasePacmanState INSTANCE = new ChasePacmanState();

    private ChasePacmanState() {}

    public static ChasePacmanState getInstance() {
        return INSTANCE;
    }

    @Override
    public void spotPacman(Ghost ghost) {
        System.out.println("I've already spotted him!");
    }

    @Override
    public void losePacman(Ghost ghost) {
        System.out.println("I've lost him! Gotta find him again!");
        ghost.setState(WanderMazeState.getInstance());
    }

    @Override
    public void pacmanTurnsSpecial(Ghost ghost) {
        System.out.println("Oh no! Gotta go!");
        ghost.setState(FleePacmanState.getInstance());
    }

    @Override
    public void pacmanTurnsNormal(Ghost ghost) {
        System.out.println("He's normal already!");
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        System.out.println("Pacman's normal yet, I can't be eaten by him yet!");
    }

    @Override
    public void reachTheBase(Ghost ghost) {
        System.out.println("I wasn't going to the base yet!");
    }

}
