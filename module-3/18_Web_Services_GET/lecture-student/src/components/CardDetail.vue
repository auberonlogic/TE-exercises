<template>
  <div>
    <div v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <h2>{{card.title}}</h2>
      <p>{{card.description}}</p>
      <comments-list :comments="card.comments" />
    </div>
  </div>
</template>

<script>
import BoardService from '@/services/BoardService.js'
import CommentsList from '@/components/CommentsList.vue'
export default {
  
  name: "card-detail",
  components: {CommentsList},

  data() {
    return {
      isLoading: true,
      card: {}
    }
  },

  created() {
    BoardService.getCard(this.$route.params.boardID, this.$route.params.cardID)
    .then(response => {
      this.card = response;
      this.isLoading = false;
    });
  }

};
</script>
