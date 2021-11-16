/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whomever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */

  function multiplyTogether(firstParameter, secondParameter) {
    return firstParameter * secondParameter;
  }


/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */

function multiplyNoUndefined(firstParameter = 0, secondParameter = 0) {
  return firstParameter * secondParameter;
}

 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}

function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  const description = `${name} is currently ${age} years old. Their quirks are: `; // String interpolation
  return description + listOfQuirks.join(separator);
}


// variable arguments
//  1. special variable arguments
//  2. spread syntax "..."
function showArgs() {
  const argsArray = Array.from(arguments);
  console.log("Array: ");
  console.log(argsArray);
  console.log("Arguments object: ");
  console.log(arguments);
}

// named function  -->  has a name
function showArgs2(...arrrgs) {
  console.log(arrrgs);
}

// spread syntax works in java too
/* public class Git {
  public static void main(String... args) {

  }
}
*/

// Anonymous functions  -->  has no name
// fat arrow  (java has this too)
// (param1) => { console.log(param1); }

function forEachExample() {
  const instructors = ["Tom", "Tom", "Walt"];
  const loudInstructors = instructors.map(capitalize);
  console.log(instructors);
  console.log(loudInstructors);
}

function capitalize(name) {
  return name.toUpperCase();
}


/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  // [1, 2, 3]
  //  ^                            0              1
  //     ^                         1              2
  //        ^                      3              3
  //                  6
  let counter = 1;
  return numbersToSum.reduce((accumulator, currentElement) => { // accumulator also known as reducer
    console.log(`Accumulator: ${accumulator} \ncurrentElement: ${currentElement}`);
    
    return accumulator + currentElement; // finally returns 6
  });
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter(n => n % 3 === 0);
}

/*
function isMultOfThree(num) {
  if (num % 3 === 0) {
    return true;
  } else {
    return false;
  }
}
*/
