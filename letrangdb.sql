-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 21, 2021 lúc 08:21 AM
-- Phiên bản máy phục vụ: 10.4.19-MariaDB
-- Phiên bản PHP: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `letrangdb`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `billID` int(11) NOT NULL,
  `userName` varchar(30) NOT NULL,
  `total` double NOT NULL,
  `address` varchar(255) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `bill`
--

INSERT INTO `bill` (`billID`, `userName`, `total`, `address`, `date`) VALUES
(1, 'thanhthanhtam', 44000, 'c43 Trần Khánh Dư, Xuân Khánh, Cần Thơ', '2021-07-20 15:43:44'),
(2, 'tam123456', 61000, 'dđff', '2021-07-20 15:50:35'),
(3, 'tam123456', 72000, 'sdsd', '2021-07-20 16:06:06'),
(4, 'thanhthanhtam', 77000, 'cantho', '2021-07-20 16:23:58'),
(5, 'thanhthanhtam', 77000, 'cantho', '2021-07-20 16:23:58'),
(6, 'thanhthanhtam', 102000, 'sddddddfdffg', '2021-07-20 16:29:33'),
(7, 'thanhthanhtam', 114000, 'ho', '2021-07-20 16:34:35'),
(8, 'thanhthanhtam', 10000, 'yuyuiyi', '2021-07-20 16:40:35'),
(9, 'thanhthanhtam', 87000, 'rtyuttt', '2021-07-20 16:41:07'),
(10, 'thanhthanhtam', 80000, 'can tho city', '2021-07-21 06:19:47');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cart`
--

CREATE TABLE `cart` (
  `cartID` int(11) NOT NULL,
  `billID` int(11) NOT NULL,
  `foodID` int(11) NOT NULL,
  `foodName` varchar(255) NOT NULL,
  `foodPrice` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `cart`
--

INSERT INTO `cart` (`cartID`, `billID`, `foodID`, `foodName`, `foodPrice`, `quantity`) VALUES
(24, 1, 47, 'Bánh khoai môn', 12000, 2),
(25, 1, 36, 'Gà chiên bột', 20000, 1),
(26, 2, 47, 'Bánh khoai môn', 12000, 3),
(27, 2, 42, 'Spaghetti', 25000, 1),
(28, 3, 41, 'Cơm gà', 35000, 1),
(29, 3, 43, 'Cơm gà cay', 37000, 1),
(30, 4, 43, 'Cơm gà cay', 37000, 1),
(31, 4, 38, 'Mirinda Cam', 10000, 2),
(32, 5, 43, 'Cơm gà cay', 37000, 1),
(33, 5, 38, 'Mirinda Cam', 10000, 2),
(34, 4, 36, 'Gà chiên bột', 20000, 1),
(35, 5, 36, 'Gà chiên bột', 20000, 1),
(36, 6, 43, 'Cơm gà cay', 37000, 1),
(37, 6, 38, 'Mirinda Cam', 10000, 2),
(38, 6, 36, 'Gà chiên bột', 20000, 1),
(39, 6, 42, 'Spaghetti', 25000, 1),
(40, 7, 43, 'Cơm gà cay', 37000, 1),
(41, 7, 38, 'Mirinda Cam', 10000, 2),
(42, 7, 36, 'Gà chiên bột', 20000, 1),
(43, 7, 42, 'Spaghetti', 25000, 1),
(44, 7, 45, 'Bánh xoài', 12000, 1),
(45, 8, 38, 'Mirinda Cam', 10000, 1),
(46, 9, 43, 'Cơm gà cay', 37000, 1),
(47, 9, 40, 'Combo 1', 40000, 1),
(48, 9, 38, 'Mirinda Cam', 10000, 1),
(49, 10, 41, 'Cơm gà', 35000, 2),
(50, 10, 39, 'Mirinda Soda ', 10000, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `categoryID` int(11) NOT NULL,
  `categoryName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`categoryID`, `categoryName`) VALUES
