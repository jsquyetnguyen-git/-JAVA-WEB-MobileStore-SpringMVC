<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta charset="ISO-8859-1">

    <title>Login</title>
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/img/ico/Qmobile.ico" />
    <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
    
    <!-- css+bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</head>

<body id="page-top">
    <!-- Modal -->
    <div class="modal-dialog shadow-lg">
        <div class="modal-content">
            <div class="modal-header">
                <img style="width: 8rem;" src="${pageContext.request.contextPath}/resources/img/logos/logo.png" alt="logo">
            </div>
            <div class="modal-body">
                <form action="login.html" method="post" name="loginForm" onsubmit="return validForm()">
                    <div class="mb-2">
                        <div class="text-danger text-center text-uppercase">${error}</div>
                    </div>
                    <div class="md-form mb-3">
                        <i class="fas fa-user"></i>
                        <input type="text" name="username" placeholder="Enter username" class="form-control">
                    </div>
                    <div class="md-form mb-3">
                        <i class="fas fa-lock"></i>
                        <input type="password" name="password" placeholder="Enter password" class="form-control">
                    </div>
                    <div class="d-flex justify-content-center">
                        <button type="submit" class="btn btn-outline-secondary me-1">Login</button>
                        <button type="reset" class="btn btn-outline-secondary ms-1">Reset</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer d-flex justify-content-center">
                <p>Not a member yet? <span><a class = "text-decoration-none" href="#">Sign Up</a></span>.</p>
            </div>
        </div>
    </div>

<!--JS-->
<script src="${pageContext.request.contextPath}/resources/script/scripts.js"></script>
</body>

</html>