package br.com.douggo.state.packman.states;

import br.com.douggo.state.packman.Ghost;

import java.sql.SQLOutput;

public class FleePacmanState implements GhostStates {

    private final static FleePacmanState INSTANCE = new FleePacmanState();

    private FleePacmanState() {}

    public static FleePacmanState getInstance() {
        return INSTANCE;
    }

    @Override
    public void spotPacman(Ghost ghost) {
        System.out.println("I've already spotted him, but now I've gotta hide!");
    }

    @Override
    public void losePacman(Ghost ghost) {
        System.out.println("I've gotta lose him anyway!");
    }

    @Override
    public void pacmanTurnsSpecial(Ghost ghost) {
        System.out.println("Pacma's already became Super Pacman!");
    }

    @Override
    public void pacmanTurnsNormal(Ghost ghost) {
        System.out.println("Phew! That was close... I'm going to find him again!");
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        System.out.println("Oh no! I've been eaten by Pacman :(");
        ghost.setState(ReturnToBaseState.getInstance());
    }

    @Override
    public void reachTheBase(Ghost ghost) {
        System.out.println("I wasn't going to the base yet! He didn't eat me yet!");
    }
}
