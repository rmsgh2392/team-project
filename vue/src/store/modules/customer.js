import axios from 'axios'


const state = {
	customer : {},
	sidebars : [],
	isAuth : ''
}
const getters = {
	getCustomer : state => state.customer,
	getSidebars : state => state.sidebars,
	getIsAuth : state => state.isAuth
	
}
const actions = {
	login({commit},{userid,passwd ,context}){
		alert('로그인 액션 들어옴')
		const url = `${context}login`
		let headers = {
            'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'
        }
		axios
		.post(url, {userid ,passwd}, headers)
		.then(({data})=>{commit('LOGIN',data)})
		.catch(()=>{alert(`axios 실패`)})
	}
}
const mutations = {
	LOGIN(state, data){
		alert('뮤테이션 들어옴'+data)
		state.customer = data.customer
		state.isAuth = data.msg
		alert(`isAuth : ${data.msg}`)
		alert(`customer : ${data.customer}`)
	}
}
export default {
	name : 'customer',
	namespaced : true,
	state,
	getters,
	actions,
	mutations
}
