<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" 
	href="${pageContext.request.contextPath}/resources/jquery-ui-1.10.1.custom/development-bundle/themes/base/jquery.ui.all.css">
	<script 
	src="${pageContext.request.contextPath}/resources/jquery-ui-1.10.1.custom/js/jquery-1.9.1.js"></script>
	<script 
	src="${pageContext.request.contextPath}/resources/jquery-ui-1.10.1.custom/development-bundle/ui/jquery.ui.core.js"></script>
	<script 
	src="${pageContext.request.contextPath}/resources/jquery-ui-1.10.1.custom/development-bundle/ui/jquery.ui.widget.js"></script>
	<script 
	src="${pageContext.request.contextPath}/resources/jquery-ui-1.10.1.custom/development-bundle/ui/jquery.ui.tabs.js"></script>
	<link rel="stylesheet" 
	href="${pageContext.request.contextPath}/resources/jquery-ui-1.10.1.custom/development-bundle/demos.css">
	<script src="${pageContext.request.contextPath}/resources/jquery-ui-1.10.1.custom/development-bundle/ui/jquery.ui.datepicker.js"></script>
	<script>
	$(function() {
		$( "#tabs" ).tabs();
	});
	
	//datepicker for DOB
	$(function() {
		$( "#DateOfBirth" ).datepicker({
			changeYear: true,
		});
	});
	</script>
	
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<title>Compro on-Line Admission System</title>
<style>
.error {
	color: #ff0000;
}
 
