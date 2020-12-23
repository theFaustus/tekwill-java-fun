package datatypes.types.enums;

public class Developer {
    public String name;
    public String title;
    //    public String seniority;
    public Seniority seniority;
    public Language language = Language.JAVA;

    public Developer(String name, String title, Seniority seniority) {
        this.name = name;
        this.title = title;
        this.seniority = seniority;
    }

    public Developer(String name, String title, Seniority seniority, Language language) {
        this.name = name;
        this.title = title;
        this.seniority = seniority;
        this.language = language;
    }

    public String toString() {
        return "Name = " + name + ", Title = " + title + ", Seniority = " + seniority + ", Language = " + language;
    }

    public enum Language {
        JAVA, PYTHON, C_PLUS_PLUS, C
    }
}
