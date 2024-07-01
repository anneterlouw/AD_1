import Instance.*;
import ilog.concert.IloException;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

public class BinaryProgramming {
    IloCplex cplex = new IloCplex();
    private final Instance instance;
    public BinaryProgramming(Instance instance) throws IloException {
        this.cplex = cplex;
        this.instance = instance;

    }
    public void createVariables(){
        IloNumVar[] x = new IloNumVar[instance.getNbItems()];
        
    }
}
