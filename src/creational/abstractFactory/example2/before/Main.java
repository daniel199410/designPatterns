package creational.abstractFactory.example2.before;

public class Main {

    public String lint(String code, EnumPlatform platform) {
        switch (platform) {
            case JAVA:
                return lintJava(code);
            case JAVASCRIPT:
                return lintJS(code);
            default:
                return lintDefault(code);
        }
    }

    public String beautify(String code, EnumPlatform platform) {
        switch (platform) {
            case JAVA:
                return lintJava(code);
            case JAVASCRIPT:
                return lintJS(code);
            default:
                return lintDefault(code);
        }
    }

    private String lintDefault(String code) {
        return String.format("%s linted with default linter", code);
    }

    private String lintJS(String code) {
        return String.format("%s linted with JavaScript linter", code);
    }

    private String lintJava(String code) {
        return String.format("%s linted with Java Linter", code);
    }
}
