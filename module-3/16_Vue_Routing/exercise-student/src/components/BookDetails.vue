<template>
  <div>
      <h2>{{ book.title }}</h2>
      <h2>{{ book.author }}</h2>
      <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
      <h3 v-if="book.read">I've read this book</h3>
      <h3 v-else>I have not read this book</h3>
  </div>
</template>

<script>
export default {
    name: 'book-details',
    computed: {
        book() {
            return this.$store.state.books.find(
                (book) => {
                    return book.isbn == this.$route.params.isbn;
                }
            );
        }
    }
}
</script>

<style>

</style>