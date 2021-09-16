package com.techelevator;

public class Exercises {

	/*
	 1. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on
	 vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 sleepIn(false, false) → true
	 sleepIn(true, false) → false
	 sleepIn(false, true) → true
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	/*
	 2. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
	 are in trouble.
	 monkeyTrouble(true, true) → true
	 monkeyTrouble(false, false) → true
	 monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;
	}

	/*
	 3. Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	 sumDouble(1, 2) → 3
	 sumDouble(3, 2) → 5
	 sumDouble(2, 2) → 8
	 */
	public int sumDouble(int a, int b) {
		// could create int sumAB and insert it for all instances of a + b
//		if (a == b) {
//			return (a + b) * 2;
//		}
//		return a + b; 46 characters
		int sumAB = a + b;
		if (a == b) {
			return sumAB * 2;
		}
		return sumAB; // 62 characters
		// Sort of dumb to literally type more code in an effort to save time or be concise or whatever...
		// But it could be useful if what's stored in the "time saving" variable is complex or used a lot.
		// This is similar to exercise 11 hasTeen. How much thought and code is it worth to save myself work later?
	}

	/*
	 4. Given an int n, return the absolute difference between n and 21, except return double the absolute
	 difference if n is over 21.
	 diff21(19) → 2
	 diff21(10) → 11
	 diff21(21) → 0
	 diff21(22) → 2
	 diff21(-10) → 31
	 */
	public int diff21(int n) {
		if (n > 21) {
			return -(21 - n) * 2; 	// Lots of ways to distribute this negative
									// -1 * (21 - n) * 2;
									// (21 - n) * -2;
									// (-21 + n) * 2;
									// Any number of parenthetical arrangements
									// Do parentheses in Java behave the same way as they do in math?
									// Whether or no, IntelliJ doesn't seem to care if I use too many
									// parentheses, so long as they're closed. But too many looks cluttered.
									// What's the goal here? What's more readable? What makes the most sense?
		}
		return 21 - n;
	}

