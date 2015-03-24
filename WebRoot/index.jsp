<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">

    <title>jQuery Validate Demo | aLittleCode</title>

	  <meta name="viewport" content="width=device-width">

    <link href="<%=path%>/resource/css/style.css" rel="stylesheet">

  	<script src="js/modernizr-2.5.3.min.js"></script>

  </head>
  <body>
		<div class="container">
				<div class="row">
				<div id="maincontent" class="span8">

				<div class="tabbable">
				 <!-- notes .alert -->
						<form action="" id="contact-form" class="form-horizontal">
						  <fieldset>
						    <legend>Sample Contact Form <small>(will not submit any information)</small></legend>

						    <div class="control-group">
						      <label class="control-label" for="name">Your Name</label>
						      <div class="controls">
						        <input type="text" class="input-xlarge" name="name" id="name">
						      </div>
						    </div>
						    <div class="control-group">
						      <label class="control-label" for="email">Email Address</label>
						      <div class="controls">
						        <input type="text" class="input-xlarge" name="email" id="email">
						      </div>
						    </div>
						    <div class="control-group">
						      <label class="control-label" for="subject">Subject</label>
						      <div class="controls">
						        <input type="text" class="input-xlarge" name="subject" id="subject">
						      </div>
						    </div>
						    <div class="control-group">
						      <label class="control-label" for="message">Your Message</label>
						      <div class="controls">
						        <textarea class="input-xlarge" name="message" id="message" rows="3"></textarea>
						      </div>
						    </div>
	              <div class="form-actions">
			            <button type="submit" class="btn btn-primary btn-large">Submit</button>
	    			      <button type="reset" class="btn">Cancel</button>
	        			</div>
						  </fieldset>
						</form>
					</div><!-- .tab-pane -->
					
					
					

				</div><!-- .tab-content -->
				</div><!-- .tabbable -->

				</div><!-- .span -->
				
			</div><!-- .row -->

      <hr>




    </div> <!-- .container -->

<!-- ==============================================
		 JavaScript below! 															-->

<!-- jQuery via Google + local fallback, see h5bp.com -->
	  <script src="<%=path%>/resource/js/jquery-1.11.2.min.js"></script>

<!-- Bootstrap JS -->
	  <script src="<%=path%>/resource/bootstrap/js/bootstrap.min.js"></script>

<!-- Validate plugin -->
		<script src="<%=path%>/resource/jquery-validation/jquery.validate.min.js"></script>

<!-- Prettify plugin -->
		<script src="assets/js/prettify/prettify.js"></script>

<!-- Scripts specific to this page -->
		<script src="<%=path%>/resource/js/script.js"></script>
  </body>
</html>
