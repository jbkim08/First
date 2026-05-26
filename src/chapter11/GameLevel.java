package chapter11;

public enum GameLevel {
    BEGINNER_LEVEL(1, "초보"),
    ADVANCED_LEVEL(2, "숙련자"),
    SUPER_LEVEL(3, "고수");

    private int level;
    private String hint;

    GameLevel(int level, String hint) {
        this.level = level;
        this.hint = hint;
    }

    public int getLevel() {
        return level;
    }

    public String getHint() {
        return hint;
    }

    static void main() {
        GameLevel[] gameLevels = GameLevel.values(); //배열상수
        for(GameLevel level : gameLevels){
            System.out.println(level);
        }
        System.out.println(GameLevel.BEGINNER_LEVEL.toString());
        System.out.println(GameLevel.BEGINNER_LEVEL.getLevel());
        System.out.println(GameLevel.BEGINNER_LEVEL.getHint());
        System.out.println(GameLevel.ADVANCED_LEVEL.toString());
        System.out.println(GameLevel.ADVANCED_LEVEL.getLevel());
        System.out.println(GameLevel.ADVANCED_LEVEL.getHint());
        System.out.println(GameLevel.SUPER_LEVEL.toString());

    }
}
