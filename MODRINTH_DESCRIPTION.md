# NeoAuthMe 6.0.2

**The best authentication plugin for Paper 1.21.10+!**

## ⚠️ Important Notice

**This version requires server software version 1.21.10 or later.** **Only Paper 1.21.10+ is guaranteed to work and receive support.** Other server software (Spigot, Bukkit, Folia, Purpur, and other Bukkit/Spigot-based forks) may work but are not officially supported and will not receive bug fixes or support for issues specific to those platforms.

**⚠️ This plugin will NOT work on:**
- Server software versions below 1.21.10
- Forge, Fabric, or other mod loaders

## 📖 Description

Prevent username stealing on your server! NeoAuthMe is a powerful authentication plugin that secures your Offline mode server or increases your Online mode server's protection.

NeoAuthMe disallows players who aren't authenticated to perform actions like placing blocks, moving, typing commands, or using the inventory. It can also kick players with uncommonly long or short player names or kick players from banned countries.

## ✨ Key Features

### 🔐 Security & Authentication
- **Username spoofing protection** - Prevents account theft
- **E-Mail Recovery System** - Recover lost passwords via email
- **Two-Factor Authentication (2FA)** - TOTP support for extra security
- **Session Login** - Stay logged in across server restarts
- **ForceLogin Feature** - Admins can login to any account via console command
- **Avoid "Logged in from another location" messages**

### 🤖 Anti-Bot System
- **Built-in AntiBot System** - Automatically detects and prevents bot attacks
- **Countries Whitelist/Blacklist** - GeoIP-based access control
- **IP-based restrictions** - Associate usernames with IPs

### 💾 Database & Storage
- **MySQL, SQLite, PostgreSQL, and MariaDB support**
- **Cached database queries** - Optimized performance
- **Custom MySQL tables/columns** - Useful for forum database integration
- **Automatic database backup** - Never lose your data
- **Built-in database converter** - Convert between database types easily

### 🔄 Migration & Import
- **Import from other plugins**: Rakamak, xAuth, CrazyLogin, RoyalAuth, vAuth
- **FlatFile to SQL converter** - Migrate from old auths.db format
- **Multiple password hash support** - Compatible with various forum systems

### 🌍 Localization
- **Editable translations and messages** - Full customization
- **Multiple language support** - See [translations list](https://github.com/Yur1nn/NeoAuthMe/blob/master/docs/translations.md)
- **Custom message files** - Create your own translations

### 🔧 Advanced Features
- **Inventory protection** - Protect player inventory until authentication (requires ProtocolLib)
- **Quit location saving** - Restore player position on login
- **Compatible with Citizens2, CombatTag, CombatTagPlus**
- **Compatible with Minecraft mods** like BuildCraft and RedstoneCraft
- **Multiple password encryption algorithms**: SHA256, ARGON2, BCRYPT, PBKDF2, and more
- **Forum integration support**: PHPBB, VBulletin, Xenforo, MyBB, IPB3, IPB4, WordPress, and more

## 📋 Requirements

- **Java 21+** (required)
- **Paper 1.21.10 or later** (REQUIRED - only officially supported platform)
- **Minecraft 1.21.10+** (required)
- ProtocolLib (optional, required for some features like inventory protection)

**Note:** This plugin is officially supported only on Paper 1.21.10+. Other server software (Spigot, Bukkit, Folia, Purpur, and other Bukkit/Spigot-based forks) may work but are not guaranteed and will not receive support for platform-specific issues.

## 🔗 Links

- **GitHub**: [Yur1nn/NeoAuthMe](https://github.com/Yur1nn/NeoAuthMe)
- **Documentation**: 
  - [Configuration Guide](https://github.com/Yur1nn/NeoAuthMe/blob/master/docs/config.md)
  - [Command List](https://github.com/Yur1nn/NeoAuthMe/blob/master/docs/commands.md)
  - [Permission Nodes](https://github.com/Yur1nn/NeoAuthMe/blob/master/docs/permission_nodes.md)
- **Support**: [GitHub Issues](https://github.com/Yur1nn/NeoAuthMe/issues)

## 🎮 Quick Start

1. Download the JAR file
2. Place it in your server's `plugins` folder
3. Start your server (Paper 1.21.10+)
4. Configure NeoAuthMe in `plugins/NeoAuthMe/config.yml`
5. Players will need to register and login to play!

## 📝 What's New in 6.0.2

- ✅ **Eliminated Paper warning** - Removed `PlayerLoginEvent` listener (no more "HorriblePlayerLoginEventHack" warning)
- ✅ **Improved performance** - Moved single session check to `AsyncPlayerPreLoginEvent`
- ✅ **Code quality improvements** - Fixed 87+ deprecation warnings, 15+ unused imports, 10+ unchecked operations
- ✅ **Removed VIP full server handling** - Use your preferred VIP plugin instead
- ✅ **Better API compatibility** - Updated deprecated API usage throughout codebase
- ✅ **Fixed resource leaks** - Improved test resource management

## 📝 What's New in 6.0.1

- ✅ Removed version-specific branching logic - Simplified codebase
- ✅ Single-branch workflow - Easier maintenance
- ✅ Code cleanup - Removed unused methods and simplified comments
- ✅ Improved maintainability

## 📝 What's New in 6.0.0

- ✅ Updated to Paper 1.21.10+ API compatibility
- ✅ Switched to `AsyncPlayerSpawnLocationEvent` for better performance
- ✅ All plugin references renamed to NeoAuthMe
- ✅ Improved teleportation handling for new Paper API
- ✅ Better thread safety and event handling

## 📜 License

GNU GPL v3.0 - See LICENSE file for details

---

**Note**: This is a fork of AuthMeReloaded, updated and maintained for Paper 1.21.10+ by Yur1nn.

