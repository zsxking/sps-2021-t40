// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}
<<<<<<< HEAD

async function showRandomPhrase(){
    const responseFromServer = await fetch('/phrases');
    const phrases = await responseFromServer.json();

    const randomPhrase = phrases[Math.floor(Math.random() * phrases.length)];           
    const phraseListElement = document.getElementById('random-phrase-container');
    phraseListElement.innerHTML = randomPhrase;

    phraseListElement.appendChild(
        createListElement('Random phrase in English is: ' + randomPhrase));
}

function createListElement(text){
    const liElement = document.createElement('li');
    liElement.innerText = text;
    return liElement
}
=======
function requestTranslation() {
        const phrase = document.getElementById('text').value;
        const lang = document.getElementById('lang').value;

        const resultContainer = document.getElementById('result');
        resultContainer.innerText = 'Loading...';

        const params = new URLSearchParams();
        params.append('text', phrase);
        params.append('languageCode', lang);

        fetch('/translate', {
          method: 'POST',
          body: params
        }).then(response => response.text())
        .then((translatedMessage) => {
          resultContainer.innerText = translatedMessage;
        });
      }
>>>>>>> b3ab97521ba5ba25cf3405d53a0769d53e0ce3f5
