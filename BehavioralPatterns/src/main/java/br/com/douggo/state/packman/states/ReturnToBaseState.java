package br.com.douggo.state.packman.states;

import br.com.douggo.state.packman.Ghost;

public class ReturnToBaseState implements GhostStates {

    private static final ReturnToBaseState INSTANCE = new ReturnToBaseState();

    private ReturnToBaseState() {}

    public static ReturnToBaseState getInstance() {
        return INSTANCE;
    }

    @Override
    public void spotPacman(Ghost ghost) {
        System.out.println("I just have been eaten by Pacman... can't spot him yet!");
    }

    @Override
    public void losePacman(Ghost ghost) {
        System.out.println("I was eaten by Pacman... I'm going to the base");
    }

    @Override
    public void pacmanTurnsSpecial(Ghost ghost) {
        System.out.println("Not my problem! I'm going to the base!");
    }

    @Override
    public void pacmanTurnsNormal(Ghost ghost) {
        System.out.println("Oh damn... now's my time but I'm going to the base.");
    }

    @Override
    public void eatenByPacman(Ghost ghost) {
        System.out.println("Can't be eaten by Pacman two times, back to back... right?!");
    }

    @Override
    public void reachTheBase(Ghost ghost) {
        System.out.println("I've reached the base, going to wander the maze again!");
        ghost.setState(WanderMazeState.getInstance());
    }
}
