/*
1. **iqTest** Bob is preparing to pass an IQ test. The most frequent task in this test 
    is to find out which one of the given numbers differs from the others. Bob observed
    that one number usually differs from the others in evenness. Help Bob — to check his 
    answers, he needs a program that among the given numbers finds one that is different in 
    evenness, and return the position of this number. _Keep in mind that your task is to help 
    Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0)_

		iqTest("2 4 7 8 10") → 3 //third number is odd, while the rest are even
		iqTest("1 2 1 1") → 2 // second number is even, while the rest are odd
		iqTest("") → 0 // there are no numbers in the given set
        iqTest("2 2 4 6") → 0 // all numbers are even, therefore there is no position of an odd number
*/

function iqTest(string) {
    const evenArray = [];
    const oddArray = [];
    const initArray = string.split(" ");

    if (string == "") {
        return 0;
    }

    for (let i = 0; i < initArray.length; i++) {
        if (initArray[i] % 2 == 0) {
            evenArray.push(initArray[i]);
        } else {
            oddArray.push(initArray[i]);
        }
    }

    if (evenArray.length == 0 || oddArray.length == 0) {
        return 0;
    }
    
    if (oddArray.length == 1) {
        for (let j = 0; j < initArray.length; j++) {
            if (initArray[j] % 2 != 0) {
                return j + 1;
            }
        }
    }

    if (evenArray.length == 1) {
        for (let k = 0; k < initArray.length; k++) {
            if (initArray[k] % 2 == 0) {
                return k + 1;
            }
        }
    }
}

/*
2. **titleCase** Write a function that will convert a string into title case, given an optional 
    list of exceptions (minor words). The list of minor words will be given as a string with each 
    word separated by a space. Your function should ignore the case of the minor words string -- 
    it should behave in the same way even if the case of the minor word string is changed.


* First argument (required): the original string to be converted.
* Second argument (optional): space-delimited list of minor words that must always be lowercase
except for the first word in the string. The JavaScript tests will pass undefined when this 
argument is unused.

		titleCase('a clash of KINGS', 'a an the of') // should return: 'A Clash of Kings'
		titleCase('THE WIND IN THE WILLOWS', 'The In') // should return: 'The Wind in the Willows'
        titleCase('the quick brown fox') // should return: 'The Quick Brown Fox'
*/

function titleCase(title, minorWords) {
    // prep title
    titleLowerCase = title.toLowerCase();
    titleArray = titleLowerCase.split(" ");
    console.log(titleArray);

    // prep minorWords
    if (minorWords != undefined) {
        minorWordsLowerCase = minorWords.toLowerCase();
        minorWordsArray = minorWordsLowerCase.split(" ");
        console.log(minorWordsArray);
    }
    
    // prep output string
    let output = "";

    // assemble output string
    for (let i = 0; i < titleArray.length; i++) {
        word = titleArray[i];
        if (i == 0) {
            insertion = word.charAt(0).toUpperCase() + word.substring(1);
            output += insertion;
            console.log(output);
        } else if (minorWordsArray.includes(word)) {
            insertion = word;
            output += " " + insertion;
            console.log(output);
        } else {
            insertion = word.charAt(0).toUpperCase() + word.substring(1);
            output += " " + insertion;
            console.log(output);
        }
    }
    return output;
}