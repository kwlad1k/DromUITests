package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/${driver}.properties"})

public interface DriverConfig extends Config {

    @Key("browser.name")
    @DefaultValue("chrome")
    String browserName();

    @Key("browser.version")
    @DefaultValue("122.0")
    String browserVersion();

    @Key("browser.size")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remote.url")
    String remoteUrl();

    @Key("remote.mode")
    @DefaultValue("false")
    Boolean remoteMode();
}