.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
	font-weight: bold;
}
</style>
</head>
<body>
	<div id="container">
		<header>
			<c:url var="logoutUrl" value="/doLogout/"/>
			<h1><span class="blue-text">Computer Professionals Program</span></h1>
			<h3>Maharishi University of Management, <span class="white-text">USA
			<a style="color: white" href="${logoutUrl}">Logout(${email})</a></span></h3>
		</header><!--header end-->
		<nav id = "menu">
			<ul>
				<c:url var="changePasswordUrl" value="/changePassword"/>
				<c:url var="applicationUrl" value="/application"/>
				<li class="menuitem"><a href="${changePasswordUrl}">Change Password</a></li>
				<li class="menuitem"><a href="${applicationUrl}">Application</a></li>
			</ul>
	     </nav><!--menu end-->
		
	<section>
	
			<h2>Apply on-Line</h2>
			<div id="tabs">
				<ul>
					<li><a href="#tabs-1">Personal Information</a></li>
					<li><a href="#tabs-2">English Proficiency</a></li>
					<li><a href="#tabs-3">Educational History</a></li>
					<li><a href="#tabs-4">Professional Experience</a></li>
					<li><a href="#tabs-5">Self Study</a></li>
					<li><a href="#tabs-6">Final</a></li>
				</ul>
				<c:url var="personalInformationUrl" value="personalInformation"/>
				<div id="tabs-1">
					<form:form action="${personalInformationUrl}" method="POST" 
					commandName="personalApplication">
					<fieldset id="personalInformation_1">
						<legend><span>Information as Displayed in your Passport</span></legend>
						<p>
							<form:label path="application.applicant.firstName">
								(Given)First Name(s)</form:label>
							<form:input path="application.applicant.firstName" id="firstName" 
								value=""/>
						</p>
						
						<p>
							<form:label path="application.applicant.middleName">
								Middle Name(s)</form:label>
							<form:input path="application.applicant.middleName" id="middleName" 
								value=""/>
						</p>
						
						<p>
							<form:label path="application.applicant.lastName">
								(Family) Legal Surname(s)</form:label>
							<form:input path="application.applicant.lastName" id="lastName" 
								value=""/>
						</p>
						
						<p>
							<form:label path="sex">Sex</form:label>
							<form:select path="sex" id="sex">
								<form:option value="">Select Sex</form:option>
								<form:option value="Female">Female</form:option>
								<form:option value="Male">Male</form:option>
							</form:select>
						</p>
						
						<p>
							<form:label path="maritalStatus">Marital Status</form:label>
							<form:select path="maritalStatus" id="maritalStatus">
								<form:option value="">Select Marital Status</form:option>
								<form:option value="Single">Single</form:option>
								<form:option value="Married">Married</form:option>
							</form:select>
						</p>
						
						<p>
							<form:label path="countryOfCitizenship.description">
								Country of Citizenship</form:label>
							<form:select path="countryOfCitizenship.description" 
								id="countryOfCitizenship">
								<form:option value="0">Select a Country</form:option>
								<form:option value="-1">Not on List</form:option>
								<form:options itemLabel="countryOfCitizenship.description" 
									itemValue="countryOfCitizenship.id" items="${countries}"/>
							</form:select>
						</p>
						
						<p>
							<form:label path="notOnListOfCountryOfCitizenship" 
								cssStyle="font-style: italic;"> If 'Not on List':</form:label>
							<form:input path="notOnListOfCountryOfCitizenship" 
								id="notOnListOfCountryOfCitizenship" value=""/>
						</p>
						
						<p>
							<form:label path="countryOfBirth.description">
								Country of Birth</form:label>
							<form:select path="countryOfBirth.description" 
								id="countryOfBirth">
								<form:option value="0">Select a Country</form:option>
								<form:option value="-1">Not on List</form:option>
								<form:options itemLabel="countryOfBirth.description" 
									itemValue="countryOfBirth.id" items="${countries}"/>
							</form:select>
						</p>
						
						<p>
							<form:label path="notOnListOfCountryOfBirth" 
								cssStyle="font-style: italic;"> If 'Not on List':</form:label>
							<form:input path="notOnListOfCountryOfBirth" 
								id="notOnListOfCountryOfBirth" value=""/>
						</p>
						
						<p>
							<form:label path="DateOfBirth">Date Of Birth</form:label>
							<form:input path="DateOfBirth" type="date" id="DateOfBirth" value=""/>
						</p>
				</fieldset>
				<fieldset id="personalInformation_2">
					<legend><span>Contact Information</span></legend>
					<p>
						<form:label path="application.applicant.emailAddress">
							Email Address</form:label>
							<form:input path="application.applicant.emailAddress" type="email" 
								id="emailAddress" value=""/>
					</p>
					<p>
					<form:label path="application.applicant.confirmEmail">
							Confirm Email Address</form:label>
					<form:input path="application.applicant.confirmEmail" type="email" 
								id="confirmEmail" value=""/>
					</p>
					
					<p>
						<form:label path="skypeId">Skype ID: (Optional)</form:label>
						<form:input path="skypeId" id="skypeId" value=""/>
					</p>
					
					<p>
						<form:label path="phoneNumber">Phone Number (please enter only one number)
							</form:label>
						<form:input path="phoneNumber" id="phoneNumber" value=""/>
					</p>
					
					<p>
						<form:label path="cityLivingNow">City you live in now</form:label>
						<form:input path="cityLivingNow" id="cityLivingNow" value=""/>
					</p>
					
					<p>
						<form:label path="countryLivingNow.description">
								Country you live in now</form:label>
						<form:select path="countryLivingNow.description" id="countryLivingNow">
							<form:option value="0">Select a Country</form:option>
							<form:option value="-1">Not on List</form:option>
							<form:options itemLabel="countryLivingNow.description" 
								itemValue="countryLivingNow.id" items="${countries}"/>
						</form:select>
				   </p>
				   
				   <p>
						<form:label path="notOnListOfCountryLivingNow" 
							cssStyle="font-style: italic;"> If 'Not on List':</form:label>
						<form:input path="notOnListOfCountryLivingNow" 
							id="notOnListOfCountryLivingNow" value=""/>
				   </p>
				</fieldset>
					</form:form>
				</div>
				
				<div id="tabs-2">
					Tab 2
				</div>
				<div id="tabs-3">
					Tab3
				</div>
				<div id="tabs-4">
					Tab4
				</div>
				<div id="tabs-5">
					Tab5
				</div>
				<div id="tabs-6">
					<form:form action="${finalSectionUrl}" method="POST" commandName="finalSection">
					</form:form>
				</div>
			</div>
    </section><!--content end-->
	
</div><!--container end-->
</body>

<div style ="clear:both"></div>
<footer>
	Copyright 2013 Nolle Group.
</footer>
</html>