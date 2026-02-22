package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private List<Diary> diaries = new ArrayList<>();

    public List<Diary> getDiaries() {
        return diaries;
    }

    public void add(String userName, String password) {
        findExistingUserName(userName);
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }

    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(userName)) {
                return diary;
            }
        }
        return null;
    }

    public void delete(String userName, String password) {
        Diary diary = findByUserName(userName);

        validateDiary(diary);
        diary.unlockDiary(password);
        diaries.remove(diary);
    }

    private void findExistingUserName(String userName) {
        if (findByUserName(userName) != null) {
            throw new IllegalArgumentException("Diary with username already exists");
        }
    }

    private void validateDiary(Diary diary) {
        if (diary == null) {
            throw new IllegalArgumentException("Diary not found");
        }
    }
}
