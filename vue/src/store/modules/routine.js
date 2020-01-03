const state = {
	isAuth : '',
	routine : {},
	sidebaers : [
        {menu : '가슴운동', link :'#'},
        {menu : '등운동', link :'#'},
        {menu : '어깨운동', link :'#'},
        {menu : '하체운동', link :'#'},
        {menu : '팔 운동', link :'#'},
        {menu : '코어 운동', link :'#'}
      ]
}
const getters = {
	getIsAuth : state => state.isAuth,
	getRoutine : state =>state.routine,
	getSidebars : state =>state.sidebaers
}
const actions = {}
const mutations = {}
export default {
	name : 'routine',
	namespaced : true,
	state,
	getters,
	actions,
	mutations
}

