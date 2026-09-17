package ru.skaldytskiivladislav.task4_3;

public final class Range {
    private final double min;
    private final double max;

    public Range(double min, double max) {
        if (min > max) throw new IllegalArgumentException("min должен быть меньше max");
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getLength() {
        return max - min;
    }

    public boolean contains(double number) {
        return number >= min && number <= max;
    }

    public boolean overlaps(Range other) {
        return this.min <= other.max && this.max >= other.min;
    }

    public Range intersection(Range other) {
        if (!overlaps(other)) {
            return null;
        }

        double newMin = Math.max(this.min, other.min);
        double newMax = Math.min(this.max, other.max);

        return new Range(newMin, newMax);
    }

    public Range union(Range other) {
        double newMin = Math.min(this.min, other.min);
        double newMax = Math.max(this.max, other.max);

        return new Range(newMin, newMax);
    }

    @Override
    public String toString() {
        return String.format("[%.2f; %.2f]", min, max);
    }

    public static void main(String[] args) {
        Range range1 = new Range(10, 20);
        Range range2 = new Range(15, 30);
        Range range3 = new Range(30, 40);

        System.out.println(range1);
        System.out.println(range1.getMax());
        System.out.println(range1.getMin());
        System.out.println(range1.getLength());

        System.out.println(range1.contains(15));
        System.out.println(range1.contains(25));

        System.out.println(range1.overlaps(range2));
        System.out.println(range1.overlaps(range3));

        System.out.println(range1.intersection(range2));
        System.out.println(range1.intersection(range3));

        System.out.println(range1.union(range2));
    }
}
