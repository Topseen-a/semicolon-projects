package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;

    @BeforeEach
    public void setUp() {
        diary = new Diary("Topseen", "ab1234");
    }

    @Test
    public void testThatDiaryShouldBeLockedByDefault() {
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatUnlockDiaryWithCorrectPasswordUnlocks() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("ab1234");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeLockedAfterUnlocking() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("ab1234");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatUserNameShouldNotChangeAfterUnlockingOrLocking() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("ab1234");
        diary.lockDiary();

        assertEquals("Topseen", diary.getUserName());
    }

    @Test
    public void testThatUnlockDiaryWithWrongPasswordThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> diary.unlockDiary("ac1234"));
    }

    @Test
    public void testThatEntryIsCreatedSuccessfully() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("ab1234");
        diary.createEntry("Title", "Body");

        Entry entry = diary.findEntryById(1);
        assertNotNull(entry);
        assertEquals("Title", entry.getTitle());
        assertEquals("Body", entry.getBody());
    }

    @Test
    public void testThatEntryCannotBeCreatedWhenLocked() {
        assertTrue(diary.isLocked());
        assertThrows(IllegalArgumentException.class, () -> diary.createEntry("Title", "Body"));
    }

    @Test
    public void testThatEntryIsUpdatedSuccessfully() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("ab1234");
        diary.createEntry("Old Title", "Old Body");

        diary.updateEntry(1, "New Title", "New Body");

        Entry entry = diary.findEntryById(1);
        assertEquals("New Title", entry.getTitle());
        assertEquals("New Body", entry.getBody());
    }

    @Test
    public void testThatEntryIsDeletedSuccessfully() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("ab1234");
        diary.createEntry("Title", "Body");

        diary.deleteEntry(1);

        Entry entry = diary.findEntryById(1);
        assertNull(entry);
    }

    @Test
    public void testThatEntryDateCreatedShouldBeSetWhenEntryIsCreated() {
        assertTrue(diary.isLocked());
        diary.unlockDiary("ab1234");

        LocalDateTime beforeCreation = LocalDateTime.now();
        diary.createEntry("Title", "Body");

        LocalDateTime afterCreation = LocalDateTime.now();
        Entry entry = diary.findEntryById(1);

        assertNotNull(entry.getDateCreated());

        assertTrue(entry.getDateCreated().isAfter(beforeCreation));
        assertTrue(entry.getDateCreated().isBefore(afterCreation));
    }
}
