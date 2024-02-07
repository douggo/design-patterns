package br.com.douggo.state.packman.states;

import br.com.douggo.state.packman.Ghost;

public class WanderMazeState implements GhostStates {
	private static final WanderMazeState instance = new WanderMazeState();
	private WanderMazeState() {};
	
	public static WanderMazeState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("Pacman spotted, I'm gonna chase him!");
		ghost.setState(ChasePacmanState.getInstance());
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println("I didn't see yet! Hang on!");
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		System.out.println("Oh damn! I've gotta hide!");
		ghost.setState(FleePacmanState.getInstance());
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		System.out.println("Pacman's normal already!");
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		System.out.println("Pacman`s normal, I can't be eaten by him!");
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("There's no way I'm going back to the base now!");
	}
}
