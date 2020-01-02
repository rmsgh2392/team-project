import Vue from 'vue'
import App from '@/components/Home.vue'
import vuetify from './plugins/vuetify'
import axios from 'axios'
import router from './router'

Vue.config.productionTip = false
Vue.prototype.$http = axios
new Vue({
  vuetify,
  axios,
  router,
  render: h => h(App)
}).$mount('#app')
