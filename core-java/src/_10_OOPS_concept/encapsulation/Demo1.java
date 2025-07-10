package _10_OOPS_concept.encapsulation;

public class Demo1 {
        public static void main(String[] args) {
            //access Movie class variables
            Movie movie = new Movie();
       /* movie.id;
        movie.title;
        movie.director;
        movie.year;*/
            movie.setId(100);
            System.out.println("ID: " + movie.getId());
            movie.setTitle("chawa");
            System.out.println("movie: " +movie.getTitle());


        }
    }


