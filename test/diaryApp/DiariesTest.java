package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    private Diaries diaries;

    @BeforeEach
    public void setUp() {
        diaries = new Diaries();
    }

    @Test
    public void testThatDiariesListShouldBeEmptyInitially() {
        assertTrue(diaries.getDiaries().isEmpty());
    }

    @Test
    public void testThatDiaryIsAddedSuccessfully() {
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("Topseen", "ab1234");

        Diary diary = diaries.findByUserName("Topseen");

        assertNotNull(diary);
        assertEquals("Topseen", diary.getUserName());
    }

    @Test
    public void testThatDiaryCannotBeAddedWithInvalidUsername() {
        assertTrue(diaries.getDiaries().isEmpty());
        assertThrows(IllegalArgumentException.class, () -> diaries.add("   ", "ab1234"));
    }

    @Test
    public void testThatDiaryCannotBeAddedWithInvalidPassword() {
        assertTrue(diaries.getDiaries().isEmpty());
        assertThrows(IllegalArgumentException.class, () -> diaries.add("Topseen", "123"));
    }

    @Test
    public void testThatListSizeIncreasesAfterAddingDiary() {
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("Topseen", "ab1234");
        assertEquals(1, diaries.getDiaries().size());
    }

    @Test
    public void testThatAddingDuplicateDiaryShouldThrowException() {
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("Topseen", "ab1234");

        assertThrows(IllegalArgumentException.class, () -> diaries.add("Topseen", "ab1234"));
    }

    @Test
    public void testThatFindByUserNameShouldReturnNullIfDiaryDoesNotExist() {
        assertTrue(diaries.getDiaries().isEmpty());
        assertNull(diaries.findByUserName("Topseen"));
    }

    @Test
    public void testThatDiaryIsDeletedSuccessfully() {
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("Topseen", "ab1234");

        diaries.delete("Topseen", "ab1234");
        assertNull(diaries.findByUserName("Topseen"));
    }

    @Test
    public void testThatDeletingDiaryWithWrongPasswordThrowsException() {
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("Topseen", "ab1234");

        assertThrows(IllegalArgumentException.class, () -> diaries.delete("Topseen", "1234"));
    }

    @Test
    public void testThatListSizeDecreasesAfterDeletingDiary() {
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("Topseen", "ab1234");

        diaries.delete("Topseen", "ab1234");
        assertEquals(0, diaries.getDiaries().size());
    }

    @Test
    public void testThatDeletingNonExistentDiaryThrowsException() {
        assertTrue(diaries.getDiaries().isEmpty());
        assertThrows(IllegalArgumentException.class, () -> diaries.delete("Topseen", "ab1234"));
    }

    @Test
    public void testThatMultipleDiariesAreHandledCorrectly() {
        assertTrue(diaries.getDiaries().isEmpty());
        diaries.add("Topseen", "ab1234");
        diaries.add("Abodunrin", "ab4321");

        diaries.delete("Topseen", "ab1234");

        assertNull(diaries.findByUserName("Topseen"));
        assertNotNull(diaries.findByUserName("Abodunrin"));
    }
}
