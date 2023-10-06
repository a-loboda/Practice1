package Practice4;

enum ClothingSize {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Сhild size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }

    public int getEuroSize() {
        return euroSize;
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    ClothingSize size;
    double price;
    String color;

    public Clothes(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Dressing a man in a T-shirt");
    }

    @Override
    public void dressWomen() {
        System.out.println("Dressing a woman in a T-shirt");
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Dressing a man in pants");
    }

    @Override
    public void dressWomen() {
        System.out.println("Dressing a woman in pants");
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Dressing a woman in a skirt");
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Dressing a man in a tie");
    }
}

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Women's dressing:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) item;
                womenClothing.dressWomen();
                System.out.printf("Size: %s, Price: %.2f, Colour: %s%n", item.size, item.price, item.color);
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Men's dressing:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) item;
                menClothing.dressMan();
                System.out.printf("Size: %s, Price: %.2f, Colour: %s%n", item.size, item.price, item.color);
            }
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(ClothingSize.M, 29.99, "Black"),
                new Pants(ClothingSize.L, 49.99, "Blue"),
                new Skirt(ClothingSize.S, 39.99, "Pink"),
                new Tie(ClothingSize.XXS, 19.99, "Red")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println("-------------------------");
        atelier.dressMan(clothes);
    }
}