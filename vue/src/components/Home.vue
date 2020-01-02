<template>
<div id="app">
  <div class="login_start">
    <span>
      <button class="login_btn"><b><router-link to="/login">로그인</router-link></b></button>
    </span>
  </div>
  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar"> 
                <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="indexReference.html"><img src="img/w3newbie.png"></a>
            </div>
          <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
              <li class="active"><a href="index.html">Home</a></li>
              <li><a href="about.html">protein calculator</a></li>
              <li><a href="courses.html"><router-link to="/board">헬스타그램</router-link></a></li>
              <li><a href="deca.html">DECA</a></li>
              <li><a href="schoolstore.html">School Store</a></li>
              <li><a href="resources.html">Resources</a></li>
              <li><a href="contacts.html">Contacts</a></li>
            </ul>
         </div>
    </div>
  </nav>
  <layout>
    <template #header>
      <div id="myCarousel" class="carousel slide" data-ride="carousel" style="min-width : fit-content;"> 
    <ol class="carousel-indicators"> 
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li> 
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
    <div class="item active">
    <img src="@/assets/img/backG.png" style="width:1000px;height:200px;"> 
    <div class="carousel-caption">
    <h1>impact the future</h1> 
    <br>
    <button type="button" class="btn btn-default">Learn More</button> 
</div>
</div>
    <div class="item">
    <img src="@/assets/img/exercise.jpg" style="width:1000px;height:200px;"> 
      <div class="carousel-caption">
    <h1>Aspiring to becoming a successful entrepreneur?</h1> 
    <br> 
    <button type="button" class="btn btn-default">Find Out How</button> 
</div>
    </div>
            <div class="item">
    <img src="@/assets/img/main.jpg" style="width:1000px;height:200px;"> 
                <div class="carousel-caption">
    <h1>having trouble with your business assignment?</h1> 
    <br> 
    <button type="button" class="btn btn-default">Get Help</button> 
</div>
    </div>
    </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev" style="left: auto;"> 
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> 
        <span class="sr-only">Previous</span>
        </a> 
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> 
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
        </a> 
     </div>
    </template>
    <template #sidebar>
    </template>
    <template #content>
      <router-view/>
    </template>
  </layout>
<!-- <div id="main" class="fix-sidebar" style="">
<div class="sidebar">
  <div class="sidebar-inner">
    <div class="list">
      <h2>Show Guide</h2>
      <ul>
      <li><router-link to="/">{{list}}</router-link></li>
      </ul>
    </div>
  </div>
</div>
</div> -->
  <!-- <nav id="sidebar">
<div class="custom-menu">
<button type="button" id="sidebarCollapse" class="btn btn-primary">
</button>
</div>
<div class="img bg-wrap text-center py-4" style="background-image: url(images/bg_1.jpg);">
<div class="user-logo">
<div class="img" style="background-image: url(images/logo.jpg);"></div>
</div>
</div>
<ul class="list-unstyled components mb-5">
<li class="active">
<a href="#"><span class="fa fa-home mr-3"></span> Home</a>
</li>
<li>
<a href="#"><span class="fa fa-download mr-3 notif"><small class="d-flex align-items-center justify-content-center">5</small></span> Download</a>
</li>
<li>
<a href="#"><span class="fa fa-gift mr-3"></span> Gift Code</a>
</li>
<li>
<a href="#"><span class="fa fa-trophy mr-3"></span> Top Review</a>
</li>
<li>
<a href="#"><span class="fa fa-cog mr-3"></span> Settings</a>
</li>
<li>
<a href="#"><span class="fa fa-support mr-3"></span> Support</a>
</li>
<li>
<a href="#"><span class="fa fa-sign-out mr-3"></span> Sign Out</a>
</li>
</ul>
</nav> -->
  <!-- <div id="myCarousel" class="carousel slide" data-ride="carousel" style="min-width : fit-content;"> 
    <ol class="carousel-indicators"> 
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li> 
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
    <div class="item active">
    <img src="@/assets/img/backG.png" style="width:1800px;height:570px;"> 
    <div class="carousel-caption">
    <h1>impact the future</h1> 
    <br>
    <button type="button" class="btn btn-default">Learn More</button> 
</div>
</div>
    <div class="item">
    <img src="@/assets/img/exercise.jpg" style="width:1826px;height:570px;"> 
      <div class="carousel-caption">
    <h1>Aspiring to becoming a successful entrepreneur?</h1> 
    <br> 
    <button type="button" class="btn btn-default">Find Out How</button> 
</div>
    </div>
            <div class="item">
    <img src="img/resources.jpeg" style="width:1826px;height:570px;"> 
                <div class="carousel-caption">
    <h1>having trouble with your business assignment?</h1> 
    <br> 
    <button type="button" class="btn btn-default">Get Help</button> 
</div>
    </div>
    </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev" style="left: auto;"> 
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> 
        <span class="sr-only">Previous</span>
        </a> 
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> 
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
        </a> 
     </div>  -->
</div>
</template>
<script>
import Layout from '@/components/cmm/Layout.vue'
export default {
  components : {Layout}
}
</script>
<style scoped>
.navbar-inverse{
  margin-top : 20px;
}
.login_btn{
  float : right;
  background-color: tomato;
  width : 10%;
  height : 30px;
  border-radius: 10px;
}
.login_start{
  height: 20px;
}
.carousel{
  padding-left : 20%;
}
.carousel-control{
  position: absolute;
    top: 0;
    bottom: 0;
    width: 15%;
    font-size: 20px;
    color: #fff;
    text-align: center;
    text-shadow: 0 1px 2px rgba(0,0,0,.6);
    background-color: rgba(0,0,0,0);
    filter: alpha(opacity=50);
    opacity: .5;
}
</style>