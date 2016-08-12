<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="container">


    <div class="alert alert-success fade in">
        <a class="close" data-dismiss="alert" href="#">&times;</a>
        <p>You've logged out</p>
    </div>


    <div class="alert alert-info fade in">
        <a class="close" data-dismiss="alert" href="#">&times;</a>
        <p>Register successful. You can log in</p>
    </div>


    <div class="alert alert-danger fade in">
        <a class="close" data-dismiss="alert" href="#">&times;</a>
        <p>Username or password is incorrect</p>
    </div>


    <div class="card card-container">
        <h4> Login to your account</h4>
        <form action="" method="post" class="form-signin">
            <input name="email" type="email" id="inputEmail" class="form-control"
                   placeholder="Email address" required autofocus>
            <input name="password" type="password" id="inputPassword" class="form-control"
                   placeholder="Password" required>
            <div id="remember" class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in
            </button>
        </form>
        <div class="margin-bottom-10">
            <a href="#" class="forgot-password">Forgot the password?</a>
        </div>
        <div class="margin-bottom-10">
            Don't have account? <a href="" class="register">Create account</a>
        </div>
    </div>
</div>