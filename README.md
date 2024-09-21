# Join Messages
### This is a simple plugin, that allows you to configure the Join/Leave messages for Players.
### While still providing a few features that can be found [here](#features)

![Spigot Downloads](https://img.shields.io/spiget/downloads/98841) ![Rating](https://img.shields.io/spiget/stars/98841)

## Table of Contents
* [Features](#features)
* [Commands](#commands)
* [Permissions](#permissions)
* [Compatability / Requirements](#compatability--requirements)
* [Where to download](#where-to-download)
* [Support](#support)
* [Configuration](#configuration)

## Features
* PlaceholderAPI Support
* Customizable Join/Leave messages
* Disable Join/Leave messages

## Commands
* `/joinmessages` - Main command for the plugin
  * `/joinmessages reload` - Reloads the configuration file


## Permissions
```yaml
#Allows the player to use the /joinmessage command
joinmessage.command.joinmessage

#Allows the player to reload the configuration file
joinmessage.command.joinmessage.reload
```

## Compatability / Requirements
### Spigot or Paper Server 1.8.8 - 1.21.1
### SoftDepends: PlaceholderAPI (Optional)

## Where to download
### [Spigot](https://www.spigotmc.org/resources/ultimate-join-message.98841/)

## Support
#### If you need help with the plugin contact me on Discord: `bedlessdeus`<br>If you found a bug, create an Issue here on GitHub

## Configuration
```yaml
# =====================================GLOBAL=====================================
# !! CBUIAM = Can be used in all Messages !!
# !! PAPI = Placeholder API !!
# Global Placeholders (CBUIAM): %prefix%
# Color Code Char (CBUIAM): '&' Example: &a == Green
Prefix: "&8[&3JM&8]"

# =====================================Plugin Messages=====================================
Reloaded: "%prefix% &aReloaded the configuration file!"

# =====================================Quit Messages=====================================
# Usable Placeholders: %player%, %disabled%, %default%
# %player%: Is replaced with the PlayerName
# %disabled%: Doesn't send a message when the player joins
# %default%: Shows the default minecraft message when the player joins
# PAPI: This message supports PAPI, you may use Installed placeholders as you please!
# Preset: &8[&c-&8] %player%
QuitMessage: "&8[&c-&8] %player%"

# =====================================Join Messages=====================================
# Usable Placeholders: %player%, %disabled%, %default%
# %player%: Is replaced with the PlayerName
# %disabled%: Doesn't send a message when the player joins
# %default%: Shows the default minecraft message when the player joins
# PAPI: This message supports PAPI, you may use Installed placeholders as you please!
# Preset: &8[&a+&8] %player%
JoinMessage: "&8[&a+&8] %player%"
```
