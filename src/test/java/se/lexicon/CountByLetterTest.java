package se.lexicon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CountByLetterTest {
    @Test
    @DisplayName("Valid letter (Happy Path)")
    void testValidLetter(){
        //Arrange
        String input = "A";
        boolean expected = true;

        //Act
        boolean actual = CountByLetter.isValidLetter(input);

        //Assert (verify)
        assertEquals(expected,actual);
    }



    @Test
    @DisplayName("Number is not a valid letter")
    void testInvalidNumber(){
        //Arrange
        String input = "5";
        boolean expected = false;

        //Act
        boolean actual = CountByLetter.isValidLetter(input);

        //Assert (verify)
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Multiple letters are invalid")
    void testMultipleLetters(){
        //Arrange
        String input = "ABC";
        boolean expected = false;

        //Act
        boolean actual = CountByLetter.isValidLetter(input);

        //Assert (verify)
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Empty input is invalid (Edge Case)")
    void testEmptyInput(){
        //Arrange
        String input = "";
        boolean expected = false;

        //Act
        boolean actual = CountByLetter.isValidLetter(input);

        //Assert (verify)
        assertEquals(expected,actual);
    }
}
