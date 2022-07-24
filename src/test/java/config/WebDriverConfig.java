package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:${pc}.properties")

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("remoteUrl")
    URL getRemoteURL();
}

