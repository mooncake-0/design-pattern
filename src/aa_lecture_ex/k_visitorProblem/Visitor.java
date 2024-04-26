package aa_lecture_ex.k_visitorProblem;
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
