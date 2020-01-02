<template>
<div>
    <div class="login-box">
        <img src="@/assets/img/profile.png" class="avatar">
        <h1>헬창의 길</h1>
        <form>
            <p>사용자 ID</p>
            <input type="text" name="username" placeholder="Enter UserID">
            <p>비밀번호</p>
            <input type="password" name="password" placeholder="Enter Password">
            <input type="submit" name="submit" value="Login">
            <a href="#">비밀번호를 잊으셨나요?</a>
            <div class="text-center small">Don't have an account?<router-link to="/join">Sign up</router-link></div>
        </form>
</div>
</div>
</template>
<script>
export default{

}
</script>
<style scoped>
body{
margin: 0;
padding: 0;
/* background: url(@/assets/img/backG.png); */
background-size: cover;
background-position:center;
font-family: sans-serif;
}
.login-box{
width: 320px;
height: 420px;
background: rgba(0, 0, 0, 0.5);
color: #fff;
top: 50%;
left:50%;
position:absolute;
transform: translate(-50%, -50%);
box-sizing: border-box;
padding: 70px 30px;
}
.avatar{
width: 100px;
height: 100px;
border-radius: 50%;
position: absolute;
top: -50px;
left: calc(50% - 50 px);
}
h1{
margin: 0;
padding: 0 0 20px;
text-align: center;
font-size: 22px;
}
.login-box p{
margin: 0;
padding: 0;
font-weight: bold;
}
.login-box input{
width: 100%;
margin-bottom: 20px;
}
.login-box input[type="text"], input[type="password"]
{
border: none;
border-bottom: 1 px solid #fff;
background: transparent;
outline: none;
height: 40px;
color: #fff;
font-size: 16px;
}
.login-box input[type="submit"]
{
border: none;
outline: none;
height: 40px;
background: #1c8adb;
color: #fff;
font-size: 18px;
border-radius: 20px;
}
.login-box input[type="submit"]:hover
{
cursor: pointer;
background: #39dc79;
color: #000;
}
.login-box a{
text-decoration: none;
font-size: 14px;
color: #fff;
}
.login-box a:hover
{
color: #39dc79;
}
</style>