<template>
  <div id="viewport" class="fixed-top">
  <div id="sidebar">
    <header>
      <a href="#">My App</a>
    </header>
    <ul class="nav" v-for="routine of routines" :key="routine.menu">
      <li>
        <router-link :to="routine.link">
          <i class="zmdi zmdi-view-dashboard"></i>{{routine.menu}}
        </router-link>
      </li>
    </ul>
  </div>
  </div>
</template>
<script>
export default{
  name : 'routineSidebar',
	data(){
    return {
      routines : [
        {menu : '가슴운동', link :'#'},
        {menu : '등운동', link :'#'},
        {menu : '어깨운동', link :'#'},
        {menu : '하체운동', link :'#'},
        {menu : '팔 운동', link :'#'},
        {menu : '코어 운동', link :'#'}
      ]
    }
  }
}
</script>
<style scoped>
@import url('https://fonts.googleapis.com/css?family=Roboto:300,400,400i,500');
#viewport {
  padding-left: 250px;
  -webkit-transition: all 0.5s ease;
  -moz-transition: all 0.5s ease;
  -o-transition: all 0.5s ease;
  transition: all 0.5s ease;
}
#sidebar {
  z-index: 1000;
  position: fixed;
  left: 250px;
  width: 250px;
  height: 100%;
  margin-left: -250px;
  overflow-y: auto;
  background: #37474F;
  -webkit-transition: all 0.5s ease;
  -moz-transition: all 0.5s ease;
  -o-transition: all 0.5s ease;
  transition: all 0.5s ease;
}
#sidebar header {
  background-color: #263238;
  font-size: 20px;
  line-height: 52px;
  text-align: center;
}
#sidebar header a {
  color: #fff;
  display: block;
  text-decoration: none;
}
#sidebar header a:hover {
  color: #fff;
}
#sidebar .nav a{
  background: none;
  border-bottom: 1px solid #455A64;
  color: #CFD8DC;
  font-size: 14px;
  padding: 16px 24px;
}

#sidebar .nav a:hover{
  background: none;
  color: #ECEFF1;
}

#sidebar .nav a i{
  margin-right: 16px;
}
</style>