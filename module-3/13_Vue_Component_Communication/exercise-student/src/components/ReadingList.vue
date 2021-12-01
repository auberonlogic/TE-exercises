<template>
  <div class="book-container">
    <book-card 
      v-for="book in books"
      v-bind:key="book.title"
      v-bind:book="book"
    />
  </div>
</template>

<script>
import BookCard from './BookCard.vue'

export default {
  name: 'reading-list',
  data() {
    return {
      books: this.$store.state.books
    }
  },

  components: {
    BookCard
  }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>