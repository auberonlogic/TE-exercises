import axios from 'axios';

const http = axios.create({
  baseURL: "https://te-pgh-api.azurewebsites.net/api",
  headers: {
    common: {
      APIKEY: '03017'
    }
  }
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },

  post(topic) {
    return http.post('/topics', topic);
  },

  put(topic) {
    return http.put(`/topics/${topic.id}`, topic);
  },

  deleteTopic(id) {
    return http.delete(`/topics/${id}`);
  }

}
