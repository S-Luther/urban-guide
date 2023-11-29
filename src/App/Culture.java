package App;

public interface Culture {
    public enum stance{
        AGGRESSIVE,
        BALANCED,
        DEFENSIVE
    }
    stance strategy();
    stance diplomacy();
    void special();
}