	/*
	 5. We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
	 We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if
	 we are in trouble.
	 parrotTrouble(true, 6) → true
	 parrotTrouble(true, 7) → false
	 parrotTrouble(false, 6) → false
	 */
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && ((hour < 7) || (hour > 20));
	}

	/*
	 6. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
	 makes10(9, 10) → true
	 makes10(9, 9) → false
	 makes10(1, 9) → true
	 */
	public boolean makes10(int a, int b) {
		return (a == 10 || b == 10) || (a + b == 10);
	}

	/*
	 7. Given 2 int values, return true if one is negative and one is positive. Except if the parameter
	 "negative" is true, then return true only if both are negative.
	 posNeg(1, -1, false) → true
	 posNeg(-1, 1, false) → true
	 posNeg(-4, -5, true) → true
	 */
	public boolean posNeg(int a, int b, boolean negative) {
		//		else if (((a < 0) && (b < 0)) && negative) {
		//			return true;
		//		}
		return (((a < 0) ^ (b < 0)) && !negative) || (((a < 0) && (b < 0)) && negative);
	}
	// What is better? OR comparators (||) in the if condition or a sequence of if elses?

	/*
	 8. Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 (Hint: Think "mod".)
	 or35(3) → true
	 or35(10) → true
	 or35(8) → false
	 */
	public boolean or35(int n) {
		return n % 3 == 0 || n % 5 == 0;
	}

	/*
	 9. Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	 icyHot(120, -1) → true
	 icyHot(-1, 120) → true
	 icyHot(2, 120) → false
	 */
	public boolean icyHot(int temp1, int temp2) {
		return (temp1 < 0 && temp2 > 100) ^ (temp1 > 100 && temp2 < 0);
	}

	/*
	 10. Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 in1020(12, 99) → true
	 in1020(21, 12) → true
	 in1020(8, 99) → false
	 */
	public boolean in1020(int a, int b) {
		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
	}
	// Is there some way to determine a range in Java besides comparing the variable
	// singly to each the lower bound and the upper bound, and requiring both to be true?

	/*
	 11. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
	 return true if 1 or more of them are teen.
	 hasTeen(13, 20, 10) → true
	 hasTeen(20, 19, 10) → true
	 hasTeen(20, 10, 13) → true
	 */
	public boolean hasTeen(int a, int b, int c) {
		// This right here is what I mean in the comment below exercise 10.
		// If I can determine a range and store it in a variable (by some method),
		// then I can input a, b, and c into that function in the condition of the if statement below.
		return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
		// Duplication of effort. How do I create a variable x to store the value of teen (range?),
		// then just compare a, b, and c each to x in the if statement.
		//
		// public boolean hasTeen(int a, int b, int c) {
		// 		some datatype x = some code to store range of teen in x
		// 		if (a == x || b == x || c == x) {
		//			return true;
		// 		}
		//		return false;
		// }
	}

	/*
	 12. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
	 return true if one or the other is teen, but not both.
	 loneTeen(13, 99) → true
	 loneTeen(21, 19) → true
	 loneTeen(13, 13) → false
	 */
	public boolean loneTeen(int a, int b) {
		return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
	}

	/*
	 13. Given three int values, a b c, return the largest.
	 intMax(1, 2, 3) → 3
	 intMax(1, 3, 2) → 3
	 intMax(3, 2, 1) → 3
	 */
	public int intMax(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	/*
	 14. Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both
	 in the range 40..50 inclusive.
	 in3050(30, 31) → true
	 in3050(30, 41) → false
	 in3050(40, 50) → true
	 */
	public boolean in3050(int a, int b) {
		return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
	}
	// the if condition looks like a mess. Better to use if else?

	/*
	 15. Given 2 int values, return the larger value that is in the range 10..20 inclusive,
	 or return 0 if neither is in that range.
	 max1020(11, 19) → 19
	 max1020(19, 11) → 19
	 max1020(11, 9) → 11
	 */
	public int max1020(int a, int b) {
		if (a > b && (a >= 10 && a <= 20)) {
			return a;
		} else if (b > a && (b >= 10 && b <= 20)){
			return b;
		} else if (a < b && (a >= 10 && a <= 20)) { // I could include this condition in the first if condition
			return a;								// by use of ||
		} else if (b < a && (b >= 10 && b <= 20)) { // Likewise I could combine this with the first if else
			return b;								// using ||
		} else {									// Since || and if else are equivalent,
			return 0;								// I can remove 2 of the 3 if else statements
		}											// If the range of acceptable return values is limited
	}												// the number of if, if else, and else statements
													// should equal the number of unique return values.
													// Or am I missing something?

	/*
	 16. When squirrels get together for a party, they like to have cigars. A squirrel party is successful
	 when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
	 there is no upper bound on the number of cigars. Return true if the party with the given values is
	 successful, or false otherwise.
	 cigarParty(30, false) → false
	 cigarParty(50, false) → true
	 cigarParty(70, true) → true
	 */
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40 && cigars <= 60) {
			return true;
		} else if (isWeekend && cigars >= 40) { // same return value as the if statement
			return true;						// combine them?
		} else {
			return false;
		}
	}

	/*
	 17. You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
	 of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
	 returned will be 0 if you did not get the table, 1 if you might get the table, and 2 if you did get
	 the table. If you or your date is very stylish (8 or more), then the result is 2 (yes). With the
	 exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the
	 result is 1 (maybe).
	 dateFashion(5, 10) → 2
	 dateFashion(5, 2) → 0
	 dateFashion(5, 5) → 1
	 */
	public int dateFashion(int you, int date) {
		if ((you >= 8 || date >= 8) && (you > 2 && date > 2)) {
			return 2;
		} else if (you > 2 && date > 2) {
			return 1;
		} else {
			return 0;
		}
	}

	/*
	 18. The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature
	 is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given
	 an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 squirrelPlay(70, false) → true
	 squirrelPlay(95, false) → false
	 squirrelPlay(95, true) → true
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (temp >= 60 && temp <= 90) {
			return true;
		} else if (isSummer && temp >= 60 && temp <= 100) {
			return true;
		} else {
			return false;
		}
	}

    /*
     19. Dessert Island Diner believes a meal isn't a meal without dessert. All meals come with
     a free dessert.

     There are three categories of free desserts: "standard", "special", and "ginormous".
     The meal amount determines the dessert category: <= $10 (standard), <= $15 (special),
     > $15 (ginormous). Unless it is your birthday -- on that day, an additional $5 is added
     when calculating the category to potentially bump you up to the next delicious category.

     For instance, if the amount of the meal was $7, and it is your birthday, $5 is added to
     $7 when determining the dessert category, which means you would qualify for a "special".

     yourCakeAndEatItToo(4.99, false) → "standard"
     yourCakeAndEatItToo(4.99, true) → "standard"
     yourCakeAndEatItToo(7.00, false) → "standard"
     yourCakeAndEatItToo(7.00, true) → "special"
     yourCakeAndEatItToo(10.00, false) → "standard"
     yourCakeAndEatItToo(10.00, true) → "special"
     yourCakeAndEatItToo(11.00, false) → "special"
     */
    public String yourCakeAndEatItToo(double mealAmount, boolean isBirthday) {
    	if (isBirthday && mealAmount <= 5) {
			return "standard";
		} else if (isBirthday && mealAmount <= 10) {
    		return "special";
		} else if (isBirthday && mealAmount > 10) {
    		return "ginormous";
		} else if (mealAmount <= 10) { 	// if i combined these with the statements with equivalent
    		return "standard";			// return values, would I have to add "!isBirthday &&" to
		} else if (mealAmount <= 15) {	// the existing condition?
    		return "special";
		} else {
    		return "ginormous";
		}
    }

	/*
	 20. Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
	 so in that case just return 20.
	 sortaSum(3, 4) → 7
	 sortaSum(9, 4) → 20
	 sortaSum(10, 11) → 21
	 */
	public int sortaSum(int a, int b) {
		if (((a + b) < 10) || ((a + b) > 19)) {
			return a + b;
		} else {
			return 20;
		}
	}

	/*
	 21. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
	 on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays,
	 the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then
	 on weekdays it should be "10:00" and weekends it should be "off".
	 alarmClock(1, false) → "7:00"
	 alarmClock(5, false) → "7:00"
	 alarmClock(0, false) → "10:00"
	 */
	public String alarmClock(int day, boolean vacation) {
		if (((day != 0 && day != 6) && vacation) || ((day == 0 || day == 6) && !vacation)) {
			return "10:00";
		} else if (day != 0 && day != 6) {
			return "7:00";
		} else {
			return "off";
		}
	}

	/*
	 22. Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true,
	 in which case return true if the number is less or equal to 1, or greater or equal to 10.
	 in1To10(5, false) → true
	 in1To10(11, false) → false
	 in1To10(11, true) → true
	 */
	public boolean in1To10(int n, boolean outsideMode) {
		if ((n >= 1 && n <= 10) && !outsideMode) {
			return true;
		} else if (outsideMode && (n <= 1 || n >=10)) {
			return true;
		} else return false;
	}

	/*
	 23. We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
	 Return true if the given non-negative number is special.
	 (Hint: Think "mod".)
	 specialEleven(22) → true
	 specialEleven(23) → true
	 specialEleven(24) → false
	 */
	public boolean specialEleven(int n) {
		return (n % 11 == 0) || (n % 11 == 1);
	}

	/*
	 24. Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
	 (Hint: Think "mod".)
	 more20(20) → false
	 more20(21) → true
	 more20(22) → true
	 */
	public boolean more20(int n) {
		return (n % 20 == 1) || (n % 20 == 2);
	}

	/*
	 25. Return true if the given non-negative number is a multiple of 3 or 5, but not both.
	 (Hint: Think "mod".)
	 old35(3) → true
	 old35(10) → true
	 old35(15) → false
	 */
	public boolean old35(int n) {
		return (n % 3 == 0) ^ (n % 5 == 0);
	}

	/*
	 26. Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
	 and 39 return true, but 40 returns false.
	 (Hint: Think "mod".)
	 less20(18) → true
	 less20(19) → true
	 less20(20) → false
	 */
	public boolean less20(int n) {
		return (n % 20 == 18) || (n % 20 == 19);
	}

	/*
	 27. Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
	 is the remainder of dividing a by b, so (7 % 5) is 2.
	 nearTen(12) → true
	 nearTen(17) → false
	 nearTen(19) → true
	 */
	public boolean nearTen(int num) {
		return (num % 10 == 0) || (num % 10 == 1) || (num % 10 == 2) || (num % 10 == 8) || (num % 10 == 9);
	}

	/*
	 28. Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are
	 extra lucky. So if either value is a teen, just return 19.
	 teenSum(3, 4) → 7
	 teenSum(10, 13) → 19
	 teenSum(13, 2) → 19
	 */
	public int teenSum(int a, int b) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return 19;
		} else return a + b;
	}

	/*
	 29. Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning
	 you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
	 answerCell(false, false, false) → true
	 answerCell(false, false, true) → false
	 answerCell(true, false, false) → false
	 */
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		// This is what the IDE suggested after the second version
		// Pay attention when your if/if else/else statements share a lot of conditions.
		// It's a clue that they can be condensed. Something to do with the distributive property?
		return !isAsleep && (isMom || !isMorning);

		// second version...
