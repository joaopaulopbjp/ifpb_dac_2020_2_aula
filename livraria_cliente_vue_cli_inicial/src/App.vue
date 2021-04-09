<template>
  <div class="container">
    <h1>Livraria On line</h1>
    <Navegacao></Navegacao>
    <router-view/>
  </div>
</template>

<script>
/*
import AdicionaLivro from './components/AdicionaLivro.vue'
*/
import Navegacao from './views/Navegacao.vue'

export default {
  name: 'App',
  components: {
    Navegacao
  }
}
</script>