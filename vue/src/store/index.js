import Vue from 'vue'
import Vuex from 'vuex'
import routine from '@/store/modules/routine'
import customer from '@/store/modules/customer'
import article from '@/store/modules/article'
import common from '@/store/modules/common'
Vue.use(Vuex)
export const store = new Vuex.Store({
	modules : {
		routine,
		customer,
		article,
		common
	}
})