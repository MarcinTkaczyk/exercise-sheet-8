package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet08.homework.olympics;

public interface RacePlan {
	
	/**
	 * Executes the next movement of the given hamster according to this race plan
	 * This method ensures that exactly one of the methods runHard(), runSteadily or runSlowly of
	 * RunnerHamster hamster gets called.
	 * @param hamster the hamster that executed this race plan
	 */
	public void nextStep(RunnerHamster hamster);
}
