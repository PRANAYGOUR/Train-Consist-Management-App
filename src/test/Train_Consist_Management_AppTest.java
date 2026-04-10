import java.util.regex.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

@Test
void testRegex_ValidTrainID() {
    assertTrue("TRN-1234".matches("TRN-\\d{4}"));
}

@Test
void testRegex_InvalidTrainIDFormat() {
    assertFalse("TRAIN12".matches("TRN-\\d{4}"));
    assertFalse("TRN12A".matches("TRN-\\d{4}"));
    assertFalse("1234-TRN".matches("TRN-\\d{4}"));
}

@Test
void testRegex_ValidCargoCode() {
    assertTrue("PET-AB".matches("PET-[A-Z]{2}"));
}

@Test
void testRegex_InvalidCargoCodeFormat() {
    assertFalse("PET-ab".matches("PET-[A-Z]{2}"));
    assertFalse("PET123".matches("PET-[A-Z]{2}"));
    assertFalse("AB-PET".matches("PET-[A-Z]{2}"));
}

@Test
void testRegex_TrainIDDigitLengthValidation() {
    assertFalse("TRN-123".matches("TRN-\\d{4}"));
    assertFalse("TRN-12345".matches("TRN-\\d{4}"));
}

@Test
void testRegex_CargoCodeUppercaseValidation() {
    assertFalse("PET-Ab".matches("PET-[A-Z]{2}"));
}

@Test
void testRegex_EmptyInputHandling() {
    assertFalse("".matches("TRN-\\d{4}"));
    assertFalse("".matches("PET-[A-Z]{2}"));
}

@Test
void testRegex_ExactPatternMatch() {
    assertFalse("TRN-1234XYZ".matches("TRN-\\d{4}"));
}