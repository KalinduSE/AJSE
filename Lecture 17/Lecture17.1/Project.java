public abstract class Project {

    private String name;
    private String managerName;
    private int teamSize;

    public Project(String name, String managerName, int teamSize) {
        this.managerName = managerName;
        this.name = name;
        this.teamSize = teamSize;
    }

    public String getName() {
        return name;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public abstract void evaluate();
}
