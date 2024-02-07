package br.com.douggo.state.packman.states;

import br.com.douggo.state.packman.Ghost;

public interface GhostStates {
	void spotPacman(Ghost ghost);
	void losePacman(Ghost ghost);
	void pacmanTurnsSpecial(Ghost ghost);
	void pacmanTurnsNormal(Ghost ghost);
	void eatenByPacman(Ghost ghost);
	void reachTheBase(Ghost ghost);
}
