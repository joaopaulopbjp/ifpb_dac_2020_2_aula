<template>
<div class="container">
		<main>
		<header>
			<h1>Adiciona livro</h1>
		</header>
		<div class="row mb-3">
			<label for="titulo" class="col-sm-2 col-form-label">Titulo:</label>
			<div class="col-sm-10">
				<input type="text" id="titulo" class="form-control"
						v-model="livro.titulo">
			</div>
		</div>
		<div class="row mb-3">
			<label for="isbn" class="col-sm-2 col-form-label">Isbn:</label>
			<div class="col-sm-10">
				<input type="text" id="isbn" class="form-control"
						v-model="livro.isbn">
			</div>
		</div>
		<div class="row mb-3">
			<label for="preco" class="col-sm-2 col-form-label">Preço:</label>
			<div class="col-sm-10">
				<input type="number" id="preco" class="form-control"
						v-model="livro.preco">
			</div>
		</div>

		<button type="submit" value="Enviar"
				v-on:click="enviarNovoLivro(livro)">Enviar</button>
		</main>
	</div>
</template>
<script>
export default{
    name: 'AdicionaLivro',
    data() {
        return {
            livro: {
                titulo: "",
				isbn: "",
				preco:""
                }
                }
    },
    methods:{
        enviarNovoLivro: function(livro){
        console.log("Livro adicionado: "+livro.titulo);
		/*this.$router.replace("/");*/
        }
        }
}
</script>