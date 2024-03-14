package Annotations;

@CSVEntity
public class Movie {
    @CSVField
    private String name;

    @CSVField
    private String director;

    @CSVField
    private String genre;

    @CSVField
    private Integer budget;

    @CSVField
    private Integer releaseYear;

    @CSVField
    private Integer boxOffice;

    public Movie(String name, String director, String genre, Integer budget, Integer releaseYear, Integer boxOffice) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.budget = budget;
        this.releaseYear = releaseYear;
        this.boxOffice = boxOffice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(Integer boxOffice) {
        this.boxOffice = boxOffice;
    }
}
