package runner;

public class EnvironmentVariablesTest {

    public static void main(String[] args) {
        System.out.println("CUCUMBER_PUBLISH_TOKEN: " + System.getenv("CUCUMBER_PUBLISH_TOKEN"));
        System.out.println("CUCUMBER_PUBLISH_ENABLED: " + System.getenv("CUCUMBER_PUBLISH_ENABLED"));
    }
}
