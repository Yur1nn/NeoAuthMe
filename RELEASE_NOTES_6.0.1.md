# NeoAuthMe 6.0.1 Release Notes

**Release Date:** November 18, 2025

## ⚠️ Important Notice

**This version requires Paper 1.21.10 or later.** It does not support older Minecraft versions, Spigot, or Paper versions below 1.21.10. This release uses the Paper API and requires specific features only available in Paper 1.21.10+.

## 🎉 What's New

### Codebase Improvements
- **Removed version-specific branching logic** - Simplified codebase by removing runtime version checks
- **Single-branch workflow** - Easier maintenance with compatibility managed through Maven dependencies
- **Code cleanup** - Removed unused methods and simplified comments

### Technical Changes
- Removed `getServerNameVersionSafe()` method (no longer needed)
- Removed runtime version checks (compatibility enforced at build time)
- Simplified event listener comments

## 📦 Installation

**⚠️ Before installing, ensure you are running Paper 1.21.10 or later!**

1. Download `authme-6.0.1.jar` from the releases page
2. Place it in your server's `plugins` folder
3. Restart your server

**Note:** This plugin will not work on Spigot, Bukkit, or Paper versions below 1.21.10.

## ⚠️ Requirements

- **Paper 1.21.10 or later** (REQUIRED - will not work on older versions)
- **Java 21** (required)
- **Minecraft 1.21.10+** (required)

**Note:** This plugin is specifically built for Paper 1.21.10+ and uses APIs that are not available in:
- Spigot
- Bukkit
- Paper versions below 1.21.10
- Any other server software

## 🔄 Upgrading from 6.0.0

This is a patch release with code improvements. No configuration changes are required. Simply replace the JAR file and restart your server.

## 📝 Full Changelog

- Remove version-specific branching and simplify codebase
- Bump version to 6.0.1 for release

## 🔗 Links

- [GitHub Repository](https://github.com/Yur1nn/NeoAuthMe)
- [Issue Tracker](https://github.com/Yur1nn/NeoAuthMe/issues)

---

**Note:** This release focuses on code quality improvements and maintainability. All functionality remains the same as version 6.0.0.

