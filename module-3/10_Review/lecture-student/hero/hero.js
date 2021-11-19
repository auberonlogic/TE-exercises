const nerdyURL = 'http://api.icndb.com/jokes/random?exclude=explicit&limitTo=nerdy';
const randomURL = 'http://api.icndb.com/jokes/random?exclude=explicit';


document.addEventListener('DOMContentLoaded', () => {
    const nerdy = document.getElementById('nerdButton');
    const h4 = document.querySelector('h4');
    nerdy.addEventListener('click', () => {
        
        fetch(nerdyUrl).then((response) => {
            return response.json();
        }).then((data) => {
            // Do your DOM manipulation here
            
            h4.innerText = data.value.joke;
        }); 
    });

    const rando = document.getElementById('randomButton');
    rando.addEventListener('click', () => {
        fetch(randomURL)
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            h4.innerText = data.value.joke;
        })
        .catch((error) => {
            console.error(error);
        })
    });


});