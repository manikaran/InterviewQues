public enum Level {
    LOW, MEDIUM, HIGH
}

class EnumProject {
    public static void main(String[] args) {
        Level lv = Level.LOW;

        if(lv == Level.LOW) {
            System.out.println("This is the low value");
        }
    }
}