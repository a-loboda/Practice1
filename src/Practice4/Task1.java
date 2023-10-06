package Practice4;
public class Task1 {
    public enum Season {
        AUTUMN(15),
        WINTER(-10),
        SPRING(10),
        SUMMER(25){
            @Override
            public void getDescription() {
                System.out.println("Hot season");
            }
        },;
        private final int averageTemp;
        private Season(int averageTemp) {
            this.averageTemp = averageTemp;
        }
        public void getDescription() {
            System.out.println("Cold season");
        }
    }

    public static void printBestSeason(Season season) {
        switch (season) {
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case WINTER:
                System.out.println("I love winter!");
                break;
        }
    }
    public static void main(String[] args) {
        Season bestSeason = Season.SUMMER;
        System.out.println("Best season info: " + bestSeason + ", averageTemp: " + bestSeason.averageTemp);
        printBestSeason(bestSeason);
        for (Season season : Season.values()) {
            System.out.println("Season: " + season);
            System.out.println("Average temp: " + season.averageTemp);
            System.out.print("Season description: ");
            season.getDescription();
        }
    }
}
