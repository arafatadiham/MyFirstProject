package day54_Wednesday.Automation_Polymorphism;

public interface WebDriver {
    public abstract void openBrowser();

    public abstract void navigateTo(String url);

    public abstract void maximize();

    public abstract void closeBrowser();

}