package tu_bs.cs.isf.mapping.solver;

public interface Prover{
	//status: 0 - proven, 1 - interactively proven, 2 - Timeout, 3 - OpenGoals, 4 - not proven, 5 - unknown
	int[] provePreCideCorc();
	int[] provePostCorcCide();
}