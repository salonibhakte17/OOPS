interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying image filter: " + type);
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying data filter: " + type);
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

class TestFilter {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.apply_filter("Blur");
        data.apply_filter("Remove Nulls");

        img.reset_filter();
        data.reset_filter();
    }
}