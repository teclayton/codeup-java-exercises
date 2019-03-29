package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {

        this.name = name;
    }

    public void setCategory(String cat) {

        this.category = cat;
    }

}
