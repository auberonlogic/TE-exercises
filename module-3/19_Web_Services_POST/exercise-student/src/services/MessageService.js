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

  get(id) {
    return http.get(`/messages/${id}`);
  },

  post(message) {
    return http.post('/messages', message);
  },

  put(message) {
    return http.put(`/messages/${message.id}`, message);
  },

  deleteMessage(id) {
    return http.delete(`/messages/${id}`);
  }

}
