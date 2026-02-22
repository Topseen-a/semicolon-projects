package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password) {
        validateUsername(userName);
        this.userName = userName;
        validatePassword(password);
        this.password = password;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        } else {
            throw new IllegalArgumentException("Incorrect Password");
        }
    }

    public void lockDiary() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        checkDiaryStatus();
        int id = entries.size() + 1;
        Entry entry = new Entry(id, title, body);
        entries.add(entry);
    }

    public void deleteEntry(int id) {
        checkDiaryStatus();
        Entry entry = findEntryById(id);
        if (entry != null) {
            entries.remove(entry);
        }
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry;
        }
        return null;
    }

    public void updateEntry(int id, String title, String body) {
        checkDiaryStatus();
        Entry entry = findEntryById(id);
        if (entry != null) {
            entry.setTitle(title);
            entry.setBody(body);
        }
    }

    public String getUserName() {
        return userName;
    }

    private void validateUsername(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
    }

    private void validatePassword(String password) {
        if (password == null || password.trim().isEmpty() || password.length() < 6) {
            throw new IllegalArgumentException("Password cannot be null or empty and must be at least 6 characters");
        }
    }

    private void checkDiaryStatus() {
        if (isLocked) throw new IllegalArgumentException("Diary is locked");
    }
}
