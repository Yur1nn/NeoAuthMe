# Release 6.0.1 - Instructions

## ✅ Already Completed
- ✅ Version bumped to 6.0.1
- ✅ Tag `v6.0.1` created and pushed
- ✅ Release JAR built: `target/authme-6.0.1.jar` (923 KB)
- ✅ Release notes created: `RELEASE_NOTES_6.0.1.md`

## 📋 Next Steps - Create GitHub Release

### Option 1: Via GitHub Web Interface (Recommended)

1. **Go to your repository:**
   - Visit: https://github.com/Yur1nn/NeoAuthMe/releases

2. **Click "Draft a new release"** or **"Create a new release"**

3. **Fill in the release details:**
   - **Tag version:** Select `v6.0.1` (should already exist)
   - **Release title:** `NeoAuthMe 6.0.1`
   - **Description:** Copy the contents from `RELEASE_NOTES_6.0.1.md`

4. **Upload the JAR file:**
   - Click "Attach binaries"
   - Upload: `target/authme-6.0.1.jar`
   - Rename it to: `NeoAuthMe-6.0.1.jar` (optional, for clarity)

5. **Publish the release:**
   - Click "Publish release"

### Option 2: Via GitHub CLI (if you install it)

```bash
gh release create v6.0.1 \
  --title "NeoAuthMe 6.0.1" \
  --notes-file RELEASE_NOTES_6.0.1.md \
  target/authme-6.0.1.jar
```

## 📦 Files Ready for Release

- **JAR:** `target/authme-6.0.1.jar` (923 KB)
- **Release Notes:** `RELEASE_NOTES_6.0.1.md`
- **Tag:** `v6.0.1` (already pushed to GitHub)

## 🔗 Quick Links

- Repository: https://github.com/Yur1nn/NeoAuthMe
- Releases: https://github.com/Yur1nn/NeoAuthMe/releases
- Tag: https://github.com/Yur1nn/NeoAuthMe/releases/tag/v6.0.1

---

**Note:** After creating the GitHub release, you may also want to:
- Upload to Modrinth (if applicable)
- Upload to SpigotMC (if applicable)
- Announce on Discord/forums

