public class ClassB {

    private int lineCount = 0;
    private int characterCount = 0;

    public void addLine(String line) {
        lineCount++;
        characterCount += line.length();
    }

    public boolean isStop(String line) {
        return line.equalsIgnoreCase("stop");
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}