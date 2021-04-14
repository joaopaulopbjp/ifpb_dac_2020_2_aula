import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import AdicionaLivro from '../views/AdicionaLivro.vue'

const routes = [
  {
    path: '/',
    component: Home
  },
  {
    path: '/add',
    component: AdicionaLivro
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
