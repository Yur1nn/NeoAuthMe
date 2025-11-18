# NeoAuthMe
**"Plugin xác thực tốt nhất cho Bukkit modding API!"**

<img src="wallpaper.png?raw=true" alt="AuthMeLogo"/>

## Mô tả

Ngăn chặn việc đánh cắp tên người chơi trên server của bạn!<br>
Sử dụng nó để bảo mật server Offline mode hoặc tăng cường bảo vệ cho server Online mode của bạn!

NeoAuthMe không cho phép người chơi chưa được xác thực thực hiện các hành động như đặt khối, di chuyển,<br>
gõ lệnh hoặc sử dụng kho đồ. Nó cũng có thể kick người chơi có tên quá dài hoặc quá ngắn hoặc kick người chơi từ các quốc gia bị cấm.

Với tính năng Session Login, bạn không cần phải thực thi lệnh xác thực mỗi lần kết nối đến server! 
Mỗi lệnh và mọi tính năng đều có thể được bật hoặc tắt từ file cấu hình được cấu trúc tốt của chúng tôi.

Bạn cũng có thể tạo file dịch của riêng mình và, nếu muốn, bạn có thể chia sẻ nó với chúng tôi! :)

#### Tính năng:
<ul>
  <li><strong>Hệ thống khôi phục E-Mail!</strong></li>
  <li>Bảo vệ chống giả mạo tên người dùng.</li>
  <li>Danh sách Trắng/Đen theo Quốc gia! <a href="https://dev.maxmind.com/geoip/legacy/codes/iso3166/">(mã quốc gia)</a></li>
  <li><strong>Hệ thống AntiBot tích hợp!</strong></li>
  <li><strong>Tính năng ForceLogin: Admin có thể đăng nhập với tất cả tài khoản qua lệnh console!</strong></li>
  <li><strong>Tránh thông báo "Đã đăng nhập từ vị trí khác"!</strong></li>
  <li>Hỗ trợ xác thực hai yếu tố (2FA)!</li>
  <li>Session Login!</li>
  <li>Dịch và tin nhắn có thể chỉnh sửa!</li>
  <li><strong>Hỗ trợ Backend MySQL và SQLite!</strong></li>
  <li>Các thuật toán mã hóa mật khẩu được hỗ trợ: SHA256, ARGON2, BCRYPT, PBKDF2, <a href="https://github.com/CypherX/xAuth/wiki/Password-Hashing">xAuth</a></li>
  <li>Các phương thức đăng ký thay thế được hỗ trợ:<br>
  <ul>
    <li>PHPBB, VBulletin: PHPBB - MD5VB</li>
    <li>Xenforo: XFBCRYPT</li>
    <li>MyBB: MYBB</li>
    <li>IPB3: IPB3</li>
    <li>IPB4: IPB4</li>
    <li>PhpFusion: PHPFUSION</li>
    <li>Joomla: JOOMLA</li>
    <li>WBB3: WBB3*</li>
    <li>SHA512: SALTEDSHA512</li>
    <li>DoubleSaltedMD5: SALTED2MD5</li>
    <li>WordPress: WORDPRESS</li>
    <li><a href="https://github.com/AuthMe/AuthMeReloaded/blob/master/docs/hash_algorithms.md">Danh sách tất cả các hash được hỗ trợ</a></li>
  </ul></li>
  <li>Tên bảng/cột MySQL tùy chỉnh (hữu ích với cơ sở dữ liệu diễn đàn)</li>
  <li><strong>Truy vấn cơ sở dữ liệu được cache!</strong></li>
  <li><strong>Hoàn toàn tương thích với Citizens2, CombatTag, CombatTagPlus!</strong></li>
  <li>Tương thích với các mod Minecraft như <strong>BuildCraft hoặc RedstoneCraft</strong></li>
  <li>Người dùng bị hạn chế (liên kết tên người dùng với IP)</li>
  <li>Bảo vệ kho đồ của người chơi cho đến khi xác thực đúng (yêu cầu ProtocolLib)</li>
  <li>Lưu vị trí thoát của người chơi</li>
  <li>Sao lưu cơ sở dữ liệu tự động</li>
  <li>Ngôn ngữ có sẵn: <a href="https://github.com/AuthMe/AuthMeReloaded/blob/master/docs/translations.md">bản dịch</a></li>
  <li>Bộ chuyển đổi tích hợp từ FlatFile đã lỗi thời (auths.db) sang SQL (authme.sql)!</li>
  <li><strong>Nhập cơ sở dữ liệu cũ của bạn từ các plugin khác như Rakamak, xAuth, CrazyLogin, RoyalAuth và vAuth!</strong></li>
</ul>

#### Cấu hình
[Cách cấu hình AuthMe](https://github.com/Yur1nn/NeoAuthMe/blob/master/docs/config.md)
#### Lệnh
[Danh sách lệnh và cách sử dụng](https://github.com/Yur1nn/NeoAuthMe/blob/master/docs/commands.md)
#### Quyền
- authme.player.* - cho tất cả lệnh người dùng
- authme.admin.* - cho tất cả lệnh admin
- [Danh sách tất cả các nút quyền](http://github.com/Yur1nn/NeoAuthMe/blob/master/docs/permission_nodes.md)

#### Hướng dẫn
- [Cách sử dụng bộ chuyển đổi](https://github.com/Yur1nn/NeoAuthMe/wiki/Converters)
- [Cách nhập cơ sở dữ liệu từ xAuth](https://dev.bukkit.org/projects/authme-reloaded/pages/how-to-import-database-from-xauth)
- [Tích hợp website](https://github.com/Yur1nn/NeoAuthMe/tree/master/samples/website_integration)
- [Cách chuyển đổi từ Rakamak](https://dev.bukkit.org/projects/authme-reloaded/pages/how-to-import-database-from-rakamak)
- Chuyển đổi giữa các loại cơ sở dữ liệu (ví dụ: SQLite sang MySQL): /authme converter


## Liên kết và Liên hệ

 - **Hỗ trợ:**
   - [GitHub issue tracker](https://github.com/Yur1nn/NeoAuthMe/issues)
   - [Discord](https://discord.gg/)

## Yêu cầu

##### Yêu cầu biên dịch:
>- JDK 21+
>- Maven (khuyến nghị 3.9.11, nhưng bất kỳ phiên bản nào trên 3.8.x đều hoạt động tốt)
>- Git/GitHub (Tùy chọn)

##### Cách biên dịch dự án:
>- Clone dự án bằng Git/GitHub
>- Thực thi lệnh "mvn clean package"

##### Yêu cầu chạy:
>- Java 21+
>- **Paper 1.21.10 trở lên** (bắt buộc - phiên bản này không hỗ trợ các phiên bản cũ hơn hoặc Spigot)
>- ProtocolLib (tùy chọn, yêu cầu bởi một số tính năng)

## Ghi công

##### Người đóng góp:
Thành viên nhóm: <a href="https://github.com/Yur1nn/NeoAuthMe/wiki/Development-team">nhà phát triển</a>, <a href="https://github.com/Yur1nn/NeoAuthMe/wiki/Translators">người dịch</a>

Ghi công AuthMe: d4rkwarriors, fabe1337, Whoami2 và pomo4ka
Ghi công AuthMeReloaded: AS1LV3RN1NJA, Hoeze và eprimex
Ghi công NeoAuthMe: Yur1nn

##### Giấy phép GeoIP:
Sản phẩm này sử dụng dữ liệu từ GeoLite API được tạo bởi MaxMind, có sẵn tại https://www.maxmind.com
