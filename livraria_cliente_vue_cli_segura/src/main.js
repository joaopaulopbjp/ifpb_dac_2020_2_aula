import { createApp } from 'vue'
import App from './App.vue'
import router from './router/index.js'
import Keycloak from 'keycloak-js'

let initOptions = {
    url: 'http://localhost:8080/auth', realm: 'livrariarealm', clientId: 'livraria', onLoad:'login-required'
  }
  
const keycloak = Keycloak(initOptions)
  
keycloak.init({ onLoad: initOptions.onLoad }).success((auth) =>{
      
      if(!auth) {
        window.location.reload();
      } else {
        console.log("Authenticated");
      }

    const app = createApp(App)
    app.config.globalProperties.$keycloak = keycloak
    app.use(router)
    app.mount('#app') 
  
      localStorage.setItem("vue-token", keycloak.token);
      localStorage.setItem("vue-refresh-token", keycloak.refreshToken);
  
      setInterval(() =>{
        keycloak.updateToken(70).success((refreshed)=>{
          if (refreshed) {
            console.log('Token refreshed'+ refreshed);
          } else {
            console.log('Token not refreshed, valid for '
            + Math.round(keycloak.tokenParsed.exp + keycloak.timeSkew - new Date().getTime() / 1000) + ' seconds');
          }
        }).error(()=>{
          console.log('Failed to refresh token');
        });
  
  
      }, 60000)
  
  }).error(() =>{
    console.log("Authenticated Failed");
  });