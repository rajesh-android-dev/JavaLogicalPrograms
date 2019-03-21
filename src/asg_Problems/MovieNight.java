package asg_Problems;

import java.util.*;
import java.text.SimpleDateFormat;

public class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies) {
        ArrayList<Movie> movieArrayList = (ArrayList<Movie>) movies;
        for (int i = 0; i <= movieArrayList.size() - 1; i++) {
            for (int j = 0; j <= movieArrayList.size() - 1; j++) {
                if (i != j) {
                    Movie iMovie = movieArrayList.get(i);
                    Movie jMovie = movieArrayList.get(j);
                    if ((iMovie.getStart().compareTo(jMovie.getStart()) == -1
                            && (iMovie.getEnd().compareTo(jMovie.getStart()) == 1))
                            || ((iMovie.getStart().compareTo(jMovie.getEnd()) == -1
                            && iMovie.getEnd().compareTo(jMovie.getEnd()) == 1)))
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(sdf.parse("2015-01-01 21:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));

        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;

    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}