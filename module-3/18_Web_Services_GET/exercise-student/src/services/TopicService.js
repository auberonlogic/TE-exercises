import axios from 'axios';

const http = axios.create({
    baseUrl: "https://te-pgh-api.azurewebsites.net/api",
    headers: {
        common: {
            APIKEY: '03017'
        }
    }
});

export default {

    getTopics() {
        return http.get('/topics');
    }

}