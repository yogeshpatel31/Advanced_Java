<%@page import="com.ld.helper.RegistrationHelper"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Electronix Store</title>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style.css" />

<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>
	<div id="main_container">

		<div id="header">
			<div id="logo">
				<a href="#"><img src="images/logo.png" alt="" border="0"
					width="237" height="140" /></a>
			</div>
			<div class="oferte_content">
				<div class="top_divider">
					<img src="images/header_divider.png" alt="" width="1" height="164" />
				</div>
				<div class="oferta">
					<div class="oferta_content">
						<img src="images/laptop.png" width="94" height="92" alt=""
							border="0" class="oferta_img" />
						<div class="oferta_details">
							<div class="oferta_title">Samsung GX 2004 LM</div>
							<div class="oferta_text">Lorem ipsum dolor sit amet,
								consectetur adipisicing elit, sed do eiusmod tempor incididunt
								ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
								nostrud exercitation ullamco</div>
							<a href="details.html" class="details">details</a>
						</div>
					</div>
					<div class="oferta_pagination">
						<span class="current">1</span> <a href="#">2</a> <a href="#">3</a>
						<a href="#">4</a> <a href="#">5</a>
					</div>
				</div>
				<div class="top_divider">
					<img src="images/header_divider.png" alt="" width="1" height="164" />
				</div>
			</div>
			<!-- end of oferte_content-->
		</div>
		<div id="main_content">
			<div id="menu_tab">
				<div class="left_menu_corner"></div>
				<ul class="menu">
					<li><a href="#" class="nav1"> Home</a></li>
					<li class="divider"></li>
					<li><a href="#" class="nav2">Products</a></li>
					<li class="divider"></li>
					<li><a href="#" class="nav3">Specials</a></li>
					<li class="divider"></li>
					<li><a href="#" class="nav4">My account</a></li>
					<li class="divider"></li>
					<li><a href="#" class="nav4">Sign Up</a></li>
					<li class="divider"></li>
					<li><a href="#" class="nav5">Shipping</a></li>
					<li class="divider"></li>
					<li><a href="" class="nav6">Contact Us</a></li>
					<li class="divider"></li>
					<li class="currencies">Currencies <select>
							<option>INR</option>

					</select>
					</li>
				</ul>
				<div class="right_menu_corner"></div>
			</div>
			<!-- end of menu tab -->
			<div class="crumb_navigation">
				Navigation: <span class="current">Home</span>
			</div>
			<div class="left_content">
				<div class="title_box">Categories</div>
				<ul class="left_menu">
					<li class="odd"><a href="books.html">Books</a></li>
					<li class="even"><a href="mobiles.html">Mobiles</a></li>
					<li class="odd"><a href="laptops.html">Laptops &amp;
							Notebooks</a></li>

				</ul>
				
				
				
				<%
				
				String username = session.getAttribute("username").toString();
				RegistrationHelper helper = new RegistrationHelper();
				String first_name = helper.getUserFirstName(username);
				out.println("<div class='title_box'>Welcome, "+ first_name  +"</div>");
				
				%>
				
				
				
				
				
				
				
				
				
				
				
				
				<div class="border_box">
					<div class="product_title">
						<!--
		<a href="details.html">Motorola 156 MX-VL</a>
		-->
					</div>
					
					<h4><a href ="changePassword.jsp">Change Password</a></h4>
					<h4><a href ="changeProfile.jsp">Change Profile</a></h4>
					
					<div>
						<img src="images/adult.png" alt="" border="0" /></a>
					</div>

				</div>



			</div>



		</div>
		<!-- end of left content -->
		<div class="center_content">
			<div class="center_title_bar">Latest Products</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">DELL INSPIRON</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/dell.jpg" alt=""
							border="0" style="width: 78%; height: 10%;" /></a>
					</div>

					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Iphone Apple</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/p4.gif" alt=""
							border="0" /></a>
					</div>
					<div class="prod_price">
						<span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Advanced Java Book</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/advJava.png" alt=""
							border="0" style="width: 43%; height: 50%;" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">HP Laptop</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/hp.png" alt=""
							border="0" style="width: 65%; height: 10%;" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">SAMSUNG</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/samsung.jpg" alt=""
							border="0" style="width: 65%; height: 10%;" /></a>
					</div>
					<div class="prod_price">
						<span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Micro Processor</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/MPI.jpg" alt=""
							border="0" style="width: 43%; height: 50%;" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="center_title_bar">Recommended Products</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">SONY Laptop</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/sony.jpg" alt=""
							border="0" style="width: 95%; height: 50%;" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Nokia</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/nokia.jpg" alt=""
							border="0" style="width: 62%; height: 50%;" /></a>
					</div>
					<div class="prod_price">
						<span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
			<div class="prod_box">
				<div class="top_prod_box"></div>
				<div class="center_prod_box">
					<div class="product_title">
						<a href="details.html">Web Programming</a>
					</div>
					<div class="product_img">
						<a href="details.html"><img src="images/WP.jpg" alt=""
							border="0" style="width: 43%; height: 50%;" /></a>
					</div>
					<div class="prod_price">
						<span class="reduce">350$</span> <span class="price">270$</span>
					</div>
				</div>
				<div class="bottom_prod_box"></div>
				<div class="prod_details_tab">
					<a href="#" title="header=[Add to cart] body=[&nbsp;] fade=[on]"><img
						src="images/cart.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Specials] body=[&nbsp;] fade=[on]"><img
						src="images/favs.gif" alt="" border="0" class="left_bt" /></a> <a
						href="#" title="header=[Gifts] body=[&nbsp;] fade=[on]"><img
						src="images/favorites.gif" alt="" border="0" class="left_bt" /></a> <a
						href="details.html" class="prod_details">details</a>
				</div>
			</div>
		</div>
		<!-- end of center content -->
		<div class="right_content">

			<div class="title_box">What’s new</div>
			<div class="border_box">
				<div class="product_title">
					<a href="details.html">Motorola 156 MX-VL</a>
				</div>
				<div class="product_img">
					<a href="details.html"><img src="images/p2.gif" alt=""
						border="0" /></a>
				</div>
				<div class="prod_price">
					<span class="reduce">350$</span> <span class="price">270$</span>
				</div>
			</div>


		</div>
		<!-- end of right content -->
	</div>
	<!-- end of main content -->
	<div class="footer">
		<div class="left_footer">
			<img src="images/footer_logo.png" alt="" width="170" height="49" />
		</div>
		<div class="center_footer">
			Template name. All Rights Reserved 2008<br /> <a
				href="http://csscreme.com"><img src="images/csscreme.jpg"
				alt="csscreme" border="0" /></a><br /> <img src="images/payment.gif"
				alt="" />
		</div>
		<div class="right_footer">
			<a href="#">home</a> <a href="#">about</a> <a href="#">sitemap</a> <a
				href="#">rss</a> <a href="">contact us</a>
		</div>
	</div>
	</div>


</body>
</html>