//		if (!isAsleep && (isMom || !isMorning)) {
//			return true;
//		}
//		return false;

		// first version...
//		if (isMorning && isMom && !isAsleep) {
//			return true;
//		} else if (!isMorning && !isAsleep) {
//			return true;
//		} else return false;
	}

	/*
	 30. We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as
	 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if
	 either tea or candy is at least double the amount of the other one, the party is great (2). However,
	 in all cases, if either tea or candy is less than 5, the party is always bad (0).
	 teaParty(6, 8) → 1
	 teaParty(3, 8) → 0
	 teaParty(20, 6) → 2
	 */
	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5) {
			return 0;
		} else if ((tea >= candy * 2) || (candy >= tea * 2)) {
			return 2;
		} else return 1;
	}

	/*
	 31. Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
	 twoAsOne(1, 2, 3) → true
	 twoAsOne(3, 1, 2) → true
	 twoAsOne(3, 2, 2) → false
	 */
	public boolean twoAsOne(int a, int b, int c) {
		// Again, the IDE suggests shortening this just a return statement...
		return (a + b == c) || (a + c == b) || (b + c == a);
		// I don't quite understand why this is equivalent to the code commented out immediately below.
		// Ooooooh because they evaluate as booleans. If any of them evaluate to true, that's what is
		// being returned from the method. No need to specify an else condition at all. Because it's implied?

//		if ((a + b == c) || (a + c == b) || (b + c == a)) {
//			return true;
//		} else return false;
	}

	/*
	 32. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with
	 the exception that if "bOk" is true, b does not need to be greater than a.
	 inOrder(1, 2, 4, false) → true
	 inOrder(1, 2, 1, false) → false
	 inOrder(1, 1, 2, true) → true
	 */
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if ((b > a) && (c > b) && !bOk) {
			return true;
		} else if (bOk && (c > b)) {
			return true;
		} else return false;
	}
	// Is there ever a reason to compare x || !x?
	// if x is true, !x is by definition false. And vice versa.
	// || is saying "I need one or the other or both."
	// If !x is true, x will never be true.
	// If x is true, !x will never be true.
	// So comparing a variable and its negative with || will only ever give you one of them.
	// I'm not articulating this well. Gotta think more about it.

	/*
	 33. Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11,
	 or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality
	 is allowed, such as 5 5 7 or 5 5 5.
	 inOrderEqual(2, 5, 11, false) → true
	 inOrderEqual(5, 7, 6, false) → false
	 inOrderEqual(5, 5, 7, true) → true
	 */
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (!equalOk && a < b && b < c) {
			return true;

			// Check this out. IntelliJ recommended condensing the if else commented out below
			// with this....
		} else return a <= b && b <= c;
			// Not sure I get why this works...

//			else if (a <= b && b <= c) {
//			return true;
//		} else return false;
	}

	/*
	 34. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another
	 of the values, it does not count towards the sum.
	 loneSum(1, 2, 3) → 6
	 loneSum(3, 2, 3) → 2
	 loneSum(3, 3, 3) → 0
	 */
	public int loneSum(int a, int b, int c) {
		if (a == b && a != c) {
			return c;
		} else if (a == c && b != c) {
			return b;
		} else if (b == c && a != c) {
			return a;
		} if (a == b && a == c) {
			return 0;
		} else return a + b + c;
	}

	/*
	 35. Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not
	 count towards the sum and values to its immediate right do not count. So for example, if b is 13, then both
	 b and c do not count.
	 luckySum(1, 2, 3) → 6
	 luckySum(1, 2, 13) → 3
	 luckySum(1, 13, 3) → 1
	 luckySum(13, 1, 3) → 3
	 luckySum(13, 13, 3) → 0
	 */
	public int luckySum(int a, int b, int c) {
		if (a == 13 && b == 13) {
			return 0;
		} else if (a == 13) {
			return c;
		} else if (b == 13) {
			return a;
		} else if (c == 13) {
			return a + b;
		} else return a + b + c;
	}

}
