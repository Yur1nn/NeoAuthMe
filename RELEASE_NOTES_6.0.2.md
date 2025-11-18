# NeoAuthMe 6.0.2 Release Notes

**Release Date:** November 19, 2025

## ⚠️ Important Notice

**This version requires server software version 1.21.10 or later.** **Only Paper 1.21.10+ is guaranteed to work and receive support.** Other server software (Spigot, Bukkit, Folia, Purpur, and other Bukkit/Spigot-based forks) may work but are not officially supported and will not receive bug fixes or support for issues specific to those platforms.

## 🎉 What's New

### Bug Fixes & Improvements
- **Eliminated Paper warning** - Removed `PlayerLoginEvent` listener to eliminate "HorriblePlayerLoginEventHack" warning
- **Moved single session check** - Single session verification now happens in `AsyncPlayerPreLoginEvent` for better performance
- **Removed VIP full server handling** - Feature removed (use your preferred VIP plugin instead)

### Code Quality
- **Fixed all deprecation warnings** - Updated deprecated API usage throughout the codebase
- **Fixed all compilation warnings** - Resolved unchecked operations, unused imports, and raw types
- **Suppressed Javadoc warnings** - Configured Maven to suppress documentation warnings during build
- **Improved test coverage** - Updated tests to reflect code changes

### Technical Changes
- Replaced deprecated `YamlFileResource` constructors with `YamlFileResourceProvider`
- Replaced deprecated `Class.newInstance()` with `Class.getDeclaredConstructor().newInstance()`
- Replaced deprecated `Runtime.exec(String)` with `ProcessBuilder`
- Replaced deprecated `URL(String)` constructor with `URI.toURL()`
- Replaced deprecated `PlayerPickupItemEvent` with `EntityPickupItemEvent`
- Updated deprecated `AuthMeApi.getLastLogin()` to `getLastLoginTime()` returning `Instant`
- Fixed resource leaks in database tests
- Removed unused imports and fields

## 📦 Installation

**⚠️ Before installing, ensure you are running server software version 1.21.10 or later!**

1. Download `authme-6.0.2.jar` from the releases page
2. Place it in your server's `plugins` folder
3. Restart your server

**Note:** This plugin requires server software version 1.21.10 or later. **Only Paper is officially supported.** Other server software may work but will not receive support.

## ⚠️ Requirements

- **Paper 1.21.10 or later** (REQUIRED - only officially supported platform)
- **Java 21** (required)
- **Minecraft 1.21.10+** (required)

**Note:** This plugin is officially supported only on Paper 1.21.10+. Other server software (Spigot, Bukkit, Folia, Purpur, and other Bukkit/Spigot-based forks) may work but are not guaranteed and will not receive support for platform-specific issues.

## 🔄 Upgrading from 6.0.1

This is a patch release with bug fixes and code quality improvements. No configuration changes are required. Simply replace the JAR file and restart your server.

### Breaking Changes
- **VIP full server handling removed** - If you were using AuthMe's VIP full server feature, you'll need to use a dedicated VIP plugin instead. The `authme.vip` permission is no longer used by AuthMe.

## 📝 Full Changelog

### Removed Features
- Removed VIP full server handling (`PlayerLoginEvent` listener)
- Removed `refusePlayerForFullServer()` method from `OnJoinVerifier`

### Code Improvements
- Moved single session check from `PlayerLoginEvent` to `AsyncPlayerPreLoginEvent`
- Fixed all deprecation warnings (87+ fixes)
- Fixed all compilation warnings
- Suppressed Javadoc warnings in Maven configuration
- Removed unused imports and fields
- Fixed resource leaks in tests

### API Changes
- `AuthMeApi.getLastLogin(String)` deprecated → use `getLastLoginTime(String)` instead
- Returns `Instant` instead of `Date` for better Java 8+ compatibility

### Test Updates
- Updated tests to reflect removed VIP functionality
- Fixed test resource management
- Updated deprecated API usage in tests

## 🐛 Bug Fixes

- Fixed Paper warning about `PlayerLoginEvent` listener
- Fixed unchecked operations warnings in `DebugCommandTest`
- Fixed resource leaks in `LoginSecurityConverterTest`
- Fixed deprecated API usage throughout codebase

## 🔧 Technical Details

### Deprecated API Replacements
- `YamlFileResource(File)` → `YamlFileResourceProvider.loadFromFile(File)`
- `YamlFileReader(File)` → `YamlFileResourceProvider.loadFromFile(File).createReader()`
- `Class.newInstance()` → `Class.getDeclaredConstructor().newInstance()`
- `Runtime.exec(String)` → `ProcessBuilder`
- `URL(String)` → `URI(String).toURL()`
- `PlayerPickupItemEvent` → `EntityPickupItemEvent`
- `ExpectedException` JUnit rule → try-catch blocks
- `Server.getOfflinePlayer(String)` → hybrid approach with fallback

### Build Configuration
- Added `-Xdoclint:none` to Javadoc plugin to suppress documentation warnings
- Set `failOnError=false` for Javadoc plugin

## 📊 Statistics

- **87+ deprecation warnings fixed**
- **15+ unused import warnings fixed**
- **10+ unchecked operation warnings fixed**
- **5+ resource leak warnings fixed**
- **100+ Javadoc warnings suppressed** (documentation-only, non-functional)

## 🙏 Acknowledgments

Thank you to all contributors and users who reported issues and provided feedback!

