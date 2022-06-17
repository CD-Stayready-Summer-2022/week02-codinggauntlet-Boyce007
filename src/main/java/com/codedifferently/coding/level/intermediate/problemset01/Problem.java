package com.codedifferently.coding.level.intermediate.problemset01;

public class Problem {

    /* Problem 01
       We need you to make ___ amount of copies of a given string.
       A string will be given and a non-negative number.
       We need you to make the given number of copies of the original string.

       Return a larger string that has n copies of the given string.

       Example:
       stringCopies("Hi", 2) --> "HiHi"
       stringCopies("Hi", 3) --> "HiHiHi"
       stringCopies("Hi", 1) --> "Hi"
     */

    public static String stringCopies(String word, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += word;
        }

        return ans;
    }


     /* Problem 02
    Does the given string contain a first instance of "x" immediately followed by another "x"?
    Evaulate the given string and return true if the first seen "x" is followed right by another "x".

    Example:
    followedX("axxbb") --> true
    followedX("axaxax") --> false
    followedX("xxxxx") --> true
     */

    public static Boolean followedX(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            char current = str.charAt(i);
            if (current == 'x') {
                char next = str.charAt(i + 1);
                if (next == current) {
                    return true;
                }
            }

        }
        return false;
    }


    /* Problem 03
    Provided a given string, take note of how many times you see a substring length 2 occur.

    Return the count of the number of times that a substring length 2 appears in the given string.
    Also, the last 2 characters of the string, such as "hixxxhi" would yield 1; don't count the end substring.

    Example:
    subTwo("hixxhi") --> 1
    subTwo("xaxxaxaxx") --> 1
    sub2("axxxaaxx") --> 2
     */

    public static Integer subTwo(String str) {
        Integer counter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            char current = str.charAt(i);
            if (current == str.charAt(i + 1)) {
                counter++;
            }
        }
        return counter;
    }


    /* Problem 04
    The new elementary school teacher wants to make a fun interactive way of learning the basic numbers.
    She wants to start with learning 1,2,3, but she is providing sets of numbers for the kids to find 1, 2, 3 out of.
    The sets of numbers will be given in a array for you to decided if they contain the sequence 1,2,3 anywhere within the
    array.

    Return true if the sequence of numbers 1, 2, 3 appears in the array anywhere.

    Example:
    basicNumbers123([1, 1, 2, 3, 1]) --> true
    basicNumbers123([1, 1, 2, 4, 1]) --> false
    basicNumbers123([1, 1, 2, 1, 2, 3]) --> true
     */

    public static Boolean basicNumbers123(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                if (nums[i + 1] == 2) {
                    if (nums[i + 2] == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    /* Problem 05
    Lets play a game of scramble the letters of any given word.
    A string will be given to you, and we need you to create a new string where we will only ask for specific letters
    out of the string.

    Return a new string made of characters at indexes 0, 1, 4, 5, 8, 9.

    So "kittens" will yield "kien".

    scrambleOfLetters("kitten") --> "kien"
    scrambleOfLetters("Chocolate") --> "Chole"
    scrambleOfLetters("CodingHorror") --> "Congrr"
     */

    public static String scrambleOfLetters(String scramble) {
        StringBuilder builder = new StringBuilder();
        builder.append(scramble.charAt(0));
        builder.append(scramble.charAt(1));
        builder.append(scramble.charAt(4));
        builder.append(scramble.charAt(5));
        if (scramble.length() >= 9) {
            builder.append(scramble.charAt(8));
        }
        if (scramble.length() >= 10) {
            builder.append(scramble.charAt(9));

        }
        return builder.toString();
    }


    /* Problem 06
    For this special case, were going to say that during a game of basketball a "triple" is when someone scores the same
    point value 3 times in a row. Such as, scoring 2 points three times in a row.
    We are keeping track of players point values in an array, but we don't want you to accept any player who has "triples".

    Evaluate the given array and return true if the array does not contain any triples.

    dontAcceptTriples([1, 1, 2, 2, 1]) --> true
    dontAcceptTriples([1, 1, 2, 2, 2, 1]) --> false
    dontAcceptTriples([1, 1, 1, 2, 2, 2, 1]) --> false
     */

    public static Boolean dontAcceptTriples(int[] score) {
        for (int i = 0; i < score.length - 2; i++) {
            Integer current = score[i];
            Integer next = score[i + 1];
            Integer third = score[i + 2];
            if (current == next) {
                if (next == third) {
                    return false;
                }
            }
        }
        return true;
    }
}
