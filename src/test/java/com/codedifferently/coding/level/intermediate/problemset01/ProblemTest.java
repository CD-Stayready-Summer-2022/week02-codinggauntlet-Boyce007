package com.codedifferently.coding.level.intermediate.problemset01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    // Problem 01
    @Test
    public void stringCopiesTest01() {

        // Given
        String str = "Hi";
        int n = 2;

        // When
        String expected = "HiHi";
        String actual = Problem.stringCopies(str, n);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stringCopiesTest02() {

        // Given
        String str = "Hi";
        int n = 3;

        // When
        String expected = "HiHiHi";
        String actual = Problem.stringCopies(str, n);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stringCopiesTest03() {

        // Given
        String str = "Hi";
        int n = 1;

        // When
        String expected = "Hi";
        String actual = Problem.stringCopies(str, n);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 02
    @Test
    public void followedXTest01() {

        // Given
        String str = "axxbb";

        // When
        Boolean expected = true;
        Boolean actual = Problem.followedX(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void followedXTest02() {

        // Given
        String str = "axaxax";

        // When
        Boolean expected = false;
        Boolean actual = Problem.followedX(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void followedXTest03() {

        // Given
        String str = "xxxxx";

        // When
        Boolean expected = true;
        Boolean actual = Problem.followedX(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 03
    @Test
    public void subTwoTest01() {

        // Given
        String str = "hixxhi";

        // When
        Integer expected = 1;
        Integer actual = Problem.subTwo(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subTwoTest02() {

        // Given
        String str = "xaxxaxaxx";

        // When
        Integer expected = 1;
        Integer actual = Problem.subTwo(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subTwoTest03() {

        // Given
        String str = "axxxaaxx";

        // When
        Integer expected = 2;
        Integer actual = Problem.subTwo(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 04
    @Test
    public void basicNumbers123Test01() {

        // Given
        int[] nums = {1, 1, 2, 3, 1};

        // When
        Boolean expected = true;
        Boolean actual = Problem.basicNumbers123(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void basicNumbers123Test02() {

        // Given
        int[] nums = {1, 1, 2, 4, 1};

        // When
        Boolean expected = false;
        Boolean actual = Problem.basicNumbers123(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void basicNumbers123Test03() {

        // Given
        int[] nums = {1, 1, 2, 1, 2, 3};

        // When
        Boolean expected = true;
        Boolean actual = Problem.basicNumbers123(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 05
    @Test
    public void scrambleOfLettersTest01() {

        // Given
        String word = "kitten";

        // When
        String expected = "kien";
        String actual = Problem.scrambleOfLetters(word);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrambleOfLettersTest02() {

        // Given
        String word = "Chocolate";

        // When
        String expected = "Chole";
        String actual = Problem.scrambleOfLetters(word);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrambleOfLettersTest03() {

        // Given
        String word = "CodingHorror";

        // When
        String expected = "Congrr";
        String actual = Problem.scrambleOfLetters(word);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 06
    @Test
    public void dontAcceptTriplesTest01() {

        // Given
        int[] nums = {1, 1, 2, 2, 1};

        // When
        Boolean expected = true;
        Boolean actual = Problem.dontAcceptTriples(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dontAcceptTriplesTest02() {

        // Given
        int[] nums = {1, 1, 2, 2, 2, 1};

        // When
        Boolean expected = false;
        Boolean actual = Problem.dontAcceptTriples(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dontAcceptTriplesTest03() {

        // Given
        int[] nums = {1, 1, 1, 2, 2, 2, 1};

        // When
        Boolean expected = false;
        Boolean actual = Problem.dontAcceptTriples(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
