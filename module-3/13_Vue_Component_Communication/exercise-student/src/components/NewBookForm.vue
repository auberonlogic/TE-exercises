<template>
    <form class="new-book-form">
        <label for="title">Title:</label>
        <input type="text" name="title" class="title-input" v-model="newBook.title" />

        <label for="author">Author:</label>
        <input type="text" name="author" class="author-input" v-model="newBook.author" />
        
        <label for="isbn">ISBN:</label>
        <input type="text" name="isbn" class="isbn-input" v-model="newBook.isbn" />

        <button type="submit" @click.prevent="addNewBook" >Add New Book</button>

    </form>
</template>

<script>
export default {
    name: "new-book-form",
    data() {
        return {
            newBook: {
                title: "",
                author: "",
                read: true,
                isbn: ""
            }
        }
    },
    methods: {
        addNewBook() {
            this.$store.commit('ADD_NEW_BOOK', this.newBook);
        }
    }
}
</script>