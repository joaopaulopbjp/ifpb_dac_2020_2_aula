<template>
<div class="container">
		<main>
			<h1>Lista de livros</h1>

			<div class="card" v-for="livro in livros" v-bind:key="livro.isbn">
				<div class="card-body">
					<div>Titulo: {{ livro.titulo }}, preco: {{ livro.preco }}</div>
				</div>
			</div>
		</main>
</div>
</template>
<script>
import axios from 'axios'

export default{
	name: 'Home',
	data() {
		return {
			livros: [
				{
					titulo:"UML",
					isbn:"1122",
					preco:44
				}
			]
		};
	},
	mounted () {
		axios
		.get('http://localhost:8080/livros')
		.then(response => (this.livros = response.data));
	}
}
</script>