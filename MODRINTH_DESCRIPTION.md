# NeoAuthMe 6.0.0

**The best authentication plugin for Paper 1.21.10+!**

## ⚠️ Important Notice

**This version requires Paper 1.21.10 or later.** It does not support older Minecraft versions, Spigot, or Paper versions below 1.21.10. This is a major release that uses the new Paper API.

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

- **Java 17+**
- **Paper 1.21.10 or later** (required)
- ProtocolLib (optional, required for some features like inventory protection)

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

