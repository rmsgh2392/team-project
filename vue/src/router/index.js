import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/auth/Login.vue'
import Join from '@/components/auth/Join.vue'
import Mypage from '@/components/auth/Mypage.vue'
import Board from '@/components/board/Board.vue'
import PostCard from '@/components/board/PostCard.vue'
import Profile from '@/components/board/Profile.vue'
Vue.use(Router)
export default new Router({
	mode : 'history',
	routes : [
		{path : '/login', name : 'login' , component : Login},
		{path : '/join', name : 'join' , component : Join},
		{path : '/mypage', name : 'mypage' , component : Mypage},
		{path : '/board', name : 'board' , component : Board},
		{path : '/postcard', name : 'postcard' , component : PostCard},
		{path : '/profile', name : 'profile' , component : Profile},
	]
})


