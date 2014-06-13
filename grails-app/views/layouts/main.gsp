<!DOCTYPE html>
<html>

<head>
	<g:set var="locationName" value="${message(code: 'location.label', default: 'Location')}" />
	<g:set var="deviceName" value="${message(code: 'device.label', default: 'Device')}" />
	
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>DeviceTracker</title>

    <!-- Core CSS - Include with every page -->
    <link href="${request.contextPath}/bootstrap_theme/css/bootstrap.min.css" rel="stylesheet">
    <link href="${request.contextPath}/bootstrap_theme/font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Dashboard -->
    <link href="${request.contextPath}/bootstrap_theme/css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
    <link href="${request.contextPath}/bootstrap_theme/css/plugins/timeline/timeline.css" rel="stylesheet">

    <!-- SB Admin CSS - Include with every page -->
    <link href="${request.contextPath}/bootstrap_theme/css/sb-admin.css" rel="stylesheet">

</head>

<body>

    <div id="wrapper">

        <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">DeviceTracker</a>
            </div>
            <!-- /.navbar-header -->

            <div class="navbar-default navbar-static-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="side-menu">
                    	<li>
                            <a href="${createLink(uri: '/')}"><i class="fa fa-table fa-fw"></i><g:message code="default.home.label"/></a>
                        </li>
                    	<li>
                            <a href="#"><i class="fa fa-dashboard fa-fw"></i>Device<span class="fa arrow"></a>
							<ul class="nav nav-second-level">
								<li>
                                    <a href="${createLink(uri: '/device/index')}"><g:message code="default.list.label" args="[deviceName]" /></a>
                                </li>
                                <li>
                                    <a href="${createLink(uri: '/device/create')}"><g:message code="default.new.label" args="[deviceName]" /></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-dashboard fa-fw"></i>Location<span class="fa arrow"></a>
							<ul class="nav nav-second-level">
								<li>
                                    <a href="${createLink(uri: '/location/index')}"><g:message code="default.list.label" args="[locationName]" /></a>
                                </li>
                                <li>
                                    <a href="${createLink(uri: '/location/create')}"><g:message code="default.new.label" args="[locationName]" /></a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <!-- /#side-menu -->
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-8">
                	
                	<!-- GSP -->
                    <g:layoutBody/> 
                    <!--------->
                    
                    <!-- /.panel .chat-panel -->
                </div>
                <!-- /.col-lg-4 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="${request.contextPath}/bootstrap_theme/js/jquery-1.10.2.js"></script>
    <script src="${request.contextPath}/bootstrap_theme/js/bootstrap.min.js"></script>
    <script src="${request.contextPath}/bootstrap_theme/js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Dashboard -->
    <script src="${request.contextPath}/bootstrap_theme/js/plugins/morris/raphael-2.1.0.min.js"></script>
    <script src="${request.contextPath}/bootstrap_theme/js/plugins/morris/morris.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="${request.contextPath}/bootstrap_theme/js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Dashboard - Use for reference -->
    <script src="${request.contextPath}/bootstrap_theme/js/demo/dashboard-demo.js"></script>
    
</body>

</html>