(1, 'Combo'),
(2, 'Món chính'),
(3, 'Món thêm'),
(4, 'Tráng miệng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `food`
--

CREATE TABLE `food` (
  `foodID` int(11) NOT NULL,
  `image` varchar(255) NOT NULL,
  `foodName` varchar(50) NOT NULL,
  `foodPrice` int(11) NOT NULL,
  `categoryID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `food`
--

INSERT INTO `food` (`foodID`, `image`, `foodName`, `foodPrice`, `categoryID`) VALUES
(36, '397332844398300-01db0d79166b5c-2mienggaran25.png', 'Gà chiên bột', 20000, 3),
(37, '397238396973400-1e72dcb226ae80-supbido1.png', 'Súp bí đỏ', 15000, 3),
(38, '397382913052400-1f050c89336429-camlnmi.png', 'Mirinda Cam', 10000, 4),
(39, '397372772181300-5ab035ed73bcf8-sodaln1.png', 'Mirinda Soda ', 10000, 4),
(40, '397212157856100-0ade732c6f5968-2810014_comga01pepsi.png', 'Combo A', 40000, 1),
(41, '397297453800500-6d2e290195e851-cmggin.png', 'Cơm gà', 35000, 2),
(42, '397253189023200-7b8e79a673f041-1840007_01myylon.png', 'Spaghetti', 25000, 2),
(43, '397314524554200-38b2b63ad78a31-1gstcaycm.jpg', 'Cơm gà cay', 37000, 2),
(44, '397429101962000-80f8a0e3b4cc05-gasottieu.png', 'Gà sốt tiêu', 20000, 3),
(45, '397178650194200-99da79db6f9f3e-600x6001.png', 'Bánh xoài', 12000, 4),
(46, '397344965826800-427e7a3136f84a-4mingggin.png', 'Gà chiên giòn', 15000, 3),
(47, '397164715141200-999e149f170dbe-2mienggaran13.png', 'Bánh khoai môn', 12000, 4),
(48, '397148796335400-71434bb9342048-7up.png', 'Nước giải khát', 10000, 4),
(49, '397411941688300-20522844a2900d-1830004_sandwichesbbq.png', 'Hamburger', 25000, 2),
(50, '397283635400000-116908274_3089421527820267_2125373065773756980_n.jpg', 'Cơm chiên ', 12000, 3),
(51, '397194009523700-118682365_3604788289533207_654219286053687111_n.jpg', 'Canh rong biển', 15000, 3),
(52, '397267253843000-118905673_3878433185516880_9202707628595446932_n.jpg', 'Salad', 15000, 3),
(53, '397470555883700-118908869_3529512170421310_1267671191152423157_n.jpg', 'Gà chiên xù', 25000, 2),
(54, '397442082435100-119064353_3282594621820314_2603260340255098431_n.jpg', 'Gà nướng tỏi', 25000, 2),
(55, '397226080894100-119590546_3309006845848616_8240795640273137182_n.jpg', 'Trà chanh', 12000, 4),
(56, '397322970115100-b3ad51b912e4e5-2mienggaran24.png', 'Cơm trắng', 12000, 3),
(57, '397361248789600-ba19009c770377-750x750.png', 'Pepsi', 10000, 4),
(58, '397396227308100-d01402ed11976b-kemsundeadau.png', 'Kem dâu', 15000, 4),
(59, '397456547807900-dffcfad49e9d4204b36180b846584569_1583290456371012822.jpg', 'Gà sốt thái', 25000, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `userName` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `userPhone` varchar(10) NOT NULL,
  `userEmail` varchar(255) NOT NULL,
  `userGender` varchar(255) NOT NULL,
  `isSelf` int(11) NOT NULL,
  `isAdmin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`userName`, `password`, `userPhone`, `userEmail`, `userGender`, `isSelf`, `isAdmin`) VALUES
('admin123', 'admin123', '0398070811', '', 'Female', 0, 1),
('ggggggggggggggggg', '12345678', '0349554811', 'ngonhi@gmail.com', 'Other', 1, 0),
('ngonhi811', '123', '0398070811', 'ngonhi8112@gmail.com', 'Female', 1, 0),
('nguyendinhvinh', '12345678', '0349554822', 'ngonhi8@gmail.com', 'Other', 1, 0),
('nguyenthanhtam', 'dangkhungdien', '0852573133', 'trandaidang@gmail.com', 'Other', 1, 0),
('tam123456', '12345678', '0234567890', 'gsdyyg@gt.en', 'Male', 1, 0),
('tamtam', '12345678', '0349554899', 'ngonhi82@gmail.vn', 'Female', 1, 0),
('tamtamtam', '12345678', '0123456789', 'tamntce@gmail.com', 'Other', 1, 0),
('thanhthanhtam', '12345678', '0123456788', 'tam@fpt.vn', 'Female', 1, 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`billID`),
  ADD KEY `userName` (`userName`);

--
-- Chỉ mục cho bảng `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`cartID`),
  ADD KEY `billID` (`billID`),
  ADD KEY `foodID` (`foodID`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`categoryID`);

--
-- Chỉ mục cho bảng `food`
--
ALTER TABLE `food`
  ADD PRIMARY KEY (`foodID`),
  ADD KEY `categoryID` (`categoryID`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userName`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `cart`
--
ALTER TABLE `cart`
  MODIFY `cartID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `categoryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT cho bảng `food`
--
ALTER TABLE `food`
  MODIFY `foodID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`userName`) REFERENCES `user` (`userName`);

--
-- Các ràng buộc cho bảng `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`billID`) REFERENCES `bill` (`billID`),
  ADD CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`foodID`) REFERENCES `food` (`foodID`);

--
-- Các ràng buộc cho bảng `food`
--
ALTER TABLE `food`
  ADD CONSTRAINT `food_ibfk_1` FOREIGN KEY (`categoryID`) REFERENCES `category` (`categoryID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
