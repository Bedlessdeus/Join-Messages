package dev.bedless.joinmessages.config;

import me.petereo.pconfig.config.BaseConfiguration;
import me.petereo.pconfig.config.Configuration;
import me.petereo.pconfig.config.ConfigurationType;
import me.petereo.pconfig.config.Information;

@Configuration(name = "Messages", path = "config", type = ConfigurationType.YAML)
public class Messages extends BaseConfiguration {
    @Information({"=====================================GLOBAL=====================================",
            "!! CBUIAM = Can be used in all Messages !!",
            "!! PAPI = Placeholder API !!",
            "Global Placeholders (CBUIAM): %prefix%",
            "Color Code Char (CBUIAM): '&' Example: &a == Green"
    })
    public String Prefix = "&8[&3JM&8]";

    @Information({"=====================================Plugin Messages====================================="})
    public String Reloaded = "%prefix% &aReloaded the configuration file!";

    @Information({"=====================================Quit Messages=====================================", "Usable Placeholders: %player%, %disabled%, %default%",
            "%player%: Is replaced with the PlayerName",
            "%disabled%: Doesnt send a message when the player joins",
            "%default%: Shows the default minecraft message when the player joins",
            "PAPI: This message supports PAPI, you may use Installed placeholders as you please!",
            "Preset: &8[&c-&8] %player%"
    })
    public String QuitMessage = "&8[&c-&8] %player%";

    @Information({"=====================================Join Messages=====================================", "Usable Placeholders: %player%, %disabled%, %default%",
            "%player%: Is replaced with the PlayerName",
            "%disabled%: Doesnt send a message when the player joins",
            "%default%: Shows the default minecraft message when the player joins",
            "PAPI: This message supports PAPI, you may use Installed placeholders as you please!",
            "Preset: &8[&a+&8] %player%"
    })
    public String JoinMessage = "&8[&a+&8] %player%";


    /*Getters*/
    public CString getPrefix() {
        return CString.fS(Prefix);
    }

    public CString getReloaded() {
        return CString.fS(Reloaded);
    }

    /*Quit*/
    public CString getQuitMessage() {
        return CString.fS(QuitMessage);
    }

    public boolean isQuitDisabled() {
        try {
            return QuitMessage.equalsIgnoreCase("%disabled%");
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean isQuitDefaulted() {
        try {
            return QuitMessage == null || QuitMessage.isEmpty() || QuitMessage.equalsIgnoreCase("%default%");
        } catch (Exception ignored) {
            return true;
        }
    }


    /*Join*/
    public CString getJoinMessage() {
        return CString.fS(JoinMessage);
    }

    public boolean isJoinDisabled() {
        try {
            return JoinMessage.equalsIgnoreCase("%disabled%");
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean isJoinDefaulted() {
        try {
            return JoinMessage == null || JoinMessage.isEmpty() || JoinMessage.equalsIgnoreCase("%default%");
        } catch (Exception ignored) {
            return true;
        }
    }

}
